/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Developer extends  Workers{
    
    private String prLang;

    public Developer(String name, String surname, int id, String prLang) {
        super(name, surname, id);
        this.prLang = prLang;
    }
    public void setFormat(String OS){
        System.out.println(getName() + " " + OS + " is loading.." );
    }

    @Override
    public void showInfos() {
        super.showInfos(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Developer's programming language knowledge: " + prLang);
    }
    
}
