/**
 * 
 */
package de.shingiro.entity;

import org.junit.Test;

import com.openpojo.reflection.PojoClass;
import com.openpojo.reflection.impl.PojoClassFactory;
import com.openpojo.validation.Validator;
import com.openpojo.validation.ValidatorBuilder;
import com.openpojo.validation.rule.impl.GetterMustExistRule;
import com.openpojo.validation.rule.impl.SetterMustExistRule;
import com.openpojo.validation.test.impl.GetterTester;
import com.openpojo.validation.test.impl.SetterTester;

import nl.jqno.equalsverifier.EqualsVerifier;

/**
 * Unit test class for Fahrt entity
 * 
 * @author angedesires
 *
 */
public class FahrtTest {

	@Test
	public void testGetterSetter() {
		
		PojoClass fahrtClass = PojoClassFactory.getPojoClass(Fahrt.class);
		
		Validator validaror = ValidatorBuilder.create()
				.with(new GetterMustExistRule())
				.with(new SetterMustExistRule())
				.with(new SetterTester())
				.with(new GetterTester())
				.build();
		
		validaror.validate(fahrtClass);
		
	}
	
	@Test
	public void testEqualsAndHashcode() {
		EqualsVerifier.forClass(Fahrt.class).usingGetClass().verify();
	}
}
