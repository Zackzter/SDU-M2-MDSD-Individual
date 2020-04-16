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