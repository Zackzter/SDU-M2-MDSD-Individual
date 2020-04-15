import java.util.*;

public class Attribute {
    private Set<AttributeData> attributes = new HashSet<>();

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
    
    public Set<AttributeData> getAttributes() {
        return attributes;
    }



    // public Set<Attribute> addExtendedAttribute(Map<String,Number> extendedAttributes, Set<Attribute> attributes) {
    //     Set<Attribute> attributess = new HashSet<>();
    //     for (String attributeName : extendedAttributes.keySet()) {
    //         if (getAttributes().contains(attributeName)) {
    //             Number value = extendedAttributes.get(attributeName);
    //             if (value instanceof Integer) {
    //                 attributess.add(createAttributeWithInt(attributeName, value.intValue()));
    //             } else if (value instanceof Float) {
    //                 attributess.add(createAttributeWithFloat(attributeName, value.floatValue()));
    //             }
    //         }
    //     }
    //     return attributess;
    // }

}