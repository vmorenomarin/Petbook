package com.vmorenomarin.petbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Pet> pets;
    private RecyclerView petList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar custom_bar = (Toolbar) findViewById(R.id.actionBar);

        setSupportActionBar(custom_bar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);


        petList = (RecyclerView) findViewById(R.id.rvPets);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        /*GridLayoutManager glm = new GridLayoutManager(this, 2);*/

        petList.setLayoutManager(llm);
        initPetList();
        initAdapter();
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

    public PetAdapter adapter;
    private void initAdapter() {
        PetAdapter adapter = new PetAdapter(pets, this);
        petList.setAdapter(adapter);
    }

    private void initPetList() {
        pets = new ArrayList<Pet>();

        pets.add(new Pet(R.drawable.pet1, "Pelusa", "(3 años)"));
        pets.add(new Pet(R.drawable.pet2, "Gasparin","(5 años)"));
        pets.add(new Pet(R.drawable.pet3, "Misifu","(2 años)"));
        pets.add(new Pet(R.drawable.pet4, "Elmo","(2 años)"));
        pets.add(new Pet(R.drawable.pet5, "Anita","(3 años)"));
        pets.add(new Pet(R.drawable.pet6, "Salamita","(4 años)"));
        pets.add(new Pet(R.drawable.pet7, "Lilith","(2 años)"));
        pets.add(new Pet(R.drawable.pet8, "Hugin y Menin","6 años"));
        pets.add(new Pet(R.drawable.pet9, "Marti","(2 años)"));
        pets.add(new Pet(R.drawable.pet10, "Zafir","(3 años)"));

    }
}
