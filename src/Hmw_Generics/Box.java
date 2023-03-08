package Hmw_Generics;

//just new comment
//another one

import java.util.Collection;
public class Box <T, B, A> {
    protected T length;
    protected B name;
    protected A supplierNumber;

    public T getLength() {
        return length;
    }
    public B getName() {
        return name;
    }
    public A getSupplierNumber() {
        return supplierNumber;
    }
    public Box(T length, B name, A supplierNumber) {
        this.length = length;
        this.name = name;
        this.supplierNumber = supplierNumber;
    }

    public static void printCollection (Collection <?> c) {
        for (Object e : c){
            System.out.println(e.getClass().getName());
        }
    }
}