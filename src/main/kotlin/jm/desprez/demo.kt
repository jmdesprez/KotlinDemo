package jm.desprez

fun runNavigator(name: String, xmlNavigator: XMLNavigator) {
    try {
        xmlNavigator.getPromotedBuild()
        println("$name work as expected")
    } catch (e: NullPointerException) {
        println("$name doesn't work as expected")
    }
}

fun runNavigator(name: String, xmlNavigator: XMLNavigatorFP) {
    try {
        xmlNavigator.getPromotedBuild()
        println("$name work as expected")
    } catch (e: NullPointerException) {
        println("$name doesn't work as expected")
    }
}

fun main(args: Array<String>) {
    runNavigator("JavaOption", JavaOption(TrickyElement()))
    runNavigator("JavaOptionBad", JavaOptionBad(TrickyElement()))
    runNavigator("JavaPyramid", JavaPyramid(TrickyElement()))
    runNavigator("JavaReject", JavaReject(TrickyElement()))
    runNavigator("JavaTryCatch", JavaTryCatch(TrickyElement()))
    runNavigator("KotlinVersion", KotlinVersion(TrickyElement()))
}

