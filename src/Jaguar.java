
class Jaguar extends Felino {
    public Jaguar(String nombre) {
        super(nombre, "Jaguar");
    }

    public void nadar() {
        System.out.println("El jaguar " + getNombre() + " está nadando.");
    }
}