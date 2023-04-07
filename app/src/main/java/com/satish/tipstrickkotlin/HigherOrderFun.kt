package com.satish.tipstrickkotlin

/**
 * @Author: Satish Nada
 * @Date: 07/04/23
 */

fun main() {

    /**
     * List of Veg and Non-Veg Break Fast List
     * By Calling getBreakFastList function will get list of string with filter of Ven only.
     * Here have used High Order Function as second parameter and pass as lambda expression
     */
    val breakFastList = listOf("Veg-Rava Dosa","Veg-Poha","Veg-Steamed Dhokla","NonVeg-Chicken Sandwich","NonVeg-Garlic Omelette")
    println(getBreakFastList(breakFastList) { it.startsWith("Veg") })
}

/**
 * getBreakFastList: List Of String as name of filtered break fast
 * @param breakFastList: List<String> - list of mixed break fast Veg and Non-Veg
 * @param foodType: String - as Higher Order Function as lambda expression
 */
fun getBreakFastList(breakFastList: List<String>, foodType: (String) -> Boolean): List<String> {
    return breakFastList.filter(foodType)
}