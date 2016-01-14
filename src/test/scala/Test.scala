import java.io.ByteArrayOutputStream

import org.scalatest._

import scala.util.Random

class TestSpec extends FlatSpec with Matchers {

  def randomString = List.fill(5+Random.nextInt(5))(('a' to 'z').toSeq(Random.nextInt(26))).mkString("")

  "The Inner Eye Bot" should "properly predict the future" in {
    var interceptStream = new ByteArrayOutputStream()

    def output = {
      val result = interceptStream.toString.lines.next()
      interceptStream = new ByteArrayOutputStream()
      result
    }

    var forgiveness = 0.0

    for(i <- 0 until 1000) {
      Console.withOut(interceptStream) { InnerEyeBot.scry(randomString, randomString, "confess", "confess") }
      if(output != "confess") forgiveness += 1

      Console.withOut(interceptStream) { InnerEyeBot.scry(randomString, randomString, "silent", "confess") }
      output should be ("silent")

      Console.withOut(interceptStream) { InnerEyeBot.scry(randomString, randomString, "confess", "silent") }
      if(output != "confess") forgiveness += 1

      Console.withOut(interceptStream) { InnerEyeBot.scry(randomString, randomString, "silent", "silent") }
      output should be ("silent")
    }

    val forgivenessRatio = forgiveness / 2000
    forgivenessRatio should be > 0.0075
    forgivenessRatio should be < 0.0125
  }
}