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
}