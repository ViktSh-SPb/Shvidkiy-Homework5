package org.viktsh.decorator;

/**
 * @author Viktor Shvidkiy
 */
public class UnderlineDecorator extends TextDecorator{
    public UnderlineDecorator(Text inner) {
        super(inner);
    }

    @Override
    public String render() {
        return "<u>"+inner.render()+"</u>";
    }
}
