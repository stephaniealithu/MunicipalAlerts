package tecsup.com.municipalalerts;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import tecsup.com.municipalalerts.activities.UserActivity;
import tecsup.com.municipalalerts.business.UserBL;
import tecsup.com.municipalalerts.models.User;

public class RegisterActivity extends AppCompatActivity {

    private SharedPreferences sharedPreferences;

    private EditText fullname;
    private EditText email;
    private EditText password1;
    private EditText password2;
    private Button register_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        fullname=(EditText) findViewById(R.id.fullname);
        email =(EditText) findViewById(R.id.email);
        password1=(EditText) findViewById(R.id.password1);
        password2=(EditText) findViewById(R.id.password2);
        register_button=(Button) findViewById(R.id.register_button);

        sharedPreferences=this.getSharedPreferences("MySharedPreferences", Context.MODE_PRIVATE);

        register_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(email.getText().toString().isEmpty()||fullname.getText().toString().isEmpty()||password1.getText().toString().isEmpty()||password2.getText().toString().isEmpty()){
                    Toast.makeText(RegisterActivity.this, "Please verify your data", Toast.LENGTH_LONG).show();
                }else{
                    if (password1.getText().toString().equals(password2.getText().toString())){


                        User user=new User(email.getText().toString(),
                                password1.getText().toString(),
                                fullname.getText().toString()
                        );

                        UserBL.register(user);


                        SharedPreferences.Editor editor=sharedPreferences.edit();

                        boolean success=editor
                                .putString("fullname",user.getFullname())
                                .putString("email",user.getEmail())
                                .putBoolean("logged",true)
                                .commit();

                        Intent intent=new Intent(RegisterActivity.this,UserActivity.class);
                        startActivity(intent);
                        finish();

                    }else{
                        Toast.makeText(RegisterActivity.this, "Please verify your passwords", Toast.LENGTH_LONG).show();

                    }
                }

            }
        });

    }
}
