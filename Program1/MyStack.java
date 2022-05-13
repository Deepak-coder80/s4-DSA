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
        top++;
        array[top]=data;
    }
    //pop();
    public char pop(){
        char c = array[top];
        top--;
        return c;        
    }
    //peek();
    public char peek(){return array[top];}
}
