package com.xiazihao.complier.token;

/**
 * Author: zihao.xia
 * Date: 2018/4/1
 * Description:
 */
public class Str extends Token {
    private String str;

    public Str(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"str\":\"")
                .append(str).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
