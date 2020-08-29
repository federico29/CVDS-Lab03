# CVDS-Lab03
### Integrantes:
- Ricardo Amaya Rivera
- Federico Barrios Meneses
##  Compilar y Ejecutar
El comando para ejecutar las pruebas unitarias de un proyecto en Maven es `mvn test`.
### Ejecutar las pruebas:
Al ejecutar las pruebas por segunda vez la diferencia fue que en la primera se ejecutó solo la clase de prueba AppTest y en la consola nos salía lo siguiente: `Tests run: 1, Failures: 0, Errors: 0, Skipped: 0`.
Pero al ejecutar las pruebas por segunda vez, después de añadir la clase RegistryTest el resultado que nos dio fue el siguiente: `Tests run: 2, Failures: 0, Errors: 0, Skipped: 0`.

## Finalizar el ejercicio
**Piense en los casos de equivalencia que se pueden generar del ejercicio para la registraduría, dadas las condiciones. Deben ser al menos 5:**
-  El que una persona esté viva o muerta tiene precedencia a cualquier valor que su edad pueda tomar o a su previa existencia en la lista de registrados.
     | **Nombre**| **Clase de equivalencia** |
	| :---       |     ---     |
	| **DEAD**|  Cuando la persona registrada está muerta|
	| **UNDERAGE**| Cuando la persona está viva y su edad está entre 0 y 17 años|
	| **INVALID_AGE**| Cuando la edad de la persona es un número negativo o un número mayor a 130 años|
	| **VALID**| Cuando la persona registrada esté viva y esté en un rango de edad entre 18 y 130 años|
	| **DUPLICATED**| Cuando una persona se intenta registrar más de una vez|

## Descuento de tarifas
1. De acuerdo con lo indicado, y teniendo en cuenta que NO hay precondiciones, en qué casos se debería arrojar una excepción de tipo ExcepcionParametrosInvalidos?. Agregue esto a la especificación
	- Arroja la excepción cuando los días de antelación son iguales o menores a 0.
	- Arroja la excepción cuando la edad es menor a 0 o mayor a 130 años.
	- Cuando la tarifa base es menor o igual a 0.
	``` 
	/** 
		calcular la tarifa de cada billete según el trayecto, la antelación en la que se 
		obtiene el billete y la edad del pasajero, de acuerdo con la normativa 005. 
		@param tarifaBase valor base del vuelo 
		@param diasAntelacion dias de antelación del vuelo 
		@param edad - edad del pasajero 
		@throws ExcepcionParametrosInvalidos diasAntelacion<=0 edad<0||130<edad tarifaBase<=0
	**/ 
	public long calculoTarifa(long tarifaBase, int diasAntelacion, int edad)
	```
2. En la siguiente tabla enumere un conjunto de clases de equivalencia que -según usted- creen una buena división del conjunto de datos de entrada de la función anterior:

	| Número | Clase de equivalencia | Resultado |
	| :---:         |     ---     |          :--- |
	| 1| días de antelación entre [0,20] y edad entre [18, 65]| Correcto|
	| 2| días de antelación > 20 y edad entre [18, 65]| Correcto|
	| 3| días de antelación entre [0,20] y edad entre (0, 18) | Correcto|
	| 4| días de antelación > 20 y edad entre (0, 18)| Correcto|
	| 5| días de antelación entre [0,20] y edad entre (65, 120) | Correcto|
	| 6| días de antelación > 20 y edad entre (65, 120) | Correcto|

	
3. Para cada clase de equivalencia, defina un caso de prueba específico, definiendo: parámetros de entrada y resultados esperados.
	> Dirigirse a  `src/test/java/edu/eci/cvds/tdd/aerodescuentos` y ver `TarifasTest.java`
4. A partir de las clases de equivalencia identificadas en el punto 2, identifique las condiciones límite o de frontera de las mismas.
5. Para cada una de las condiciones de frontera anteriores, defina casos de prueba específicos