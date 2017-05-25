package tecsup.com.municipalalerts.activities;

import android.provider.ContactsContract;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import tecsup.com.municipalalerts.R;
import tecsup.com.municipalalerts.models.Noticia;


public class SubmitNewActivity extends Activity {

    private EditText titulo_report;
    private EditText desc_report;
    private EditText ubicacion;
    private FloatingActionButton sendreport;


    private static final int CAMERA_PIC_REQUEST = 2500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_new);
/*
        titulo_report = (EditText)findViewById(R.id.titulo_report);
        desc_report = (EditText)findViewById(R.id.desc_report);
        ubicacion = (EditText)findViewById(R.id.ubicacion);
        sendreport =(FloatingActionButton)findViewById(R.id.sendreport);


sendreport.setOnClickListener(new OnClickListener() {
    @Override
    public void onClick(View v) {
        DatabaseReference dbref= FirebaseDatabase.getInstance().getReference("News");
        String id= dbref.push().getKey();
        Noticia new_noticia = new Noticia();
        new_noticia.setTitle(titulo_report.getText().toString());
        new_noticia.setContent(desc_report.getText().toString());
        new_noticia.setDate(ubicacion.getText().toString());
        dbref.child(id).setValue(new_noticia);
    }
});




        Button photo_button = (Button)findViewById(R.id.photo_button);
        photo_button.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, CAMERA_PIC_REQUEST);
            }
        });
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == CAMERA_PIC_REQUEST) {
            Bitmap image = (Bitmap) data.getExtras().get("data");
            ImageView imageview = (ImageView) findViewById(R.id.captura);
            imageview.setImageBitmap(image);
        }
    }

    */
}}
