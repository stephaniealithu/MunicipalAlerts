package tecsup.com.municipalalerts.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.messaging.FirebaseMessaging;

import tecsup.com.municipalalerts.R;

public class ConfigActivity extends AppCompatActivity {

    CheckBox checktraffic;
    CheckBox checkweather;
    CheckBox checksafe;
    Button sign_out_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);
        checktraffic = (CheckBox) findViewById(R.id.checktraffic);
        checksafe = (CheckBox) findViewById(R.id.checksafe);
        checkweather = (CheckBox) findViewById(R.id.checkweather);
        sign_out_button = (Button) findViewById(R.id.sign_out_button);




        checkweather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkweather.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (checkweather.isActivated()){
                            FirebaseMessaging.getInstance().subscribeToTopic("weather");
                        }else{
                            FirebaseMessaging.getInstance().unsubscribeFromTopic("weather");
                        }
                    }
                });
            }
        });

        checksafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checksafe.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (checksafe.isActivated()){
                            FirebaseMessaging.getInstance().subscribeToTopic("publicsafety");
                        }else{
                            FirebaseMessaging.getInstance().unsubscribeFromTopic("publicsafety");
                        }
                    }
                });
            }
        });
        checktraffic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checktraffic.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (checktraffic.isActivated()){
                            FirebaseMessaging.getInstance().subscribeToTopic("trafficalert");
                        }else{
                            FirebaseMessaging.getInstance().unsubscribeFromTopic("trafficalert");
                        }
                    }
                });
            }
        });


       sign_out_button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               FirebaseAuth.getInstance().signOut();
               Intent intent = new Intent (getBaseContext(), LoginActivity.class);
               startActivity(intent);
           }
       });

    }

}
