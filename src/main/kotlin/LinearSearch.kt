class LinearSearch(
    private val sortedList: List<Int>,
    private val search: Int
) {
    fun byBruteForceUsingForEachLoop(): Int {
        if (sortedList.isEmpty()) {
            println("-> empty list to search!")
            return UNSUCCESSFUL_SEARCH
        }

        var interactions = 0
        var indexFound = UNSUCCESSFUL_SEARCH

        sortedList.indices.forEach { index ->
            interactions++

            if (sortedList[index] == search) {
                println("-> value $search found in index $index with $interactions interactions!")
                indexFound = index
                return@forEach
            }
        }

        if (indexFound == UNSUCCESSFUL_SEARCH) println("-> value $search not found with $interactions interactions!")
        return indexFound
    }

    fun byBruteForceUsingForLoop(): Int {
        if (sortedList.isEmpty()) {
            println("-> empty list to search!")
            return UNSUCCESSFUL_SEARCH
        }

        var interactions = 0
        var indexFound = UNSUCCESSFUL_SEARCH

        loop@ for (index in sortedList.indices) {
            interactions++

            if (sortedList[index] == search) {
                println("-> value $search found in index $index with $interactions interactions!")
                indexFound = index
                break@loop
            }
        }

        if (indexFound == UNSUCCESSFUL_SEARCH) println("-> value $search not found with $interactions interactions!")
        return indexFound
    }
}
