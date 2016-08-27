package com.vmorenomarin.petbook;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.view.ViewPager;

import com.vmorenomarin.petbook.adapter.PageAdapter;
import com.vmorenomarin.petbook.fragment.MainFragment;
import com.vmorenomarin.petbook.fragment.MyPetFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    private Toolbar custom_bar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    ArrayList<Fragment> fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar custom_bar = (Toolbar) findViewById(R.id.actionBar);
        setSupportActionBar(custom_bar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        setUpViewPager();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menufav:
                Intent intent = new Intent(this, PetDetailActivity.class);
                startActivity(intent);
                break;
            case R.id.mContact:
                Intent intent1 = new Intent(this, ContactActivity.class);
                startActivity(intent1);
                break;
            case R.id.mAbout:
                Intent intent2 = new Intent(this, AboutActivity.class);
                startActivity(intent2);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private ArrayList<Fragment> addFragments () {
        ArrayList<Fragment> fragments = new ArrayList<>();

        fragments.add(new MainFragment());
        fragments.add(new MyPetFragment());

        return fragments;
    }

    public void setUpViewPager() {
        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(), addFragments()));
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setText("Mascotas").setIcon(R.drawable.ic_action_name);
        tabLayout.getTabAt(1).setIcon(R.drawable.mypet).setText("Mi mascota");

    }
}
