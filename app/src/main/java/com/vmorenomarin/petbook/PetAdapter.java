package com.vmorenomarin.petbook;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by victor on 8/22/16.
 */
public class PetAdapter extends RecyclerView.Adapter<PetAdapter.PetViewHolder> {

    ArrayList<Pet> pets;
    Activity activity;

    public PetAdapter(ArrayList<Pet> pets, Activity activity) {
        this.pets = pets;
        this.activity = activity;
    }



    @Override
    public PetViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_pet, parent, false);
        return new PetViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PetViewHolder petViewHolder, int position) {
        final Pet pet = pets.get(position);
        petViewHolder.imgPet.setImageResource(pet.getPhoto());
        petViewHolder.tvPetName.setText(pet.getName());
        petViewHolder.tvPetAge.setText(pet.getAge());

        petViewHolder.btnfav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Toast.makeText(activity, "Te ha gustado " + pet.getName(), Toast.LENGTH_SHORT).show();
            }
        });

        /*petViewHolder.viewfav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, PetDetailActivity.class);
                intent.putExtra("imgPet", pet.getPhoto());
                intent.putExtra("petName",pet.getName());
                activity.startActivity(intent);
            }
        });*/
    }

    @Override
    public int getItemCount() {
        return pets.size();
    }

    public static class PetViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgPet;
        private TextView tvPetName;
        private TextView tvPetAge;
        private ImageButton btnfav;

        public PetViewHolder(View itemView) {
            super(itemView);
            imgPet    =   (ImageView) itemView.findViewById(R.id.imgPetCV);
            tvPetName =   (TextView)  itemView.findViewById(R.id.tvPetName);
            tvPetAge  =   (TextView)  itemView.findViewById(R.id.tvPetAge);
            btnfav    =   (ImageButton) itemView.findViewById(R.id.btnfav);;
        }
    }

}
