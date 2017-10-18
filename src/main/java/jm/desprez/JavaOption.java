package jm.desprez;

import io.vavr.control.Option;
import org.jetbrains.annotations.NotNull;

public class JavaOption  implements XMLNavigatorFP {
    private final Element rootElement;


    public JavaOption(final Element element) {
        rootElement = element;
    }


    @NotNull
    public Option<Element> getPromotedBuild() {
        // can produce a NullPointerException
        return Option.of(rootElement.getChild("config"))
                     .flatMap(element -> Option.of(element.getChild("plugins")))
                     .flatMap(element -> Option.of(element.getChild("promote")));
    }

}
