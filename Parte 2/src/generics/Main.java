package generics;

public class Main {

    public static void main(String[] args){
        Creador<Peluche> creadorPeluche = new Creador<>() {
            @Override
            public Peluche crear() {
                return new Peluche();
            }
        };


        Creador<Carrito> creadorCarrito = new Creador<>() {
            @Override
            public Carrito crear() {
                return new Carrito();
            }
        };

        creadorPeluche.crear();
        creadorCarrito.crear();
    }

}
