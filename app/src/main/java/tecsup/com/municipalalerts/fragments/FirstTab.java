package tecsup.com.municipalalerts.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


import java.util.ArrayList;

import tecsup.com.municipalalerts.R;
import tecsup.com.municipalalerts.activities.SubmitNewActivity;
import tecsup.com.municipalalerts.business.NoticiasAdapter;
import tecsup.com.municipalalerts.models.Noticia;


public class FirstTab extends Fragment {
    DatabaseReference dbref;
    RecyclerView recyclerView;
    private NoticiasAdapter noticiasAdapter;
    private ArrayList<Noticia> noticiaArrayList;
    private FloatingActionButton addNew;

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
        recyclerView = (RecyclerView) view.findViewById(R.id.noticiaList);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        noticiaArrayList=new ArrayList<>();
        recyclerView.setAdapter(noticiasAdapter);
        dbref=FirebaseDatabase.getInstance().getReference("News");

        dbref.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
             Noticia news = dataSnapshot.getValue(Noticia.class);

                Log.d("Noticia encontrada", news.toString());
                noticiaArrayList.add(news);
                noticiasAdapter=new NoticiasAdapter(noticiaArrayList);
                recyclerView.setAdapter(noticiasAdapter);
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

                Noticia news = dataSnapshot.getValue(Noticia.class);
                noticiaArrayList.add(news);
                noticiasAdapter=new NoticiasAdapter(noticiaArrayList);
                recyclerView.setAdapter(noticiasAdapter);

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        addNew = (FloatingActionButton)view.findViewById(R.id.addNew);


        addNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),SubmitNewActivity.class);
                startActivity(intent);
            }
        });









    }
}
