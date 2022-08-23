package com.luismorales17106494.a000ejeciciosdekotlinya

/*23 - POO - Conceptos de programación orientada a objetos
Kotlin nos permite utilizar la metodología de programación orientada a objetos.

Con la metodología de programación orientada a objetos (POO) se irán introduciendo conceptos
de objeto, clase, propiedad, campo, método, constructor, herencia etc. y de todos estos
temas se irán planteando problemas resueltos.

Prácticamente todos los lenguajes desarrollados en los últimos 25 años implementan la
posibilidad de trabajar con POO (Programación Orientada a Objetos)

Conceptos básicos de Objetos
Un objeto es una entidad independiente con sus propios datos y programación. Las ventanas,
menúes, carpetas de archivos pueden ser identificados como objetos; el motor de un auto
también es considerado un objeto, en este caso, sus datos (campos y propiedades) describen
sus características físicas y su programación (métodos) describen el funcionamiento interno
y su interrelación con otras partes del automóvil (también objetos).

El concepto renovador de la tecnología Orientación a Objetos es la suma de funciones
a elementos de datos, a esta unión se le llama encapsulamiento. Por ejemplo, un objeto
Auto contiene ruedas, motor, velocidad, color, etc, llamados atributos. Encapsulados con
estos datos se encuentran los métodos para arrancar, detenerse, dobla, frenar etc.
La responsabilidad de un objeto auto consiste en realizar las acciones apropiadas y
mantener actualizados sus datos internos. Cuando otra parte del programa (otros objetos)
necesitan que el auto realice alguna de estas tareas (por ejemplo, arrancar) le envía un
mensaje. A estos objetos que envían mensajes no les interesa la manera en que el objeto
auto lleva a cabo sus tareas ni las estructuras de datos que maneja, por ello, están
ocultos.
Entonces, un objeto contiene información pública, lo que necesitan los otros objetos
para interactuar con él e información privada, interna, lo que necesita el objeto para
operar y que es irrelevante para los otros objetos de la aplicación.

 */
fun main() {

    problema1()
}

fun problema1() {
    /*
    Implementaremos una clase llamada Persona que tendrá como propiedades (variables)
    su nombre y edad, y tres métodos (funciones), uno de dichos métodos inicializará
    las propiedades del nombre y la edad, otro método mostrará en la pantalla el contenido
    de las propiedades y por último uno que imprima si es mayor de edad.

    Definir dos objetos de la clase Persona.
     */
    val persona1 = Persona()
    persona1.inicializar("Lalo", 26)
    persona1.mostrarContenido()
    persona1.mayorEdad()
    val persona2 = Persona()
    persona2.inicializar("Edu", 16)
    persona2.mostrarContenido()
    persona2.mayorEdad()


}

class Persona {
    private var nombre: String = ""
    private var edad: Int = 0

    fun inicializar(nombre: String, edad: Int) {
        this.nombre = nombre
        this.edad = edad

    }

    fun mostrarContenido() {
        println("Nombre: $nombre\nEdad: $edad")
    }

    fun mayorEdad() = if (edad > 18) println("Es mayor de edad") else println("Es menor de edad")

}
