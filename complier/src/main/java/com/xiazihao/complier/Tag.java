package com.xiazihao.complier;

/**
 * Author: zihao.xia
 * Date: 2018/4/1
 * Description:
 */
public enum Tag {
    ERR,
    END,
    ID,
    KW_INT, KW_CHAR, KW_VOID,
    KW_EXTERN,
    NUM, CH, STR,
    NOT, LEA,
    ADD, SUB, MUL, DIV, MOD,
    INC, DEC,
    GT, GE, LT, LE, EQU, NEQU,
    AND, OR,
    LPAREN, RPARN,
    COMMA, COLON, SEMICON,
    ASSIGN,
    KW_IF, KW_ELSE,
    KW_SWITCH, KW_CASE, KW_DEFAULT,
    KW_WHITE, KW_DO, KW_FOR,
    KW_BREAK, KW_CONTINUE, KW_RETURN
};