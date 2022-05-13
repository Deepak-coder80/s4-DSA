import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
       //create object for class mystack
       MyStack skObj= new MyStack(100);
       //create object for scanner class
       Scanner scan = new Scanner(System.in);
       //read the string input from the user
       System.out.print("Enter the String : ");
       String inpuString = scan.nextLine();
       //push each character to the stack
       for(int i=0;i<inpuString.length();i++){
           skObj.push(inpuString.charAt(i));
       }
       //make the new string(reversed) by the stack
       char[] revSArray = new char[inpuString.length()];
       for(int i=0;i<inpuString.length();i++){
           revSArray[i]=skObj.pop();
       }
       String newString= String.valueOf(revSArray);
       //compare the two string
       if(inpuString.compareTo(newString)==0){
           System.out.println("Entered String is Palindrome !");

       }else{
           System.out.println("Entered String is Not Palindrome!");
       }

       scan.close();
    }
}