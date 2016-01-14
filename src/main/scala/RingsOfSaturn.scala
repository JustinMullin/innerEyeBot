object RingsOfSaturn {
  def currentPosition = System.nanoTime() * 0.1288 / Math.cos(23.32 * Math.PI * System.nanoTime())
  def quantumFactor = 21f
  def specularAmount = 1.00001
}
