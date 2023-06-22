class Tigre extends Felino {
    public Tigre(String nombre) {
        super(nombre, "Tigre");
    }

    public void cazar() {
        System.out.println("El tigre " + getNombre() + " está cazando.");
    }
}