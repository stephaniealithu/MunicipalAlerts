package tecsup.com.municipalalerts;

/**
 * Created by Steph on 23/05/2017.
 */
import android.app.Application;
import  com.google.firebase.FirebaseApp;
import com.google.firebase.database.FirebaseDatabase;
public class FireLearn extends Application{

    @Override
    public void onCreate(){
        super.onCreate();

        if(!FirebaseApp.getApps(this).isEmpty()){
            FirebaseDatabase.getInstance().setPersistenceEnabled(true);
        }
    }
}
