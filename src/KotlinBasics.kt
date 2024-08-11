var age: Int = 25
val link: String = "www.google.com"
val price: Float = 5.5f
var isFollower: Boolean = true
var ch: Char = 's'

var firstCondition = false
var secondCondition = false

var userAge = "user age = $age"

//Type cast
var isFollowing: String = isFollower.toString()
var friendCount: String = "55"
var friendCountDouble: Double = friendCount.toDouble()
// Take Input

var userInput :Int = readln().toInt()
var  ageFromUser = "user age = $userInput"


fun main() {
    age++
    println(link)
    println(age)
    println(isFollower)
    println(ch)
    println(isFollowing)
    println(friendCountDouble)
    println(firstCondition && secondCondition)
    println(userAge)
    println(ageFromUser)
}