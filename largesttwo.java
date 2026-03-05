import java.util.Scanner;

class largesttwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a Alphabet to check (v/c) : ");
        char c = sc.next().charAt(0);
        
        switch(c){
            case 'A': System.out.println("vowel !"); break;
            case 'E': System.out.println("vowel !"); break;
            case 'I': System.out.println("vowel !"); break;
            case 'O': System.out.println("vowel !"); break;
            case 'U': System.out.println("vowel !"); break;
            case 'a': System.out.println("vowel !"); break;
            case 'e': System.out.println("vowel !"); break;
            case 'i': System.out.println("vowel !"); break;
            case 'o': System.out.println("vowel !"); break;
            case 'u': System.out.println("vowel !"); break;
            default: System.out.println("consonant !");
        }
        sc.close();
    }
}
