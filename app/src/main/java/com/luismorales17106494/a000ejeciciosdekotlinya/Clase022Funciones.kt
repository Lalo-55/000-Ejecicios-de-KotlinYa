package com.luismorales17106494.a000ejeciciosdekotlinya

import java.util.function.IntToDoubleFunction


class Clase022Funciones {
    /*
    22 - Funciones: parámetros y retorno de datos tipo arreglo
    Hemos visto el objetivo de plantear funciones en un programa y que las mismas
    pueden recibir datos por medio de parámetros y retornar un dato.
    Los parámetros de una función pueden ser de tipo Int, Char, Float etc. como hemos visto
    en conceptos anteriores pero también pueden ser de tipo arreglo como veremos en este
    concepto.
     */

    fun problema1() {
        /*
        Problema 1
        Definir en la función main un arreglo de enteros de 5 elementos.
        Declarar dos funciones, en una efectuar la carga de sus elementos y
        en la otra su impresión.
         */
        val arreglo = IntArray(5)
        cargaElementosProb1(arreglo)
        imprimirElementosProb1(arreglo)

    }

    private fun cargaElementosProb1(arreglo: IntArray) {
        arreglo.forEachIndexed { index, elemento ->
            println("ingrese elemento: ")
            arreglo[index] = readLine()!!.toInt()
        }

    }

    private fun imprimirElementosProb1(arreglo: IntArray) {
        arreglo.forEach {
            print("$it ")
        }
    }

    fun problema2() {
        /*
        Problema 2
        Se desea almacenar los sueldos de operarios.
        Cuando se ejecuta el programa se debe pedir la cantidad de sueldos a ingresar.
        Luego crear un arreglo con dicho tamaño.
        Definir una función de carga y otra de impresión.
         */
        println("Cuantos sueldo desea cargar: ")
        val cantidad = readLine()!!.toInt()
        val sueldos = IntArray(cantidad)
        cargaElementosProb2(sueldos)
        imprimirElementosProb2(sueldos)

    }

    private fun cargaElementosProb2(sueldos: IntArray) {
        sueldos.forEachIndexed { index, elemento ->
            println("Ingrese el sueldo: ")
            sueldos[index] = readLine()!!.toInt()
        }
    }

    private fun imprimirElementosProb2(sueldos: IntArray) {
        sueldos.forEach {
            println(it)
        }
    }

    fun ejercicio1() {
        /*
        Ejercicio 1
        Desarrollar un programa que permita ingresar un arreglo de n elementos,
        ingresar n por teclado.
        Elaborar dos funciones una donde se lo cree y cargue al arreglo
        y otra que sume todos sus elementos y retorne dicho valor a la main
        donde se lo imprima.
         */
        val arreglo = cargarElementosEjer1()
        val suma = sumaDeElementosEjer1(arreglo)
        println("La suma es : $suma")
    }

    private fun cargarElementosEjer1(): IntArray {
        println("Ingrese el número de elementos a ingresar: ")
        val cantidad = readLine()!!.toInt()
        val arreglo = IntArray(cantidad)

        for (index in arreglo.indices) {
            println("Ingrese el elemento: ")
            arreglo[index] = readLine()!!.toInt()
        }
        return arreglo

    }

    private fun sumaDeElementosEjer1(arreglo: IntArray): Int {
        var suma = 0
        for (index in arreglo.indices) {
            suma += arreglo[index]
        }
        return suma

    }

    fun ejercicio2() {
        /*
        Ejercicio 2
        Cargar un arreglo de n elementos. Imprimir el menor elemento
         */
        val arreglo = cargarElementosEjer1()
        val elementoMenor = elementoMenorEjer2(arreglo)
        println("El elemento menor es: $elementoMenor")
    }

    private fun elementoMenorEjer2(arreglo: IntArray): Any {
        var menor = arreglo[0]
        for (index in arreglo.indices) {
            if (menor > arreglo[index]) menor = arreglo[index]


        }
        return menor

    }
}