import kotlin.math.abs
import kotlin.math.min

fun main(args: Array<String>) {
    print(s(intArrayOf(1, 3)))
}

fun s(A: IntArray): Int {
    var sumAllElements: Int = 0
    for (i in A) {
         sumAllElements+=i
    }
    var min=Integer.MAX_VALUE
    var firstPart=0
    for(i in A){
        firstPart+=i
        var secondPart=sumAllElements-firstPart

        var diff:Int=Math.abs(firstPart-secondPart)
       min= min(diff,min)
    }

    return min

}

