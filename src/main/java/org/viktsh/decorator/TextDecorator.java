package org.viktsh.decorator;

/**
 * @author Viktor Shvidkiy
 */
public abstract class TextDecorator implements Text{
    protected final Text inner;

    public TextDecorator(Text inner){
        this.inner=inner;
    }
}
