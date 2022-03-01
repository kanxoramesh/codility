
fun solution(A: IntArray): Int {
    // write your code in Kotlin 1.3.11 (Linux)
    var size=A.size
    var totalSum=(size+2)*(size+1)/2

    for(item in A ){
        totalSum-=item
    }
    return totalSum
}
