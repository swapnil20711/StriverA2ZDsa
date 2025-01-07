package arrays

fun moveZeroToArrayEnd(nums: Array<Int>): Array<Int> {
    val result = ArrayList<Int>(nums.size)
    var numberOfZeros = 0
    for (i in nums) {
        if (i != 0) {
            result.add(i)
        } else {
            numberOfZeros++;
        }
    }

    for (i in 0..result.lastIndex){
        nums[i]=result[i]
    }

    for (i in result.lastIndex..nums.lastIndex) {
        nums[i] = 0
    }

    return nums
}

fun main() {
    val array = arrayOf(1, 0, 2, 3, 2, 0, 4, 5, 0)
    for (element in moveZeroToArrayEnd(array)) {
        print("$element ")
    }
}