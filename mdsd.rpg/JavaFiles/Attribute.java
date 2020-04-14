import java.util.*;
		
		public class Attribute{
			//private Map<String, ? extends number> mapOfAttributes = new HashMap<>();
			
			
			private String pp = AttributeEnum.pp.toString();
			private String power = AttributeEnum.power.toString();
			private String current_hp = AttributeEnum.current_hp.toString();
			private String speed = AttributeEnum.speed.toString();
			private String max_hp = AttributeEnum.max_hp.toString();
		
            private String attributeName;

            private Set<String> attributes = new HashSet<>();

            private int intValue;
            private float floatValue;
            private static Attribute attribute;

            private Attribute(){}

                
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

            public float getFloatValue(){
		        return floatValue;
            }
            
            public int getIntValue(){
		        return intValue;
            }

            public Set<String> getAttributes(){
                return attributes;
            }

            public Set<Attribute> addExtendedAttribute(Map<String, Number> extendedAttributes, Set<Attribute> attributes){
                Set<Attribute> attributess = new HashSet<>();
                for(String attributeName : extendedAttributes.keySet()){
                    if(getAttributes().contains(attributeName)){
                        Number value = extendedAttributes.get(attributeName);
                        if(value instanceof Integer){
                            attributess.add(createAttributeWithInt(attributeName, value.intValue()));
                        }
                        else if (value instanceof Float){
                            attributess.add(createAttributeWithFloat(attributeName, value.floatValue()));
                        }
                    }
                }
                return attributess;
            }
            
            
		}