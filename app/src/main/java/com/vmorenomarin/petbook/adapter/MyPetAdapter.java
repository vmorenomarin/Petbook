package com.vmorenomarin.petbook.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.vmorenomarin.petbook.R;
import com.vmorenomarin.petbook.pojo.Pet;

import java.util.ArrayList;

/**
 * Created by victor on 8/22/16.
 */
public class MyPetAdapter extends RecyclerView.Adapter<MyPetAdapter.MyPetViewHolder> {

    ArrayList<Pet> mypet;
    Activity activity;

    public MyPetAdapter(ArrayList<Pet> mypet, Activity activity) {
        this.mypet = mypet;
        this.activity = activity;
    }


    @Override
    public MyPetViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_my_pet, parent, false);
        return new MyPetViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyPetViewHolder myPetViewHolder, int position) {
        final Pet pet = mypet.get(position);
        myPetViewHolder.imgMyPet.setImageResource(pet.getPhoto());
        myPetViewHolder.tvMyPetAge.setText(pet.getAge());
    }

    @Override
    public int getItemCount() {
        return mypet.size();
    }

    public static class MyPetViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgMyPet;
        private TextView tvMyPetAge;


        public MyPetViewHolder(View itemView) {
            super(itemView);
            imgMyPet    =   (ImageView) itemView.findViewById(R.id.imgMyPetCV);
            tvMyPetAge  =   (TextView)  itemView.findViewById(R.id.tvMyPetAge);

        }
    }

}
