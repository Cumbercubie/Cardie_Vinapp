package com.example.cardie_vinapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MyListActivity extends AppCompatActivity {

    List<CardSet> SetList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sets__list);
        int animal = R.drawable.animal_crossing;
        SetList = new ArrayList<>();
        SetList.add(new CardSet("1235","Animals",animal,10,"1234"));
        SetList.add(new CardSet("1235","Animal",animal,10,"1234"));
        SetList.add(new CardSet("1235","Anima",animal,10,"1234"));
        SetList.add(new CardSet("1235","Anim",animal,10,"1234"));
        SetList.add(new CardSet("1235","Ani",animal,10,"1234"));
        SetList.add(new CardSet("1235","Ani",animal,10,"1234"));
        SetList.add(new CardSet("1235","Ani",animal,10,"1234"));
        SetList.add(new CardSet("1235","Ani",animal,10,"1234"));
        SetList.add(new CardSet("1235","Ani",animal,10,"1234"));
        SetList.add(new CardSet("1235","Ani",animal,10,"1234"));
        SetList.add(new CardSet("1235","Ani",animal,10,"1234"));
        SetList.add(new CardSet("1235","Ani",animal,10,"1234"));
        SetList.add(new CardSet("1235","Ani",animal,10,"1234"));


        RecyclerView Set_RV =  findViewById(R.id.SetRV);
        SetListAdapter Set_Adapter = new SetListAdapter(this,SetList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        Set_RV.setLayoutManager(linearLayoutManager);
        Set_RV.setAdapter(Set_Adapter);
    }
}
