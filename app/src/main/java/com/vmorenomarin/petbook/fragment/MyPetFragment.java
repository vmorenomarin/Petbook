package com.vmorenomarin.petbook.fragment;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mikhaellopez.circularimageview.CircularImageView;
import com.vmorenomarin.petbook.R;
import com.vmorenomarin.petbook.adapter.MyPetAdapter;
import com.vmorenomarin.petbook.pojo.Pet;
import java.util.ArrayList;


public class MyPetFragment extends Fragment {

    ArrayList<Pet> mypet;
    private RecyclerView myPetList;
    private CircularImageView circularImageView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_my_pet, container, false);

        CircularImageView circularImageView = (CircularImageView) v.findViewById(R.id.cimPhoto);
        myPetList = (RecyclerView) v.findViewById(R.id.rvMyPet);


        GridLayoutManager glm = new GridLayoutManager(getActivity(), 3);

        myPetList.setLayoutManager(glm);
        initMyPetList();
        initAdapter();
        return v;
    }

    public MyPetAdapter adapter;
    private void initAdapter() {
            adapter = new MyPetAdapter(mypet, getActivity());
            myPetList.setAdapter(adapter);
    }

    private void initMyPetList() {
        mypet = new ArrayList<Pet>();

        mypet.add(new Pet(R.drawable.pet1, "Pelusa", "(3 años)"));
        mypet.add(new Pet(R.drawable.pet2, "Gasparin","(5 años)"));
        mypet.add(new Pet(R.drawable.pet3, "Misifu","(2 años)"));
        mypet.add(new Pet(R.drawable.pet4, "Elmo","(2 años)"));
        mypet.add(new Pet(R.drawable.pet5, "Anita","(3 años)"));
        mypet.add(new Pet(R.drawable.pet6, "Salamita","(4 años)"));
        mypet.add(new Pet(R.drawable.pet7, "Lilith","(2 años)"));
        mypet.add(new Pet(R.drawable.pet8, "Hugin y Menin","6 años"));
        mypet.add(new Pet(R.drawable.pet9, "Marti","(2 años)"));
        mypet.add(new Pet(R.drawable.pet10, "Zafir","(3 años)"));

    }

}
