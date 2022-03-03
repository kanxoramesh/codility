import kotlin.math.abs
import kotlin.math.min

fun main(args: Array<String>) {
   print(passingCars(intArrayOf(1,1,1,1,1)))
}
//max=2
//min=2
//1122
fun passingCars( A: IntArray): Int {
  var count=0
    var zeros=0
    for(item in A){
        if(item==0){
            zeros++
        }else{
            count+=zeros
            if(count>1000000000) return -1
        }
    }

    return count
}

