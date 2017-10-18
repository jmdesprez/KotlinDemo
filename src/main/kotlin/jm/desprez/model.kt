package jm.desprez

import io.vavr.control.Option

interface Element {
    fun getChild(tagName: String): Element?
}

interface XMLNavigator {
    fun getPromotedBuild(): Element?
}

interface XMLNavigatorFP {
    fun getPromotedBuild(): Option<Element>
}

class TrickyElement : Element {
    override fun getChild(tagName: String) =
            when (tagName) {
                "config" -> this
                else -> null
            }
}
