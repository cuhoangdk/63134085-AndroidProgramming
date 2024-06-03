package thi.hoang63134085.dethi1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity
        implements BottomNavigationView
        .OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;
    BMIFragment bmiFragment = new BMIFragment();
    FamousCityFragment famousCityFragment = new FamousCityFragment();
    NotesFragment notesFragment = new NotesFragment();
    ProfileFragment profileFragment = new ProfileFragment();
    HomeFragment homeFragment = new HomeFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView
                = findViewById(R.id.bottomNavigationView);

        bottomNavigationView
                .setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.nagivation_home);
    }


    @Override
    public boolean
    onNavigationItemSelected(@NonNull MenuItem item)
    {
        if (item.getItemId() ==R.id.nagivation_home){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFragment, homeFragment)
                    .commit();
            return true;}
        else if (item.getItemId() ==R.id.nagivation_cau1){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFragment, bmiFragment)
                    .commit();
            return true;}
        else if (item.getItemId() ==R.id.nagivation_cau2){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFragment, famousCityFragment)
                    .commit();
            return true;}
        else if (item.getItemId() ==R.id.nagivation_cau3){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFragment, notesFragment)
                    .commit();
            return true;}
        else if (item.getItemId() ==R.id.nagivation_cau4){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFragment, profileFragment)
                    .commit();
            return true;}
        return false;
    }
}