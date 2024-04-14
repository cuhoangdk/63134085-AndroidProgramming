package ntu.mssv63134085.w7_usingrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recyclerViewData;
    RecyclerView recyclerViewLandscape;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewData = getDataForRecyclerView();
        recyclerViewLandscape = findViewById(R.id.recyclerLand);
        //RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        //recyclerViewLandscape.setLayoutManager(layoutLinear);
        //RecyclerView.LayoutManager layoutLinearHorizonal = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        //recyclerViewLandscape.setLayoutManager(layoutLinearHorizonal);
        RecyclerView.LayoutManager layoutGrid = new GridLayoutManager(this,2);
        recyclerViewLandscape.setLayoutManager(layoutGrid);
        landScapeAdapter = new LandScapeAdapter(this, recyclerViewData);
        recyclerViewLandscape.setAdapter(landScapeAdapter);
    }
    ArrayList<LandScape> getDataForRecyclerView(){
        ArrayList<LandScape> dsDuLieu = new ArrayList<LandScape>();
        LandScape landScape1 = new LandScape("mucangchai","Mù cang chải");
        LandScape landScape2 = new LandScape("caonguyendadongvan","Cao nguyên đá Đồng Văn");
        LandScape landScape3 = new LandScape("thacbandoc","Thác bản Dốc");
        LandScape landScape4 = new LandScape("tranan","Tràng An");
        dsDuLieu.add(landScape1);
        dsDuLieu.add(landScape2);
        dsDuLieu.add(landScape3);
        dsDuLieu.add(landScape4);
        return dsDuLieu;
    }
}