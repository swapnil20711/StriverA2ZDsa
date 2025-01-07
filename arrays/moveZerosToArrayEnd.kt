package arrays

fun moveZeroToArrayEnd(nums: Array<Int>): ArrayList<Int> {
    val result = ArrayList<Int>(nums.size)
    var numberOfZeros = 0
    for (i in nums) {
        if (i != 0) {
            result.add(i)
        } else {
            numberOfZeros++;
        }
    }

    for (i in 0..numberOfZeros) {
        result.add(0)
    }

    return result
}

fun main() {
    val array = arrayOf(1, 0, 2, 3, 2, 0, 4, 5, 0)
    for (element in moveZeroToArrayEnd(array)) {
        print("$element ")
    }
}