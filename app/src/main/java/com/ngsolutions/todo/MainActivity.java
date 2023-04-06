package com.ngsolutions.todo;


import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ngsolutions.todo.adapter.CategoryListAdapter;
import com.ngsolutions.todo.model.Category;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Category[] categories=new Category[]{
                new Category("https://cdn-icons-png.flaticon.com/128/3144/3144456.png","Shopping List"),
                new Category("https://cdn-icons-png.flaticon.com/128/9309/9309173.png","Work List"),
                new Category("https://cdn-icons-png.flaticon.com/128/1629/1629101.png","Private List"),
                new Category("https://cdn-icons-png.flaticon.com/128/2989/2989898.png","Random List"),
                new Category("https://cdn-icons-png.flaticon.com/128/3655/3655578.png","Academic List"),

        };
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview_category);
        CategoryListAdapter adapter = new CategoryListAdapter(categories);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

}