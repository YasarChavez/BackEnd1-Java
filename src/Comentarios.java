public class Comentarios {

    //TIPOS DE DATOS PRIMITIVOS

    /*Primitivos: Son predefinidos por el lenguaje. La biblioteca Java proporciona clases asociadas a
    estos tipos que proporcionan métodos que facilitan su manejo.*/

    /*
    byte Es un entero con signo de 8 bits, el mínimo valor que se puede almacenar es -128 y
    el máximo valor es de 127 (inclusive).

    short Es un entero con signo de 16 bits. El valor mínimo es -32,768 y el valor máximo 32,767 (inclusive).
    int Es un entero con signo de 32 bits. El valor mínimo es -2,147,483,648 y el valor
    máximo es 2,147,483,64 (inclusive). Generalmente es la opción por defecto.

    long Es un entero con signo de 64 bits, el valor mínimo que puede almacenar este tipo de
    dato es -9,223,372,036,854,775,808 y el máximo valor es 9,223,372,036,854,775,807 (inclusive).

    float Es un número decimal de precisión simple de 32 bits (IEEE 754 Punto Flotante).

    double Es un número decimal de precisión doble de 64 bits (IEEE 754 Punto Flotante).

    boolean Este tipo de dato sólo soporta dos posibles valores: verdadero o falso y el dato es
    representado con tan solo un bit de información.

    char El tipo de dato carácter es un simple carácter unicode de 16 bits. Su valor mínimo es
    de '\u0000' (En entero es 0) y su valor máximo es de '\uffff' (En entero es 65,535).
    Nota: un dato de tipo carácter se puede escribir entre comillas simples, por ejemplo
    'a', o también indicando su valor Unicode, por ejemplo '\u0061'.

    String Además de los tipos de datos primitivos el lenguaje de programación Java provee
    también un soporte especial para cadena de caracteres a través de la clase String.
    Encerrando la cadena de caracteres con comillas dobles se creará de manera
    automática una nueva instancia de un objeto tipo String.
    String cadena = “Sebastián”;
    Los objetos String son inmutables, esto significa que una vez creados, sus valores
    no pueden ser cambiados. Si bien esta clase no es técnicamente un tipo de dato
    primitivo, el lenguaje le da un soporte especial y hace parecer como si lo fuera.*/

    //VALORES POR DEFECTO
    /*En Java no siempre es necesario asignar valores cuando nuevos atributos son declarados.
    Cuando los atributos son declarados, pero no inicializados, el compilador les asignará un valor por
    defecto. A grandes rasgos el valor por defecto será cero o null dependiendo del tipo de dato. La
    siguiente tabla resume los valores por defecto dependiendo del tipo de dato.*/

    /*
    byte 0
    short 0
    int 0
    long 0
    float 0.0
    double 0.0
    boolean False
    char '\u0000'
    String Null
    Objetos Null
     */

    //Operadores Aritméticos
    /*

    + Operador de Suma
    - Operador de Resta
    * Operador de Multiplicación
    / Operador de División
    % Operador de Módulo

     */
    //Operadores Unarios
    /*

    + Operador Unario de Suma; indica que el valor es positivo.
    - Operador Unario de Resta; indica que el valor es negativo.
    ++ Operador de Incremento.
    -- Operador de Decremento.

     */

    //Operadores de Igualdad y Relación
    /*

    == Igual
    != Distinto
    > Mayor que
    >= Mayor o igual que
    < Menor que
    <= Menor o igual que

     */

    //Operadores lógicos.
    /*

    Operador	Descripción	            Sintaxis
    &&	        And lógico (y)	        a && b
    ||	        Or lógico (o)	        a || b
    !	        Negación lógica (no)	!a

     */


}
