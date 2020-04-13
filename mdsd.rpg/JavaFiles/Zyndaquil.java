import java.util.*;
		public class Zyndaquil {
			private Type type = new Type("fire");
			private Set<Attribute> attributes = new HashSet<>();
			//private Move move = new Move("Ember");
			private Attribute maxHP = Attribute.createAttributeWithInt(AttributeEnum.MAX_HP.toString(), 10);
			private Attribute currentHP = Attribute.createAttributeWithInt(AttributeEnum.CURRENT_HP.toString(), 10);

			public Zyndaquil (Type type, Set<Move> moves, Set<Attribute> atrributes){
			//	move.addMove("Ember");
			}
			
			public Attribute getMaxHP(){
				return maxHP;
			}
			
			public Attribute getCurrentHP(){
				return currentHP;
			}
			
			public void setCurrentHP(int currentHP){
				 this.currentHP.setValue(currentHP);
			}
			
			public Set<Attribute> getEntityAttributes(){
				return attributes;
			}
			
		}