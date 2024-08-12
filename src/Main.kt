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
  *
  * 2. Create a Mutable Map:
  * 2.1. Declare a MutableMap of strings to doubles with the values ("one" to 1.1, "two" to 2.2, "three" to 3.3).
  * 2.2. Add a new key-value pair "four" to 4.4 to the mutable map.
  * 2.3. Remove the key "two" from the mutable map.
  * 2.4. Use a loop to iterate through the mutable map and print each key-value pair using forEach.
  * 2.5. Sort the mutable map by key in ascending order and print the sorted map.
  *
  * 2. Set, Mutable Set, HashSet, TreeSet
  * 1. Create a Set:
  * 1.1. Declare an immutable Set of integers with the values [1, 2, 3, 4, 5].
  * 1.2. Use a loop to iterate through the set and print each value.
  * 1.3. Check if the set contains the value 3 using the contains operator and print the result.
  * 2. Create a Mutable Set:
  * 2.1. Declare a MutableSet of strings with the values ["apple", "banana", "cherry"].
  * 2.2. Add the value "date" to the mutable set.
  * 2.3. Remove the value "banana" from the mutable set.
  * 2.4. Use a loop to iterate through the mutable set and print each value using forEach.
  * 2.5. Convert the mutable set to a sorted list and print the sorted list
  * ****/

 //  * 1. Map, Mutable Map, HashMap, TreeMap
//  * 1. Create a Map:
//  * 1.1. Declare an immutable Map of strings to integers with the values ("apple" to 3, "banana" to 2, "cherry" to 5).
    val createImmutableMapStrToIntVar :Map<String,Int> = mapOf("apple" to 3, "banana" to 2, "cherry" to 5)

//  * 1. Map, Mutable Map, HashMap, TreeMap
//  * 1. Create a Map:
//  * 1.2. Use a loop to iterate through the map and print each key-value pair using entries.
    println("***************************************************************************")

    for (n in createImmutableMapStrToIntVar.entries){
        println(n)
    }

//  * 1. Map, Mutable Map, HashMap, TreeMap
//  * 1. Create a Map:
//  * 1.3. Use the getValue function to retrieve the value for the key "banana" and print it.
    println("***************************************************************************")

    println(" the value for the key banana:  ${createImmutableMapStrToIntVar.getValue("banana")}")

//      * 1. Map, Mutable Map, HashMap, TreeMap
//  * 1. Create a Map:
//  * 1.4. Check if the map contains the key "apple" using containsKey and print the result.
    println("***************************************************************************")

    println(" the map contains the key apple using containsKey:  ${createImmutableMapStrToIntVar.containsKey("apple")}")
println("###########################################################################")
//  * 2. Create a Mutable Map:
//  * 2.1. Declare a MutableMap of strings to doubles with the values ("one" to 1.1, "two" to 2.2, "three" to 3.3).

    val createMutableMapStrToDoubleVar :MutableMap<String,Double> = mutableMapOf("one" to 1.1, "two" to 2.2, "three" to 3.3)

//  * 2. Create a Mutable Map:
//  2.2. Add a new key-value pair "" to 4.4 to the mutable map.

    createMutableMapStrToDoubleVar["four"] = 4.4

//  * 2. Create a Mutable Map:
//  2.3. Remove the key "two" from the mutable map.

    createMutableMapStrToDoubleVar.remove("two")

//  * 2.4. Use a loop to iterate through the mutable map and print each key-value pair using forEach.
    println("***************************************************************************")

    createMutableMapStrToDoubleVar.forEach { println(it.key to it.value) }

//  * 2. Create a Mutable Map:
//  * 2.5. Sort the mutable map by key in ascending order and print the sorted map.
println("***************************************************************************")
    val sortedMap = createMutableMapStrToDoubleVar.toSortedMap()
    println("Sorted Map by keys in ascending order:")
    sortedMap.forEach { (key, value) ->
        println("$key -> $value")
    }

    println("###########################################################################")
//  * 2. Set, Mutable Set, HashSet, TreeSet
//  * 1. Create a Set:
//  * 1.1. Declare an immutable Set of integers with the values [1, 2, 3, 4, 5].

    val imutableSetInt : Set<Int> = setOf(1, 2, 3, 4, 5)

//  * 2. Set, Mutable Set, HashSet, TreeSet
//  * 1. Create a Set:
//1.2. Use a loop to iterate through the set and print each value.
    println("***************************************************************************")

    for (n in imutableSetInt.iterator()){
        println(n)
    }
//  * 2. Set, Mutable Set, HashSet, TreeSet
//  * 1. Create a Set:
//  * 1.3. Check if the set contains the value 3 using the contains operator and print the result.
    println("***************************************************************************")

    println("the set contains the value 3 :- ${imutableSetInt.contains(3)}")

    println("###########################################################################")

//  * 2. Create a Mutable Set:
//  * 2.1. Declare a MutableSet of strings with the values ["apple", "banana", "cherry"].

}



//fun createImmutableMapStrToInt():Map<String,Int>{
//
//}