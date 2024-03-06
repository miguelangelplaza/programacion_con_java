package examen.clases;

/**
 * Gato
 */
public class Gato extends Mascota {

    private String chip; 
    private String NombreDelGato; 
    public boolean vacunado;
    private int totalGatos;
    private int edad; 
    private String pelaje; 

    public Gato(String chip){
        this.chip = chip;
    }


    public String getChip() {
        return chip;
    }
    public void setChip(String chip) {
        this.chip = chip;
    }
    public String getNombreDelGato() {
        return NombreDelGato;
    }
    public void setNombreDelGato(String nombreDelGato) {
        NombreDelGato = nombreDelGato;
    }
    public boolean isVacunado() {
        return vacunado;
    }
    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    public Gato(String chip, String nombreDelGato, boolean vacunado) {
        this.chip = chip;
        NombreDelGato = nombreDelGato;
        this.vacunado = vacunado;
    }

    public void maulla(){
        System.out.println("Miauuuuuuuu! Brrrr......");
    }

    public void bufa(){
        System.out.println("Fuuuuuu");
    }

    public void pasea(){
        if (vacunado=false) {
            System.out.println(NombreDelGato + " no puede pasear hasta ser vacunado/a");
        } else{
            System.out.println("Miauuuuuuuu! Brrrr......");
        }
    }

    public void vacunado(){
        if (vacunado=false) {
            System.out.println("Fuuuuuu");
        } else{
            System.out.println(NombreDelGato +" se encuentra vacunado/a");
        }
    }


    public int getTotalGatos() {
        return totalGatos;
    }
    public void setTotalGatos(int totalGatos) {
        this.totalGatos = totalGatos;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getPelaje() {
        return pelaje;
    }
    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }
    
    

    
}