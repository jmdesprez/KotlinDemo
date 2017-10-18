package jm.desprez

class KotlinVersion(private val rootElement: Element) : XMLNavigator {
    override fun getPromotedBuild() =
            rootElement.getChild("config")
                    ?.getChild("plugins")
                    ?.getChild("promote")
}