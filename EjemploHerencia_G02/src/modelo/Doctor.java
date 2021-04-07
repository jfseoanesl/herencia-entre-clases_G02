/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author jairo
 */
public class Doctor extends Person {
    private String specialty, hospital;
    
    public Doctor() {
        // invoca al constructor de la superclase
        super();
    }
    
    public Doctor(int id, String name, String lastName, int age, String specialty, 
            String hospital){
        super(id, name, lastName, age);
        this.specialty= specialty;
        this.hospital=hospital;
        
    }

    /**
     * @return the specialty
     */
    public String getSpecialty() {
        return specialty;
    }

    /**
     * @param specialty the specialty to set
     */
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    /**
     * @return the hospital
     */
    public String getHospital() {
        return hospital;
    }

    /**
     * @param hospital the hospital to set
     */
    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
    
    @Override
    public String retornarDatos(){
    
        return "Doctor {specialty: "+this.specialty+", hospital: " +this.hospital+
                ", "+super.retornarDatos()+"}";
    }
   
    
}
