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