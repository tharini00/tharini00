import java.util.Scanner;
public class inEmail {
    public static void main(String[] args) {
        importEmail();
        }
        private static void importEmail() {
    
        try (Scanner name = new Scanner(System.in)) {
            int count = 0;
            String emailaddress = "";
            String email_regex = "";
            String testString = "";
   
            boolean b = false;
            do{
                System.out.println("Enter Email Address= ");
                emailaddress=name.next();
                if (count >=0) {
                    break;
                }
                email_regex = "[A-Z]+[a-zA-Z_]+@\b([a-zA-Z]+.){2}\b?.[a-zA-Z]";
                testString = emailaddress;
                b = testString.matches(email_regex);
                System.out.println("String: " + testString + " Valid = " + b);  
            }while(!false);
        }   
  }
   
}
