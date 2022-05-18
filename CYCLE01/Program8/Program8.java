import java.util.Scanner;

class Node{
    public int data;
    public Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    private Node head;

    public LinkedList(){
        head=null;
    }

    //implement insertLast 
    public void addNode(int data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;            
        }
        temp.next=newNode;

    }
    //implement display
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print("-["+temp.data+"]-");
            temp=temp.next;            
        }
        System.out.println();
    }
    //implement deleteLast
    public void deleteLast(){
        if(head==null){
            System.out.println("Can't Delete !! LIST IS EMPTY");
            return;
        }
        Node temp = head;
        while((temp.next).next!=null){;
            temp=temp.next;            
        }
        System.out.println("DELETED : "+(temp.next.data));
        temp.next=null;

        display();
    }
    //implement average
    public void average(int size){
        if(head==null){
            System.out.println("CAN'T FIND AVERAGE !! LIST IS EMPTY");
            return;
        }
        if(size % 2==0){
            int mid = size/2 -1;
            Node temp = head;
            while(mid != 0){
                temp=temp.next;
                mid--;
            }
            Node tempNext = temp.next;
            
            double average =(double) ((temp.data+tempNext.data)/2.0);
            System.out.println("AVERAGE OF MIDDLE ELEMENTS = "+average);

        }else{
            int mid = size/2;
            Node temp = head;
            while(mid != 0){
                temp=temp.next;
                mid--;
            }
            System.out.println("AVERAGE OF MIDDLE ELEMENTS = "+temp.data);
        }
    }
    //implement swap
    public void swap(int pos1 , int pos2){
        Node spos1 = head;
        Node spos2 = head;
        int i=0;
        while(i!=(pos1+1) && spos1!=null){
            spos1=spos1.next;
            i++;
        }
        i=0;
        while(i!=(pos2+1) && spos2!=null){
            spos2=spos2.next;
            i++;
        }
        System.out.println("DATA FOUND AT THE "+(pos1)+" IS "+spos1.data);
        System.out.println("DATA FOUND AT THE "+(pos2)+" IS "+spos2.data);
        System.out.println("SWAPPING THE VALUESS...");
        int data = spos1.data;
        spos1.data=spos2.data;
        spos2.data=data;

        System.out.print("\nLIST AFTER SWAPPING : ");
        display();
    }
    
}

class Program8 {
    public static void main(String[] args) {
        //OBJECT SECTION
        LinkedList list = new LinkedList();
        Scanner scan = new Scanner(System.in);

        //VARIABLE SECTION
        int choice =0;
        int option =0;

        //INPUT SECTION
            //read the size of list
            System.out.print("Enter the number of nodes : ");
            int size = scan.nextInt();
            //read the data
            for (int i = 0; i < size; i++) {
                System.out.print("Enter the data : ");
                int data=scan.nextInt();
                list.addNode(data);
            }
            //display the list 
            System.out.print("\n Entered List : ");
            list.display();
            //read the option
            do{
                System.out.println("\nSELECT AN OPTION TO CONTINUE...");               
                System.out.println("\t ENTER 1 FOR  AVERAGE OF MIDDILE 2 ELEMENTS .");
                System.out.println("\t ENTER 2 FOR  DELETE LAST  ELEMENT .");
                System.out.println("\t ENTER 3 FOR  SWAP THE POSITION OF ELEMENT .");
                System.out.println("\t ENTER 4 FOR ADD NODE TO THE LIST");
                System.out.print("ENTER YOUR OPTION HERE : ");
                option=scan.nextInt();

                switch(option){
                case 1:
                    list.average(size);
                    break;
                case 2:
                    list.deleteLast();
                    break;
                case 3:
                    System.out.print("Enter first position : ");
                    int pos1 = scan.nextInt();
                    System.out.print("Enter second position : ");
                    int pos2 = scan.nextInt();
                    list.swap(pos1, pos2);
                    break;
                case 4:
                    System.out.print("Enter data want to add : ");
                    int data = scan.nextInt();
                    list.addNode(data);
                    size++;
                    //display the list 
                    System.out.print("\n UPDATED List : ");
                    list.display();
                    break;
                default:
                    System.out.println("INVALID ENTRY!!!!!!");
                    break;
                }

                System.out.print("\n Do you want to continue ? enter 1 here : ");
                choice = scan.nextInt();
            }while(choice==1);



        //OUTPUT SECTION

        scan.close();
    }
}
