package src.Strategy;

public class AccionBuscar implements Accion{
    @Override
    public void aplicar() {
        System.out.println("Estoy buscando");

    }

    @Override
    public int getOpcion() {
        return 5;
    }
}
