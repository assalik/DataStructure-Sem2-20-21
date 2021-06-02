import java.util.Scanner;

public class Recursion1{
    public static void main(String[] args) {
        System.out.println(SubstituteAI("flabbergasted"));
        System.out.println(SubstituteAI("Astronaut"));

    }
    public static String SubstituteAI(String a){
        if (a.length() == 0){
            return a;
        }else if (a.charAt(0) == 'a'){
            return 'i' + SubstituteAI(a.substring(1));
        }else{
            return a.charAt(0) + SubstituteAI(a.substring(1));
        }

    }
}
