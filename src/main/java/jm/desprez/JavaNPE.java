package jm.desprez;

public class JavaNPE  implements XMLNavigator {
    private final Element rootElement;


    public JavaNPE(final Element element) {
        rootElement = element;
    }


    public Element getPromotedBuild() {
        // can produce a NullPointerException
        return rootElement.getChild("config")
                          .getChild("plugins")
                          .getChild("promote");
    }

}
