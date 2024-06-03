package thi.hoang63134085.dethi1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FamousCityFragment extends Fragment {

    LandScapeAdapter adapter;
    ArrayList<LandScape> list;
    RecyclerView recyclerViewLandScape;
    public FamousCityFragment() {
        // Required empty public constructor
    }

    public static FamousCityFragment newInstance(String param1, String param2) {
        FamousCityFragment fragment = new FamousCityFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //3. Chuẩn bị dữ liệu cho list
        list = new ArrayList<LandScape>();
        list.add(new LandScape("mucangchai","Mù cang chải","Việt Nam"));
        list.add(new LandScape("caonguyendadongvan","Cao nguyên đá Đồng Văn","Việt Nam"));
        list.add(new LandScape("thacbandoc","Thác bản Dốc","Việt Nam"));
        list.add(new LandScape("tranan","Tràng An","Việt Nam"));
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewCau3 =inflater.inflate(R.layout.fragment_famous_city, container, false);
        //4. Tìm điều khiển Recycler
        recyclerViewLandScape=  viewCau3.findViewById(R.id.ryCau3);

        //5. Tạo layout manager để đặt bố cục cho Recycler
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(viewCau3.getContext());
        recyclerViewLandScape.setLayoutManager(layoutLinear);

        //6. Tạo adapter gắn vào nguồn dữ liệu
        adapter = new LandScapeAdapter(viewCau3.getContext(), list);
        //7, Gắn adapter vào Recycler
        recyclerViewLandScape.setAdapter(adapter);

        return viewCau3;
    }
}