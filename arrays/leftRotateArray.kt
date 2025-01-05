package arrays

fun leftRotateByOne(nums:Array<Int>):Array<Int>{
    val firstElement  = nums[0]
    for (i in 1..nums.lastIndex){
        nums[i-1] = nums[i]
    }
    nums[nums.size-1] = firstElement
    return nums
}
fun main (){
    val array = arrayOf(1,2,3,4,5)
    for (i in leftRotateByOne(array)){
        print("$i ")
    }
}