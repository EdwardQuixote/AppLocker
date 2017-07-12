package com.balram.locker.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class AppLockerActivity extends AppCompatActivity {
	private static PageListener pageListener;

	public AppLockerActivity() {
	}

	public static void setListener(PageListener listener) {
		pageListener = listener;
	}

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if(pageListener != null) {
			pageListener.onActivityCreated(this);
		}

	}

	protected void onStart() {
		super.onStart();
		if(pageListener != null) {
			pageListener.onActivityStarted(this);
		}

	}

	protected void onResume() {
		super.onResume();
		if(pageListener != null) {
			pageListener.onActivityResumed(this);
		}

	}

	protected void onPause() {
		super.onPause();
		if(pageListener != null) {
			pageListener.onActivityPaused(this);
		}

	}

	protected void onStop() {
		super.onStop();
		if(pageListener != null) {
			pageListener.onActivityStopped(this);
		}

	}

	protected void onDestroy() {
		super.onDestroy();
		if(pageListener != null) {
			pageListener.onActivityDestroyed(this);
		}

	}

	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		if(pageListener != null) {
			pageListener.onActivitySaveInstanceState(this);
		}

	}
}