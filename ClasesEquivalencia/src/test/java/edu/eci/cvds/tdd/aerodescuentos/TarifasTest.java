package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Test;

import junit.framework.*;

public class TarifasTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void deberiaHacer0PorcientoDeDescuento() throws Exception {
		// No pidio el billete con antelacion superior a 20 d�as y esta entre 18 y 65 a�os= 5 d�as y 25 a�os
		// Se espera un descuento de 0 por lo que el valor final de billete ser� de 2.000.000
		double nuevaTarifa = CalculadorDescuentos.calculoTarifa(2000000, 5, 25);
		Assert.assertEquals((double)2000000,nuevaTarifa);	
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void deberiaHacer15PorcientoDeDescuento() throws Exception {
		// 15% de descuento sacando el billete con antelaci�n superior a 20 d�as: 30 d�as
		// Se espera un descuento de 300.000 por lo que el valor final de billete ser� de 1.700.000
		double nuevaTarifa = CalculadorDescuentos.calculoTarifa(2000000, 30, 25);
		Assert.assertEquals((double)1700000,nuevaTarifa);	
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void deberiaHacer5PorcientoDeDescuento() throws Exception {
		// 5% de descuento a los pasajeros con edad inferior a 18 a�os: 15 a�os
		// Se espera un descuento de 100.000 por lo que el valor final de billete ser� de 1.900.000
		double nuevaTarifa = CalculadorDescuentos.calculoTarifa(2000000, 2, 15);
		Assert.assertEquals((double)1900000,nuevaTarifa);	
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void deberiaHacer20PorcientoDeDescuento() throws Exception {
		// 15% de descuento sacando el billete con antelaci�n superior a 20 d�as: 30 d�as
		// 5% de descuento a los pasajeros con edad inferior a 18 a�os: 15 a�os
		// Se espera un descuento de 400.000 por lo que el valor final de billete ser� de 1.600.000
		double nuevaTarifa = CalculadorDescuentos.calculoTarifa(2000000, 30, 15);
		Assert.assertEquals((double)1600000,nuevaTarifa);	
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void deberiaHacer8PorcientoDeDescuento() throws Exception {
		// 8% de descuento a los pasajeros con edad superior a 65 a�os: 70 a�os
		// Se espera un descuento de 160.000 por lo que el valor final de billete ser� de 1.840.000
		double nuevaTarifa = CalculadorDescuentos.calculoTarifa(2000000, 2, 70);
		Assert.assertEquals((double)1840000,nuevaTarifa);	
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void deberiaHacer23PorcientoDeDescuento() throws Exception {
		// 15% de descuento sacando el billete con antelaci�n superior a 20 d�as: 30 d�as
		// 8% de descuento a los pasajeros con edad superior a 65 a�os: 70 a�os
		// Se espera un descuento de 460.000 por lo que el valor final de billete ser� de 1.540.000
		double nuevaTarifa = CalculadorDescuentos.calculoTarifa(2000000, 30, 70);
		Assert.assertEquals((double)1540000,nuevaTarifa);	
	}
}














