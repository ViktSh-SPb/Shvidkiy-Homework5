package org.viktsh.decorator;

/**
 * @author Viktor Shvidkiy
 */
public class MainClass {
    public static void main(String[] args) {
        Text text = new PlainText("Мой текст");
        text=new BoldDecorator(new ItalicDecorator(new UnderlineDecorator(text)));
        System.out.println(text.render());
    }
}
