package jm.desprez;

import io.vavr.control.Option;
import org.jetbrains.annotations.NotNull;

public class JavaOptionBad  implements XMLNavigatorFP {
    private final Element rootElement;


    public JavaOptionBad(final Element element) {
        rootElement = element;
    }


    @NotNull
    public Option<Element> getPromotedBuild() {
        // can produce a NullPointerException
        return Option.of(rootElement.getChild("config"))
                     .map(element -> element.getChild("plugins"))
                     .map(element -> element.getChild("promote"));
    }
}
