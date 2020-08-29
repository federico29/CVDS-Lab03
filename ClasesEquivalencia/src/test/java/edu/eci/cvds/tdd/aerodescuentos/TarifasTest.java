package edu.eci.cvds.tdd.aerodescuentos;
import edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos;

import org.junit.Assert;
import org.junit.Test;
public class TarifasTest {
	@Test
    public void deberiaAplicar20DeDescuento() {
		CalculadorDescuentos c=new CalculadorDescuentos();
		long s=(long) c.calculoTarifa(2000000, 23, 15);
		Assert.assertEquals(400000, s);
    }
}
