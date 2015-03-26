import com.typesafe.config.ConfigFactory

object Run extends App {

  val config = ConfigFactory.load()
  val message = config.getString("run.message")
  println(message)

}