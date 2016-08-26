package com.vmorenomarin.petbook.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vmorenomarin.petbook.pojo.Pet;
import com.vmorenomarin.petbook.R;
import com.vmorenomarin.petbook.adapter.PetAdapter;

import java.util.ArrayList;


public class MainFragment extends Fragment {


    ArrayList<Pet> pets;
    private RecyclerView petList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_main, container, false);

        petList = (RecyclerView) v.findViewById(R.id.rvPets);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        /*GridLayoutManager glm = new GridLayoutManager(this, 2);*/

        petList.setLayoutManager(llm);
        initPetList();
        initAdapter();
        return v;
    }


    public PetAdapter adapter;
    private void initAdapter() {
        adapter = new PetAdapter(pets, getActivity());
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
