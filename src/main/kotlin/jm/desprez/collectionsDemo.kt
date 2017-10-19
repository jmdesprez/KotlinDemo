package jm.desprez

import java.io.File

fun filter() {

    val filtered = File("source.txt").useLines { lines ->
        lines.filter { line ->
            line.contains("Bad credentials")
        }
    }

    File("destination.txt").writeText(filtered.joinToString("\n"))
}