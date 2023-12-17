class MutableStack<E>(vararg items: E) {

  private val elements = items.toMutableList()

  fun push(element: E) = elements.add(element)	// add novo elemento

  fun peek(): E = elements.last()	// retornar o último elemento

  fun pop(): E = elements.removeAt(elements.size - 1) // remove o último elemento

  fun isEmpty() = elements.isEmpty() // checka se a classe está vazia

  fun size() = elements.size // retorna o tamanho da classe

  override fun toString() = "MutableStack(${elements.joinToString()})"
}


fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)

fun main() {
  val stack = mutableStackOf(0.62, 3.14, 2.7) // instanciando stack
  stack.push(9.87) // adicionando 9.87 no final da lista. stack = (0.62, 3.14, 2.7, 9.87)
  println(stack.peek()) // retornando o último item da lista. Output: 9.87
  println(stack.isEmpty()) // checkando se a lista está vázia. Output: false
  stack.pop() // removendo o último elemento da lista stack = (0.62, 3.14, 2.7)
  println(stack.size()) // retornando o tamanho atual da lista. Output: 3
  println(stack)
}