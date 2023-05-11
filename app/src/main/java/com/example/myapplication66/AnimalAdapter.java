package com.example.myapplication66;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.ViewHolder> {

    private final List<Animal> animals;
    private final LayoutInflater inflater;

    public AnimalAdapter(List<Animal> animals, Context context) {
        this.animals = animals;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Animal animal = animals.get(position);
        holder.animalViev.setImageResource(animal.getAnimalRes());
        holder.nameViev.setText(animal.getName());
        holder.animalDesViev.setText(animal.getAnimalDescription());

    }

    @Override
    public int getItemCount() {
        return animals.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        final ImageView animalViev;
        final TextView nameViev, animalDesViev;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            animalViev = itemView. findViewById(R.id.imageView);
            nameViev = itemView.findViewById(R.id.name);
            animalDesViev = itemView.findViewById(R.id.desc);

        }
    }
}
