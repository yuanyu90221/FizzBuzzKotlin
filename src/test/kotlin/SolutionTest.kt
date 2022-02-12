import kotlin.test.Test
import kotlin.test.assertEquals

internal class SolutionTest {
    private val sol: Solution = Solution()
    @Test
    fun fizzBuzzExample1() {
        val expectList: List<String> = listOf("1", "2", "Fizz")
        val n = 3
        assertEquals(expectList, sol.fizzBuzz(n))
    }
    @Test
    fun fizzBuzzExample2() {
        val expectList: List<String> = listOf("1", "2", "Fizz", "4", "Buzz")
        val n = 5
        assertEquals(expectList, sol.fizzBuzz(n))
    }
    @Test
    fun fizzBuzzExample3() {
        val expectList: List<String> = listOf("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz")
        val n = 15
        assertEquals(expectList, sol.fizzBuzz(n))
    }
}