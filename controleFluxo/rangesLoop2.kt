fun main() {

    // O range também verifica o intervalo entre strings
    // Output: abcd
    for (c in 'a'..'d') {
        print(c)
    }
    print(" ")

    // Output: zxvt
    for (c in 'z' downTo 's' step 2) {
        print(c)
    }
    print(" ")
}