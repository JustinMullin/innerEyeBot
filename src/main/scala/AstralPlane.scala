import scala.util.Random

object AstralPlane {
  def projections = List.fill(100)(Random.shuffle(projection.toSet).toString)

  def projection =
    """
      |::::::::::::::::::::::::::::::::::::::::::::::::::::::
      |::  ::::  ::::  ::::  ::::  ::::  ::::  ::::  ::::  ::
      |::::::::::::::::::::::::::::::::::::::::::::::::::::::
      |::::::      ::::::::::::      ::::::::::::      ::::::
      |::  ::      ::  ::::  ::      ::  ::::  ::      ::  ::
      |::::::      ::::::::::::      ::::::::::::      ::::::
      |::::::::::::::::::::::::::::::::::::::::::::::::::::::
      |::  ::::  ::::  ::::  ::::  ::::  ::::  ::::  ::::  ::
      |::::::::::::::::::::::::::::::::::::::::::::::::::::::
      |::::::::::::::::::                  ::::::::::::::::::
      |::  ::::  ::::  ::                  ::  ::::  ::::  ::
      |::::::::::::::::::                  ::::::::::::::::::
      |::::::      ::::::                  ::::::      ::::::
      |::  ::      ::  ::                  ::  ::      ::  ::
      |::::::      ::::::                  ::::::      ::::::
      |::::::::::::::::::                  ::::::::::::::::::
      |::  ::::  ::::  ::                  ::  ::::  ::::  ::
      |::::::::::::::::::                  ::::::::::::::::::
      |::::::::::::::::::::::::::::::::::::::::::::::::::::::
      |::  ::::  ::::  ::::  ::::  ::::  ::::  ::::  ::::  ::
      |::::::::::::::::::::::::::::::::::::::::::::::::::::::
      |::::::      ::::::::::::      ::::::::::::      ::::::
      |::  ::      ::  ::::  ::      ::  ::::  ::      ::  ::
      |::::::      ::::::::::::      ::::::::::::      ::::::
      |::::::::::::::::::::::::::::::::::::::::::::::::::::::
      |::  ::::  ::::  ::::  ::::  ::::  ::::  ::::  ::::  ::
      |::::::::::::::::::::::::::::::::::::::::::::::::::::::
      |
    """
}
