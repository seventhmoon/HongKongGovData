package hk.g0v.data.app;

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * Created by fung on 3/5/2017.
 */

public class MainApplication extends Application {
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
