/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

/**
 *
 * @author joao batista
 */
public class Tokens {

    public String name;
    public String value;
    public int line;
    public int column;
    public String desc;

    public Tokens(String string, String yytext, int yyline, int yycolumn) {
        this.name = string;
        this.value = yytext;
        this.line = yyline + 1;
        this.column = yycolumn + 1;
        this.desc = "";
    }

    public Tokens(String string, String yytext, int yyline, int yycolumn, String desc) {
        this.name = string;
        this.value = yytext;
        this.line = yyline + 1;
        this.column = yycolumn + 1;
        this.desc = desc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setLine(int line) {
        this.line = line + 1;
    }

    public void setColumn(int column) {
        this.column = column + 1;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

    public String getDesc() {
        return desc;
    }

}
