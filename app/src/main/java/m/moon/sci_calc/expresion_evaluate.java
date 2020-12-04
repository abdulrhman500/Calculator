package m.moon.sci_calc;

import android.provider.Settings;
import android.widget.EditText;

//import java.math.*;
public class expresion_evaluate {
Stack<Double> Numbers_Written = new Stack<Double>();

Stack<Double> mm = new Stack<Double>();
Stack<String> deleted_num = new Stack<String>();
Stack<Double> summ = new Stack<Double>();
Stack<Character> signs_Written = new Stack<Character>();
boolean recorded=false,plus_clicked=false;
double	sum=0;
char temp_sign=' ';
double mul=1;

expresion_evaluate(){
    signs_Written.push('+');
summ.push(0.0);
}
String recived_num="";
int The_Integer;
char sign;

boolean dot_written=false;

void num_work() throws NumberFormatException {
    if(dot_written){
    recived_num="0.".concat(recived_num);
    }
    Numbers_Written.push(Double.parseDouble(recived_num)+The_Integer);
    recived_num = "";
    signs_Written.push(sign);
}
void trace (String nn, EditText result)
{
    
    int c = nn.length();
    String hallo="";
    
    if (signs_Written.count == 0) {
        result.setText(recived_num);
        
    } else if (Character.isDigit(nn.charAt(c - 1))) {
        hallo=recived_num;
        if(dot_written)
            hallo="0.".concat(hallo);
        
        if(signs_Written.top()!=null){
        switch (signs_Written.top()) {
            //possible ERORR CHECK WHAT IS PRINTED IS IT THE VALUE OF THEIR ADDITION OR NOT
          
            
            case '+':
                result.setText(Double.toString((Double.parseDouble(hallo) + sum)));
                
                break;
            case '-':
                result.setText(Double.toString((-Double.parseDouble(hallo) + sum)));
                
                break;
            case '*':
                result.setText(Double.toString((mul * Double.parseDouble(hallo) + sum)));
                break;
            case '/':
         //
                result.setText(Double.toString((mul * (1 / Double.parseDouble(hallo)) + sum)));
                break;
            default:
                result.setText("Syntax Error");
            
        }
        }else{
            result.setText(recived_num);
        }
        
        
    }else{
        
        result.setText("Syntax Error");
        
        
    }
}

void plus(char x,double m){
    summ.push(sum);
  
    if(x=='+') {
        sum+=m;
        System.out.println("SUM="+sum+"\n m="+m+"\n operation is "+x);
    }else if(x=='*') {
        mul*=m;
        sum+=mul;
        System.out.println("SUM="+sum+"\n m="+m+"\n operation is "+x);
    }else if(x=='/')
    {
        m=1/m;
        mul*=m;
        sum+=mul;
        System.out.println("SUM="+sum+"\n m="+m+"\n operation is "+x);
    }
    else if(x=='-') {
        sum-=m;
        System.out.println("SUM="+sum+"\n m="+m+"\n operation is "+x);
    }
    
    
    mm.push(mul);
    System.out.println("MUL PUSHED IN - is "+mul+" mm. top= "+mm.top.item);
    mul=1;
    recived_num="";
  
}

void mul(char x,double m) {
   
    if(x=='+') {
        mul*=m;
        System.out.println("SUM="+sum+"\n m="+m+"\n operation is "+signs_Written.top());
    }else if(x=='*') {
        mul*=m;
        System.out.println("SUM="+sum+"\n m="+m+"\n operation is "+signs_Written.top());
    }else if(x=='/')
    {
        
        m=1/m;
        mul*=m;
        System.out.println("SUM="+sum+"\n m="+m+"\n operation is "+signs_Written.top());
        
    }
    else if(x=='-') {
        mul*=-m;
        System.out.println("SUM="+sum+"\n m="+m+"\n operation is "+x);
    }
    recived_num="";
}

void div(char x,double m){
   
    if(x=='+') {
        mul*=m;
    
        System.out.println("SUM="+sum+"\n m="+m+"\n operation is "+x);
    }else if(x=='*') {
        mul*=m;
        System.out.println("SUM="+sum+"\n m="+m+"\n operation is "+x);
    }else if(x=='/')
    {
        m=1/m;
        mul*=m;
        System.out.println("SUM="+sum+"\n m="+m+"\n operation is "+x);
    }
    else if(x=='-') {
        mul*=-m;
        System.out.println("SUM="+sum+"\n m="+m+"\n operation is "+x);
    }
    
    
    
    recived_num="";
}
void mins(char x,double m) {
    summ.push(sum);
  
    if(x=='+') {
        sum+=m;
        System.out.println("SUM="+sum+"\n m="+m+"\n operation is "+x);
    }else if(x=='*') {
        mul*=m;
        sum+=mul;
        System.out.println("SUM="+sum+"\n m="+m+"\n operation is "+x);
    }else if(x=='/')
    {
        m=1/m;
        mul*=m;
        sum+=mul;
        System.out.println("SUM="+sum+"\n m="+m+"\n operation is "+x);
    }
    
    else if(x=='-') {
        sum-=m;
        System.out.println("SUM="+sum+"\n m="+m+"\n operation is "+x);
        
    }
    
    mm.push(mul);
    System.out.println("MUL PUSHED IN - is "+mul+" mm. top= "+mm.top.item);
    mul=1;
    recived_num="";
    
    
    
}


void new_setup(){
    deleted_num.clear();
    signs_Written.clear();
    summ.clear();
    mm.clear();
    sum=0;
    mul=1;
    Numbers_Written.clear();
    
}
void back(String n){
//System.out.println("mm ="+mm.top.item);

    if(n!=null)
    {    if(Character.isDigit(n.charAt(n.length()-1))) {
        deleted_num.push(n.charAt(n.length()-1)+"");
        System.out.println("num pushed"+deleted_num.top());
        System.out.println("HALO=-0987654567================="+recived_num);
        recived_num = recived_num.substring(0, recived_num.length() - 1);
        System.out.println("HALO=///////////-0987654567================="+recived_num);
    }else if(n.charAt(n.length()-1)=='.'){
        dot_written=false;
       
//recive the num and to use it in * and / to make the mul to its new form after deleting *or/ and the num after it if exists
    }
    //
    else {
 
        //intented for operations +-*/ only

        temp_sign=  signs_Written.pop_with_return_poped();

        recived_num=Double.toString(Numbers_Written.pop_with_return_poped());
        
        if(n.charAt(n.length()-1)=='+'){
            recorded=true;
            plus_clicked=true;
           // if(recived_num!=null)
            
            
            mul=mm.pop_with_return_poped()/Double.parseDouble(recived_num);
            
           System.out.println("welcom hgvg mm= "+mul*Double.parseDouble(recived_num)+" recevied num "+recived_num+"  mul = "+mul);
            sum=summ.pop_with_return_poped();
        deleted_num.clear();
        }else if(n.charAt(n.length()-1)=='-'){
            recorded=true;
            plus_clicked=true;
           // if(recived_num!=null)
            mul=mm.pop_with_return_poped()/Double.parseDouble(recived_num);
            sum=summ.pop_with_return_poped();
            deleted_num.clear();
        }else {
            if(n.charAt(n.length()-1)=='*'){
                
            
                if(recorded){
                  if(signs_Written.top()=='/')
                        mul=mm.pop_with_return_poped()/((1/Double.parseDouble(recived_num))*deleted_num_value());
                  else
                      mul=mm.pop_with_return_poped()/(deleted_num_value()*Double.parseDouble(recived_num));
    
                }else {
                   // mul=mm.pop_with_return_poped();
                    if(plus_clicked)
                    {  mul=mm.pop_with_return_poped();plus_clicked=false;}

//                        mul=mm.pop_with_return_poped()*Double.parseDouble(recived_num);
                    else if(signs_Written.top()=='/')
                        mul*=Double.parseDouble(recived_num);
                        //                      mul=mm.pop_with_return_poped()/Double.parseDouble(recived_num);
                    else
                        mul/=Double.parseDouble(recived_num);
                    
                    
                    
                    }
                deleted_num.clear();
            }else if(n.charAt(n.length()-1)=='/'){
    
                if(recorded){
                    if(signs_Written.top()=='/')
                      mul=mm.pop_with_return_poped()*deleted_num_value()*Double.parseDouble(recived_num);
        else
                        mul=mm.pop_with_return_poped()*deleted_num_value()/Double.parseDouble(recived_num);
            
            
                }else {
                    if(plus_clicked)
                    {                        mul=mm.pop_with_return_poped();plus_clicked=false;}

//                        mul=mm.pop_with_return_poped()*Double.parseDouble(recived_num);
                    else if(signs_Written.top()=='/')
                       mul*=Double.parseDouble(recived_num);
                        //                      mul=mm.pop_with_return_poped()/Double.parseDouble(recived_num);
                    else
                        mul/=Double.parseDouble(recived_num);
        
    
                }
                
                deleted_num.clear();
            }
            
            
            /*
String ss=signs_Written.display();
           String nn=Numbers_Written.display();
if(temp_sign!=' ')
ss=ss.concat(temp_sign+"");

if(ss.charAt(ss.length()-2)==temp_sign){
     mul=calc_mul(nn,ss);
}else{
    mul=Double.parseDouble(recived_num);
    mul=calc_mul(nn,ss);

}
*/
     System.out.println(mul+"  RECEVED NUM AFTER THE DELETE HERE WE GOOOOOOOOOOOOOOO ");
        
        }
    } }
}

private double deleted_num_value(){
    String temp="";
    while(deleted_num.top!=null){
        temp=temp.concat(deleted_num.pop_with_return_poped());
    }
    
    System.out.println(Double.parseDouble(temp)+"HELLO I AM THE DELEDTED NUM VALUEE");
return Double.parseDouble(temp);}





double calc_mul(String n,String s){
    double y=1;
    int count=0;
    
    int len_s=s.length();
    int len_n=n.length();
char jj=s.charAt(len_s-count-1);
 char nn;
 while(jj=='*'& count<len_n){
        if(count==0) {y *= Double.parseDouble(recived_num) * Double.parseDouble(n.charAt(count)+""); }
 else y*= Double.parseDouble(n.charAt(count)+"");
    count+=1;
    
    jj=s.charAt(count);
    }
   
   while(jj=='/'& count<len_n){
       
       if(count==0){
           y *= (1/Double.parseDouble(recived_num)) *Double.parseDouble(n.charAt(count)+"");
           System.out.println("111111111111 111112222-============1"+y);
       }
    else
        y=  Double.parseDouble(n.charAt(count)+"")*(1/y);
   count++;
       System.out.println("111111111111 111112222-==========)))))))))))))))))))==1"+y);
       jj=s.charAt(count);
   
   }
   
   return y;
   
    }





}


