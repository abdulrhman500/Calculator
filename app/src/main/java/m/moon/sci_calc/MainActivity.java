package m.moon.sci_calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
//make sur eto handle dot_written in the back button

public class MainActivity extends AppCompatActivity {
EditText screen,result;
String num_written;
char written_sign;
Button _1,_2,_3,_4,_5,_6,_7,_8,_9,_0,plus,minus,mult,div,equal,dot;
ImageButton back;


expresion_evaluate a = new expresion_evaluate();

void sendto(expresion_evaluate aa){
    
    aa.recived_num = aa.recived_num.concat(num_written);
    //
    
// aa.sign=gewritten_sign();//what is this

}
void sendsign(expresion_evaluate aa){
    aa.sign = written_sign;
}
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    //screen=(EditText)findViewById(R.id.);
    written_sign = ' ';
    num_written = "";
    
    result=(EditText)findViewById(R.id.result);
    screen=(EditText)findViewById(R.id.en);
    
    equal=(Button)findViewById(R.id.equal);
_1=(Button)findViewById(R.id.b1);
_2=(Button)findViewById(R.id.b2);
    _3=(Button)findViewById(R.id.b3);
    _4=(Button)findViewById(R.id.b4);
    _5=(Button)findViewById(R.id.b5);
    _6=(Button)findViewById(R.id.b6);
    _7=(Button)findViewById(R.id.b7);
    _8=(Button)findViewById(R.id.b8);
    _9=(Button)findViewById(R.id.b9);
    _0=(Button)findViewById(R.id.b0);
      plus=(Button)findViewById(R.id.plus);

    minus=(Button)findViewById(R.id.mins);
    div=(Button)findViewById(R.id.div);
    mult=(Button)findViewById(R.id.mul);
dot=(Button)findViewById(R.id.dot);
back=(ImageButton)findViewById(R.id.back);

back.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           String k=screen.getText().toString();
           
           if(k.length()-1>=0){
           screen.setText(k.substring(0,k.length()-1));
           a.back(k);
result.setText("");
           }
       }
   });
dot.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        int n = screen.getText().toString().length();
        if (n != 0) {
            if (Character.isDigit(screen.getText().toString().charAt(n - 1))) {
    
                if (!a.dot_written) {
               a.The_Integer =Integer.parseInt(screen.getText().toString().charAt(n-1)+"");
               
                    screen.setText(screen.getText() + ".");
                    a.dot_written = true;
                    //num_written = num_written.concat(".");
                }
            }else{
                if (!a.dot_written) {
                    screen.setText(screen.getText().toString()+ "0.");
                    a.dot_written = true;
                  //  num_written = num_written.concat("0.");
                }
            }
        }
        
        else{
                screen.setText(screen.getText().toString()+ "0.");
                a.dot_written = true;
            System.out.println("hi there   dot ="+a.dot_written);

                //num_written = num_written.concat("0.");
            
        }
    }
});
    _1.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            // your handler code here
            

String l=screen.getText().toString();
if(l!=null)
screen.setText(l+"1");
else screen.setText("1");
System.out.println("Hiiiiii"+a.dot_written);

result.setText("");
    set_num_written(1);
    sendto(a);
            a.recorded=false;
    
        }
   
    });
    
    _2.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            // your handler code here
    
    
            String l=screen.getText().toString();
            if(l!=null)
                screen.setText(l+"2");
            else screen.setText("2");
    
            result.setText("");
            set_num_written(2);
            sendto(a);
            a.recorded=false;
    
        }
        
    });
    
    _3.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            // your handler code here
    
    
            String l=screen.getText().toString();
            if(l!=null)
                screen.setText(l+"3");
            else screen.setText("3");
            result.setText("");
            set_num_written(3);
            sendto(a);
    
            a.recorded=false;
            
        }
        
    });
    
    _4.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            // your handler code here
    
            String l=screen.getText().toString();
            if(l!=null)
                screen.setText(l+"4");
            else screen.setText("4");
    
            result.setText("");
            set_num_written(4);
            
            sendto(a);
            a.recorded=false;
            
            
        }
        
    });
    _5.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            // your handler code here
    
            String l=screen.getText().toString();
            if(l!=null)
                screen.setText(l+"5");
            else screen.setText("5");
            
            result.setText("");
            set_num_written(5);
            sendto(a);
            a.recorded=false;
            
            
        }
        
    });
    _6.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            // your handler code here
    
            String l=screen.getText().toString();
            if(l!=null)
                screen.setText(l+"6");
            else screen.setText("6");
    
            result.setText("");
            set_num_written(6);
            sendto(a);
            a.recorded=false;
            
            
        }
        
    });
    _7.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            // your handler code here
    
            String l=screen.getText().toString();
            if(l!=null)
                screen.setText(l+"7");
            else screen.setText("7");
    
            result.setText("");
            set_num_written(7);
            sendto(a);
            a.recorded=false;
            
            
        }
        
    });
    _8.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            // your handler code here
    
            String l=screen.getText().toString();
            if(l!=null)
                screen.setText(l+"8");
            else screen.setText("8");
            
            result.setText("");
            set_num_written(8);
            sendto(a);
            a.recorded=false;
            
            
        }
        
    });
    _9.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            // your handler code here
    
    
            String l=screen.getText().toString();
            if(l!=null)
                screen.setText(l+"9");
            else screen.setText("9");
            
            result.setText("");
            set_num_written(9);
            sendto(a);
            a.recorded=false;
            
            
        }
        
    });
    _0.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            // your handler code here
    
    
            String l=screen.getText().toString();
            if(l!=null)
                screen.setText(l+"0");
            else screen.setText("0");

            result.setText("");
            set_num_written(0);
            sendto(a);
            a.recorded=false;
            
            
        }
        
    });
    plus.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            
    
            // your handler code here
            int n = screen.getText().toString().length();
            if (n != 0) {
                if (Character.isDigit(screen.getText().toString().charAt(n - 1))) {
            screen.setText(screen.getText().toString()+"+");
            result.setText("");
            setWritten_sign('+');
//          sendto(a);
            sendsign(a);
            a.num_work();
            a.plus(a.signs_Written.pre_top(),a.Numbers_Written.top());
System.out.println("NUM WRITTEN IS ="+a.Numbers_Written.top());
                    a.dot_written=false;
        }}}
        
    });
    
    
    minus.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
           
    
            // your handler code here
            int n = screen.getText().toString().length();
            if (n != 0) {
                if (Character.isDigit(screen.getText().toString().charAt(n - 1))) {
                    screen.setText(screen.getText().toString() + "-");
                    result.setText("");
                    setWritten_sign('-');
    
                    //         sendto(a);
                    sendsign(a);
                    a.num_work();
                    a.mins(a.signs_Written.pre_top(), a.Numbers_Written.top());
    
                }

            }
            a.dot_written=false;
        }
    });
    mult.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            // your handler code here
            
            int n = screen.getText().toString().length();
            if (n != 0) {
                if (Character.isDigit(screen.getText().toString().charAt(n - 1))) {
                    screen.setText(screen.getText().toString() + "*");
    
                    result.setText("");
                    setWritten_sign('*');
                    //sendto(a);
    
                    sendsign(a);
    
                    a.num_work();
    
                    a.mul(a.signs_Written.pre_top(), a.Numbers_Written.top());
    
                }
            }a.dot_written=false;
        }
    });
    div.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            // your handler code here
         
            int n = screen.getText().toString().length();
            if (n != 0) {
                if (Character.isDigit(screen.getText().toString().charAt(n - 1))) {
                    screen.setText(screen.getText().toString() + "/");
                    result.setText("");
                    setWritten_sign('/');
    
                    //sendto(a);
                    sendsign(a);
                    a.num_work();
                    a.div(a.signs_Written.pre_top(), a.Numbers_Written.top());
                }
            }   a.dot_written=false;
    
        }
    });
    
    
    equal.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {

            // your handler code here
if(screen.getText().toString().length()!=0)
{
    System.out.println("Recived nimbr..>"+a.recived_num+"mul =   "+a.mul);
            a.trace(screen.getText().toString(),result);        }
    }});
 //  a.equal_clicked=true;
    
    
    
}
Thread myThread =new Thread(){
    
    @Override
    public void run() {
        super.run();
a.trace(screen.getText().toString(),result);
    }

};


void set_num_written(int c){
    
   
       // num_written=num_written.concat(Integer.toString(c));
   //     System.out.println(num_written+"***** this is num written\n"+"DOT_WRITTEN="+a.dot_written);
    
    
    num_written=Integer.toString(c);
//System.out.println(num_written+" this is num written\n"+"DOT_WRITTEN="+a.dot_written);
}
void setWritten_sign(char c){
    written_sign=c;
}
char gewritten_sign(){return written_sign;}

}

