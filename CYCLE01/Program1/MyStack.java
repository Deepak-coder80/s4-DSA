public class MyStack {
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
