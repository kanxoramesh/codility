

fun main(args: Array<String>) {
   print(countDivOptimal(4,13,3))
}
fun countDivOptimal( A:Int,B:Int,K:Int): Int{
    var base=Math.ceil(A.toDouble()/K)
    base*=K
    var top=Math.floor(B.toDouble()/K)

    var remain=(top*K)-base
    var count:Int= (remain/K).toInt()
    return count+1

}
fun countDiv( A:Int,B:Int,K:Int): Int {
  var count=0
var i=A
    while (i<=B ){
        if(i%K==0){
            count++
            i=i+K
        }else{
            i++
        }
    }
    return count
}

