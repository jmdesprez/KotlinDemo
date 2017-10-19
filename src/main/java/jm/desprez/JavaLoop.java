package jm.desprez;

import java.util.Stack;

public class JavaLoop
        implements XMLNavigator {
    private final Element rootElement;


    public JavaLoop(final Element element) {
        rootElement = element;
    }


    public Element getPromotedBuild() {
        final Stack<String> tagNames = new Stack();
        tagNames.push("promote");
        tagNames.push("plugins");
        tagNames.push("config");
        Element currentElement = rootElement;
        while(!tagNames.isEmpty()) {
            final String tagName = tagNames.pop();
            currentElement = currentElement.getChild(tagName);
            if(currentElement == null) {
                return null;
            }
        }
        return currentElement;
    }
}
