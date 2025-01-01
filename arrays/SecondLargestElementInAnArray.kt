package arrays

fun findSecondLargestElementInAnArray(nums: IntArray): Int {
    val largestElementInAnArray = findLargestElementInAnArrayBruteForce(nums);
    var secondLargestElementInAnArray = -1;
    for (num in nums) {
        if (num > secondLargestElementInAnArray && num != largestElementInAnArray) {
            secondLargestElementInAnArray = num;
        }
    }
    return secondLargestElementInAnArray
}

fun main() {
    val nums = intArrayOf(1, 2, 4, 5, 7, 7)
    println("Second largest element in the array is ${findSecondLargestElementInAnArray(nums)}")
}