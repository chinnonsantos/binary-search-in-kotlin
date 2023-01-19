package unit

import main
import org.junit.jupiter.api.assertDoesNotThrow
import kotlin.test.Test

internal class MainTest {
    @Test
    fun `When calling main function, should not throw exception`() {
        assertDoesNotThrow { main() }
    }
}