package ar.edu.unq.po2.tp3;
import java.util.Calendar;
import java.util.Date;

public class Persona {
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;

    public int getEdad() {
        Calendar nacimiento = Calendar.getInstance();
        nacimiento.setTime(this.fechaNacimiento);

        Calendar hoy = Calendar.getInstance();

        int edad = hoy.get(Calendar.YEAR) - nacimiento.get(Calendar.YEAR);

        if (hoy.get(Calendar.DAY_OF_YEAR) < nacimiento.get(Calendar.DAY_OF_YEAR)) {
            edad--;
        }

        return edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public Date getFechaDeNacimiento(){
        return this.fechaNacimiento;
    }
    //No conoce por el encapsulamiento, solo sabe que va a devolver un int
    public boolean menorQue(Persona otraPersona){
        return this.getEdad()< otraPersona.getEdad();
    }

    //QUE ONDA CON EL STATIC? Lo decia Claude
    public Persona(String nombre,String apellido, Date fechaNacimiento){
        this.nombre = nombre;
        this.apellido= apellido;
        this.fechaNacimiento = fechaNacimiento;
    }
}
