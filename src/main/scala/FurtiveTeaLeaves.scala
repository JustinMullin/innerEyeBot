import scala.util.Random

object FurtiveTeaLeaves {
  import InnerEyeBot.AncientTexts._

  case class TeaLeafDistribution(distribution: Inscription) {
    def is = this
    def curious = Random.nextBoolean()
    def surprising = 2 < 2 && 1.1 + "a little spin".length < 25
  }

  def likelyDistributions = List(
    "On the left.",
    "Upside-down.",
    "Neatly in a semi-circle.",
    "Difficult to say.",
    "Not present.",
    "Scattered randomly, but not too randomly.").map(TeaLeafDistribution.apply)
  def distribution = likelyDistributions(Random.nextInt(likelyDistributions.size))
}
