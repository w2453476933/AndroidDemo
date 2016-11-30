package com.mycompany.demo;

	import android.app.*;
	import android.os.*;
	import android.widget.*;
	import android.view.*;
	import android.text.*;

	public class PpiCalculatorActivity extends Activity 
	{
		//定义界面元素
		private EditText ScreenSizeEdt,HorPpiEdt,VerPpiEdt;
		private TextView PpiText;
		private Button DoBtn;
		@Override
		protected void onCreate(Bundle savedInstanceState)
		{
			super.onCreate(savedInstanceState);
			setContentView(R.layout.ppicalculatorlayout);
			//获取界面元素
			ScreenSizeEdt=(EditText)findViewById(R.id.ScreenSizeEdt);
			HorPpiEdt=(EditText)findViewById(R.id.HorPpiEdt);
			VerPpiEdt=(EditText)findViewById(R.id.VerPpiEdt);
			DoBtn=(Button)findViewById(R.id.DoBtn);
			PpiText=(TextView)findViewById(R.id.PpiText);
			//为Button组件加入Click事件的监听
			DoBtn.setOnClickListener(new Button.OnClickListener(){
					@Override
					public void onClick(View v){
						StringBuilder sb=new StringBuilder();
						sb.append("未填写");
						int a=0;
						if (TextUtils.isEmpty(ScreenSizeEdt.getText()))
						{sb.append("(屏幕尺寸)");a=1;}
						if (TextUtils.isEmpty(HorPpiEdt.getText()))
						{sb.append("(横向分辨率)");a=1;}
						if (TextUtils.isEmpty(VerPpiEdt.getText()))
						{sb.append("(纵向分辨率)");a=1;}
						if(a==0){
							Double chicun=Double.parseDouble(ScreenSizeEdt.getText().toString());
							int Hor=Integer.parseInt(HorPpiEdt.getText().toString());
							int Ver=Integer.parseInt(VerPpiEdt.getText().toString());
							double ppi=Math.sqrt(Hor*Hor+Ver*Ver)/chicun;
							PpiText.setText("屏幕PPI为: "+ppi);}
						else
						{
							Toast toast=Toast.makeText(PpiCalculatorActivity.this,sb.toString(),Toast.LENGTH_SHORT);
							toast.show();
						}

					}


				});
		}

	}
