package com.example.foodapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the layout for the content view
        setContentView(R.layout.activity_main);

    }

    // Working button
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.bottom_navigation_menu, menu);
        return true;
    }
     // Id next new activity
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item.getItemId
        switch (item.getItemId()) {
            case R.id.page1:
                NewStep();
                return true;
            case R.id.page2:
                newStepTwo();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
// Second activity
    private void newStepTwo() {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }
// Third activity
    private void NewStep() {

        Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
        startActivity(intent);

    }
}