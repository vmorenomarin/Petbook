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

public class PetDetailActivity extends AppCompatActivity {

    ArrayList<Pet> pets;
    private RecyclerView petList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet_detail);

        Toolbar custom_bar = (Toolbar) findViewById(R.id.actionBar);
        setSupportActionBar(custom_bar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        petList = (RecyclerView) findViewById(R.id.rvPets);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        /*GridLayoutManager glm = new GridLayoutManager(this, 2);*/

        petList.setLayoutManager(llm);
        initPetList();
        initAdapter();
    }

     public PetAdapter adapter;
    private void initAdapter() {
        PetAdapter adapter = new PetAdapter(pets, this);
        petList.setAdapter(adapter);
    }

    private void initPetList() {
        pets = new ArrayList<Pet>();


        pets.add(new Pet(R.drawable.pet3, "Misifu","(2 años)"));
        pets.add(new Pet(R.drawable.pet5, "Anita","(3 años)"));
        pets.add(new Pet(R.drawable.pet7, "Lilith","(2 años)"));
        pets.add(new Pet(R.drawable.pet9, "Marti","(2 años)"));
        pets.add(new Pet(R.drawable.pet6, "Salamita","(4 años)"));


    }
}
