import kotlin.random.Random
import kotlin.system.measureNanoTime

const val LIST_MAX_SIZE = 1_000_000
const val UNSUCCESSFUL_SEARCH = -1

fun main() {
    val desiredNumber: Int = Random.nextInt(until = LIST_MAX_SIZE)
    val sortedIntList: List<Int> = List(LIST_MAX_SIZE) { it + 1 }

    val linearSearch = LinearSearch(sortedList = sortedIntList, search = desiredNumber)
    println("Hello World!")
    println("Desired number: $desiredNumber")
    println("List size: ${sortedIntList.size}")

    println("\n### Linear Search - Brute Force Approach (ForEach loop) ###")
    val howSlowIsBruteForce = measureNanoTime{ linearSearch.byBruteForceUsingForEachLoop() }
    println("took ${howSlowIsBruteForce / 1000} microseconds to execute!")

    println("\n### Linear Search - Brute Force Approach (For loop) ###")
    val howSlowIsBruteForceFor = measureNanoTime{ linearSearch.byBruteForceUsingForLoop() }
    println("took ${howSlowIsBruteForceFor / 1000} microseconds to execute!")
}
