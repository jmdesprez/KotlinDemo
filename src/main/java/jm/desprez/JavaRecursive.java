package jm.desprez;

import io.vavr.collection.List;

public class JavaRecursive implements XMLNavigator {
    private final Element rootElement;


    public JavaRecursive(final Element element) {
        rootElement = element;
    }


    private Element navigate(final Element current, final Element acc, final List<String> tagNames) {
        if(current == null) {
            return null;
        }
        if(tagNames.isEmpty()) {
            return acc;
        }
        final Element newCurrent = current.getChild(tagNames.head());
        return navigate(newCurrent, current, tagNames.tail());
    }


    private Element navigate(final List<String> tagNames) {
        return navigate(rootElement, rootElement, tagNames);
    }

    public Element getPromotedBuild() {
        return navigate(List.of("config", "plugins", "promote"));
    }
}
