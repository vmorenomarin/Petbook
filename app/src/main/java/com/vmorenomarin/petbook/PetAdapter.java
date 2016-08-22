package com.vmorenomarin.petbook;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by victor on 8/22/16.
 */
public class PetAdapter extends RecyclerView.Adapter<PetAdapter.PetViewHolder> {

    ArrayList<Pet> pets;

    public PetAdapter(ArrayList<Pet> pets){
        this.pets = pets;}

    public class PetViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgPetCV;
        private TextView tvPetNameCV;
        private TextView tvPetAgeCV;
        private TextView tvMasterCV;
        private TextView tvPhoneCV;

        public PetViewHolder(View itemView) {
            super(itemView);
            imgPetCV    =   (ImageView) itemView.findViewById(R.id.imgPetCV);
            tvPetNameCV =   (TextView)  itemView.findViewById(R.id.tvPetName);
            tvPetAgeCV  =   (TextView)  itemView.findViewById(R.id.tvPetAge);
            tvMasterCV  =   (TextView)  itemView.findViewById(R.id.tvMaster);
            tvPhoneCV   =   (TextView)  itemView.findViewById(R.id.tvPhone);
        }
    }

    @Override
    public PetViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_pet, parent, false);
        return new PetViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PetViewHolder petViewHolder, int position) {
        Pet pet = pets.get(position);
        petViewHolder.imgPetCV.setImageResource(pet.getPhoto());
        petViewHolder.tvPetNameCV.setText(pet.getName());
        petViewHolder.tvPetAgeCV.setText(pet.getAge());
        petViewHolder.tvMasterCV.setText(pet.getMaster());
        petViewHolder.tvPhoneCV.setText(pet.getPhone());
    }

    @Override
    public int getItemCount() {
        return 0;
    }


}
