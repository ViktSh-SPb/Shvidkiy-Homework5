package org.viktsh.decorator;

/**
 * @author Viktor Shvidkiy
 */
public class ItalicDecorator extends TextDecorator {
    public ItalicDecorator(Text inner) {
        super(inner);
    }

    @Override
    public String render() {
        return "<i>" + inner.render() + "</i>";
    }
}
