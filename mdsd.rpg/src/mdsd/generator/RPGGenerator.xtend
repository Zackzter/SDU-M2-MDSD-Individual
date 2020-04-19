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
		var gamefile = ""
		var locationbool = false
		var relationbool = false
		var movesbool = false
		var entitiesbool = false
		var teamsbool = false
		var attributesbool = false
		var deathbool = false
		val classFileName = thing.getName() + ".java"
		for (Declaration d : thing.getDeclarations()){
			switch(d){
				Locations:
					if(!locationbool){
						fsa.generateFile("Location.java" , d.generateLocation)
						locationbool = true
					}
				Relations:
					if(!relationbool){
                        fsa.generateFile("TypeEnum.java", d.generateTypeEnum)
                        relationbool = true
                    }
				Moves:
					if(!movesbool){
						gamefile += generateMoves(fsa, d)
						d.test
						movesbool = true
					}
				Entities:
					if(!entitiesbool){
						gamefile += generateEntities(fsa, d)
						entitiesbool = true
					}
				Teams:
					if(!teamsbool){
						gamefile += generateTeams(fsa, d)
						teamsbool = true
					}
				Attributes:
					if(!attributesbool){
                        fsa.generateFile("Attribute.java" , d.generateAttribute)
                        fsa.generateFile("AttributeEnum.java", d.generateAttributeEnum)
                        attributesbool = true
                    }
				Death:
					System.out.println("Do this")
					/* 
					'''
					public class DeathCondition {
					// ost3
					�d.req.re�
			
					}
					'''
					*/
				default:
					System.out.println("reported")
			}

		}
		fsa.generateFile(classFileName, gamefile)
		
	}
	
	def CharSequence generateAttribute(Attributes attribute){
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
	
	def generateAttributeData(){
		'''
		import java.util.*;
		public class AttributeData {
		
		    private int intValue;
		    private float floatValue;
		    private String attributeName;
		
		    public AttributeData() {
		    }
		
		    public AttributeData(int intValue, float floatValue, String attributeName) {
		        this.intValue = intValue;
		        this.floatValue = floatValue;
		        this.attributeName = attributeName;
		    }
		
		    public static AttributeData createAttributeWithStringAndDefaultValues(String s){
		        AttributeData a = new AttributeData();
		        a.setAttributeName(s);
		        a.setFloatValue(45.0f);
		        a.setIntValue(45);
		        Attribute ab = Attribute.getInstance();
		        ab.addAttribute(a);
		        ab = null;
		        return a;
		    }
		    
		    public static AttributeData createAttributeDataWithFloat(String attributeData, float f) {
		        AttributeData a = new AttributeData();
		        a.setAttributeName(attributeData);
		        a.setFloatValue(f);
		        Attribute ab = Attribute.getInstance();
		        ab.addAttribute(a);
		        ab = null;
		        return a;
		    }
		
		    public static AttributeData createAttributeDataWithInt(String attributeData, int i) {
		        AttributeData a = new AttributeData();
		        a.setAttributeName(attributeData);
		        a.setIntValue(i);
		        Attribute ab = Attribute.getInstance();
		        ab.addAttribute(a);
		        ab = null;
		        return a;
		    }
		
		    public int getIntValue() {
		        return this.intValue;
		    }
		
		    public void setIntValue(int intValue) {
		        this.intValue = intValue;
		    }
		
		    public float getFloatValue() {
		        return this.floatValue;
		    }
		
		    public void setFloatValue(float floatValue) {
		        this.floatValue = floatValue;
		    }
		
		    public String getAttributeName() {
		        return this.attributeName;
		    }
		
		    public void setAttributeName(String attributeName) {
		        this.attributeName = attributeName;
		    }
		
		    @Override
		    public boolean equals(Object o) {
		        if (o == this)
		            return true;
		        if (!(o instanceof AttributeData)) {
		            return false;
		        }
		        AttributeData attributeData = (AttributeData) o;
		        return intValue == attributeData.intValue && floatValue == attributeData.floatValue && Objects.equals(attributeName, attributeData.attributeName);
		    }
		
		    @Override
		    public int hashCode() {
		        return Objects.hash(intValue, floatValue, attributeName);
		    }
		
		    @Override
		    public String toString() {
		        return "{" +
		            " intValue='" + getIntValue() + "'" +
		            ", floatValue='" + getFloatValue() + "'" +
		            ", attributeName='" + getAttributeName() + "'" +
		            "}";
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
	
	def CharSequence generateEntities(IFileSystemAccess2 fsa, Entities entities){
		fsa.generateFile("Entity.java", generateEntity)
		fsa.generateFile("EntityEnum.java", entities.generateEntityEnum)
		fsa.generateFile("EntityState.java", generateEntityState)
		
		'''
		private List<Entity> entities;
		private List<Entity> battleEntities;
		private Attribute attribute;
		
		private void createEntities(){
			�FOR entity : entities.entity�
			Entity �entity.name.toLowerCase� = new Entity();
			�entity.name.toLowerCase�.setName("�entity.name�");
			�entity.name.toLowerCase�.setType(�entity.EType.type.name�);
			�FOR move : entity.EMoves.move�
			�entity.name.toLowerCase�.addMoveData(Move.getInstance().getMove("�move.name�"));
			�ENDFOR�
			�FOR att : entity.att�
			�IF getNumberFromAtomicDab(att.av.an) instanceof Integer�
			�entity.name.toLowerCase�.addAttribute(AttributeData.createAttributeDataWithInt("�att.attribute.name�", �getNumberFromAtomicDab(att.av.an)�));
			�ELSEIF getNumberFromAtomicDab(att.av.an) instanceof Float�
			�entity.name.toLowerCase�.addAttribute(AttributeData.createAttributeDataWithFloat("�att.attribute.name�", �getNumberFromAtomicDab(att.av.an)�));
			�ENDIF�
			�ENDFOR�
			entities.add(�entity.name.toLowerCase�);
			�ENDFOR�
			
		}
		
		'''
	}
	
	def CharSequence generateEntity(){
		'''
		import java.util.*;
		import java.util.concurrent.*;
		public class Entity{
		    private String name;
		    private String type;
		    private EntityState state;
		    private List<AttributeData> attribute;
		    private List<AttributeData> changingAttributes;
		    private List<MoveData> moves;
		
		    public Entity(){
		      attribute = new ArrayList<>();
		      moves = new ArrayList<>();
		      changingAttributes = new CopyOnWriteArrayList<>();
		    }
		
		    public Entity(Entity e){
		      this();
		      this.name = e.getName();
		      this.type = e.getType();
		      this.state = e.getEntityState();
		      if(!e.getAttributes().isEmpty())
		        this.attribute.addAll(e.getAttributes());
		      if(!e.getChangingAttributes().isEmpty())
		        this.changingAttributes.addAll(e.getChangingAttributes());
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
		
		    public List<AttributeData> getChangingAttributes(){
		      return changingAttributes;
		    }
		
		    public EntityState getEntityState(){
		      return state;
		    }
		
		    public void setEntityState(EntityState state){
		      this.state = state;
		    }
		
		    public void addAttribute(AttributeData attribute){
		      this.attribute.add(attribute);
		      this.changingAttributes.add(attribute);
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
		
		    public void requestChange(AttributeChangeEvent attribute){
		      if(changingAttributes.contains(attribute.getPreviousState())){
		        changingAttributes.remove(attribute.getPreviousState());
		        changingAttributes.add(attribute.getTargetState());
		      }
		    }
		
		    public void die(){
		      state = EntityState.DEAD;
		      System.out.println("[" + this.toString() + "] " +  "Ufff I died");
		    }
		
		    @Override
		    public String toString() {
		      
		      return this.name;
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
	def dispatch Number getNumberFromAtomicDab(IntNum x){
		x.value
	}
	def dispatch Number getNumberFromAtomicDab(FloatNum x){
		val floatstring = x.i + "." + x.decimal
		Float.valueOf(floatstring)
	}
	
	def CharSequence generateLocation(Locations locations){
		
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
		        }
		    }
		
		
		}
		'''
	}
	
	def CharSequence generateMoves(IFileSystemAccess2 fsa, Moves moves){
		fsa.generateFile("Move.java", generateEntity)
		fsa.generateFile("MoveEnum.java", moves.generateMoveEnum)
		fsa.generateFile("EntityState.java", generateEntityState)
		
		
		
		'''
		
		private Move moves = Move.getInstance()
		
		private void addMoves(){
			MoveData tempMoveData;
			�FOR move : moves.move�
			tempMoveData = new MoveData();
			tempMoveData.setMoveName("�move.name�");
			tempMoveData.setType("�move.EType.type.name�");
				�FOR att : move.att�
				�IF getNumberFromAtomicDab(att.av.an) instanceof Integer�
				tempMoveData.addAttribute(AttributeData.createAttributeDataWithInt("�att.attribute.name�", �getNumberFromAtomicDab(att.av.an)�));
				�ELSEIF getNumberFromAtomicDab(att.av.an) instanceof Float�
				tempMoveData.addAttribute(AttributeData.createAttributeDataWithFloat("�att.attribute.name�", �getNumberFromAtomicDab(att.av.an)�));
				�ENDIF�
				�ENDFOR�
			�ENDFOR�
		}
		
		'''
		
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
	
	def generateMoveData(){
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

	def generateMoveEnum(Moves moves){
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
	
	def CharSequence generateTeams(IFileSystemAccess2 fsa, Teams teams){
		fsa.generateFile("Team.java", generateTeam())
		
		
		'''
		
		private Team team = new Team();
		
		private void createTeams(){
			�FOR team : teams.team�
			�addTeamMemberString(team)�
			�ENDFOR�
		}
		
		private Entity findEntityByName(String name){
			for(Entity e : entities){
				if(e.toString().equals(name){
					return e;
				}
			}
			return null;
		}
		
		'''
	}
	
	def String addTeamMemberString(Team team){
		var createTeamString = "team.addTeamMember(" + '"' + team.name + '"' + ", "
		var i = 1
		for(Entity e : team.members.entity){
			createTeamString += "findEntityByName(" + '"'+ e.name + '"' + ")"
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
	
	def generateType(){
		'''
		import java.util.*;
				
		public class Type{
				
			private List<String> types = new ArrayList<>();
			//private String typeName;
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
		}
		'''
	}

	def generateTypeEnum(Relations relation){
        '''
        public enum TypeEnum{
        �FOR type: relation.type �
            �type.name�,
        �ENDFOR�
        }
        '''
    }
	
	
}
