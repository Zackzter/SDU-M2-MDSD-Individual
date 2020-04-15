package mdsd.rpg.JavaFiles;


import java.util.*;
		
public class Type{
		
	private Set<String> types = new HashSet<>();
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

	public Set<String> getTypes(){
		return types;
	}
}