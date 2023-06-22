
class Guepardo extends Felino {
    public Guepardo(String nombre) {
        super(nombre, "Guepardo");
    }

    public void correr() {
        System.out.println("El guepardo " + getNombre() + " está corriendo.");
    }
}
