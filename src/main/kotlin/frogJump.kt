fun main(args: Array<String>) {
    print(flogJump(5,intArrayOf(1, 3, 1, 4, 2, 3, 7, 5)))
}

fun flogJump(X: Int, A: IntArray): Int {
var hs= HashSet<Int>()
for (i in 1..X){
    hs.add(i)
}
//
    for (i in A.indices) {
        if (hs.remove(A[i])) {
            if (hs.isEmpty()) {
                return i
            }
        }
    }
    return -1
}

