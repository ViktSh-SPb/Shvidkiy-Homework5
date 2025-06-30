package org.viktsh.decorator;

/**
 * @author Viktor Shvidkiy
 */
public class BoldDecorator extends TextDecorator {
    public BoldDecorator(Text inner) {
        super(inner);
    }

    @Override
    public String render() {
        return "<b>" + inner.render() + "</b>";
    }
}
