package tecsup.com.municipalalerts;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

import static tecsup.com.municipalalerts.MyFirebaseMessagingService.TAG;

/**
 * Created by Steph on 23/05/2017.
 */

public class MyFirebaseInstanceIdService extends FirebaseInstanceIdService {


    @Override
    public void onTokenRefresh() {
      super.onTokenRefresh();
        String token = FirebaseInstanceId.getInstance().getToken();

        Log.d(TAG, "token: " + token);

    }
}
