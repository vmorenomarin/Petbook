package com.vmorenomarin.petbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

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

        petList = (RecyclerView) findViewById(R.id.rvPets);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        /*GridLayoutManager glm = new GridLayoutManager(this, 2);*/

        petList.setLayoutManager(llm);
        initPetList();
        initAdapter();
    }

    private void initAdapter() {
    }

    private void initPetList() {
        pets = new ArrayList<Pet>();

        pets.add(new Pet(R.drawable.pet1, "Pelusa", 3, "Euclideo", 2345432));
        pet.add(new Pet(R.drawable.pet2, "Gasparín",))
    }
}
