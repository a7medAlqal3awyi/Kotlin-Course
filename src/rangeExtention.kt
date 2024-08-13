import java.util.random.RandomGenerator

fun main() {
    val myRange = 0..20
    // or
    val range = 0.rangeTo(20)

    val downRange = 20.downTo(0)
//    myRange.printAll()
//    println("")
//    downRange.printAll()

    println("Enter the number")
    val  Range =0..100 step 2
    val input= readLine()!!.toInt()
    if (input in Range){
        println("$input is in range")
    }
    else{
        println("$input is not in range")
    }
//    var friendsCount = 599

//    if (friendsCount in 0..20) {
//        println("lonly")
//    } else if (friendsCount in 20..100) {
//        println("Family")
//
//    } else if (friendsCount in 100..500) {
//        println("Social")
//
//    } else if (friendsCount in 500..5000) {
//        println("Famous")
//
//    }

}

fun IntProgression.printAll() {
    this.forEach {
        print(" $it ")
    }
}