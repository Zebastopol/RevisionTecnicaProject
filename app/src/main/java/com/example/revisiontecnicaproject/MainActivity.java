package com.example.revisiontecnicaproject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    DrawerLayout          myDrawerLayout;
    NavigationView        navView;
    Toolbar               myToolbar;
    ActionBarDrawerToggle toggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDrawerLayout = findViewById(R.id.myDrawerLayout);
        navView = findViewById(R.id.navView);
        myToolbar = findViewById(R.id.myToolbar);

        setSupportActionBar(myToolbar);
        navView.setNavigationItemSelectedListener(this);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.myFrame, new registro())
                .commit();
        setTitle("Ingrese Registro");
        toggle = setDrawerToogle();
        myDrawerLayout.addDrawerListener(toggle);

    }


   private ActionBarDrawerToggle setDrawerToogle() {

        return new ActionBarDrawerToggle(this, myDrawerLayout, myToolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);

    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        toggle.onConfigurationChanged(newConfig);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        toggle.syncState();
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (toggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return true;
    }
}