/**
 * 
 */
package de.shingiro.entity;

import org.junit.Before;
import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

/**
 * Unit Test class for Kind entity
 * 
 * @author a.shingiro
 *
 */
public class KindTest {

	@Before
	public void init() {
		
		// TODO: Reimplement me!
		/*
		PojoValidator pojoValidator = new PojoValidator();
		pojoValidator.addRule(new NoPublicFieldsRule());
		pojoValidator.addRule(new NoStaticExceptFinalRule());
		pojoValidator.addRule(new GetterMustExistRule());
		pojoValidator.addRule(new SetterMustExistRule());
	
		
		PojoClass kindClass = PojoClassFactory.getPojoClass(Kind.class);
		
		Validator validator = ValidatorBuilder.create();
		*/
	}
	
	@Test
	public void testGetterSetter() {
		
		// TODO: Reimplement me!
		/*
		PojoClass kindClass = PojoClassFactory.getPojoClass(Kind.class);
		
		Validator validator = ValidatorBuilder.create()
	            .with(new GetterMustExistRule())
	            .with(new SetterMustExistRule())
	            .with(new SetterTester())
	            .with(new GetterTester())
	            .build();

	    validator.validate(kindClass);
	    */
	}

	@Test
	public void testEqualsAndHashcode() {
		EqualsVerifier.forClass(Fahrer.class).usingGetClass().verify();
	}
}
