class BinarySearch(
    private val sortedList: List<Int>,
    private val search: Int
) {
    fun byDivideAndConquerUsingRecursiveLoop(
        interactions: Int = 1,
        indexLow: Int = 0,
        indexHigh: Int = sortedList.size - 1
    ): Int {
        val indexMid: Int = (indexLow + indexHigh) / 2
//        println("index middle: $indexMid")

        return when {
            sortedList.isEmpty() -> {
                println("-> empty list to search!")
                UNSUCCESSFUL_SEARCH
            }
            indexLow > indexHigh -> {
                println("-> value $search not found with $interactions interactions!")
                UNSUCCESSFUL_SEARCH
            }
            sortedList[indexMid] == search -> {
                println("-> value $search found in index $indexMid with $interactions interactions!")
                indexMid
            }
            sortedList[indexMid] < search -> byDivideAndConquerUsingRecursiveLoop(
                interactions = interactions + 1,
                indexLow = indexMid + 1,
                indexHigh = indexHigh
            )
            sortedList[indexMid] > search -> byDivideAndConquerUsingRecursiveLoop(
                interactions = interactions + 1,
                indexLow = indexLow,
                indexHigh = indexMid - 1
            )
            else -> UNSUCCESSFUL_SEARCH
        }
    }

    fun byDivideAndConquerUsingNativeFunction(): Int {
        if (sortedList.isEmpty()) {
            println("-> empty list to search!")
            return UNSUCCESSFUL_SEARCH
        }

        return sortedList.binarySearch(search)
    }
}
