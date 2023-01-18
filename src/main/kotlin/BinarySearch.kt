class BinarySearch(
    private val sortedList: List<Int>,
    private val search: Int
) {
    fun byDivideAndConquerUsingRecursiveLoop(
        interactions: Int = 1,
        indexStart: Int = 0,
        indexEnd: Int = sortedList.size - 1
    ): Int {
        val indexHalfSize: Int = (indexStart + indexEnd) / 2
//        println("index half size: $indexHalfSize")

        return when {
            sortedList.isEmpty() -> {
                println("-> empty list to search!")
                UNSUCCESSFUL_SEARCH
            }
            indexStart > indexEnd -> {
                println("-> value $search not found with $interactions interactions!")
                UNSUCCESSFUL_SEARCH
            }
            sortedList[indexHalfSize] == search -> {
                println("-> value $search found in index $indexHalfSize with $interactions interactions!")
                indexHalfSize
            }
            sortedList[indexHalfSize] < search -> byDivideAndConquerUsingRecursiveLoop(
                interactions = interactions + 1,
                indexStart = indexHalfSize + 1,
                indexEnd = indexEnd
            )
            sortedList[indexHalfSize] > search -> byDivideAndConquerUsingRecursiveLoop(
                interactions = interactions + 1,
                indexStart = indexStart,
                indexEnd = indexHalfSize - 1
            )
            else -> UNSUCCESSFUL_SEARCH
        }
    }
}
