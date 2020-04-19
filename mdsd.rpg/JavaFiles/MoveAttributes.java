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