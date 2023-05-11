package com.example.myapplication66;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    private List<Animal> animals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setInitialData();

        RecyclerView recyclerView = findViewById(R.id.recycler);

        AnimalAdapter adapter = new AnimalAdapter(animals, this);
        recyclerView.setAdapter(adapter);

    }
    private void setInitialData(){
        animals = new ArrayList<>();
        animals.add( new Animal("Кошка-медведь", "Впервые зафиксировали в Китае в 8 столетии",
        R.drawable.cat));
        animals.add( new Animal("Красный волк", "Наиболее распространён в Китае и Инлии",
                R.drawable.volv));
        animals.add( new Animal("Манул", "Встречается в Южных и центральных районах республики Бурятия",
                R.drawable.manyl));
        animals.add( new Animal("Соня-полчок", "Самая крупная из сонь",
                R.drawable.sona));
        animals.add( new Animal("Снежный барс", "От них зависит наша экосистема",
                R.drawable.snow));
    }
}