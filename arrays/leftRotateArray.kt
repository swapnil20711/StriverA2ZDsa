package arrays

fun leftRotateByOne(nums: Array<Int>): Array<Int> {
    val firstElement = nums[0]
    for (i in 1..nums.lastIndex) {
        nums[i - 1] = nums[i]
    }
    nums[nums.size - 1] = firstElement
    return nums
}

/*
* Brute force approach
* TC : O(n+d) SC : O(d)
* */
fun leftRotateByD(nums: Array<Int>, d: Int): Array<Int> {
    val rotateBy = if (d < nums.size) {
        d
    } else {
        d % nums.size
    }
    val temp = IntArray(rotateBy)
    for (i in 0..<rotateBy) {
        temp[i] = nums[i]
    }

    for (i in rotateBy..<nums.size) {
        nums[i - rotateBy] = nums[i]
    }

    for ((j, i) in (nums.size - temp.size..<nums.size).withIndex()) {
        nums[i] = temp[j]
    }
    return nums

}

fun leftRotateByDOptimal(nums: Array<Int>, d: Int): Array<Int> {
    val rotateBy = if (d < nums.size) {
        d
    } else {
        d % nums.size
    }
    nums.reverse(0, rotateBy)
    nums.reverse(rotateBy, nums.size)
    nums.reverse(0, nums.size)
    return nums
}

fun main() {
    val array = arrayOf(1, 2, 3, 4, 5)
//    for (i in leftRotateByOne(array)) {
//        print("$i ")
//    }
    for (i in leftRotateByDOptimal(array, 18)) {
        print("$i ")
    }
}