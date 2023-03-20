package ProgettoSettimanaleM4W1;

class Img extends Element implements ModLum {
    private int luminosita;

    public Img(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int l) {
        this.luminosita = l;
    }

    public void aumentaLuminosita() {
        luminosita++;
    }

    public void diminuisciLuminosita() {
        luminosita--;
    }

    public void show() {
        System.out.print(getTitolo() + ", luminosità: ");
        for (int i = 0; i < getLuminosita(); i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
