import java.util.*;
		
		public class Move{
			private Set<String> setOfMoves = new HashSet<>();
			private String moveName;
            private Type type;
            private Attribute attribute;
			private Set<Attribute> attributes = new HashSet<>();
			private List<Effect> effects = new ArrayList<>();
			
			private Set<Attribute> entityAttributes = new HashSet<>();
			
			public class Effect{
				
			}
			
			private Attribute attributePP, attributePower;
			
			public Move(String moveName, Type type, Set<Attribute> moveAttributes){
                this.moveName = moveName;
                this.type = type;
                attribute = Attribute.getInstance();
                attribute.getAttributes();
				
				if (type != null){
					 type = new Type("fire");
				}
				
				if (!attributes.isEmpty()) {
					int pp = 25;
					int power = 45;
					
				    attributePP = Attribute.createAttributeWithInt(AttributeEnum.PP.toString(), pp);
					attributePower = Attribute.createAttributeWithInt(AttributeEnum.POWER.toString(), power);
                    attributes.add(attributePP);
                    attributes.add(attributePower);
					//if ()
					
                }
                
                if (!moveName.isEmpty()){
                    addMove(moveName);
               }
				
				
			}
			
			
			public void addMove(String move){
				setOfMoves.add(move);
			}
			
		}