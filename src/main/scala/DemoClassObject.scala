class cars {
  private var  tax = 10
  var base = 100
  def getonroad() = { tax + base}
  def checktax():Int = { tax = 1000
    tax }
}
object DemoClassObject extends App {
  val bmw = new cars()
    println(bmw.checktax())
    bmw.base = 200
    println(bmw.getonroad())
  // Creating another instance of the class as "honda"
    val honda = new cars
    println(honda.base)
    println(honda.getonroad())
}
