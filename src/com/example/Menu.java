package com.example;

import android.R;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Anastasia Belozertseva
 */
public class Menu extends ListActivity{
    String[] classes = {"MyActivity", "Text", "activity2", "activity3", "activity4", "activity5", "activity6"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter< String>(Menu.this, R.layout.simple_list_item_1, classes));
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        String item = (String) getListAdapter().getItem(position);
        try{
            Class itemClass = Class.forName("com.example." + item);
            Intent openActivity = new Intent(Menu.this, itemClass);
            startActivity(openActivity);
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }

}
