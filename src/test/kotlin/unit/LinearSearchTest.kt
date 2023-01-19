package unit

import LIST_MAX_SIZE
import LinearSearch
import UNSUCCESSFUL_SEARCH
import kotlin.random.Random
import kotlin.test.Test
import kotlin.test.assertEquals

internal class LinearSearchTest {
    private val desiredNumber: Int = Random.nextInt(until = LIST_MAX_SIZE)
    private val sortedIntList: List<Int> = List(LIST_MAX_SIZE) { it + 1 }
    private val linearSearch = LinearSearch(sortedIntList, desiredNumber)

    @Test
    fun `When calling byBruteForceUsingForEachLoop with random search, should return index of the value found`() {
        val indexExpected = desiredNumber - 1

        assertEquals(indexExpected, linearSearch.byBruteForceUsingForEachLoop())
    }

    @Test
    fun `When calling byBruteForceUsingForLoop with random search, should return index of the value found`() {
        val indexExpected = desiredNumber - 1

        assertEquals(indexExpected, linearSearch.byBruteForceUsingForLoop())
    }

    @Test
    fun `When calling byBruteForceUsingForEachLoop with specific search, should return index of the value found`() {
        val desiredNumber: Int = LIST_MAX_SIZE
        val indexExpected = desiredNumber - 1

        val linearSearch = LinearSearch(sortedIntList, desiredNumber)

        assertEquals(indexExpected, linearSearch.byBruteForceUsingForEachLoop())
    }

    @Test
    fun `When calling byBruteForceUsingForLoop with specific search, should return index of the value found`() {
        val desiredNumber: Int = LIST_MAX_SIZE
        val indexExpected = desiredNumber - 1

        val linearSearch = LinearSearch(sortedIntList, desiredNumber)

        assertEquals(indexExpected, linearSearch.byBruteForceUsingForLoop())
    }

    @Test
    fun `When calling byBruteForceUsingForEachLoop with search lower than list, should return UNSUCCESSFUL_SEARCH`() {
        val desiredNumber: Int = -5
        val indexExpected = UNSUCCESSFUL_SEARCH

        val linearSearch = LinearSearch(sortedIntList, desiredNumber)

        assertEquals(indexExpected, linearSearch.byBruteForceUsingForEachLoop())
    }

    @Test
    fun `When calling byBruteForceUsingForLoop with search lower than list, should return UNSUCCESSFUL_SEARCH`() {
        val desiredNumber: Int = -5
        val indexExpected = UNSUCCESSFUL_SEARCH

        val linearSearch = LinearSearch(sortedIntList, desiredNumber)

        assertEquals(indexExpected, linearSearch.byBruteForceUsingForLoop())
    }

    @Test
    fun `When calling byBruteForceUsingForEachLoop with search higher than the list, should return UNSUCCESSFUL_SEARCH`() {
        val desiredNumber: Int = LIST_MAX_SIZE + 1
        val indexExpected = UNSUCCESSFUL_SEARCH

        val linearSearch = LinearSearch(sortedIntList, desiredNumber)

        assertEquals(indexExpected, linearSearch.byBruteForceUsingForEachLoop())
    }

    @Test
    fun `When calling byBruteForceUsingForLoop with search higher than the list, should return UNSUCCESSFUL_SEARCH`() {
        val desiredNumber: Int = LIST_MAX_SIZE + 1
        val indexExpected = UNSUCCESSFUL_SEARCH

        val linearSearch = LinearSearch(sortedIntList, desiredNumber)

        assertEquals(indexExpected, linearSearch.byBruteForceUsingForLoop())
    }

    @Test
    fun `When calling byBruteForceUsingForEachLoop with empty list, should return UNSUCCESSFUL_SEARCH`() {
        val sortedIntList: List<Int> = emptyList()
        val indexExpected = UNSUCCESSFUL_SEARCH

        val linearSearch = LinearSearch(sortedIntList, desiredNumber)

        assertEquals(indexExpected, linearSearch.byBruteForceUsingForEachLoop())
    }

    @Test
    fun `When calling byBruteForceUsingForLoop with empty list, should return UNSUCCESSFUL_SEARCH`() {
        val sortedIntList: List<Int> = emptyList()
        val indexExpected = UNSUCCESSFUL_SEARCH

        val linearSearch = LinearSearch(sortedIntList, desiredNumber)

        assertEquals(indexExpected, linearSearch.byBruteForceUsingForLoop())
    }
}
