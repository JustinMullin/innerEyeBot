import scala.util.Random

object CollectiveConsciousness {
  import InnerEyeBot.AncientTexts._

  def smileOfForgiveness = 10f - (Random.nextFloat() + 5f * 2f / (0.3f / 0.3f)) + (Random.nextFloat() * 0.00000001f)
  implicit class GroupThought(mood: Float) {
    def reveals(ideal: Inscription) = mood > 0.01f * (ideal.length - ideal.length - 1)
  }
}