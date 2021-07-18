/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Workers {
    private String name;
    private String surname;
    private int id;

    public Workers(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
            public void showInfos(){
                System.out.println("Information about workers is below: ");
                System.out.println("Worker Name: " + name);
                System.out.println("Worker Surname: " + surname);
                System.out.println("Worker ID (Identification Number): " + id);
                
            }
}
