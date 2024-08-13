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
  *
  * 3. Pair and Triple
  * 1. Working with Pairs:
  * 1.1. Declare a Pair of a string and an integer with the values ("apple", 5).
  * 1.2. Access the first and second elements of the pair and print them.
  * 1.3. Create a list of pairs with the values [("one", 1), ("two", 2), ("three", 3)].
  * 1.4. Use a loop to iterate through the list of pairs and print each pair.
  *
  * 2. Working with Triples:
  * 2.1. Declare a Triple of a string, an integer, and a double with the values ("apple", 5, 1.1).
  * 2.2. Access the first, second, and third elements of the triple and print them.
  * 2.3. Create a list of triples with the values [("one", 1, 1.1), ("two", 2, 2.2), ("three", 3, 3.3)].
  * 2.4. Use a loop to iterate through the list of triples and print each triple.
  *
  * 4. Removing Duplications Using Set
  * 1. Handling Duplications:
  * 1.1. Declare a List of integers with the values [1, 2, 3, 2, 4, 5, 3, 6, 1].
  * 1.2. Create a MutableList to store duplicated elements.
  * 1.3. Use a loop to iterate through the list and add any element that appears more than once to the MutableList of duplicates.
  * 1.4. Print the MutableList of duplicated elements.
  * 2. Remove Duplications Using Set:
  * 2.1. Convert the original list to a Set to remove all duplications.
  * 2.2. Convert the Set back to a list.
  * 2.3. Print the list after removing duplications.
  * 3. Check for Duplications with Additional Elements:
  * 3.1. Add additional elements [2, 7, 8, 3] to the original list.
  * 3.2. Convert the updated list to a Set to remove any new duplications.
  * 3.3. Print the list after removing the new duplications
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


//  * 2. Create a Mutable Set:
//  * 2.1. Declare a MutableSet of strings with the values ["apple", "banana", "cherry"].

    val mutableSetStr : MutableSet<String> = mutableSetOf("apple", "banana", "cherry")

//  * 2. Create a Mutable Set:
//  * 2.2. Add the value "date" to the mutable set.

    mutableSetStr.add("date")

//  * 2. Create a Mutable Set:
//  * 2.3. Remove the value "banana" from the mutable set.

    mutableSetStr.remove("banana")

//  * 2. Create a Mutable Set:
//  * 2.4. Use a loop to iterate through the mutable set and print each value using forEach.
    println("***************************************************************************")

    mutableSetStr.forEach { it -> println(it) }
//  * 2. Create a Mutable Set:
//  * 2.5. Convert the mutable set to a sorted list and print the sorted list
    println("***************************************************************************")

    mutableSetStr.sorted().iterator().forEach {it -> println(it)  }

    println("###########################################################################")

//    * 3. Pair and Triple
//    * 1. Working with Pairs:
//    * 1.1. Declare a Pair of a string and an integer with the values ("apple", 5).

    val pairStrInt: Pair<String,Int>  = Pair("apple", 5)
    val pairStrInt2  = "apple" to 5

//    * 3. Pair and Triple
//    * 1. Working with Pairs:
//    * 1.2. Access the first and second elements of the pair and print them.

 println("the first elements of the pair ${pairStrInt.first}")
 println("the second elements of the pair ${pairStrInt.second}")

//    * 3. Pair and Triple
//    * 1. Working with Pairs:
//    * 1.3. Create a list of pairs with the values [("one", 1), ("two", 2), ("three", 3)].

    val listOfPairs = listOf("one" to 1, "two" to 2 , "three" to 3)



//    * 3. Pair and Triple
//    * 1. Working with Pairs:
//    * 1.4. Use a loop to iterate through the list of pairs and print each pair.
    println("***************************************************************************")

    for (n in listOfPairs.iterator()){
        println(n)
    }

    println("###########################################################################")

//   * 2. Working with Triples:
//  * 2.1. Declare a Triple of a string, an integer, and a double with the values ("apple", 5, 1.1).


//   * 2. Working with Triples:
//  * 2.2. Access the first, second, and third elements of the triple and print them.


//   * 2. Working with Triples:
//  * 2.3. Create a list of triples with the values [("one", 1, 1.1), ("two", 2, 2.2), ("three", 3, 3.3)].

//   * 2. Working with Triples:
//  * 2.4. Use a loop to iterate through the list of triples and print each triple.
}



//fun createImmutableMapStrToInt():Map<String,Int>{
//
//}