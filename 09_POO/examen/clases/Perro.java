package examen.clases;

/**
 * Perro
 */
public class Perro extends Mascota{

    private String chip;
    private String NombreDelPerro; 
    private String raza;
    private boolean vacunado;
    private int totalPerros;
    private int edad; 


    ////Constructores
    public Perro(String chip) {
        this.chip = chip;
    }

    public Perro (String chip, String NombreDelPerro) {
        this.chip = chip;
        this.NombreDelPerro = NombreDelPerro;
    }

    // class perro {
    //     private String raza;
    // }

    public void ladrar(){
        System.out.println("guau guau");
    }

    public void gruñe(){
        System.out.println("grrr grrr");
    }

    public void pasear(){
       do {
        System.out.println(NombreDelPerro + " no puede pasear hasta no estar vacunado/a");
       } while (vacunado = false);
       

       System.out.println("guau guau");
       

    }

    public void vacunar() {
        if (vacunado = true) {
            System.out.println(NombreDelPerro + " se encuentra vacunado/a");
        }else{
            System.out.println("grrrrrr");
        
        }
    }



    
    
    
    
    
    public String getChip() {
        return chip;
    }

    public String getNombreDelPerro() {
        return NombreDelPerro;
    }

    public String getRaza() {
        return raza;
    

    }

    public int getTotalPerros() {
        return totalPerros;
    }

    public void setTotalPerros(int totalPerros) {
        this.totalPerros = totalPerros;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public void setNombreDelPerro(String nombreDelPerro) {
        NombreDelPerro = nombreDelPerro;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }



    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    public Perro(int totalPerros) {
        this.totalPerros = totalPerros;
    }


    

    


    
}


