/*
 * generated by Xtext 2.21.0
 */
package mdsd.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import mdsd.rPG.SystemRPG
import mdsd.rPG.Entity
import mdsd.rPG.Type
import mdsd.rPG.Move
import mdsd.rPG.Moves
import mdsd.rPG.Attribute
import mdsd.rPG.Locations
import mdsd.rPG.Death
import mdsd.rPG.AtomicNumber
import mdsd.rPG.Require
import mdsd.rPG.Or
import mdsd.rPG.And
import mdsd.rPG.Add
import mdsd.rPG.Sub
import mdsd.rPG.Mult
import mdsd.rPG.Div
import mdsd.rPG.Comparator
import mdsd.rPG.Eq
import mdsd.rPG.Smaller
import mdsd.rPG.SmallerEq
import mdsd.rPG.NEq
import mdsd.rPG.Bigger
import mdsd.rPG.BiggerEq
import mdsd.rPG.IntNum
import mdsd.rPG.NameAttribute
import mdsd.rPG.FloatNum
import mdsd.rPG.Attributes
import mdsd.rPG.Entities
import mdsd.rPG.Declaration
import mdsd.rPG.Relations
import mdsd.rPG.Teams
import mdsd.rPG.NumberComparing
import mdsd.rPG.Team
import mdsd.rPG.Members
import java.util.ArrayList
import mdsd.rPG.Effect
import java.util.List
import mdsd.rPG.MoveAttributes
import mdsd.rPG.EntityAttributes

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class RPGGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val mathLul = resource.allContents.filter(SystemRPG).next
		
		god(mathLul, fsa)
		
	}
	
	def god(SystemRPG thing, IFileSystemAccess2 fsa){
		var locationbool = false
		var relationbool = false
		var movesbool = false
		var entitiesbool = false
		var teamsbool = false
		var attributesbool = false
		var deathbool = false
		val classFileName = thing.getName() 
		for (Declaration d : thing.getDeclarations()){
			switch(d){
				Locations:
					if(!locationbool){ // should be done
						generateLocations(fsa, d)
						locationbool = true
					}
				Relations:
					if(!relationbool){ // should be done
                        generateTypes(fsa, d)
                        relationbool = true
                    }
				Moves:
					if(!movesbool){
						generateMoves(fsa, d)
						d.test
						movesbool = true
					}
				Entities:
					if(!entitiesbool){ // should be done
						generateEntities(fsa, d)
						entitiesbool = true
					}
				Teams:
					if(!teamsbool){ // should be done
						generateTeams(fsa, d)
						teamsbool = true
					}
				Attributes: // should be done
					if(!attributesbool){
						generateAttributes(fsa, d)
                        attributesbool = true
                    }
				Death: // should be done
					if(!deathbool){
						fsa.generateFile("DeathChecker.java", d.generateDeathChecker)
						deathbool = true
					}
					
				default:
					System.out.println("reported")
			}

		}
		fsa.generateFile(classFileName + ".java", classFileName.generateGamePOG2)
		fsa.generateFile("Runner.java", classFileName.generateRunner)
	}
	
	def CharSequence generateRunner(String name){
		'''
		import java.util.*;
		
		public class Runner {
		    public static void main(String[] args) {
		    	�name� �name.toLowerCase� = new �name�();
		    	�name.toLowerCase�.run();
		    }
		}
		'''
	}
	
	def CharSequence generateDeathChecker(Death death){
		'''
		import java.util.*;
		public class DeathChecker {
			public boolean check(Entity entity){
				HashMap<String, Number> eData = new HashMap<>();
				for(AttributeData aData : entity.getAttributes()){
					eData.put(aData.getAttributeName(), aData.getNumber());
				}
				return (�death.req.new_re�);
			}
		}
		'''
	}
	
	def CharSequence generateGamePOG2(String classFileName){
		'''
		import java.util.*;
		import java.awt.event.*;
		
		public class �classFileName�{
			private Type type;
		    private List<Entity> entities;
		    private List<Entity> battleEntities;
		    private Team team;
		    private Move move;
		    private MoveInit moveInit;
		    private EntityInit entityInit;
		    private TeamInit teamInit;
		    private TypeRelationsInit typeRelationsInit;
		    private LocationsInit locationsInit;
		    private Location location;
		    private DeathChecker deathChecker;
		    private Random random;
		    
		    private String currentTeam;
		    private boolean gameFinished;
		    private boolean won = false;
		    private boolean lost = false;
		    private Scanner s;
		    private Entity playerEntity;
		    
		    public �classFileName�(){
		    	entities = new ArrayList<>();
		    	type = Type.getInstance();
		      	team = new Team();
		    	battleEntities = new ArrayList<>();
		    	move = Move.getInstance();
		    	location = Location.getInstance();
		    	deathChecker = new DeathChecker();
		    	moveInit = new MoveInit();
		    	entityInit = new EntityInit();
		    	teamInit = new TeamInit();
		    	locationsInit = new LocationsInit();
		        typeRelationsInit = new TypeRelationsInit();
		        s = new Scanner(System.in);
		        random = new Random();
		   	}
		   	
		   	public void run(){
		   		initialize();
		   		gameLoop();
		   	}
		   	
		   	private void initialize(){
		   		moveInit.addMoves(move);
		   		entityInit.createEntities(entities);
		   		teamInit.createTeams(team, entities);
		   		typeRelationsInit.createRelations(type);
		   		locationsInit.addLocations(location);
		   	}
		   	
		   	private void gameLoop(){
		   		playerEntity = team.getPlayerTeam().remove(0);
				while (!gameFinished) {
					if(won){
						gameFinished = true;
						System.out.println("You Won!");
					}else if(lost){
						gameFinished = true;
						System.out.println("You Lost.");
					}else{
						// Get current location to fight at
						String currentLocation = location.getLocations().remove(0);
						String enemyTeamName = location.getTeams().get(currentLocation);
						List<Entity> enemyTeam = team.getTeamByName(location.getTeams().get(currentLocation));
						System.out.println("Current Location: " + currentLocation + ", fighting against: " + enemyTeamName);
						processGame(enemyTeam);
					}
				}
		   	}
		   	
		   	private void processGame(List<Entity> enemyTeam){
		   		while(enemyTeam.size() > 0 && !lost){
		   			Entity enemyEntity = enemyTeam.remove(0);
		   			fight(enemyEntity);
		   		}
		   		if(!(location.getLocations().size() > 0) && !lost){
					won = true;
		   		}
		   	}
		   		
		   	private void fight(Entity enemyEntity){
		   		boolean fighting = true;
		   		while(fighting){
		   			System.out.println("You are against " + enemyEntity.getName() + " choose your move");
		   			List<String> moves = playerEntity.getMoveNameList();
					System.out.println(moves);
					
					boolean pickMove = true;
					while (pickMove){  
						String moveName = s.nextLine();
						
						// Will check that the user writes pick a move which exists
						if(moves.contains(moveName)){
							Number power = move.getMove(moveName).getMoveAttributes().get(0).getNumber();                                    
							System.out.println("You used "+ moveName + "\n");
							// TODO: in xtend file use actual hp hihi
							// health = health - power;
							// System.out.println("Enemy hp: " + health + "\n");
							pickMove = !pickMove;
						}else{
							System.out.println("That's not a possible move!");
						}
						if(deathChecker.check(enemyEntity)){
							System.out.println(enemyEntity.getName() + " is dead!");
							enemyEntity.setEntityState(EntityState.DEAD);
							return;
						}else{
							System.out.println("Enemy Turn...");
							int choosenMove = random.nextInt(enemyEntity.getMoveNameList().size());
							Number enemyPower = move.getMove(enemyEntity.getMoveNameList().get(choosenMove)).getMoveAttributes().get(0).getNumber();
							System.out.println(enemyEntity.getName() + " used " + enemyEntity.getMoveNameList().get(choosenMove) + "\n");
							//player_health -= enemyPower;
							//System.out.println("Player health: " + player_health + "\n");
							if(deathChecker.check(playerEntity)){
								System.out.println("Your " + playerEntity.getName() + " is dead");
								playerEntity.setEntityState(EntityState.DEAD);
								
								// Will add the next player entity to the fight, if there are no more, it will go to game over
								if(!team.getPlayerTeam().isEmpty()){
									playerEntity = team.getPlayerTeam().remove(0);
								}else{
									lost = true;
									return;
								}
							}
						}
					}
		   		}
		   	}
		}
		
		
		'''
	}
	
	def generateAttributes(IFileSystemAccess2 fsa, Attributes attributes){
		//fsa.generateFile("Attribute.java" , generateAttribute)
        fsa.generateFile("AttributeEnum.java", attributes.generateAttributeEnum)
        fsa.generateFile("AttributeData.java", generateAttributeData)
	}
	
	def CharSequence generateAttribute(){
		'''
		import java.util.*;
		
		public class Attribute {
		    private List<AttributeData> attributes = new ArrayList<>();
		
		    private static Attribute attribute;
		
		    private Attribute() {
		
		    }
		
		    public static Attribute getInstance() {
		        if (attribute == null) {
		            attribute = new Attribute();
		        }
		        return attribute;
		    }
		
		    public void addAttribute(AttributeData attribute) {
		        attributes.add(attribute);
		    }
		    
		    public List<AttributeData> getAttributes() {
		        return attributes;
		    }
		}
		'''
	}

	def CharSequence generateMoveAttribute(MoveAttributes attribute){
	'''
	import java.util.*;
	
	public class MoveAttributes {
	    private List<AttributeData> moveattributes = new ArrayList<>();
	
	    private static MoveAttributes attribute;
	
	    private MoveAttributes() {
	
	    }
	
	    public static MoveAttributes getInstance() {
	        if (attribute == null) {
	            attribute = new MoveAttributes();
	        }
	        return attribute;
	    }
	
	    public void addAttribute(AttributeData attribute) {
	        moveattributes.add(attribute);
	    }
	    
	    public List<AttributeData> getAttributes() {
	        return moveattributes;
	    }
	}
	'''
	}
	
	def CharSequence generateEntityAttribute(EntityAttributes attribute){
	'''
	import java.util.*;

	public class EntityAttributes {
	private List<AttributeData> entityattributes = new ArrayList<>();
	private static EntityAttributes attribute;

		private EntityAttributes() {
		
		}

	    public static EntityAttributes getInstance() {
	        if (attribute == null) {
	            attribute = new EntityAttributes();
	        }
	        return attribute;
	    }
	
	    public void addAttribute(AttributeData attribute) {
	        entityattributes.add(attribute);
	    }
	    
	    public List<AttributeData> getAttributes() {
	        return entityattributes;
	    }
	}
	'''
	}
	
	def generateAttributeChangeEvent(){
		'''
		public class AttributeChangeEvent{
		  private AttributeData previousState;
		  private AttributeData targetState;
		
		  public AttributeChangeEvent(AttributeData previousState, AttributeData targetState){
		    this.previousState = previousState;
		    this.targetState = targetState;
		  }
		
		  public AttributeData getTargetState(){
		    return this.targetState;
		  }
		
		  public AttributeData getPreviousState(){
		    return this.previousState;
		  }
		
		}
		'''
	}
	
	def CharSequence generateAttributeData(){
		'''
		import java.util.*;
		public class AttributeData {
		
		    private Number number;
		    private String attributeName;
		
		    public AttributeData() {
		    }
		
		    public AttributeData(String attributeName, Number number) {
		        this.number = number;
		        this.attributeName = attributeName;
		    }
		
		    public Number getNumber() {
		        return this.number;
		    }
		
		    public void setNumber(Number number){
		        this.number = number;
		    }
		
		    public String getAttributeName() {
		        return this.attributeName;
		    }
		
		    public void setAttributeName(String attributeName) {
		        this.attributeName = attributeName;
		    }
		}
		'''
	}
	
	def generateAttributeEnum(Attributes attributes){
        '''
        public enum AttributeEnum{
        �FOR attribute: attributes.attribute �
            �attribute.name�,
        �ENDFOR�
        }
        '''
    }
	
    def CharSequence generateEffect(Moves moves){
    '''
        �FOR move: moves.move�
            �FOR effect: move.effect�
                �effect.rule.carl�
                �effect.rule.carl.attribute.attribute.name�=�effect.rule.carl.change.exp�
            �ENDFOR�
        �ENDFOR�
    '''
    }
    
    def test(Moves moves){
        var list = new ArrayList<Object>()
        for(Move move : moves.move){
            for(Effect effects : move.effect){
                effects.rule.carl.change.exp2(list)
            }
        }
        for(Object o : list)
            System.out.println(o.toString())
    }
    
    def dispatch exp2(Add x, List<Object> list){
        x.left.exp2(list)
        list.add('+')
        x.right.exp2(list)
    }
    def dispatch exp2(Sub x, List<Object> list){
        x.left.exp2(list)        
        list.add('-')
        x.right.exp2(list)
    }
    def dispatch exp2(Mult x, List<Object> list){
        x.left.exp2(list)        
        list.add('*')
        x.right.exp2(list)
    }
    def dispatch exp2(Div x, List<Object> list){
        x.left.exp2(list)
        list.add('/')
        x.right.exp2(list)
    }
    def dispatch exp2(IntNum x, List<Object> list){
        list.add(x.value)
    }
    def dispatch exp2(FloatNum x, List<Object> list){
        list.add(x.decimal)
    }
    def dispatch exp2(NameAttribute x, List<Object> list){
        list.add(x.attribute.AVal)
    }

	def generateEntities(IFileSystemAccess2 fsa, Entities entities){
		fsa.generateFile("Entity.java", generateEntity)
		fsa.generateFile("EntityEnum.java", entities.generateEntityEnum)
		fsa.generateFile("EntityState.java", generateEntityState)
		fsa.generateFile("EntityInit.java", entities.generateEntityInit)
	}
	
	def CharSequence generateEntity(){
		'''
		import java.util.*;
		public class Entity{
		    private String name;
		    private String type;
		    private EntityState state;
		    private List<AttributeData> attribute;
		    private List<MoveData> moves;
		
		    public Entity(){
		      attribute = new ArrayList<>();
		      moves = new ArrayList<>();
		    }
		
		    public Entity(Entity e){
		      this();
		      this.name = e.getName();
		      this.type = e.getType();
		      this.state = e.getEntityState();
		      if(!e.getAttributes().isEmpty())
		        this.attribute.addAll(e.getAttributes());
		      if(!e.getMoveData().isEmpty())
		        this.moves.addAll(e.getMoveData());
		    }
		
		    public String getName(){
		      return this.name;
		    }
		    public void setName(String name){
		      this.name = name;
		    }
		    public String getType(){
		      return this.type;
		    }
		    public void setType(String type){
		      this.type = type;
		    }
		    public List<AttributeData> getAttributes(){
		      return attribute;
		    }
		
		    public EntityState getEntityState(){
		      return state;
		    }
		
		    public void setEntityState(EntityState state){
		      this.state = state;
		    }
		
		    public void addAttribute(AttributeData attribute){
		      this.attribute.add(attribute);
		    }
		
		    public List<MoveData> getMoveData(){
		      return moves;
		    }
		
		    public List<String> getMoveNameList(){
		      List<String> moveNames = new ArrayList<>();
		      for (MoveData moveData : getMoveData()) {
		          moveNames.add(moveData.getMoveName());
		      }
		      return moveNames;
		    }
		    
		    public void addMoveData(MoveData moveData){
		      moves.add(moveData);
		    }
		}
		'''
	}
	
	def CharSequence generateEntityEnum(Entities entities){
		var entityEnum = ""
		var i = 1
		for(entity : entities.entity){
			entityEnum += entity.name
			if(i < entities.entity.size){
				entityEnum += ", "
				i++
			} else {
				entityEnum += ";"
			}
		}
		'''
		enum EntityEnum{
			�entityEnum�
		}
		'''
	}
	
	def CharSequence generateEntityState(){
		'''
		public enum EntityState {
		    DEAD, ALIVE
		}
		'''
	}
	
	def CharSequence generateEntityInit(Entities entities){
		/*�IF getNumberFromAtomicDab(att.av.an) instanceof Integer�
				�entity.name.toLowerCase�.addAttribute(AttributeData.createAttributeDataWithInt("�att.attribute.name�", �getNumberFromAtomicDab(att.av.an)�));
				�ELSEIF getNumberFromAtomicDab(att.av.an) instanceof Float�
				�entity.name.toLowerCase�.addAttribute(AttributeData.createAttributeDataWithFloat("�att.attribute.name�", �getNumberFromAtomicDab(att.av.an)�));
				�ENDIF� */
		
		'''
		import java.util.*;
		
		public class EntityInit{
			public void createEntities(List<Entity> entities){
				�FOR entity : entities.entity�
				Entity �entity.name.toLowerCase� = new Entity();
				�entity.name.toLowerCase�.setName("�entity.name�");
				�entity.name.toLowerCase�.setType("�entity.EType.type.name�");
				�FOR move : entity.EMoves.move�
				�entity.name.toLowerCase�.addMoveData(Move.getInstance().getMove("�move.name�"));
				�ENDFOR�
				�FOR att : entity.att�
				�IF getNumberFromAtomicDab(att.av.an) instanceof Number�
				�entity.name.toLowerCase�.addAttribute(new AttributeData("�att.attribute.name�", �getNumberFromAtomicDab(att.av.an)�));
				�ENDIF�
				�ENDFOR�
				entities.add(�entity.name.toLowerCase�);
				�ENDFOR�
				
			}
		}
		
		'''
	}
	
	def CharSequence generateGamePOG(SystemRPG systemRPG){
		'''
		import java.util.*;
		import java.awt.event.*;
		
		public class Game implements KeyListener{
		    private Type type;
		    private List<Attribute> attributes;
		    private Attribute attribute;
		    private boolean gameFinished;
		    private List<Entity> eList; 
		    private List<Entity> battleEntities;
		    private Team team;
		
		    private String currentLocation;
		    private String currentTeam;
		
		    public Game(){
		      eList = new ArrayList<>();
		      attributes = new ArrayList<>();
		      team = new Team();
		      battleEntities = new ArrayList<>();
		    }
		
		    public boolean isGameFinished(){
		        return gameFinished;
		    }
		
		    public void toggleGameFinished(){
		        gameFinished = !gameFinished;
		    }
		
		    public void addTypes(){
		        type = Type.getInstance();
		        for(TypeEnum typeName : TypeEnum.values()){
		            type.addType(typeName.toString());
		        }
		        System.out.println(type.getTypes());
		        type = null;
		    }
		
		    public void addMoves(){
		        Move moves = Move.getInstance();
		
		        for(MoveEnum mE: MoveEnum.values()){
		            MoveData tempMoveData = new MoveData();
		            tempMoveData.setMoveName(mE.toString());
		            tempMoveData.setType(mE.getType());
		            tempMoveData.addAttribute(AttributeData.createAttributeWithStringAndDefaultValues("power"));
		            tempMoveData.addAttribute(AttributeData.createAttributeDataWithInt("pp", 25));
		            moves.addMove(tempMoveData);
		        }
		        moves = null;
		    }
		
		    public Move getMove(){
		        return Move.getInstance();
		    }
		
		    public void addAttributes(){
		        attribute = Attribute.getInstance();
		        for (AttributeEnum e : AttributeEnum.values()){
		            attribute.addAttribute(AttributeData.createAttributeWithStringAndDefaultValues(e.toString()));
		        }
		        System.out.println(attribute.getAttributes());
		    }
		
		    public void addTeam() {
		        Entity zyndaquil = new Entity();
		        Entity zotodile = new Entity();
		
		        zyndaquil.setName("zyndaquil");
		        zyndaquil.setType("fire");
		        zyndaquil.addMoveData(Move.getInstance().getMove("Ember"));
		
		
		        zotodile.setName("zotodile");
		        zotodile.setType("water");
		        zotodile.addMoveData(Move.getInstance().getMove("Water_gun"));
		        zotodile.addMoveData(Move.getInstance().getMove("Razor_leaf"));
		
		
		        getAttributes().forEach(element -> zyndaquil.addAttribute(element));
		        getAttributes().forEach(element -> zotodile.addAttribute(element));
		
		
		        team.addTeamMember("Zilver", zyndaquil);
		        team.addTeamMember("Zilver", zotodile);
		        team.addTeamMember("Rival", zotodile);
		        team.addTeamMember("Rival", zyndaquil);
		        team.addTeamMember("Red", zotodile);
		        team.addTeamMember("Red", zotodile);
		    }
		
		    public void addLocation(){
		        Location tempLoc = Location.getInstance();
		        tempLoc.addLocation("Johto");
		        tempLoc.addTeamToLocation("Johto", "Rival");
		
		        tempLoc.addLocation("Kanto");
		        tempLoc.addTeamToLocation("Kanto", "Red");
		    }
		
		    public Location getLocation(){
		        return Location.getInstance();
		    }
		
		    public List<String> getTypes(){
		        Type tempType = Type.getInstance();
		        List<String> aString = new ArrayList<>();
		
		        aString.addAll(tempType.getTypes());
		
		        tempType = null;
		        return aString;
		
		    }
		
		    public List<AttributeData> getAttributes(){
		        Attribute tempAttribute = Attribute.getInstance();
		
		        List<AttributeData> aAttribute = new ArrayList<>();
		
		        aAttribute.addAll(tempAttribute.getAttributes());
		
		        tempAttribute = null;
		        return aAttribute;
		
		    }
		
		    public void addEntity(){
		      String[] types = {"fire", "water", "grass"};
		      int index = 0;
		      for (EntityEnum ee : EntityEnum.values() ) {
		        Entity e = new Entity();
		        e.setName(ee.toString());
		        e.setType(types[index]);
		        Attribute.getInstance().getAttributes().forEach(element -> e.addAttribute(element));
		        Move.getInstance().getMoves().forEach(element -> e.addMoveData(element)); 
		        eList.add(e);
		        if(index<2){
		            index++;
		        } else {
		            index = 0;
		        }
		      }
		    }
		
		    public List<Entity> getEList(){
		        return eList;
		    }
		
		    public List<Entity> getBattleEntities(){
		        return this.battleEntities;
		    }
		
		    /**
		     * @return the team
		     */
		    public Team getTeam() {
		        return team;
		    }
		
		    public String getCurrentLocation(){
		        return this.currentLocation;
		    }
		
		    public void setCurrentLocation(String currentLocation) {
		        this.currentLocation = currentLocation;
		    }
		
		    public String getCurrentTeam(){
		        return this.currentTeam;
		    }
		
		    public void setCurrentTeam(String currentTeam) {
		        this.currentTeam = currentTeam;
		    }
		
		    @Override
		    public void keyPressed(KeyEvent e){
		        if (e.getKeyChar() == 'x') {
		            toggleGameFinished();
		        }
		    }
		
		    @Override
		    public void keyReleased(KeyEvent e){
		
		    }
		
		    @Override
		    public void keyTyped(KeyEvent e){
		
		    }
		}
		
		'''
	}
	
	def CharSequence generateKillable(Death death){
		
	}
	
	def CharSequence re(Require req){
		req.log.logic
	}
	
	def CharSequence new_re(Require req){
		req.log.new_logic
	}
	
	def dispatch CharSequence logic(Or x){
		'''(�x.left.logic�||�x.right.logic�)'''
	}
	def dispatch CharSequence logic(And x){
		'''(�x.left.logic�&&�x.right.logic�)'''
	}
	def dispatch CharSequence logic(NumberComparing x){
		'''(�x.left.exp��x.comp.generateComp��x.right.exp�)'''
	}
	def generateComp(Comparator op) {
		switch op { Eq: '==' Smaller: '<' Bigger: '>' SmallerEq: '<=' BiggerEq: '>=' NEq: '!=' }
	}
	def dispatch CharSequence exp(Add x){
		'''(�x.left.exp�+�x.right.exp�)'''
	}
	def dispatch CharSequence exp(Sub x){
		'''(�x.left.exp�-�x.right.exp�)'''
	}
	def dispatch CharSequence exp(Mult x){
		'''(�x.left.exp�*�x.right.exp�)'''
	}
	def dispatch CharSequence exp(Div x){
		'''(�x.left.exp�/�x.right.exp�)'''
	}
	def dispatch CharSequence exp(IntNum x){
		Integer.toString(x.value)
	}
	def dispatch CharSequence exp(FloatNum x){
		Integer.toString(x.i) + '.' + Integer.toString(x.decimal)
	}
	def dispatch CharSequence exp(NameAttribute x){
		{"_"+x.attribute.name}
	}
	
	def dispatch CharSequence new_logic(Or x){
		'''(�x.left.new_logic�||�x.right.new_logic�)'''
	}
	def dispatch CharSequence new_logic(And x){
		'''(�x.left.new_logic�&&�x.right.new_logic�)'''
	}
	def dispatch CharSequence new_logic(NumberComparing x){
		'''(�x.left.new_exp��x.comp.generateComp��x.right.new_exp�)'''
	}
	def dispatch CharSequence new_exp(Add x){
		'''(�x.left.new_exp�+�x.right.new_exp�)'''
	}
	def dispatch CharSequence new_exp(Sub x){
		'''(�x.left.new_exp�-�x.right.new_exp�)'''
	}
	def dispatch CharSequence new_exp(Mult x){
		'''(�x.left.new_exp�*�x.right.new_exp�)'''
	}
	def dispatch CharSequence new_exp(Div x){
		'''(�x.left.new_exp�/�x.right.new_exp�)'''
	}
	def dispatch CharSequence new_exp(IntNum x){
		Integer.toString(x.value)
	}
	def dispatch CharSequence new_exp(FloatNum x){
		Integer.toString(x.i) + '.' + Integer.toString(x.decimal)
	}
	def dispatch CharSequence new_exp(NameAttribute x){
		if(x.attribute.AVal.LTypes !== null && x.attribute.AVal.LTypes.equals("Integer")){
			"eData.get(" + '"' +x.attribute.name + '"' + ").intValue()"
		}else if(x.attribute.AVal.LTypes !== null && x.attribute.AVal.LTypes.equals("Float")){ 
			"eData.get(" + '"' +x.attribute.name + '"' + ").floatValue()"
		}else if(x.attribute.AVal.an !== null && x.attribute.AVal.an instanceof IntNum){
			"eData.get(" + '"' +x.attribute.name + '"' + ").intValue()"
		}else if(x.attribute.AVal.an !== null && x.attribute.AVal.an instanceof FloatNum){
			"eData.get(" + '"' +x.attribute.name + '"' + ").floatValue()"
		} else {
			"Shit son" 
		}
	}

	def dispatch Number getNumberFromAtomicDab(IntNum x){
		x.value
	}
	def dispatch Number getNumberFromAtomicDab(FloatNum x){
		val floatstring = x.i + "." + x.decimal
		Float.valueOf(floatstring)
	}
	
	def generateLocations(IFileSystemAccess2 fsa, Locations locations){
		fsa.generateFile("Location.java", generateLocation)
		fsa.generateFile("LocationsInit.java", locations.generateLocationInit)
	}
	
	def CharSequence generateLocation(){
		
		'''
		import java.util.*;
		
		public class Location {
		    private List<String> locations;
		    private String currentLocation;
		    private String currentTeam;
		
		    private Map<String, String> teams;
		
		    private static Location location;    
		
		    private Location(){
		        locations = new ArrayList<>();
		        teams = new HashMap<>();
		
		    }
		
		    public static Location getInstance(){
		        if(location == null){
		            location = new Location();
		        }
		        return location;
		    }
		
		    public String getCurrentLocation(){
		        return this.currentLocation;
		    }
		
		    public String getCurrentTeam(){
		        return this.currentTeam;
		    }
		
		    public Map<String, String> getTeams(){
		        return this.teams;
		    }
		
		    public List<String> getLocations(){
		        return this.locations;
		    }
		
		    public void setLocations(List<String> locations){
		        this.locations = locations;
		    }
		
		    public void setCurrentLocation(String currentLocation){
		        this.currentLocation = currentLocation;
		    }
		
		    public void addLocation(String location){
		        locations.add(location);
		    }
		
		    public void addTeamToLocation(String location, String team){
		        if(locations.contains(location)){
		            teams.put(location, team);
		        } else {
		        	addLocation(location);
		        	teams.put(location, team);
		        }
		    }
		
		
		}
		'''
	}
	
	def CharSequence generateLocationInit(Locations locations){
		'''
		import java.util.*;
		
		public class LocationsInit{
			public void addLocations(Location location){
				String locationName;
				String teamName;
				�FOR location : locations.loc�
				locationName = "�location.name�";
				teamName = "�location.team.name�";
				location.addTeamToLocation(locationName, teamName);
				�ENDFOR�
			}
		}
		'''
	}
	
	def generateMoves(IFileSystemAccess2 fsa, Moves moves){
		fsa.generateFile("Move.java", generateMove)
		fsa.generateFile("MoveEnum.java", moves.generateMoveEnum)
		fsa.generateFile("MoveInit.java", moves.generateMoveInit)
		fsa.generateFile("MoveData.java", generateMoveData)
	}
	
	def CharSequence generateMove(){
		'''
		import java.util.*;
				
		public class Move{			
		
			private static Move move;
			private List<MoveData> moves = new ArrayList<>();
			
			private Move(){}
		
			public static Move getInstance(){
				if (move == null){
					move = new Move();
				}
				return move;
			}
		
			public void addMove(MoveData move){
				moves.add(move);
			}
		
			public MoveData getMove(String move){
				MoveData mD = null;
		
				for (MoveData moveData : moves) {
					if(moveData.getMoveName().equals(move)){
						mD = moveData;
					}
				}
				return mD;
			}
		
			public List<MoveData> getMoves(){
				return moves;
			}
		
		}
			
		'''
		
	}
	
	def CharSequence generateMoveData(){
		'''
		import java.util.*;
		
		public class MoveData{
		
		    private String moveName;
			private String type;
		    private List<AttributeData> moveAttributes;
		
		    public MoveData(){
		        this.moveAttributes = new ArrayList<>();
		    }
		
		    public MoveData(String moveName, String type, List<AttributeData> moveAttributes) {
		        this.moveName = moveName;
		        this.type = type;
		        this.moveAttributes = moveAttributes;
		    }
		
		    public String getMoveName(){
		        return this.moveName;
		    }
		
		    public void setMoveName(String moveName) {
		        this.moveName = moveName;
		    }
		
		    public String getType() {
		        return this.type;
		    }
		
		    public void setType(String type) {
		        this.type = type;
		    }
		
		    public List<AttributeData> getMoveAttributes() {
		        return this.moveAttributes;
		    }
		
		    public void setMoveAttributes(List<AttributeData> moveAttributes) {
		        this.moveAttributes = moveAttributes;
		    }
		
		    public void addAttribute(AttributeData attribute){
		        moveAttributes.add(attribute);
		    }
		
		    @Override
		    public boolean equals(Object o) {
		        if (o == this)
		            return true;
		        if (!(o instanceof MoveData)) {
		            return false;
		        }
		        MoveData moveData = (MoveData) o;
		        return Objects.equals(moveName, moveData.moveName) && Objects.equals(type, moveData.type) && Objects.equals(moveAttributes, moveData.moveAttributes);
		    }
		
		    @Override
		    public int hashCode() {
		        return Objects.hash(moveName, type, moveAttributes);
		    }
		
		    @Override
		    public String toString() {
		        return getMoveName();
		    }
		
		}
		'''
	}

	def CharSequence generateMoveEnum(Moves moves){
		var moveEnums = ""
		var i = 1
		for(move : moves.move){
			var name = move.name
			var type = move.getEType().type.name
			moveEnums += name
			moveEnums += "(" + '"' + type + '"' + ')'
			if(i < moves.move.size){
				moveEnums += ", "
				i++
			} else {
				moveEnums += ";"
			}
		}
		
		'''
		enum MoveEnum{
		    �moveEnums�
		    private String type;
		
		    private MoveEnum(String type){
		        this.type = type;
		    }
		
		    public String getType(){
		        return this.type;
		    }
		}
		'''
	}
	
	def CharSequence generateMoveInit(Moves moves){
		/*
		 * 
		 * �IF getNumberFromAtomicDab(att.av.an) instanceof Integer�
				tempMoveData.addAttribute(AttributeData.createAttributeDataWithInt("�att.attribute.name�", �getNumberFromAtomicDab(att.av.an)�));
				�ELSEIF getNumberFromAtomicDab(att.av.an) instanceof Float�
				tempMoveData.addAttribute(AttributeData.createAttributeDataWithFloat("�att.attribute.name�", �getNumberFromAtomicDab(att.av.an)�));
				�ENDIF�
		 */
		
		
		'''
		import java.util.*;
		
		public class MoveInit{
			public void addMoves(Move moves){ //private Move moves = Move.getInstance()
				MoveData tempMoveData;
				�FOR move : moves.move�
				tempMoveData = new MoveData();
				tempMoveData.setMoveName("�move.name�");
				tempMoveData.setType("�move.EType.type.name�");
				�FOR att : move.att�
				�IF getNumberFromAtomicDab(att.av.an) instanceof Number�
				tempMoveData.addAttribute(new AttributeData("�att.attribute.name�", �getNumberFromAtomicDab(att.av.an)�));
				�ENDIF�
				�ENDFOR�
				moves.addMove(tempMoveData);
				�ENDFOR�
			}
		}
		'''
	}
	
	def generateTeams(IFileSystemAccess2 fsa, Teams teams){
		fsa.generateFile("Team.java", generateTeam)
		fsa.generateFile("TeamInit.java", teams.generateTeamInit)
	}
	
	def String addTeamMemberString(Team team){
		var createTeamString = "team.addTeamMember(" + '"' + team.name + '"' + ", "
		var i = 1
		for(Entity e : team.members.entity){
			createTeamString += "findEntityByName(" + '"'+ e.name + '"' + ", entities" + ")"
			if(team.members.entity.size() > i){
				i++
				createTeamString += ", "
			} else {
				createTeamString += ");"
			}
		}
		createTeamString
	}
	
	def CharSequence generateTeam(){
		'''
		import java.util.*;
		
		public class Team {
		    private Map<String, List<Entity>> teams;
		    private List<String> teamNames;
		
		    public Team() {
		        teams = new HashMap<>();
		        teamNames = new ArrayList<>(); 
		    }
		
		    public List<Entity> getTeamByName(String name) {
		        if (!teams.containsKey(name)) {
		            return null;
		        }
		        return teams.get(name);
		    }
		
		    public void addTeamMember(String team, Entity... entity) {
		        if (!teams.containsKey(team)) {
		            teams.put(team, entityAdder(entity));
		            teamNames.add(team);
		        } else {
		            teams.get(team).addAll(entityAdder(entity));
		        }
		    }
		
		    public List<Entity> entityAdder(Entity... entity) {
		        List<Entity> eList = new ArrayList<>();
		        for (Entity entity2 : entity) {
		            Entity tempEntity = new Entity(entity2);
		            eList.add(tempEntity);
		        }
		        return eList;
		    }
		
		    public Map<String, List<Entity>> getTeams(){
		        return teams;
		    }
		
		    public List<Entity> getPlayerTeam(){
		        return teams.get(teamNames.get(0));
		    }
		
		    public boolean checkPlayerEntities(){
		        int playerTeamSize = getPlayerTeam().size();
		        int deadEntities = 0;
		        for (Entity entity : getPlayerTeam()) {
		            if(entity.getEntityState() == EntityState.DEAD) break;
		            deadEntities++;
		            if(deadEntities == playerTeamSize) return true;
		        }
		        return false;
		    }
		
		    public int playerEntitiesAlive(){
		        int alive = 0;
		        for (Entity entity : getPlayerTeam()) {
		            if(entity.getEntityState() != EntityState.DEAD) alive++;
		        }
		        return alive;
		    }
		}
		'''
	}
	
	def CharSequence generateTeamInit(Teams teams){
		'''
		import java.util.*;
		
		public class TeamInit{
			public void createTeams(Team team, List<Entity> entities){
				�FOR team : teams.team�
				�addTeamMemberString(team)�
				�ENDFOR�
			}
			
			private Entity findEntityByName(String name, List<Entity> entities){
				for(Entity e : entities){
					if(e.getName().equals(name)){
						return e;
					}
				}
				return null;
			}
		}
		
		
		
		
		'''
	}
	
	def generateTypes(IFileSystemAccess2 fsa, Relations relations){
		fsa.generateFile("Type.java", generateType)
		fsa.generateFile("TypeEnum.java", relations.generateTypeEnum)
		fsa.generateFile("TypeRelation.java", generateTypeRelation)
		fsa.generateFile("TypeRelationsInit.java", relations.generateTypeInit)
	}
	
	def CharSequence generateTypeRelation(){
		'''
		import java.util.ArrayList;
				
				public class TypeRelation {
				
				    private ArrayList<String> weakAgainst;
				    private ArrayList<String> strongAgainst;
				
				    public TypeRelation(){
				        weakAgainst = new ArrayList<>();
				        strongAgainst = new ArrayList<>();
				    }
				
				    public void addStrongAgainst(String strong){
				        strongAgainst.add(strong);
				    }
				
				    public void addWeakAgainst(String weak){
				        strongAgainst.add(weak);
				    }
				
				    public ArrayList<String> getWeakAgainst(){
				        return weakAgainst;
				    }
				
				    public ArrayList<String> getStrongAgainst(){
				        return strongAgainst;
				    }
				
				}
		'''
	}
	
	def CharSequence generateTypeInit(Relations relations){
		
		'''
		import java.util.*;
				
		public class TypeRelationsInit{
			public void createRelations(Type type){
				TypeRelation tr;
				String currentType;
				�FOR t : relations.type�
				tr = new TypeRelation();
				currentType = "�t.name�";
				tr.addStrongAgainst("�t.TExpression.strong.name�");
				�FOR better : t.TExpression.strong2�
				tr.addStrongAgainst("�better.name�");
				�ENDFOR�
				tr.addWeakAgainst("�t.TExpression.weak.name�");
				�FOR worse : t.TExpression.weak2�
				tr.addWeakAgainst("�worse.name�");
				�ENDFOR�
				type.addTypeRelation(currentType, tr);
				�ENDFOR�
			}
		}
		'''
	}
	
	def CharSequence generateType(){
		'''
		import java.util.*;
				
		public class Type{
				
			private List<String> types = new ArrayList<>();
			private HashMap<String, TypeRelation> typeRelations = new HashMap<>();
		
			private static Type type;
					
			private Type(){}
		
			public static Type getInstance(){
				if(type == null){
					type = new Type();
				}
				return type;
			}
							
			public void addType(String type){
				types.add(type);
			}
		
			public List<String> getTypes(){
				return types;
			}
		
			public void addTypeRelation(String typeString, TypeRelation tr){
				typeRelations.put(typeString, tr);
			}
		
			public HashMap<String, TypeRelation> getTypeRelations(){
				return typeRelations;
			}
		}
		'''
	}

	def generateTypeEnum(Relations relations){
        '''
        public enum TypeEnum{
        �FOR type: relations.type �
            �type.name�,
        �ENDFOR�
        }
        '''
    }
	
}
