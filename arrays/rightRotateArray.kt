package arrays

/*
* Brute force
* */
fun rightRotateArrayByOne(nums:Array<Int>): Array<Int> {
    /*
    * 1,2,3,4,5
    * 5,1,2,3,4
    * */
    val lastElement = nums[nums.size-1];

    for (i in nums.lastIndex downTo 1){
        nums[i] = nums[i-1]
    }

    nums[0] = lastElement

    return nums
}

fun main(){
    val array = arrayOf(1,2,3,4,5)
    for (i in rightRotateArrayByOne(array)){
        print("$i ")
    }
}