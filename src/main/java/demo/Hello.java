package demo;

import org.apache.commons.lang3.StringEscapeUtils;

public class Hello {

    public static void main(String[] args) {
        String text = "\\u0048\\u0065\\u006C\\u006C\\u006F: \\u4e09 and World";
        String normal = StringEscapeUtils.unescapeJava(text);
        System.out.println(normal);
    }

}
