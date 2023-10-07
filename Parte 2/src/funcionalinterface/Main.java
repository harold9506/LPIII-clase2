package funcionalinterface;

import java.util.function.Function;

public class Main {

    public static void main(String[] args){
        Function<Integer, String> function = (Integer integer) -> integer.toString() + "este es el numero";
        String string = function.apply(8);
        propiainterfaz<String, Integer> propiainterfaz = (String stringParam) -> {
            System.out.println("Valor de entrada" + stringParam);
            return 50;
        };
        System.out.println(propiainterfaz.aplicar("100"));
    }
}

