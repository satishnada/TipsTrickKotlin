package com.satish.tipstrickkotlin

/**
 * @Author: Satish Nada
 * @Date: 07/04/23
 */

fun main() {
    val myList = listOf("foo", "bar", "baz")
    val myIterator = myList.iterator()
    while (myIterator.hasNext()) {
        val value = myIterator.next()
        println(value)
    }

    /**
     * Provide a Default Parameter to a Function
     * We can call this function with or without providing a value for the y parameter:
     */
    println(multiply(5)) // Output: 5
    println(multiply(5, 3)) // Output: 15

}

fun multiply(x: Int, y: Int = 1): Int {
    return x * y
}