package com.example.shoppinglistmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        shoppingListButtonPageSwitch();
    }

    public void shoppingListButtonPageSwitch() {
        final Button shoppingList = findViewById(R.id.shoppingListButton);

        shoppingList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, shoppingListPage.class);
                MainActivity.this.startActivity(myIntent);
                overridePendingTransition(R.anim.right_slide_in, R.anim.right_slide_out);
            }
        });
    }
}
