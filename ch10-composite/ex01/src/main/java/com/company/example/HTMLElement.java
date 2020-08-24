package com.company.example;

import java.util.List;
import java.util.ArrayList;

// tag::source[]
public class HTMLElement {
    String tagName;
    private List<HTMLElement> children = new ArrayList<>();

    public HTMLElement() {
        this("html");
    }

    public HTMLElement(String tagName) {
        this.tagName = tagName;
    }

    public void add(HTMLElement element) {
        children.add(element);
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("<");
        builder.append(tagName);
        builder.append(">");
        for(HTMLElement element : children) {
            builder.append(element.toString());
        }
        builder.append("</");
        builder.append(tagName);
        builder.append(">");

        return builder.toString();
    }
}
// end::source[]