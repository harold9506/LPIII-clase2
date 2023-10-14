package streams;

import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void main (String []args) {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado(1L, 20 , "KAndres"));
        empleados.add(new Empleado(6L, 24 , "Karen"));
        empleados.add(new Empleado(8L, 17 , "Daniela"));


        Set<String> nombres = empleados.stream()//Set String para nombre
                .map(empleado -> empleado.getNombre())
                .collect(Collectors.toSet());

        Set<Character> iniciales = empleados.stream()//Set character para iniciales
                .map(empleado -> empleado.getNombre())
                .map(nombre -> nombre.charAt(0))
                .collect(Collectors.toSet());

        Set<Empleado> edad = empleados.stream() //filtrar por edad
                .filter(empleado -> empleado.getEdad() > 18)
                .collect(Collectors.toSet());

        Set<Empleado> filtroempleado = empleados.stream() //filtrar por edad
                .filter(empleado -> empleado.getNombre().charAt(0) != 'A')
                .collect(Collectors.toSet());

        Optional<Empleado> maximo = empleados.stream() //valor maximo
                .max(Comparator.comparing(empleado -> empleado.getEdad()));

        Optional<Empleado> minimo = empleados.stream() //valor minimo
                .min(Comparator.comparing(empleado -> empleado.getEdad()));

        Optional<Empleado> primerelemento = empleados.stream() //encontrar primer elemento
                .filter(empleado -> empleado.getNombre().charAt(0) == 'K')
                .findFirst();

        Optional<Empleado> cualquierelemento = empleados.stream() //encontrar cualquier elemento
                .filter(empleado -> empleado.getNombre().charAt(0) == 'K')
                .findAny();

        Map<Long, Empleado> crearmapa = empleados.stream()//Se mapea los empleados
                .collect(Collectors.toMap(empleado -> empleado.getId(), empleado -> empleado));



        System.out.println(nombres);
        System.out.println(iniciales);
        System.out.println(edad);
        System.out.println(filtroempleado);
        System.out.println(maximo);
        System.out.println(minimo);
        System.out.println(primerelemento);
        System.out.println(cualquierelemento);
        System.out.println(empleados);

        System.out.println(crearmapa);

        empleados.stream() //mostrar todos los empleados
                .forEach(System.out::println);

        Optional<Empleado> optionalEmpleado =
                Optional.of(new Empleado(5L, 10, "Alan"))
                .filter(empleado -> empleado.getEdad() > 18);

        optionalEmpleado.orElse(null);
        System.out.println(optionalEmpleado.isPresent());

    }


}
