package com.mycompany.demo;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.app.*;
import android.widget.CompoundButton.*;
import android.transition.*;

public class SwitchActivity extends Activity
{
	ToggleButton toggleButton;
	Switch switchButton;
    TextView switchTextView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.switchlayout);
		toggleButton=(ToggleButton)findViewById(R.id.toggleButton);
		switchButton=(Switch)findViewById(R.id.switchButton);
		switchTextView=(TextView)findViewById(R.id.switchTextView);
		toggleButton.setOnCheckedChangeListener(new OnCheckedChangeListener(){
			@Override
			public void onCheckedChanged(CompoundButton p,boolean a){
				if(a)
					switchTextView.setVisibility(View.VISIBLE);
					else
						switchTextView.setVisibility(View.GONE);
			}
		});
		switchButton.setOnCheckedChangeListener(new OnCheckedChangeListener(){
			@Override
			public void onCheckedChanged(CompoundButton p,boolean a){
				if(a)
					switchTextView.setVisibility(View.VISIBLE);
					else
						switchTextView.setVisibility(View.GONE);
			}
		});
	}
}
