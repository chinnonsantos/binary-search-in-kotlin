package unit

import BinarySearch
import LIST_MAX_SIZE
import UNSUCCESSFUL_SEARCH
import kotlin.random.Random
import kotlin.test.Test
import kotlin.test.assertEquals

internal class BinarySearchTest {
    private val desiredNumber: Int = Random.nextInt(until = LIST_MAX_SIZE)
    private val sortedIntList: List<Int> = List(LIST_MAX_SIZE) { it + 1 }
    private val binarySearch = BinarySearch(sortedIntList, desiredNumber)

    @Test
    fun `When calling byDivideAndConquerUsingRecursiveLoop with random search, should return index of the value found`() {
        val indexExpected = desiredNumber - 1

        assertEquals(indexExpected, binarySearch.byDivideAndConquerUsingRecursiveLoop())
    }

    @Test
    fun `When calling byDivideAndConquerUsingNativeFunction with random search, should return index of the value found`() {
        val indexExpected = desiredNumber - 1

        assertEquals(indexExpected, binarySearch.byDivideAndConquerUsingNativeFunction())
    }

    @Test
    fun `When calling byDivideAndConquerUsingRecursiveLoop with specific search, should return index of the value found`() {
        val desiredNumber: Int = LIST_MAX_SIZE
        val indexExpected = desiredNumber - 1

        val binarySearch = BinarySearch(sortedIntList, desiredNumber)

        assertEquals(indexExpected, binarySearch.byDivideAndConquerUsingRecursiveLoop())
    }

    @Test
    fun `When calling byDivideAndConquerUsingNativeFunction with specific search, should return index of the value found`() {
        val desiredNumber: Int = LIST_MAX_SIZE
        val indexExpected = desiredNumber - 1

        val binarySearch = BinarySearch(sortedIntList, desiredNumber)

        assertEquals(indexExpected, binarySearch.byDivideAndConquerUsingNativeFunction())
    }

    @Test
    fun `When calling byDivideAndConquerUsingRecursiveLoop with search lower than list, should return UNSUCCESSFUL_SEARCH`() {
        val desiredNumber: Int = -5
        val indexExpected = UNSUCCESSFUL_SEARCH

        val binarySearch = BinarySearch(sortedIntList, desiredNumber)

        assertEquals(indexExpected, binarySearch.byDivideAndConquerUsingRecursiveLoop())
    }

    @Test
    fun `When calling byDivideAndConquerUsingNativeFunction with search lower than list, should return UNSUCCESSFUL_SEARCH`() {
        val desiredNumber: Int = -5
        val indexExpected = UNSUCCESSFUL_SEARCH

        val binarySearch = BinarySearch(sortedIntList, desiredNumber)

        assertEquals(indexExpected, binarySearch.byDivideAndConquerUsingNativeFunction())
    }

    @Test
    fun `When calling byDivideAndConquerUsingRecursiveLoop with search higher than the list, should return UNSUCCESSFUL_SEARCH`() {
        val desiredNumber: Int = LIST_MAX_SIZE + 1
        val indexExpected = UNSUCCESSFUL_SEARCH

        val binarySearch = BinarySearch(sortedIntList, desiredNumber)

        assertEquals(indexExpected, binarySearch.byDivideAndConquerUsingRecursiveLoop())
    }

    @Test
    fun `When calling byDivideAndConquerUsingNativeFunction with search higher than the list, should return the same searched value (negative)`() {
        val desiredNumber: Int = LIST_MAX_SIZE + 1
        val indexExpected = desiredNumber * -1

        val binarySearch = BinarySearch(sortedIntList, desiredNumber)

        assertEquals(indexExpected, binarySearch.byDivideAndConquerUsingNativeFunction())
    }

    @Test
    fun `When calling byDivideAndConquerUsingRecursiveLoop with empty list, should return UNSUCCESSFUL_SEARCH`() {
        val sortedIntList: List<Int> = emptyList()
        val indexExpected = UNSUCCESSFUL_SEARCH

        val binarySearch = BinarySearch(sortedIntList, desiredNumber)

        assertEquals(indexExpected, binarySearch.byDivideAndConquerUsingRecursiveLoop())
    }

    @Test
    fun `When calling byDivideAndConquerUsingNativeFunction with empty list, should return UNSUCCESSFUL_SEARCH`() {
        val sortedIntList: List<Int> = emptyList()
        val indexExpected = UNSUCCESSFUL_SEARCH

        val binarySearch = BinarySearch(sortedIntList, desiredNumber)

        assertEquals(indexExpected, binarySearch.byDivideAndConquerUsingNativeFunction())
    }
}
