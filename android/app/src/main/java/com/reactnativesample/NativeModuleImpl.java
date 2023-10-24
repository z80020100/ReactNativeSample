package com.reactnativesample;

import android.util.Log;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class NativeModuleImpl extends ReactContextBaseJavaModule {

  private static final String TAG = "ReactNativeSample";

  NativeModuleImpl(ReactApplicationContext context) {
    super(context);
  }

  @Override
  public String getName() {
    return "NativeModuleImpl";
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public void log(String message) {
    Log.d("ReactNativeSample", message);
  }
}
