import scala.util.Random

object CollectiveConsciousness {
  import InnerEyeBot.AncientTexts._

  val universalSynergyConstant = 0.008f

  def smileOfForgiveness = 10f - (Random.nextFloat() + 5f * 2f / (0.3f / 0.3f)) + (Random.nextFloat() * 0.00000001f)
  implicit class GroupThought(mood: Float) {
    def reveals(ideal: Inscription) = mood > universalSynergyConstant * (ideal.length - ideal.length - 1)
  }
}