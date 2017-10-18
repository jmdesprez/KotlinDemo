package jm.desprez;

public class JavaReject implements XMLNavigator {
    private final Element rootElement;


    public JavaReject(final Element element) {
        rootElement = element;
    }


    public Element getPromotedBuild() {
        final Element config = rootElement.getChild("config");
        if (config == null) {
            return null;
        }

        final Element plugins = config.getChild("plugins");
        if (plugins == null) {
            return null;
        }

        return plugins.getChild("promote");
    }
}
