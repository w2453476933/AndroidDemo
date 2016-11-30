package com.mycompany.demo;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.text.*;
import android.view.View.*;
import javax.crypto.*;

public class SimpleCalculatorActivity extends Activity 
{
	private Button Bt1,Bt2,Bt3,Bt4,Bt5,Bt6,Bt7,Bt8,Bt9,Bt0,BtPoint,BtAdd,BtSub,BtMul,BtDiv,BtEqu,BtCE,BtDel;
    private TextView resultText1,resultText2;
    private String num1=null;//存放第一个数
    private String num2=null;//存放第二个数
	private String tmp=null;//存放结果字符
    private int k=0,j=0,x=0,y=0;//判定输入的是第几个数;等号是否按下
    private double num3=0;//存放结果
	double z=630.0,m=0.0,n,g;//控制字体大小
	
	@Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simplecalculatorlayout);
		resultText2=(TextView)findViewById(R.id.resultText2);
		resultText1=(TextView)findViewById(R.id.resultText1);
		resultText1.setText("0");
		myOnClickListener myOnClickListener=new myOnClickListener();
		Bt1=(Button)findViewById(R.id.Bt1);
		Bt1.setOnClickListener(myOnClickListener);
		Bt2=(Button)findViewById(R.id.Bt2);
		Bt2.setOnClickListener(myOnClickListener);
		Bt3=(Button)findViewById(R.id.Bt3);
		Bt3.setOnClickListener(myOnClickListener);
		Bt4=(Button)findViewById(R.id.Bt4);
		Bt4.setOnClickListener(myOnClickListener);
		Bt5=(Button)findViewById(R.id.Bt5);
		Bt5.setOnClickListener(myOnClickListener);
		Bt6=(Button)findViewById(R.id.Bt6);
		Bt6.setOnClickListener(myOnClickListener);
		Bt7=(Button)findViewById(R.id.Bt7);
		Bt7.setOnClickListener(myOnClickListener);
		Bt8=(Button)findViewById(R.id.Bt8);
		Bt8.setOnClickListener(myOnClickListener);
		Bt9=(Button)findViewById(R.id.Bt9);
		Bt9.setOnClickListener(myOnClickListener);
		Bt0=(Button)findViewById(R.id.Bt0);
		Bt0.setOnClickListener(myOnClickListener);
		BtAdd=(Button)findViewById(R.id.BtAdd);
		BtAdd.setOnClickListener(myOnClickListener);
		BtSub=(Button)findViewById(R.id.BtSub);
		BtSub.setOnClickListener(myOnClickListener);
		BtMul=(Button)findViewById(R.id.BtMul);
		BtMul.setOnClickListener(myOnClickListener);
		BtDiv=(Button)findViewById(R.id.BtDiv);
		BtDiv.setOnClickListener(myOnClickListener);
		BtPoint=(Button)findViewById(R.id.BtPoint);
		BtPoint.setOnClickListener(myOnClickListener);		
		BtEqu=(Button)findViewById(R.id.BtEqu);
		BtEqu.setOnClickListener(myOnClickListener);
		BtDel=(Button)findViewById(R.id.BtDel);
		BtDel.setOnClickListener(myOnClickListener);
		BtCE=(Button)findViewById(R.id.BtCE);
		BtCE.setOnClickListener(myOnClickListener);		
	 }
	class myOnClickListener implements OnClickListener
	{

		@Override
		public void onClick(View p)
		{
			// TODO: Implement this method
			switch(p.getId()){
				case R.id.Bt0:
					numGet(k,"0");
					break;
				case R.id.Bt1:
					numGet(k,"1");
					break;
				case R.id.Bt2:
					numGet(k,"2");
					break;
				case R.id.Bt3:
					numGet(k,"3");
					break;
				case R.id.Bt4:
					numGet(k,"4");
					break;
				case R.id.Bt5:
					numGet(k,"5");
					break;
				case R.id.Bt6:
					numGet(k,"6");
					break;
				case R.id.Bt7:
					numGet(k,"7");
					break;
				case R.id.Bt8:
					numGet(k,"8");
					break;
				case R.id.Bt9:
					numGet(k,"9");
					break; 
				case R.id.BtAdd:
					if(resultText1.getText().toString()!="除数为0"){
						if(k==0&&num1!=null){
						checkLength("+");
						k=1;
					}
					j=0;}
					break;
				case R.id.BtSub:
					if(resultText1.getText().toString()!="除数为0"){
					if(k==0&&num1!=null){
					    checkLength("-");
						k=2;
					}
					j=0;}
					break;
				case R.id.BtMul:
					if(resultText1.getText().toString()!="除数为0"){
					if(k==0&&num1!=null){
						checkLength("×");
						k=3;
					}
					j=0;}
					break;
				case R.id.BtDiv:
					if(resultText1.getText().toString()!="除数为0"){
					if(k==0&&num1!=null){
						checkLength("÷");
						k=4;
					}
					j=0;}
					break;
				case R.id.BtPoint:
					if(j==0){
						
					if(k==0) {
						if(x==0&&num1!=null&&num1.indexOf(".")==-1){
							num1=num1+".";
							tmp=num1;
							if(tmp.length()<=9){
								resultText1.setTextSize(75);
							}
							if(tmp.length()>9){ 
							n=tmp.length();
							g=z/n-m;
								resultText1.setTextSize((float)g);
								if(tmp.length()==15){
									x=1;
								}
							}
						
						resultText1.setText(tmp);
						resultText2.setText(resultText1.getText().toString());
					}
					}
					else {
						if(y==0&&num2!=null&&num2.indexOf(".")==-1){
							num2=num2+".";
							if(num2.length()==15)	{
								y=1;
							}
							checkLength(".");
					}
					}
					}
					break;
				case R.id.BtDel:
					if(k==0&&num1.length()>1){
						num1=num1.substring(0,num1.length()-1);	
						resultText1.setText(resultText1.getText().toString().substring(0,resultText1.getText().toString().length()-1));
						resultText2.setText(resultText1.getText().toString());
						checkLength1();
					}
					else if(k==0&&num1.length()<2){
						num1="0";
						resultText1.setText("0");
						resultText2.setText("0");
						checkLength1();
					}
					else if(k==1||k==2||k==3||(k==4&&j==0) ){
						if(num2==null){
							k=0;
						}
						else if(num2.length()>1) {
							num2=num2.substring(0,num2.length()-1);
						}
						else if(num2.length()<2){
							num2=null;
						}
						resultText1.setText(resultText1.getText().toString().substring(0,resultText1.getText().toString().length()-1));
						resultText2.setText(resultText1.getText().toString());
						checkLength1();
					}
				if(k==4&&j==1){
					resultText1.setText("0");
				}
					
					break;
				case R.id.BtEqu:
					if(j==0){
						if(num1==null){
						num3=0;
							tmp=String.valueOf(num3);
							if(tmp.length()<=9){
								resultText1.setTextSize(75);
							}
							if(tmp.length()>9){ 
								n=tmp.length();
								g=z/n-m;
								resultText1.setTextSize((float)g);
							}
							if(tmp.indexOf(".")!=-1&&tmp.lastIndexOf("0")==tmp.length()-1){
								resultText1.setText(String.valueOf((int)num3));
							}
							else{
								resultText1.setText(String.valueOf(num3));

							}
							num1=resultText1.getText().toString();
							num2=null;
							num3=0;
							k=0;
							j=1;
					}
					if((k==0&&num1!=null)||(k!=0&&num2==null)){
						num3=Double.parseDouble(num1);
						tmp=String.valueOf(num3);
						if(tmp.length()<=9){
							resultText1.setTextSize(75);
						}
						if(tmp.length()>9){ 
							n=tmp.length();
							g=z/n-m;
							resultText1.setTextSize((float)g);
						}
						if(tmp.indexOf(".")!=-1&&tmp.lastIndexOf("0")==tmp.length()-1){
							resultText1.setText(String.valueOf((int)num3));
						}
						else{
							resultText1.setText(String.valueOf(num3));

						}
						num1=resultText1.getText().toString();
						num2=null;
						num3=0;
						k=0;
						j=1;
					}
					if(k==1&&num2!=null){
				
						num3=Double.parseDouble(num1)+Double.parseDouble(num2);
						tmp=String.valueOf(num3);
						if(tmp.length()<=9){
							resultText1.setTextSize(75);
						}
						if(tmp.length()>9){ 
							n=tmp.length();
							g=z/n-m;
							resultText1.setTextSize((float)g);
						}
						if(tmp.indexOf(".")!=-1&&tmp.lastIndexOf("0")==tmp.length()-1){
							resultText1.setText(String.valueOf((int)num3));
						}
						else{
							resultText1.setText(String.valueOf(num3));

						}
						num1=resultText1.getText().toString();
						num2=null;
						num3=0;
						k=0;
						j=1;
						
					}
					if(k==2&&num2!=null){
			
							num3=Double.parseDouble(num1)-Double.parseDouble(num2);
						tmp=String.valueOf(num3);
						if(tmp.length()<=9){
							resultText1.setTextSize(75);
						}
						if(tmp.length()>9){ 
							n=tmp.length();
							g=z/n-m;
							resultText1.setTextSize((float)g);
						}
						if(tmp.indexOf(".")!=-1&&tmp.lastIndexOf("0")==tmp.length()-1){
							resultText1.setText(String.valueOf((int)num3));
						}
						else{
							resultText1.setText(String.valueOf(num3));

						}
						num1=resultText1.getText().toString();
						num2=null;
						num3=0;
						k=0;
						j=1;
						
					}
					if(k==3&&num2!=null){
							num3=Double.parseDouble(num1)*Double.parseDouble(num2);
						tmp=String.valueOf(num3);
						if(tmp.length()<=9){
							resultText1.setTextSize(75);
						}
						if(tmp.length()>9){ 
							n=tmp.length();
							g=z/n-m;
							resultText1.setTextSize((float)g);
						}
						if(tmp.indexOf(".")!=-1&&tmp.lastIndexOf("0")==tmp.length()-1){
							resultText1.setText(String.valueOf((int)num3));
						}
						else{
							resultText1.setText(String.valueOf(num3));

						}
						num1=resultText1.getText().toString();
						num2=null;
						num3=0;
						k=0;
						j=1;
						
					}
					if(k==4&&num2=="0"){
					
							resultText1.setText("除数为0");
						
							resultText1.setTextSize(75);
							j=1;
							k=0;
							num2=null;
							
						
					}
					if(k==4&&num2!="0"){
						num3=Double.parseDouble(num1)/Double.parseDouble(num2);
						tmp=String.valueOf(num3);
						if(tmp.length()<=9){
							resultText1.setTextSize(75);
						}
						if(tmp.length()>9){ 
							n=tmp.length();
							g=z/n-m;
							resultText1.setTextSize((float)g);
						}
						if(tmp.indexOf(".")!=-1&&tmp.lastIndexOf("0")==tmp.length()-1){
							resultText1.setText(String.valueOf((int)num3));
						}
						else{
							resultText1.setText(String.valueOf(num3));

						}
						num1=resultText1.getText().toString();
						num2=null;
						num3=0;
						k=0;
						j=1;
					}
					
					}
					break;
					case R.id.BtCE:
						num1="0";
						num2=null;
						num3=0;
						k=0;
						j=0;
						x=0;
						y=0;
						resultText1.setText("0");
						checkLength1();
						
				
			}
		}

	public void numGet(int a,String b){
	if(j==0){
		
		if(a==0&&x==0) {
			if(num1==null||num1=="0"){
				num1=b;
			}
			else{
				num1=num1+b;
			}
			tmp=num1;
			if(tmp.length()<=9){
				resultText1.setTextSize(75);
			}
			if(tmp.length()>9){
				n=tmp.length();
				g=z/n-m;
				resultText1.setTextSize((float)g);
			
				if(tmp.length()==15){
					x=1;
				}
			}
		
			resultText1.setText(tmp);
			resultText2.setText(resultText1.getText().toString());
		}
		else if(a!=0&&y==0){
			if(num2==null||num2=="0"){
				num2=b;
			}
			else{
				num2=num2+b;
			}
			if(num2.length()==15){
				y=1;
			}
            checkLength(b);
		}
		}
		else if (j==1){
		num1=b;
		j=0;
			resultText1.setText(num1);
			resultText2.setText(resultText1.getText().toString());
		}
	}
	public void checkLength(String v){
		tmp=resultText1.getText().toString();
		if(tmp.length()<=8){
			resultText1.setTextSize(75);
		}
		if(tmp.length()>8){
			n=tmp.length();
			g=z/n-m;
			resultText1.setTextSize((float)g);
			}
		
		if(v!=null){resultText1.setText(tmp+v);
		resultText2.setText(resultText1.getText().toString());}
	}
		public void checkLength1(){
			tmp=resultText1.getText().toString();
			if(tmp.length()<=9){
				resultText1.setTextSize(75);
			}
			if(tmp.length()>9){
				n=tmp.length();
				g=z/n-m;
				resultText1.setTextSize((float)g);
			}
		}
	}
}
