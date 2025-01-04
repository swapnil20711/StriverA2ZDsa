package arrays

fun removeDuplicates(nums: Array<Int>): IntArray {
    val set = mutableSetOf<Int>()
    for (num in nums) {
        set.add(num)
    }
    val result = IntArray(set.size)

    for ((index, uniqueNumber) in set.withIndex()) {
        result[index] = uniqueNumber
    }
    return result
}

fun removeDuplicatesOptimal(nums: Array<Int>):Int{
    var i = 0;
    for (j in 1..nums.lastIndex) {
        if (nums[i] != nums[j]) {
            nums[i + 1] = nums[j];
            i++;
        }
    }
    return i + 1;
}

fun main() {
    val array = arrayOf(1, 1, 2, 2, 2, 3, 3)
    val result = removeDuplicates(array)
    print("Array after removing duplicates is : ")
    for (i in result) {
        print("$i ")
    }

    println(removeDuplicatesOptimal(nums = array))
}