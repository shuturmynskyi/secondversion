package Hmw_Generics;

import java.util.Arrays;
import java.util.Collection;

public class BoxTest {
    public static void main(String[] args) {
        Box<Double, String, Integer> first = new Box<> (100.12, "BigOne", 30);

        Collection <?> col = Arrays.asList(first.getName(), first.getLength(), first.getSupplierNumber());
        Box.printCollection(col);

    }
}