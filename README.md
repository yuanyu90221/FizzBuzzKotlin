# FizzBuzzKotlin

write a function fizzBuzz to generate a list of string based on the input number

## 我的解法

```kotlin
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
```

## reference from My Teacher Recca Chao's solution

[Recca Chao's kata fizz-buzz](https://gitpage.reccachao.net/kotlin/kata/fizz-buzz/)

透過 map, when 這樣的 operator 可以簡化程式碼, 增加可讀性

因為 map, when 都是屬於一種標準抽象化的operation