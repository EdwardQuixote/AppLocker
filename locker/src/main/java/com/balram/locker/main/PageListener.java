package com.balram.locker.main;

import android.support.v7.app.AppCompatActivity;

public interface PageListener {

	void onActivityCreated(AppCompatActivity activity);

	void onActivityStarted(AppCompatActivity activity);

	void onActivityResumed(AppCompatActivity activity);

	void onActivityPaused(AppCompatActivity activity);

	void onActivityStopped(AppCompatActivity activity);

	void onActivitySaveInstanceState(AppCompatActivity activity);

	void onActivityDestroyed(AppCompatActivity activity);
}
