import java.util.Scanner;

class MyStack {
    private char[] array;
    private int max;
    private int top;


    //constructor
    public MyStack(int max){
        this.max=max;
        array=new char[max];
        top=-1;
    }

    //isEmpty();
    public boolean isEmpty(){return (top==-1);}
    //isFull();
    public boolean isFull(){return (top==(max-1));}
    //push();
    public void push(char data){

        if(isFull()){
            System.out.println("Can't Push into the stack!");
        }else{
            top++;
            array[top]=data;
        }
    }
    //pop();
    public char pop(){
        if(isEmpty()){
            System.out.println("Can't Pop from the  stack!");
            return 'f';
        }
        char c = array[top];
        top--;
        return c;        
    }
    //peek();
    public char peek(){return array[top];}
}

class Problem2 {
    public static void main(String[] args) {
        //create Mystack object
        MyStack skObj = new MyStack(100);
        //create Scanner class object
        Scanner scan = new Scanner(System.in);
        //read the expression
        System.out.print("Enter the expression : ");
        String exp = scan.nextLine();
        //push brackets and check if it is balanced
        boolean flag = false;
        for(int i =0;i<exp.length();i++){
            char symbol = exp.charAt(i);

            if(symbol=='('||symbol=='{'||symbol=='['){
                skObj.push(symbol);
            }else if(symbol==')'){
                if(skObj.peek()=='('){
                   flag=true;
                }else{
                    System.out.println("Expression not statisfied !!");
                    System.exit(0);
                }
            }else if(symbol=='}'){
                if(skObj.peek()=='{'){
                   flag=true;
                }else{
                    System.out.println("Expression not statisfied !!");
                    System.exit(0);
                }
            }else if(symbol==']'){
                if(skObj.peek()=='['){
                   flag=true;
                }else{
                    System.out.println("Expression not statisfied !!");
                    System.exit(0);
                }
            }
        }
        //print result
        if(!skObj.isEmpty() || flag){
            System.out.println("Expression Statisfied !!");
        }

        scan.close();
    }
}
