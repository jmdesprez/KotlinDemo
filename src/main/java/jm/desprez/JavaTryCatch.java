package jm.desprez;

public class JavaTryCatch implements XMLNavigator {
    private final Element rootElement;


    public JavaTryCatch(final Element element) {
        rootElement = element;
    }


    public Element getPromotedBuild() {
        // WARNING: this is NOT the exepected behaviour
        try {
            return rootElement.getChild("config")
                              .getChild("plugins")
                              .getChild("promote");
        } catch (final NullPointerException e) {
            return null;
        }
    }
}
