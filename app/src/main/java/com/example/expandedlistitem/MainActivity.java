package com.example.expandedlistitem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    ExpandableListView expandableListView;

    List<String> names;
    Map<String,List<String>> products;
    ExpandableListAdapter expandableAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expandableListView=(ExpandableListView)findViewById(R.id.simpleExpandedList);

        fillData();
        expandableAdapter=new MyExpandableAdapter(this,names,products);
        expandableListView.setAdapter(expandableAdapter);
    }

    public void fillData()
    {
        names=new ArrayList<>();
        products=new HashMap<>();

        names.add("Maruti Suzuki");
        names.add("Huyndai");
        names.add("Chevrolet");
        names.add("Honda");

        List<String> maruti=new ArrayList<>();
        List<String> huyndai=new ArrayList<>();
        List<String> chevrolet=new ArrayList<>();
        List<String> honda=new ArrayList<>();

        maruti.add("Dzire");
        maruti.add("Wagnor");
        maruti.add("Alto");
        maruti.add("Brezza");
        maruti.add("Omni");

        huyndai.add("Santro");
        huyndai.add("i10");
        huyndai.add("i20");
        huyndai.add("Creta");
        huyndai.add("Tuscan");

        chevrolet.add("Tavera");
        chevrolet.add("Beat");
        chevrolet.add("Enjoy");

        honda.add("Amaze");
        honda.add("Jazz");
        honda.add("City");
        honda.add("Civic");

        products.put(names.get(0),maruti);
        products.put(names.get(1),huyndai);
        products.put(names.get(2),chevrolet);
        products.put(names.get(3),honda);
    }
}
