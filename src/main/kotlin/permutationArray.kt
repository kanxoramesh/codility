import kotlin.math.abs
import kotlin.math.min

fun main(args: Array<String>) {
    print(per(intArrayOf(1, 3,7,2,2)))
}

fun per(A: IntArray): Int {
    var hs = HashSet<Int>()
    for (i in A) {
        hs.add(i)
    }
    if (hs.size != A.size) {
        return 0
    }

    for(i in 1..A.size){
        hs.remove(i)
    }
    if(hs.isEmpty()){
        return 1
    }else
        return 0
}


fun perSum(A: IntArray): Int {
    var sum=0
    for (i in A) {
        sum+=i
    }
    var naturalSum=A.size*(A.size+1)/2

    if(naturalSum==sum){
        return 1
    }else
        return 0
}


