package thi.mssv63134085.baithi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity
        implements BottomNavigationView
        .OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;
    Cau1Fragment cau1Fragment = new Cau1Fragment();
    Cau2Fragment cau2Fragment = new Cau2Fragment();
    Cau3Fragment cau3Fragment = new Cau3Fragment();
    Cau4Fragment cau4Fragment = new Cau4Fragment();
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
                    .replace(R.id.flFragment, cau1Fragment)
                    .commit();
            return true;}
        else if (item.getItemId() ==R.id.nagivation_cau2){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFragment, cau2Fragment)
                    .commit();
            return true;}
        else if (item.getItemId() ==R.id.nagivation_cau3){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.flFragment, cau3Fragment)
                .commit();
        return true;}
        else if (item.getItemId() ==R.id.nagivation_cau4){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.flFragment, cau4Fragment)
                .commit();
        return true;}
        return false;
    }
}