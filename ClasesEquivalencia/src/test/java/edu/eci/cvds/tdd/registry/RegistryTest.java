package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void validateRegistryResult() {
    	Gender genero= Gender.MALE;
    	
        Person person = new Person("Pepito Perez",1024149568,19,genero,true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.VALID, result);
    }
    
    @Test
    public void deberiaPasarSiLaPersonaEstaMuerta() {
    	Gender genero= Gender.FEMALE;
    	
    	Person person = new Person("Pepita Perez",1019149500,22,genero,false);
    	
    	RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.DEAD, result);
    }

    @Test
    public void deberiaPasarSiLaPersonaEsMenorDeEdad() {
    	Gender genero= Gender.MALE;
    	
    	Person person = new Person("Lionel Messi",52186475,15,genero,true);
    	
    	RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }
    
    @Test
    public void deberiaFallarSiLaEdadEsValida() {
    	Gender genero= Gender.UNIDENTIFIED;
    	
    	Person person = new Person("Alvaro Uribe",52135000,150,genero,true);
    	
    	RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }
    
    @Test
    public void noDebeEstarDuplicadaLaPersona() {
    	//Registro de la persona
    	Gender genero0= Gender.FEMALE;
    	
    	Person person0 = new Person("Pepito Perez",1024149568,19,genero0,true);
    	
    	registry.registerVoter(person0);
    	
    	//Nuevo intento de registro de la persona
    	Gender genero= Gender.FEMALE;
    	
    	Person person = new Person("Pepito Perez",1024149568,19,genero,true);
    	
    	RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.DUPLICATED, result);
    }
}