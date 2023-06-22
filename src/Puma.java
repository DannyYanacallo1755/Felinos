
class Puma extends Felino {
    public Puma(String nombre) {
        super(nombre, "Puma");
    }

    public void saltar() {
        System.out.println("El puma " + getNombre() + " está saltando.");
    }
}
