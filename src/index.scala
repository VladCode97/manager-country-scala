class ManagerCountry():

  /**
   * Data
   */
  private var collection: Map[String, String] = Map[String, String]()

  /**
   * Actions
   */
  def addCapital(country: String, capital: String): Unit =
    if (!collection.contains(country)) then
      this.collection += (country, capital)
    else
      throw Exception("This country exists")

  def removeCapital(country: String): Unit =
    if (existCountry(country)) then
      this.collection -= country
    else
      throw Error("This country does not exists")

  /**
   * Calculus or function pure
   */
  def viewAllCapitals(): Unit = this.collection.foreach((element) => println("Capitals: " + element._2))
  def viewCapitalByCountry(country: String): Unit = println(this.collection.filter((element) => element._1 == country))
  private def existCapital(capital: String): Boolean = this.collection.exists((element) => element._2 == capital)
  private def existCountry(country: String): Boolean = this.collection.exists((element) => element._1 == country)

@main def main(): Unit =
  val managerCountry: ManagerCountry = ManagerCountry()
  managerCountry.addCapital("CO", "BOGOTA")
  managerCountry.addCapital("US", "WASHINGTON")
  managerCountry.addCapital("PA", "CIUDAD DE PANAMA")
  managerCountry.removeCapital("PA")
  managerCountry.viewAllCapitals()