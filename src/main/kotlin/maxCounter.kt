import kotlin.math.abs
import kotlin.math.min

fun main(args: Array<String>) {
   maxCounter(4,intArrayOf(1, 3,4,4,3,5,2)).onEach { println(it) }
}
//max=2
//min=2
//1122
fun maxCounter(N: Int, A: IntArray): IntArray {
   var count= IntArray(N)
    var max=0
    var min=0
    for(i in A){
        if(i>N){
            min=max

        }else{
            count[i-1]=Math.max(count[i-1]+1,min+1)
            max=Math.max(count[i-1],max)
        }
    }
    for( i in count.indices) {
        count[i] = Math.max(min,count[i])
    }
    return count
}

