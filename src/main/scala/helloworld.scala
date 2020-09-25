object helloworld {
  def main(args: Array[String]) {
    println("Hello World!!")
    val ax = add(2,5)
    println("addition on 2 and 5 is " + ax)
  }
  def add (a:Int,y:Int)= { a + y}

}
