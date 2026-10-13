package com.dinoduel.game;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.graphics.Color;
import android.view.View;
public class MainActivity extends Activity {
 @Override public void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  getWindow().getDecorView().setSystemUiVisibility(5894 | 1024 | 512 | 4096);
  getWindow().setStatusBarColor(Color.rgb(23,35,28));
  WebView web = new WebView(this);
  web.setBackgroundColor(Color.rgb(23,35,28));
  WebSettings s=web.getSettings(); s.setJavaScriptEnabled(true); s.setDomStorageEnabled(false);
  web.setOverScrollMode(View.OVER_SCROLL_NEVER);
  setContentView(web); web.loadUrl("file:///android_asset/index.html");
 }
 @Override public void onBackPressed(){ super.onBackPressed(); }
}
