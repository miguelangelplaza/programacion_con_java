package ejemplos;
/**
 * EjemploHasMap03
 * 
 * 
 * @author miguel angel plaza rueda
 * 
 */
public class Carta {
    private static String[] palos = {"oros", "Bastos", "espadas", "copas"};
    private static String[] nuemros = {"1", "2", "3", "4", "5", "6", "7"};

    private String palo; 
    private String valor;

    public Carta(){
        this.palo = palos[(int)(Math.random()*4)];
        this.palo = numeros[(int)(Math.random()*10)];




        
public String getPalo() {
    return palo;
}

public String getValor() {
    return valor;
}






    @Override
    public String toString() {
        return valor + " de " + palo;








        


    }



    
}
}