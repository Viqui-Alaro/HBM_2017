package hansa.com.bo.hbm;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by VAlaro on 18/9/2017.
 */

public class MenuHbm extends AppCompatActivity {

    public final String LOG = "HBM_Android";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG,"onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG,"onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG,"onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG,"onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG,"onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG,"onRestart");
    }
}
