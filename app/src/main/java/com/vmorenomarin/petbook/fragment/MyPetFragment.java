package com.vmorenomarin.petbook.fragment;


import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
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

       myPetList = (RecyclerView) v.findViewById(R.id.rvMyPet);
        GridLayoutManager glm = new GridLayoutManager(getActivity(), 2);

        myPetList.setLayoutManager(glm);
        initMyPetList();
        initCollapsingToolbar(v);
        initAdapter();
        return v;
    }

    private void initCollapsingToolbar(View root) {
        CollapsingToolbarLayout collapsingToolbarLayout =
                (CollapsingToolbarLayout) root.findViewById(R.id.collapsingToolbar);

        collapsingToolbarLayout.setContentScrimColor(getResources().getColor(R.color.colorAccent));
        CircularImageView circularImageView = (CircularImageView) root.findViewById(R.id.cimPhoto);

    }


    public MyPetAdapter adapter;
    private void initAdapter() {
            adapter = new MyPetAdapter(mypet, getActivity());
            myPetList.setAdapter(adapter);
    }

    private void initMyPetList() {
        mypet = new ArrayList<Pet>();

        mypet.add(new Pet(R.drawable.pet3, "Misifu", "(3)"));
        mypet.add(new Pet(R.drawable.pet3, "Misifu","(5)"));
        mypet.add(new Pet(R.drawable.pet3, "Misifu","(2)"));
        mypet.add(new Pet(R.drawable.pet3, "Misifu","(2)"));
        mypet.add(new Pet(R.drawable.pet3, "Misifu","(3)"));
        mypet.add(new Pet(R.drawable.pet3, "Misifu","(4)"));
        mypet.add(new Pet(R.drawable.pet3, "Misifu","(2)"));
        mypet.add(new Pet(R.drawable.pet3, "Misifu","6"));
        mypet.add(new Pet(R.drawable.pet3, "Misifu","(2)"));
        mypet.add(new Pet(R.drawable.pet3, "Misifu","(3)"));

    }

}
