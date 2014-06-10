import scala.io.Source

object BingSuggestApi extends App {

  val html = Source.fromURL("http://api.bing.com/osjson.aspx?query=scala+programming")
  val htmlString = html.mkString
  // parse string into List object
  val suggests = htmlString.replace("[", "").replace("]", "").replace("\"", "").split(",").tail
  suggests.foreach(println)

}
