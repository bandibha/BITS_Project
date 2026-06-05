
public class Queue1 {
    int front=-1;;
    int rear=-1;
    int arr[] = new int [5];
    void en(int data)
    {
        if(rear==arr.length-1)
        {
            System.out.println("Queue Overflow");
            return;
        }
        if(front==-1)
        {
            front=0;
        }
        rear++;
        arr[rear]=data;
        System.out.println(arr[rear]+"->Inserted");
    }

    void de()
    {
        if(front==-1 || front>rear)
        {
            System.out.println("Queue Underflow");
            return;
        }
        
        System.out.println(arr[front]+"->Deleted");
        front++;
    }
    void peek()
    {
      if(front==-1 || front>rear)
        {
            System.out.println("Queue Underflow");
            return;
        }  
         System.out.println(arr[front]+":is peek value");
    }
    void display()
    {
       if(front==-1 || front>rear)
        {
            System.out.println("Queue Underflow");
            return;
        }   
        for(int i=front;i<=rear;i++)
        {
            if(arr[i]==arr[rear])
            System.out.print(arr[i]);
            else
                System.out.print(arr[i]+"->");
        }
    }
    void count()
    {
        if(front==-1 || front>rear)
        {
            System.out.println("Queue Underflow");
            return;
        }   
        int count = 0;
        for(int i=front;i<=rear;i++){
            count++;
        }
        System.out.println("\ncount:"+count);
    }
    public static void main(String[] args) {
        Queue1 ob = new Queue1();
        ob.en(23);
        ob.en(24);
        ob.en(25);
        ob.en(26);
        ob.de();
        ob.peek();
        ob.display();
        ob.count();
    }
}
