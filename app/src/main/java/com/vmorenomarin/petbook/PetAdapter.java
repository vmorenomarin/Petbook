package com.vmorenomarin.petbook;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by victor on 8/22/16.
 */
public class PetAdapter extends RecyclerView.Adapter<PetAdapter.PetViewHolder> {

    ArrayList<Pet> pets;

    public PetAdapter(ArrayList<Pet> pets){
        this.pets = pets;}


    @Override
    public PetViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_pet, parent, false);
        return new PetViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PetViewHolder petViewHolder, int position) {
        Pet pet = pets.get(position);
        petViewHolder.imgPet.setImageResource(pet.getPhoto());
        petViewHolder.tvPetName.setText(pet.getName());
        petViewHolder.tvPetAge.setText(pet.getAge());

    }

    @Override
    public int getItemCount() {
        return pets.size();
    }

    public class PetViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgPet;
        private TextView tvPetName;
        private TextView tvPetAge;


        public PetViewHolder(View itemView) {
            super(itemView);
            imgPet    =   (ImageView) itemView.findViewById(R.id.imgPetCV);
            tvPetName =   (TextView)  itemView.findViewById(R.id.tvPetName);
            tvPetAge  =   (TextView)  itemView.findViewById(R.id.tvPetAge);
        }
    }
}
