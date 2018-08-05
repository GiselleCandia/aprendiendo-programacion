/*
 * En esta lección vamos a aprender lo básico para empezar a ejecutar programas y ver su resultado.
 *
 * Los contenidos son:
 *      - como ejecutar un programa en IntelliJ
 *      - donde leer el resultado de la ejecución de un programa
 *      - entender la función "println()"
 *      - entender como crear texto en un programa (String)
 *
 * Al final de este archivo vas a ver una linea de texto con colores que contiene "fun main(args: Array<String>) {".
 * Ese texto es una función que sirve como punto de entrada de un programa. No te preocupes si esto no tiene sentido
 * ahora.
 *
 * Por ahora solo seguime la corriente.  Hacé click derecho sobre cualquier parte de este archivo y vas a ver parecer una
 * lista interminable de commandos. De esa lista sólo estamos interesados en un ítem que tiene un triángulo verde y que
 * dice "Run 1_primer_programaKt...".
 *
 * Seleccioná "Run 1_primer_programaKt..." y vas a ver animaciónes en la parte de abajo de Intellij seguido de una ventana
 * que se abre. Si mirás bien, el título de esa ventana es "Run" y tiene el texto "Hola mundo" en ella. Ese es el
 * resultado de tu programa !
 *
 * Pero, que es ese programa ?
 *
 * Este programa usa la función "println()", println es una abreviación de "print line" que significa "imprimir linea".
 * En resumen, la función "println()" sirve para escribir una linea de texto en la salida del programa.
 *
 * Si te fijás bien, en el programa "Hola Mundo" está escrito entre comillas, pero en la salida no tiene las commillas.
 * La razón para eso es que un programa está escrito con texto.
 *
 * Las comillas sirven para diferenciar los comandos del "texto" que vamos a usar como texto real. El "texto" en un programa
 * se llama "String" y tiene que estar entre comillas.
 *
 */
fun main(args: Array<String>) {
    println("Hola Mundo")
}