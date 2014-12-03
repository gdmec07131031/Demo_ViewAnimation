package cnedu.gdmec.s07131031.demo_viewanimation;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView myTv;
	private Button btnAlpha,btnTranslate,btnScale,btnRotate,btnAll;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTv=(TextView) findViewById(R.id.textView1);
        btnAlpha=(Button) findViewById(R.id.button1);
        btnTranslate=(Button) findViewById(R.id.button2);
        btnScale=(Button) findViewById(R.id.button3);
        btnRotate=(Button) findViewById(R.id.button4);
        btnAll=(Button) findViewById(R.id.button5);
        
        btnAlpha.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Animation animation=AnimationUtils.loadAnimation(MainActivity.this, R.anim.alpha_animation);
				myTv.startAnimation(animation);
			}
        	
        });
        btnTranslate.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Animation animation=AnimationUtils.loadAnimation(MainActivity.this, R.anim.translate_animation);
				myTv.startAnimation(animation);
				
			}
        	
        });
        btnScale.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Animation animation=AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale_animation);
				myTv.startAnimation(animation);
				
			}
        	
        });
        btnRotate.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Animation animation=AnimationUtils.loadAnimation(MainActivity.this, R.anim.romate_animation);
				myTv.startAnimation(animation);
				
			}
        	
        });
        btnAll.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Animation animation=AnimationUtils.loadAnimation(MainActivity.this, R.anim.set_animation);
				myTv.startAnimation(animation);
				
			}
        	
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
