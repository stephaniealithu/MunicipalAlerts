package tecsup.com.municipalalerts.activities;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import tecsup.com.municipalalerts.R;

import tecsup.com.municipalalerts.adapters.MyTabStatePagerAdapter;
import tecsup.com.municipalalerts.fragments.FirstTab;
import tecsup.com.municipalalerts.fragments.SecondTab;

public class UserActivity extends AppCompatActivity {

    private TabLayout tabLayout;

    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        // Vinculamos el Tablayout con el ViewPager
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        tabLayout.setupWithViewPager(viewPager);

        // Añadimos un layout Adapter al ViewPager
        MyTabStatePagerAdapter adapter = new MyTabStatePagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FirstTab(), "First Tab");
        adapter.addFragment(new SecondTab(), "Second Tab");
        viewPager.setAdapter(adapter);


    }}
