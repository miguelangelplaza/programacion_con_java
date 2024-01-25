package sieteymedia;


/**
 * Carta
 */

 public class Carta {
    private String palo;
    private String valor;

    public Carta(String palo, String valor) {
        this.palo = palo;
        this.valor = valor;
    }

    public String getPalo() {
        return palo;
    }

    public String getValor() {
        return valor;
    }

    public double getPuntuacion() {
        switch (valor) {
            case "Sota":
            case "Caballo":
            case "Rey":
                return 0.5;
            default:
                // Trata de convertir el valor a un número; si no es posible, devuelve 0.
                try {
                    return Double.parseDouble(valor);
                } catch (NumberFormatException e) {
                    return 0.0;
                }
        }
    }

    @Override
    public String toString() {
        return valor + " de " + palo;
    }
}