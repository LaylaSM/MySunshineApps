package intermediate.iak.laylasm.mysunshineapps;

import android.app.Application;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static intermediate.iak.laylasm.mysunshineapps.BaseUrl.BASE_URL_WEATHER;

/**
 * Created by Layla Siti Mardhiyah on 20/08/2017.
 */

public class App extends Application {
    private static App instance;
    private Object retrofit;

    public App(){
        instance = this;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        createRetrofit();
        createGson();
    }

    private void createGson() {
        new GsonBuilder().create();
    }

    private void createRetrofit() {
       retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL_WEATHER)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static App getInstance() {
        return instance;
    }

    public Object getRetrofit() {
        return retrofit;
    }
}
