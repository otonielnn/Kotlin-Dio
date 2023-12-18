fun main() {

  val authors = setOf("Shakespeare", "Hemingway", "Twain")
  val writers = setOf("Twain", "Shakespeare", "Hemingway")

  println(authors == writers)   // retorna True. Apenas compara os elementos
  println(authors === writers)  // retorna False. Pois os conjuntos tem referencias diferentes.
}