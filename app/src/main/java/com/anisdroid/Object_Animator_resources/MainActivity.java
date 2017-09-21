package com.anisdroid.Object_Animator_resources;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.animation.*;

public class MainActivity extends Activity 
{
	ImageView iii;
	Button fade,trans,rotate,scale,combo;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		iii = (ImageView) findViewById(R.id.img);
		
		fade = (Button) findViewById(R.id.alpha_button);
		trans = (Button) findViewById(R.id.trans_button);
		rotate = (Button) findViewById(R.id.rotate_button);
		scale = (Button) findViewById(R.id.scale_button);
		combo = (Button) findViewById(R.id.combo_button);
		
		mySetup(fade,R.animator.fade);
		mySetup(trans,R.animator.translation);
		mySetup(rotate,R.animator.rotate);
		mySetup(scale,R.animator.scale);
		mySetup(combo,R.animator.combo);
		
    }
	
	public void mySetup(View vvv, final int rrr){
		
		vvv.setOnClickListener(
			new View.OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
					
					Animator anim = AnimatorInflater.loadAnimator(MainActivity.this,rrr);
					anim.setTarget(iii);
					anim.start();
					return;
				}
				
				
			}
		);
		
	}
	
}
