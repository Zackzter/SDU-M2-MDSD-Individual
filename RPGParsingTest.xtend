/*
 * generated by Xtext 2.21.0
 */
package mdsd.tests

import com.google.inject.Inject
import mdsd.rPG.SystemRPG
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import mdsd.rPG.Entities
import mdsd.rPG.Entity
import org.eclipse.emf.ecore.EObject
import mdsd.rPG.Move
import mdsd.rPG.Speed
import mdsd.rPG.EntityAttribute
import mdsd.rPG.AltAttribute

@ExtendWith(InjectionExtension)
@InjectWith(RPGInjectorProvider)
class RPGParsingTest {
	
	// Locations | Relations | Moves | Entities | Teams | Death | Attributes | Effects
	
	@Inject
	ParseHelper<SystemRPG> parseHelper
	
	@Test
	def void T00_loadModel() {

		val result = parseHelper.parse('''
			game TestGame
			
			location Test opponents TestTeamB terrain TestTerrain type one
			
			relations
				type one
					zero < one < two
			
			attributes
				attribute testAttributeOne is Integer
				attribute testAttributeTwo is Integer
				
			death require testAttributeOne <= 0
			
			speed_value testAttributeTwo
			
			effects
			    effect move TestEffect 
			    if testAttributeTwo > 0 then target testAttributeOne is testAttributeOne-1
			    
			moves
				move testMove type one
					attribute testAttributeTwo is Integer
					effect move TestEffect
			
			entities
				entity TestEntityOne type one
					attribute testAttributeOne is 5
					attribute testAttributeTwo is 6					
					move testMove
				entity TestEntityTwo type one
					attribute testAttributeOne is 5
					attribute testAttributeTwo is 6					
					local testLocalAttribute is 5
					move testMove
					
			teams size 1
				team TestTeamA
					members TestEntityOne
				team TestTeamB
					members TestEntityTwo
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: �errors.join(", ")�''')
	}
	
	@Test
	def void T01_testDeclarationSize() {
		val result = parseHelper.parse('''
			game TestGame
			
			location Test opponents TestTeamB terrain TestTerrain type one
			
			relations
				type one
					zero < one < two
			
			attributes
				attribute testAttributeOne is Integer
				attribute testAttributeTwo is Integer
				
			death require testAttributeOne <= 0
			
			speed_value testAttributeTwo
			
			effects
			    effect move TestEffect 
			    if testAttributeTwo > 0 then target testAttributeOne is testAttributeOne-1
			    
			moves
				move testMove type one
					attribute testAttributeTwo is Integer
					effect move TestEffect
			
			entities
				entity TestEntityOne type one
					attribute testAttributeOne is 5
					attribute testAttributeTwo is 6					
					move testMove
				entity TestEntityTwo type one
					attribute testAttributeOne is 5
					attribute testAttributeTwo is 6					
					local testLocalAttribute is 5
					move testMove
					
			teams size 1
				team TestTeamA
					members TestEntityOne
				team TestTeamB
					members TestEntityTwo
		''')
		Assertions.assertEquals(result.declarations.size(), 9)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: �errors.join(", ")�''')
	}
	 
	@Test
	def void T02_testParseEntities() {
		val result = parseHelper.parse('''
			game TestGame
			
			location Test opponents TestTeamB terrain TestTerrain type one
			
			relations
				type one
					zero < one < two
			
			attributes
				attribute testAttributeOne is Integer
				attribute testAttributeTwo is Integer
				
			death require testAttributeOne <= 0
			
			speed_value testAttributeTwo
			
			effects
			    effect move TestEffect 
			    if testAttributeTwo > 0 then target testAttributeOne is testAttributeOne-1
			    
			moves
				move testMove type one
					attribute testAttributeTwo is Integer
					effect move TestEffect
			
			entities
				entity TestEntityOne type one
					attribute testAttributeOne is 5
					attribute testAttributeTwo is 6					
					move testMove
				entity TestEntityTwo type one
					attribute testAttributeOne is 5
					attribute testAttributeTwo is 6					
					local testLocalAttribute is 5
					move testMove
					
			teams size 1
				team TestTeamA
					members TestEntityOne
				team TestTeamB
					members TestEntityTwo
		''')
		Assertions.assertTrue(result.declarations.get(7) instanceof Entities)
		Assertions.assertTrue(result.declarations.get(7).eContents.size == 2)
		
		val speedAttribute = result.declarations.get(4) as Speed
		val speedName = speedAttribute.speedValue.name
		
		for(EObject e : result.declarations.get(7).eContents) {
			val temp = e as Entity
			Assertions.assertTrue(temp.name == "TestEntityOne" || temp.name == "TestEntityTwo")
			Assertions.assertTrue(temp.EMoves.move.size > 0)
			Assertions.assertTrue(temp.EMoves.move.get(0) instanceof Move)
			Assertions.assertTrue(temp.EMoves.move.get(0).name == "testMove")
			var checkSpeed = false
			for(EntityAttribute attributes : temp.attributes){
				if(attributes instanceof AltAttribute){
					if(attributes.attribute.name.equals(speedName)) checkSpeed = true
				}
			}
			Assertions.assertTrue(checkSpeed)
		}
		
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: �errors.join(", ")�''')
	}
	
	
	
}
