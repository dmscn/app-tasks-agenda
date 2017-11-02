package br.com.damasceno.agenda.activity;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.json.JSONObject;

import br.com.damasceno.agenda.constant.Constants;
import br.com.damasceno.agenda.helper.VolleyResponseListener;
import br.com.damasceno.agenda.util.SharedPreferencesUtils;
import br.com.damasceno.agenda.util.ToastUtils;
import br.com.damasceno.agenda.util.VolleyUtils;

public class SplashActivity extends AppCompatActivity implements Constants {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        final String credentials;
        credentials = SharedPreferencesUtils.getCredentials(getApplicationContext());

        // Verify if user is logged in
        if(credentials != null) {

            // Redirect to Main Activity
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
            return;

        } else {

            // Redirect to Login Activity
            Intent intent = new Intent(this, WelcomeActivity.class);
            startActivity(intent);
            finish();
            return;

        }

    }
}
