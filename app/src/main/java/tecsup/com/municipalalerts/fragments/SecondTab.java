package tecsup.com.municipalalerts.fragments;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import tecsup.com.municipalalerts.R;

public class SecondTab extends Fragment {

    private ImageButton phoneNumber1;
    private ImageButton phoneNumber2;
    private ImageButton phoneNumber3;
    private ImageButton phoneNumber4;
    private ImageButton phoneNumber5;
    private TextView num1;
    private TextView num2;
    private TextView num3;
    private TextView num4;
    private TextView num5;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_second_tab, container, false);

//        view.findViewById(R.id....)

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        phoneNumber1 = (ImageButton) view.findViewById(R.id.callButton1);
        phoneNumber2 = (ImageButton) view.findViewById(R.id.callButton2);
        phoneNumber3 = (ImageButton) view.findViewById(R.id.callButton3);
        phoneNumber4 = (ImageButton) view.findViewById(R.id.callButton4);
        phoneNumber5 = (ImageButton) view.findViewById(R.id.callButton5);
        num1=(TextView) view.findViewById(R.id.num1);
        num2=(TextView) view.findViewById(R.id.num2);
        num3=(TextView) view.findViewById(R.id.num3);
        num4=(TextView) view.findViewById(R.id.num4);
        num5=(TextView) view.findViewById(R.id.num5);
        phoneNumber1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: "+num1.getText()));
                startActivity(intent);
            }
        });
        phoneNumber2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: "+num2.getText()));
                startActivity(intent);
            }
        });
        phoneNumber3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: "+num3.getText()));
                startActivity(intent);
            }
        });
        phoneNumber4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: "+num4.getText()));
                startActivity(intent);
            }
        });
        phoneNumber5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: "+num5.getText()));
                startActivity(intent);
            }
        });


    }
}

