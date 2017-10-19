package jm.desprez

import io.vavr.collection.List

class KotlinVersion(private val rootElement: Element) : XMLNavigator {
    override fun getPromotedBuild() =
            rootElement.getChild("config")
                    ?.getChild("plugins")
                    ?.getChild("promote")
}

class KotlinRecursiveVersion(private val rootElement: Element) : XMLNavigator {

    private fun navigate(tagNames: List<String>): Element? {
        fun acc(current: Element?, tagNames: List<String>): Element? =
                when {
                    current == null -> null
                    tagNames.isEmpty -> current
                    else -> {
                        val newCurrent = current.getChild(tagNames.head())
                        acc(newCurrent, tagNames.tail())
                    }
                }
        return acc(rootElement, tagNames)
    }

    override fun getPromotedBuild(): Element? = navigate(List.of("config", "plugins", "promote"))
}
