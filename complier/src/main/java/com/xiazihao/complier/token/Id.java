package com.xiazihao.complier.token;

/**
 * Author: zihao.xia
 * Date: 2018/4/1
 * Description:
 */
public class Id extends Token{
    String name;

    public Id(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"name\":\"")
                .append(name).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
