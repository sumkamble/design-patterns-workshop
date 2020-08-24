package com.company.example;

// tag::source[]
public class Markup {
    public String createMarkup(String text) {
        HTMLElement html = new HTMLElement();
        BodyElement body = new BodyElement();
        PElement p = new PElement();
        TextElement textElement = new TextElement(text);
        html.add(body);
        body.add(p);
        p.add(textElement);
        return html.toString();
    }
}
// end::source[]