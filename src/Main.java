
import java.util.Scanner;

public class Main {
    
   public static void main(String[] args){
Scanner scanner = new Scanner(System.in); 
       System.out.println("Welcome to operation center of office workers.");
       String options = ("__Operations__\n "
                        +"1.Developer Operations_:\n"
                        +"2.Team-Leader Operations_:\n "
                        +"3.For exit,please type Q");
       System.out.println("//\\//\\//\\//\\//\\//\\//\\//\\//\\");
       System.out.println(options);
       System.out.println("//\\//\\//\\//\\//\\//\\//\\//\\//\\");
       
       while (true){
           System.out.print("Please choose your opertion in below: ");
           String operation = scanner.nextLine();
           
           if (operation.equals("Q")){
               System.out.println("Pleasse wait, when operations ending...");
              break;
           }
           else if (operation.equals("1")){
              Developer developer = new Developer("Harry Wilson", "Potter", 04526,"Python, C, Java");
                      String dev_options = ("1.Making Format\n"
                                            +"2.Show Informations\n"
                                            +"3.For exit,Pleasse type Q");
                      System.out.println("****************************");
                      System.out.println(dev_options);
                      System.out.println("****************************");
                      
                      while(true){
                          System.out.print("Please choose your developer operations");
                          String dev_op = scanner.nextLine();
                          
                          if (dev_op.equals("Q")){
                              System.out.println("Your developer operations ending..");
                              break;
                          }
                          else if(dev_op.equals("1")){
                              System.out.println("Developer's operating system: ");
                              String OS = scanner.nextLine();
                              developer.setFormat(OS);
                          }
                          else if (dev_op.equals("2")){
                              developer.showInfos();
                          }
                          else{
                              System.out.println("Undefined process... ");
                          }
                      }
               
           }
           else if (operation.equals("2")){
               TeamLeader tLeader = new TeamLeader("Louise Ryan", "Hamilton", 43235, 7);
               
               String teamL_op = ("Team Leader contents\n"
                                 +"1.Raising Incomes\n"
                                 +"2.Look Information\n"
                                 +"3.For exit,type by Q");
               System.out.println("_-------------------_");
               System.out.println(teamL_op);
               System.out.println("_-------------------_");
               
               while(true){
                   System.out.print("Choose your option from Team Leader contents");
                   String tmLeader = scanner.nextLine();
                   
                   if (tmLeader.equals("Q")){
                       System.out.println("Your Team Leader operating ending...");
                       break;
                   }
                   else if (tmLeader.equals("1")){
                       System.out.print("How much income you want extra adding by TeamLeader??");
                       int exIncome = scanner.nextInt();
                       scanner.nextLine();
                       tLeader.raiseIncome(exIncome);
                   }
                   else if (tmLeader.equals("2")){
                       tLeader.showInfos();
                   }
                   else {
                       System.out.println("Your option is undefined => Check Again...");
                   }
               }
           }
           else{
               System.out.println("Your option denied.Choose operations listed below...");
           }
       }
   } 
}
