package com.example.ghosthunterv3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.splash);

			Thread logoTimer = new Thread() {
				public void run() {
					try {
						int logoTimer = 0;
						while (logoTimer < 5000) {
							sleep(100);
							logoTimer = logoTimer + 100;
						}
						;
						startActivity(new Intent("com.example.CLEARSCREEN"));
					}
					catch (InterruptedException e) {
						e.printStackTrace();
					}
					finally {
						finish();
					}
				}
			};
			logoTimer.start();
		}	
}
