fun main() {

    // Output: 0123
    for(i in 0..3) {
        print(i)
    }
    print(" ")

    // Output: 012
    for(i in 0 until 3) {
        print(i)
    }
    print(" ")

    // Output: 2468
    for(i in 2..8 step 2) {
        print(i)
    }
    print(" ")

    // Output: 3210
    for (i in 3 downTo 0) {
        print(i)
    }
    print(" ")


}