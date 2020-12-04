package m.moon.sci_calc;
public class Stack<t> {

    int count =1;
    node top=null;
    class node {
        
        
        node next;
        t item;
        
node (t item){
    this.item=item;
}
    }
    t top(){
        if(top!=null)
        return  top.item;
    else return null;
    }
    t pre_top(){
        if(top!=null)
            return  top.next.item;
        else return null;
    
       
        
    }
void push(t item){
node n=new node(item);
n.next=top;
top=n;
count++;
    }
void pop(){
if(top!=null){
        top=top.next;
count--;
    }}
t pop_with_return_poped(){
    if(top!=null) {
node temp=top;
        t tp = top.item;
    
        top = top.next;
        temp.next=null;
        count--;
        return tp;
    }else return null;
    }
void clear(){top=null;
    count=1;}




String display() {

        node cur=top;

String b="";
while(cur.next!=null){
b=b.concat((String) cur.item+"");
    cur=cur.next;
}

return b;    }

}