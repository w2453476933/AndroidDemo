package com.mycompany.demo;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.app.*;
import android.view.View.*;

public class EditTextActivity extends Activity
{
	EditText edtName,edtAddress,edtPhone,edtEmail,edtPassword;
	Button getEdtResult;
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.edittextlayout);
		edtName=(EditText)findViewById(R.id.edtName);
		edtAddress=(EditText)findViewById(R.id.edtAddress);
		edtPhone=(EditText)findViewById(R.id.edtPhone);
		edtPassword=(EditText)findViewById(R.id.edtPassword);
		edtEmail=(EditText)findViewById(R.id.edtEmail);
		getEdtResult=(Button)findViewById(R.id.getEdtResult);
		getEdtResult.setOnClickListener(new View.OnClickListener(){
			@Override
		  	public void onClick(View v){
				StringBuilder sb1=new StringBuilder();
				if(edtName.getText().toString().equals(""))
					sb1.append("未输入姓名。");
				else
					sb1.append("姓名为:"+edtName.getText().toString()+"。");
				if(edtAddress.getText().toString().equals(""))
					sb1.append("未输入地址。");
				else
					sb1.append("地址为:"+edtAddress.getText().toString()+"。");
				if(edtPhone.getText().toString().equals(""))
					sb1.append("未输入电话号码。");
				else
					sb1.append("电话号码为:"+edtPhone.getText().toString()+"。");
				if(edtEmail.getText().toString().equals(""))
					sb1.append("未输入邮箱。");
				else
					sb1.append("邮箱为:"+edtEmail.getText().toString()+"。");
				if(edtPassword.getText().toString().equals(""))
					sb1.append("未输入密码。");
				else
					sb1.append("密码为:"+edtPassword.getText().toString()+"。");
					
				Toast.makeText(EditTextActivity.this,sb1.toString(),Toast.LENGTH_SHORT).show();

			}
		});
	
		
		
	}
}
