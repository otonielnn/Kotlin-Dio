fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"
    }
}

fun main() {
    println(describeString(null)) // Output: Empty or null string
    println(describeString("otoniel")) // Output: String of length 7
}