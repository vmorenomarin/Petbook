package com.vmorenomarin.petbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

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

    private void initAdapter() {
        PetAdapter adapter = new PetAdapter(pets);
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
