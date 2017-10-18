package jm.desprez;

public class JavaPyramid implements XMLNavigator {
    private final Element rootElement;


    public JavaPyramid(final Element element) {
        rootElement = element;
    }


    public Element getPromotedBuild() {
        final Element config = rootElement.getChild("config");
        if (config != null) {
            final Element plugins = config.getChild("plugins");
            if (plugins != null) {
                return plugins.getChild("promote");
            }
        }
        return null;
    }
}
