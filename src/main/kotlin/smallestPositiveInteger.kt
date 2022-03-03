fun main(args: Array<String>) {
    print( smallestPosNew(intArrayOf(-2)))
}
fun smallestPos(A: IntArray): Int {
  var sm=1
    var hs= HashSet<Int>()
    for(i in A){
        hs.add(i)
    }
    for (i in A){
        if(i<1) {
            hs.remove(i)
        }else{
            if(hs.remove(i)){
                sm=Math.min(i+1,sm+1)
            }
        }
    }

    return sm
}

fun smallestPosNew(A: IntArray): Int {


    var pos=segregate(A)

    var positiveArray=IntArray(A.size-pos)
    var temppos=0
    for(i in pos until  A.size){
        positiveArray[temppos]=A[i]
        temppos++
    }

    for(i in positiveArray.indices)
    {
       var x= Math.abs(positiveArray[i])

        if((x-1)<positiveArray.size && positiveArray[x-1]>0 ){
                positiveArray[x-1]= -positiveArray[x-1]
        }
    }
    for(i in positiveArray.indices)
    {
        if(positiveArray[i]>0){
          return i+1
        }
    }
    return positiveArray.size+1

}
fun segregate(A:IntArray):Int{
    var pos=0
    for(i in A.indices){
        if(A[i]<=0){
            var temp=A[i]
            A[i]=A[pos]
            A[pos]=temp
            pos++
        }
    }
    return pos

}