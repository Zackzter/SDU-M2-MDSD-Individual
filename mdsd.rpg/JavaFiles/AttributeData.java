package mdsd.rpg.JavaFiles;


public class AttributeData {

    private int intValue;
    private float floatValue;
    private String attributeName;

    public AttributeData() {
    }

    public AttributeData(int intValue, float floatValue, String attributeName) {
        this.intValue = intValue;
        this.floatValue = floatValue;
        this.attributeName = attributeName;
    }

    public static AttributeData createAttributeWithStringAndDefaultValues(String s){
        AttributeData a = new AttributeData();
        a.setAttributeName(s);
        a.setFloatValue(45.0f);
        a.setIntValue(45);
        Attribute ab = Attribute.getInstance();
        ab.addAttribute(a);
        a = null;
        return a;
    }
    
    public static AttributeData createAttributeDataWithFloat(String attributeData, float f) {
        AttributeData a = new AttributeData();
        a.setAttributeName(attributeData);
        a.setFloatValue(f);
        Attribute ab = Attribute.getInstance();
        ab.addAttribute(a);
        a = null;
        return a;
    }

    public static AttributeData createAttributeDataWithInt(String attributeData, int i) {
        AttributeData a = new AttributeData();
        a.setAttributeName(attributeData);
        a.setIntValue(i);
        Attribute ab = Attribute.getInstance();
        ab.addAttribute(a);
        a = null;
        return a;
    }

    public int getIntValue() {
        return this.intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public float getFloatValue() {
        return this.floatValue;
    }

    public void setFloatValue(float floatValue) {
        this.floatValue = floatValue;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof AttributeData)) {
            return false;
        }
        AttributeData attributeData = (AttributeData) o;
        return intValue == attributeData.intValue && floatValue == attributeData.floatValue && Objects.equals(attributeName, attributeData.attributeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(intValue, floatValue, attributeName);
    }

    @Override
    public String toString() {
        return "{" +
            " intValue='" + getIntValue() + "'" +
            ", floatValue='" + getFloatValue() + "'" +
            ", attributeName='" + getAttributeName() + "'" +
            "}";
    }

}