package tecsup.com.municipalalerts.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseListAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import tecsup.com.municipalalerts.R;


public class FirstTab extends Fragment {
    private ListView contactsList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_first_tab, container, false);

//        view.findViewById(R.id....)

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        contactsList = (ListView) view.findViewById(R.id.contacts_list);

        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://municipalalerts2017.firebaseio.com/Users");
        FirebaseListAdapter<String> firebaseListAdapter = new FirebaseListAdapter<String>(
                getActivity(),
                String.class,
                android.R.layout.simple_list_item_1,
                databaseReference){

            @Override
            protected void  populateView(View v, String model, int position){
                TextView textView = (TextView) v.findViewById(android.R.id.text1);
                textView.setText(model);
            }
        };
        contactsList.setAdapter(firebaseListAdapter);


    }
}
