package com.vmorenomarin.petbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.vmorenomarin.petbook.adapter.PetAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    private Toolbar toolbar;
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


}
