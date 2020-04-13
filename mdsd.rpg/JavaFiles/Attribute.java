import java.util.*;
		
		public class Attribute{
			//private Map<String, ? extends number> mapOfAttributes = new HashMap<>();
			
			
			private String pp = AttributeEnum.PP.toString();
			private String power = AttributeEnum.POWER.toString();
			private String current_hp = AttributeEnum.CURRENT_HP.toString();
			private String speed = AttributeEnum.SPEED.toString();
			private String max_hp = AttributeEnum.MAX_HP.toString();
		
            private String attributeName;

            private Set<String> attributes = new HashSet<>();

            private int intValue;
            private float floatValue;
            private static Attribute attribute;

            private Attribute(){
            }

                public void setAttributeName(String name){
                    this.attributeName = name;
                }
                public static Attribute getInstance(){
                    if (attribute == null) {
                        attribute = new Attribute();
                    }
                    return attribute;
                }

            public void addAttribute(String attribute){
                attributes.add(attribute);
            }
		
		    public static Attribute createAttributeWithFloat(String attribute, float f){
              Attribute a = new Attribute();
              a.setAttributeName(attribute);
		      a.setValue(f);
		      return a;
		    }
		
		    public static Attribute createAttributeWithInt(String attribute, int i){
              Attribute a = new Attribute();
              a.setAttributeName(attribute);
		      a.setValue(i);
		      return a; 
		    }
		
		    public void setValue(float f){
		        floatValue = f;
            }
            
            public void setIntValue(int i){
		        intValue = i;
            }

            public Set<String> getAttributes(){
                return attributes;
            }
            
            
		}