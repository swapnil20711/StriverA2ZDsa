package arrays

fun checkIfArrayIsSorted(nums: Array<Int>): Boolean {
    for (i in 1..nums.lastIndex) {
        if (nums[i] >= nums[i - 1]) {
            continue;
        } else {
            return false;
        }
    }
    return true
}

fun main() {
    val sortedArray = arrayOf(1, 2, 3, 3, 4)
    val nonSortedArray = arrayOf(1, 2, 3, 4, -10)
    println("${checkIfArrayIsSorted(sortedArray)}")
    println("${checkIfArrayIsSorted(nonSortedArray)}")
}