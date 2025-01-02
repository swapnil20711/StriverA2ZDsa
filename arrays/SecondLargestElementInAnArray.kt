package arrays

/*
* TC O(2N)
* */
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

/*
* O(N)*/
fun findSecondLargestElementInArrayOptimal(nums: IntArray): Int {
    var largestElement = nums[0]
    var secondLargestElement = -1
    for (num in nums) {
        if (num > largestElement) {
            secondLargestElement = largestElement;
            largestElement = num;
        } else if (num < largestElement && num > secondLargestElement) {
            secondLargestElement = num
        }
    }
    return secondLargestElement;
}

fun main() {
    val nums = intArrayOf(1, 2, 4, 5, 7, 7)
    println("Second largest element in the array is ${findSecondLargestElementInArrayOptimal(nums)}")
}