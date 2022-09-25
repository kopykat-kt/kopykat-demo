package at.kopyk.demo

data class Person(val name: String, val age: Int)

fun main() {
  val p1 = Person("Alex", 1)
  val p2 = p1.copy { age++ }
  println(p2.age)
}
