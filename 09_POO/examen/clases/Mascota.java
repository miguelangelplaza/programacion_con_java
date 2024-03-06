package examen.clases;

// import examen.clases.Mascota.MascotaInterface;

/**
 * Mascota1
 */
public abstract class Mascota implements MascotaInterface   {

    // class Mascota implements MascotaInterface {

        private String chip; 
        private String NombreMascota;
        private int edad; 
        private boolean vacunada;
        private int totalMascotas;
        
        
        public Mascota(String chip, String nombre, int edad) {
        this.chip = chip;
        this.NombreMascota = nombre;
        this.edad = edad;
        this.vacunada = false; 


    }



    
    public void vacunar() {
        vacunada = true;
        System.out.println( NombreMascota + " ha sido vacunada.");
    }




    public String getChip() {
        return chip;
    }




    public void setChip(String chip) {
        this.chip = chip;
    }




    public String getNombreMascota() {
        return NombreMascota;
    }




    public void setNombreMascota(String nombreMascota) {
        NombreMascota = nombreMascota;
    }




    public int getEdad() {
        return edad;
    }




    public void setEdad(int edad) {
        this.edad = edad;
    }




    public boolean isVacunada() {
        return vacunada;
    }




    public void setVacunada(boolean vacunada) {
        this.vacunada = vacunada;
    }




    public int getTotalMascotas() {
        return totalMascotas;
    }




    public void setTotalMascotas(int totalMascotas) {
        this.totalMascotas = totalMascotas;
    }

    }


      
       





    


