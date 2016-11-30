package com.mycompany.demo;
import android.os.*;
import android.app.*;
import android.view.*;
import android.widget.*;
import android.widget.CompoundButton.*;

public class RadioButtonActivity extends Activity
{
	RadioGroup radioGroup1,radioGroup2;
	String str1="",str2="";
	TextView radioGroupTextView;
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.radiobuttonlayout);
		radioGroupTextView=(TextView)findViewById(R.id.radioGroupTextView);
		radioGroup1=(RadioGroup)findViewById(R.id.radioGroup1);
		radioGroup2=(RadioGroup)findViewById(R.id.radioGroup2);
		radioGroup1.setOnCheckedChangeListener(myOnCheckedListener);
		radioGroup2.setOnCheckedChangeListener(myOnCheckedListener);
		
	}
	private RadioGroup.OnCheckedChangeListener myOnCheckedListener = new RadioGroup.OnCheckedChangeListener(){

		@Override
		public void onCheckedChanged(RadioGroup p, int ID)
		{
			// TODO: Implement this method
			RadioButton rBtn=(RadioButton)p.findViewById(ID);
			if(p==radioGroup1){
				Toast.makeText(RadioButtonActivity.this,"你选择了"+rBtn.getText().toString(),Toast.LENGTH_SHORT).show();
				str1=rBtn.getText().toString();
			}
			else if(p==radioGroup2){
				Toast.makeText(RadioButtonActivity.this,"你选择了"+rBtn.getText().toString(),Toast.LENGTH_SHORT).show();
				str2=rBtn.getText().toString();
			}
			radioGroupTextView.setText("你的选择为："+str1+"  "+str2);
			
		}

	};
} 
