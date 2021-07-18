
public class TeamLeader extends Workers{
    private int resPerson;

    public TeamLeader(String name, String surname, int id, int resPerson) {
        super(name, surname, id);
        this.resPerson = resPerson;
    }

    @Override
    public void showInfos() {
        super.showInfos(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Number for responsible persons: " + resPerson + " ");
    }
    public void raiseIncome(int income){
        System.out.println("One of the workers" + getName() +  " income has been rasied " + income + " $.");
    }
    
    
}
