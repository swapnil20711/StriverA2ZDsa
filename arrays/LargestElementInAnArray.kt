package arrays


/*
* This will have a complexity of O (N)*/
fun findLargestElementInAnArray(nums: IntArray): Int {
    var max = nums[0]
    for (i in 1 until nums.size) {
        if (nums[i] > max) {
            max = nums[i]
        }
    }
    return max;
}

/*
* This will take complexity of O(n * logn)
* */
fun findLargestElementInAnArrayBruteForce(nums: IntArray): Int {
    val sortedNums = nums.sorted()
    return sortedNums[sortedNums.size - 1]
}

fun main() {
    val nums = intArrayOf(12, 15, 16, -30, 44)
    println(findLargestElementInAnArrayBruteForce(nums))
    println(findLargestElementInAnArray(nums))
}