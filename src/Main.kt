//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
 /***
  * Task: Maps, Sets, Pairs, and Triples (Using Functions)
  * Requirements:
  * 1. Map, Mutable Map, HashMap, TreeMap
  * 1. Create a Map:
  * 1.1. Declare an immutable Map of strings to integers with the
  * values ("apple" to 3, "banana" to 2, "cherry" to 5).
  * 1.2. Use a loop to iterate through the map and print each key-value
  * pair using entries.
  * 1.3. Use the getValue function to retrieve the value for the key
  * "banana" and print it.
  * 1.4. Check if the map contains the key "apple" using containsKey
  * and print the result.
  * 2. Create a Mutable Map:
  * 2.1. Declare a MutableMap of strings to doubles with the values
  * ("one" to 1.1, "two" to 2.2, "three" to 3.3).
  * 2.2. Add a new key-value pair "four" to 4.4 to the mutable map.
  * 2.3. Remove the key "two" from the mutable map.
  * 2.4. Use a loop to iterate through the mutable map and print each
  * key-value pair using forEach.
  * 2.5. Sort the mutable map by key in ascending order and print the
  * sorted map.
  * ****/

 //  * 1. Map, Mutable Map, HashMap, TreeMap
//  * 1. Create a Map:
//  * 1.1. Declare an immutable Map of strings to integers with the
//  * values ("apple" to 3, "banana" to 2, "cherry" to 5).
    val createImmutableMapStrToIntVar :Map<String,Int> = mapOf("apple" to 3, "banana" to 2, "cherry" to 5)

//  * 1. Map, Mutable Map, HashMap, TreeMap
//  * 1. Create a Map:
//  * 1.2. Use a loop to iterate through the map and print each key-value pair using entries.
    for (n in createImmutableMapStrToIntVar.entries){
        println(n)
    }

//      * 1. Map, Mutable Map, HashMap, TreeMap
//  * 1. Create a Map:
//  * 1.3. Use the getValue function to retrieve the value for the key "banana" and print it.

    println(" the value for the key banana:  ${createImmutableMapStrToIntVar.getValue("banana")}")

//      * 1. Map, Mutable Map, HashMap, TreeMap
//  * 1. Create a Map:
//  * 1.4. Check if the map contains the key "apple" using containsKey and print the result.

    println(" the map contains the key apple using containsKey:  ${createImmutableMapStrToIntVar.containsKey("apple")}")


}



//fun createImmutableMapStrToInt():Map<String,Int>{
//
//}