package m.moon.sci_calc;
//MAKE SURE IT WORKS
public class Queue<t> {
class node {
    
    node next;
    t item;
    
    node(){
        next=null;
    }
}

int count=0;
node front=null,end=null;

void enqueue(t item)
{
    node a=new node();
    a.item=item;
    if(count==0)
        front=end=a;
else{
    end.next=a;
    end=a;
    
    }
    count++;
  
}
void dequeue(){
    if(!isempty()) {
        front = front.next;
        count--;
    }if(front==null)
        front=end=null;
    }
boolean isempty(){return front==null&end==null?true:false; }
void clear(){front=end=null;count=0;}
}
