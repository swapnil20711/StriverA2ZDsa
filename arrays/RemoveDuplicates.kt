package arrays

fun removeDuplicates(nums:Array<Int>): IntArray {
    val set = mutableSetOf<Int>()
    for (num in nums){
        set.add(num)
    }
    val result = IntArray(set.size)

    for ((index, uniqueNumber) in set.withIndex()){
        result[index] = uniqueNumber
    }
    return result
}

fun main() {
    val array = arrayOf(1, 1, 2, 3, 4, 4, 4, 5, 6, 6)
    val result = removeDuplicates(array)
    print("Array after removing duplicates is : ")
    for (i in result){
        print("$i ")
    }
}