import java.util.Scanner;


class Main {  
  public static void main(String args[]) { 
  char letter;
  Scanner sc = new Scanner(System.in);
  
  System.out.println("type a letter:");
  
  letter = sc.next().charAt(0); //letter receives the imput 
  letter = Character.toLowerCase(letter); //data processing
    
  for(letter++; letter<=122 ; letter++){ //magic with the ASCII table
    System.out.println(letter);    
    }
  System.out.println("END!");
  } 
}