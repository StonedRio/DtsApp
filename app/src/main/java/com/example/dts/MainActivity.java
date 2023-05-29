package com.example.dts;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout constraintLayout;
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView navigationView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        constraintLayout=findViewById(R.id.constrain_layout);
        toolbar=constraintLayout.findViewById(R.id.toolbar);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView =findViewById(R.id.nav_view);

        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (item.getItemId()==R.id.pending){
                    drawerLayout.closeDrawer(GravityCompat.START);
                    toolbar.setVisibility(View.GONE);
                    ReplaceFragment(new PendingFragment());
                }
                else if (item.getItemId()==R.id.inspected) {
                    drawerLayout.closeDrawer(GravityCompat.START);
                    toolbar.setVisibility(View.GONE);
                    ReplaceFragment(new InspectedFragment());
                }
                else if (item.getItemId()==R.id.recomended) {
                    drawerLayout.closeDrawer(GravityCompat.START);
                    toolbar.setVisibility(View.GONE);
                    ReplaceFragment(new RecomendedFragment());
                }
                else if (item.getItemId()==R.id.not_recomended) {
                    drawerLayout.closeDrawer(GravityCompat.START);
                    toolbar.setVisibility(View.GONE);
                    ReplaceFragment(new NotRecomendedFragment());
                }
                else if (item.getItemId()==R.id.about_us) {
                    Toast.makeText(MainActivity.this, "No Action Provided", Toast.LENGTH_SHORT).show();
                }
                else if (item.getItemId()==R.id.facebook) {
                    Toast.makeText(MainActivity.this, "No Action Provided", Toast.LENGTH_SHORT).show();
                }
                else if (item.getItemId()==R.id.rate_us) {
                    Toast.makeText(MainActivity.this, "No Action Provided", Toast.LENGTH_SHORT).show();
                }
                else if (item.getItemId()==R.id.invite_a_Friend) {
                    Toast.makeText(MainActivity.this, "No Action Provided", Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });


    }
    public void ReplaceFragment(Fragment fragment)
    {
        try {
            FragmentManager fragmentManager=getSupportFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.frameLayout,fragment,"");
            fragmentTransaction.commit();
        }catch (Exception e)
        {
            Log.d("aa", "Exception---"+e.getMessage());
        }
    }

    public DrawerLayout getDrawerLayout() {
        return drawerLayout;
    }
}