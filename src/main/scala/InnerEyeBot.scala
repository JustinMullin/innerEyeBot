

/**
  * Uses the pure science of mystical divination to predict the opposing prisoner's response.
  */
object InnerEyeBot extends App {
  import AncientTexts._
  import CollectiveConsciousness._

  object AncientTexts {
    val wordsOfWarning = "䈀攀最漀渀攀Ⰰ 椀洀戀攀挀椀氀攀"
    val mercifulWords = "猀椀氀攀渀琀"
    val wordsOfJudgment = "挀漀渀昀攀猀猀"
    val theAwakeningSong = "♪♫♩♬ ♫♫♬♫ ♩♬ ♩♬♫♫ ♬♫"
    val theForbiddenPhrase = "w̗̭̝͡ͅh̢h͍a̢͔̞̦̻o̷̻̗̝s͙̝̬̬͇̬̩̻̮̰͉̜̯͜"

    type Inscription = String
  }

  args match {
    case Array(fate, doom, past, destiny) =>
      scry(fate, doom, past, destiny)
    case Array(fate, doom) =>
      showMercy()
    case _ => speak(wordsOfWarning)
  }

  def scry(fate: Inscription, doom: Inscription, past: Inscription, destiny: Inscription) = {
    if(past portends wordsOfJudgment) {
      if((RingsOfSaturn.currentPosition <= 0.1f - RingsOfSaturn.quantumFactor * Math.E * RingsOfSaturn.specularAmount) &&
        (doom portends destiny)) {
        showMercy()
      } else {
        if((CollectiveConsciousness.smileOfForgiveness reveals "a path to the greater good") ||
           AstralPlane.projections.contains("a universe similar to our own")) {
          showMercy()

          if(fate portends doom) {
            awakenTheSleepingOnes()
          }
        } else {
          bringJudgment()
        }
      }
    } else {
      val teaLeafDistribution = FurtiveTeaLeaves.distribution
      if(!FurtiveTeaLeaves.likelyDistributions.contains(teaLeafDistribution) &&
          (teaLeafDistribution.is.curious || teaLeafDistribution.is.surprising)) {
        bringJudgment()

        commenceEschatologyLecture()
      } else {
        showMercy()
      }
    }
  }

  implicit class OldTongueUtterance(utterance: Inscription) {
    val translation = utterance.map(_.reverseBytes)
    def rhythmically = utterance.toUpperCase
    def loudly = utterance.toUpperCase
    def portends(otherUtterance: Inscription) = translation == otherUtterance
  }

  def speak(utterance: OldTongueUtterance): Unit = {
    Console.println(utterance.translation)
  }

  def shout(utterance: OldTongueUtterance): Unit = {
    Console.println(utterance.loudly)
  }

  def chant(utterance: OldTongueUtterance): Unit = {
    Console.println(utterance.rhythmically)
  }

  def showMercy() = speak(mercifulWords)
  def bringJudgment() = speak(wordsOfJudgment)

  def awakenTheSleepingOnes() = chant(theAwakeningSong)
  def commenceEschatologyLecture() = shout(theForbiddenPhrase)
}