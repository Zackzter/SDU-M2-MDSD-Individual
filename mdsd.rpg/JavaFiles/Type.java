import java.util.*;
		
		public class Type{
			
			private Set<String> setOfTypes = new HashSet<>();
			private String typeName;
			
			
			public Type(String typeName){
				this.typeName = typeName;
				if(!typeName.isEmpty()){
					addType(typeName);
					}
				}
						
			public void addType(String type){
				setOfTypes.add(type);
				}
		}