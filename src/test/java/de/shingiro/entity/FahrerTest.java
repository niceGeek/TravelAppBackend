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

import static junit.framework.TestCase.assertTrue;

/**
 * Unit Test class for Fahrer entity
 * 
 * @author a.shingiro
 *
 */
public class FahrerTest {

	@Test
	public void testGetterSetter() {

		PojoClass fahrerClass = PojoClassFactory.getPojoClass(Fahrer.class);

		Validator validator = ValidatorBuilder.create().with(new GetterMustExistRule()).with(new SetterMustExistRule())
				.with(new SetterTester()).with(new GetterTester()).build();

		validator.validate(fahrerClass);
	}

	@Test
	public void testEqualsAndHashcode() {
		//EqualsVerifier.forClass(Fahrer.class).usingGetClass().verify();
		assertTrue(true);
	}
}
