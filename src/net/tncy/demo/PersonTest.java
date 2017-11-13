package net.tncy.demo;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Date;
import java.util.Set;
import javax.validation.ValidatorFactory;
import javax.validation.*;

public class PersonTest {

    @Test
    public void testFunctional(){
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Date date = new Date(1995, 1, 22);
        Person p = new Person("Claire", "Schultz", date, "FR", 22);

        Set<ConstraintViolation<Person>> constraintViolations = validator.validate(p);
        assertEquals(0, constraintViolations.size());
    }

    @Test
    public void testWrongFirstName(){
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Date date = new Date(1995, 1, 22);
        Person p = new Person("", "Schultz", date, "FR", 22);

        Set<ConstraintViolation<Person>> constraintViolations = validator.validate(p);
        assertEquals(1, constraintViolations.size());

    }

}