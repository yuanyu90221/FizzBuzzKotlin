class Solution {
    fun fizzBuzz(n: Int): List<String> {
        return (1.. n).map { i -> findResponse(i) }
    }
    private fun findResponse(n: Int): String {
        return when {
            n % 15 == 0 -> "FizzBuzz"
            n % 3 == 0 -> "Fizz"
            n % 5 == 0 -> "Buzz"
            else -> n.toString()
        }
    }
}