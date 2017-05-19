package tecsup.com.municipalalerts.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import tecsup.com.municipalalerts.R;

public class SecondTab extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_first_tab, container, false);

//        view.findViewById(R.id....)

        return view;
    }

}
