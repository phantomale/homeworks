/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes.antlr;

/**
 *
 * @author JuanCamilo
 */
public class Variable<T> {

    public static final int TYPE_REAL = 0;
    public static final int TYPE_BOOLEAN = 1;
    public static final int TYPE_INTEGER = 2;
    public static final int TYPE_STRING = 3;
    public static final int TYPE_CHAR = 4;
    public static final int TYPE_ARRAY = 5;
    public static final int TYPE_VOID = 6;

    private int type;
    private T value;

    public Variable(int type, T value) {
        this.type = type;
        this.value = value;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return getTypeString() + " " + value;
    }

    public String getTypeString() {
        switch (type) {
            case TYPE_BOOLEAN:
                return "booleano";
            case TYPE_CHAR:
                return "caracter";
            case TYPE_INTEGER:
                return "entero";
            case TYPE_STRING:
                return "cadena";
            case TYPE_REAL:
                return "real";
            case TYPE_VOID:
                return "void";
            case TYPE_ARRAY:
                return "Arreglo";
        }
        return "error";
    }

}
