package sieteymedia;


/**
 * Carta
 */

 class Carta {

    // Atributos
    private String palo;
    private String numero;

    // Constructor
    public Carta(String palo, String numero) {
        this.palo = palo;
        this.numero = numero;
    }

    // Métodos

    public double Puntuacion() {
        switch (numero) {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
                return Double.parseDouble(numero);
            case "Sota":
            case "Caballo":
            case "Rey":
                return 0.5;
            default:
                return 0.0;
        }
    }



    @Override
    public String toString() {
        return numero + " de " + palo;
    }
}