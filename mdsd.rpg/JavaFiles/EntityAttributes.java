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