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
- **Clase de equivalencia 1:** El que una persona esté viva o muerta tiene precedencia a cualquier valor que su edad pueda tomar o a su previa existencia en la lista de registrados.
	1. **DEAD:** Cuando la persona registrada está muerta.
	2. **UNDERAGE:** Cuando la persona está viva y su edad está entre 0 y 17 años.
	3. **INVALID_AGE:** Cuando la edad de la persona es un número negativo o un número mayor a 130 años.
	4. **VALID:** Cuando la persona registrada esté viva y esté en un rango de edad entre 18 y 130 años.
	5. **DUPLICATED:** Cuando una persona se intenta registrar más de una vez.
- Clase de equivalencia 2:
	1. **MALE:** Cuando la persona registrada es de género masculino.
	2. **FEMALE:** Cuando la persona registrada es de género femenino.
	3. **UNDENTIFIED:** Cuando la persona no se identifica con ninguno de los dos géneros.

## Descuento de tarifas
1. De acuerdo con lo indicado, y teniendo en cuenta que NO hay precondiciones, en qué casos se debería arrojar una excepción de tipo ExcepcionParametrosInvalidos?. Agregue esto a la especificación
	- Arroja la excepción cuando los días de antelación son iguales o menores a 0.
	- Arroja la excepción cuando la edad es menor a 0 o mayor a 130 años.
	- Cuando la tarifa base es menor o igual a 0.
2. En la siguiente tabla enumere un conjunto de clases de equivalencia que -según usted- creen una buena división del conjunto de datos de entrada de la función anterior:

	| Numero | Clase de equivalencia | Resultado |
	| :---:         |     ---     |          :--- |
	| 1   | La tarifa base es mayor a 0     | Correcto    |
	| 2     | La tarifa base es menor o igual a 0       | Incorrecto      |
	| 3     | Los días de antelación son menores o iguales a 0       | Incorrecto      |
	| 4    | Los días de antelación son mayores a 0       | Correcto      |
	| 5     | La edad se encuenta en el rango de 0 a 130 años       | Correcto      |
	| 6     | La edad es menor a 0 o mayor a 130 años       | Incorrecto      |
3. Para cada clase de equivalencia, defina un caso de prueba específico, definiendo: parámetros de entrada y resultados esperados.