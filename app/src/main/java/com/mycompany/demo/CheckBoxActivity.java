package com.mycompany.demo;
import android.os.*;
import android.app.*;
import android.view.*;
import android.widget.*;
import android.widget.CompoundButton.*;

public class CheckBoxActivity extends Activity
{
	public CheckBox checkBox1,checkBox2,checkBox3,checkBox4,checkBox5,checkBox6,checkBox7;
	public TextView checkBoxTextView;
	public String str,str1="",str2="",str3="",str4="",str5="",str6="",str7="";
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.checkboxlayout);
		checkBoxTextView=(TextView)findViewById(R.id.checkBoxTextView);
		checkBox1=(CheckBox)findViewById(R.id.checkBox1);
		checkBox2=(CheckBox)findViewById(R.id.checkBox2);
		checkBox3=(CheckBox)findViewById(R.id.checkBox3);
		checkBox4=(CheckBox)findViewById(R.id.checkBox4);
		checkBox5=(CheckBox)findViewById(R.id.checkBox5);
		checkBox6=(CheckBox)findViewById(R.id.checkBox6);
		checkBox7=(CheckBox)findViewById(R.id.checkBox7);
		checkBox1.setOnCheckedChangeListener(myOnCheckedChangeListener);
		checkBox2.setOnCheckedChangeListener(myOnCheckedChangeListener);
		checkBox3.setOnCheckedChangeListener(myOnCheckedChangeListener);
		checkBox4.setOnCheckedChangeListener(myOnCheckedChangeListener);
		checkBox5.setOnCheckedChangeListener(myOnCheckedChangeListener);
		checkBox6.setOnCheckedChangeListener(myOnCheckedChangeListener);
		checkBox7.setOnCheckedChangeListener(myOnCheckedChangeListener);
	}
	private CheckBox.OnCheckedChangeListener myOnCheckedChangeListener=new CheckBox.OnCheckedChangeListener(){

		@Override
		public void onCheckedChanged(CompoundButton p, boolean a)
		{
			// TODO: Implement this method
			switch(p.getId()){
				case R.id.checkBox1:str1=Do(p,a);break;
				case R.id.checkBox2:str2=Do(p,a);break;
				case R.id.checkBox3:str3=Do(p,a);break;
				case R.id.checkBox4:str4=Do(p,a);break;
				case R.id.checkBox5:str5=Do(p,a);break;
				case R.id.checkBox6:str6=Do(p,a);break;
				case R.id.checkBox7:str7=Do(p,a);break;
			}
			checkBoxTextView.setText("你喜欢这些英雄："+" "+str1+" "+str2+" "+str3+" "+str4+" "+str5+" "+str6+" "+str7);
		}
      };
	  private String Do(CompoundButton m,boolean n){
		  if(n){
			  Toast.makeText(CheckBoxActivity.this,"你选择了："+m.getText().toString(),Toast.LENGTH_SHORT).show();
			str=m.getText().toString();
		  }
		 else if(!n){
			  Toast.makeText(CheckBoxActivity.this,"你取消选择了："+m.getText().toString(),Toast.LENGTH_SHORT).show();
			  str="";
		  }
		  return str;
	  }
}
