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
public class Teacher extends Person{
    private String program, university;
    
    public Teacher(){
        super();
    }
    
    public Teacher(int id, String name, String lastName, int age, String program, 
            String university){
        super(id, name, lastName, age);
        this.program=program;
        this.university=university;
    }

    /**
     * @return the program
     */
    public String getProgram() {
        return program;
    }

    /**
     * @param program the program to set
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     * @return the university
     */
    public String getUniversity() {
        return university;
    }

    /**
     * @param university the university to set
     */
    public void setUniversity(String university) {
        this.university = university;
    }
    
    @Override
    public String retornarDatos(){
        return "Teacher{program: "+ this.program+", University: "+this.university+", "
                + super.retornarDatos()+"}";
    }
    
}
