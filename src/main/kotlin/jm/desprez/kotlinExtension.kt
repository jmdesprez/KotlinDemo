@file:JvmName("Toolbox")
package jm.desprez

import io.vavr.collection.List

fun Element?.navigate(tagNames: List<String>): Element? =
        when {
            this == null -> null
            tagNames.isEmpty -> this
            else -> getChild(tagNames.head()).navigate(tagNames.tail())
        }

fun main(args: Array<String>) {
    println(TrickyElement().navigate(List.of("config")))
    println(TrickyElement().navigate(List.of("config", "plugins", "promote")))
}
