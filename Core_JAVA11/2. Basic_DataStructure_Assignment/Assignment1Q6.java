package corejava;

import java.util.Scanner;

public class Assignment1Q6{
    
    static String userId = "Ajay";
    static String password = "password";

    public static boolean loginUser(String user, String pass) {

        if (user.equals(userId) && pass.equals(password)) {
        return true;}
        else { 
        return false;
    }
}

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            String userId, password;
            int attempt = 0;
            

            do {
                System.out.println("Enter UserID: ");
                userId = sc.next();
                System.out.println("Enter Password: ");
                password = sc.next();
                boolean ans= loginUser(userId,password);


                if (ans == true) {
                    System.out.println("Welcome" + userId);
                    break;
                } 
                else if (ans == false && attempt < 3) {
                    System.out.println("You have entered wrong credentials ,please verify");
                    attempt += 1;
                }

            } while (attempt != 3);
            if (attempt >= 3) {
                System.out.println("You have entered wrong credentials 3 times");
            }
        }  
    }
}
