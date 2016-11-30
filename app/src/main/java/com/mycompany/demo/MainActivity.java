package com.mycompany.demo;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;

	public class MainActivity extends Activity 
	{
		@Override
		protected void onCreate(Bundle savedInstanceState)
		{
			super.onCreate(savedInstanceState);
			setContentView(R.layout.main);
		}
		public void startPpiCalculatorActivity(View v){
			Intent intent=new Intent(this,PpiCalculatorActivity.class);
			startActivity(intent);
		}
		public void startImageViewActivity(View v){
			Intent intent=new Intent(this,ImageViewActivity.class);
			startActivity(intent);
		}
		public void startListViewActivity(View v){
			Intent intent=new Intent(this,ListViewActivity.class);
			startActivity(intent);
		}
	public void startSwitchActivity(View v){
		Intent intent=new Intent(this,SwitchActivity.class);
		startActivity(intent);
		}
		public void startSimpleCalculatorActivity(View v){
			Intent intent=new Intent(this,SimpleCalculatorActivity.class);
			startActivity(intent);
		}
	public void startRadioButtonActivity(View v){
		Intent intent=new Intent(this,RadioButtonActivity.class);
		startActivity(intent);
	}
	public void startCheckBoxActivity(View v){
		Intent intent=new Intent(this,CheckBoxActivity.class);
		startActivity(intent);
	}
	public void startTextViewActivity(View v){
		Intent intent=new Intent(this,TextViewActivity.class);
		startActivity(intent);
	}
		public void startButtonActivity(View v){
			Intent intent=new Intent(this,ButtonActivity.class);
			startActivity(intent);
		}
	    public void startEditTextActivity(View v){
		Intent intent=new Intent(this,EditTextActivity.class);
		startActivity(intent);
	    }
		
}
