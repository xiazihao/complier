package com.xiazihao.complier.token;

/**
 * Author: zihao.xia
 * Date: 2018/4/1
 * Description:
 */
public class Num extends Token{
    private String val;

    public Num(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"val\":\"")
                .append(val).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
