package thi.mssv63134085.baithi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Cau3Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Cau3Fragment extends Fragment {
    // Khai báo các biến cần thiêt

    //1. Khai báo các biến toàn cục
    LandScapeAdapter adapter;
    ArrayList<LandScape> list;
    //2. Khai báo các biến đại diện cho các view cần tương tác
    RecyclerView recyclerViewLandScape;

    public Cau3Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Cau3Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Cau3Fragment newInstance(String param1, String param2) {
        Cau3Fragment fragment = new Cau3Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //3. Chuẩn bị dữ liệu cho list
        list = new ArrayList<LandScape>();
        list.add(new LandScape("mucangchai","Mù cang chải"));
        list.add(new LandScape("caonguyendadongvan","Cao nguyên đá Đồng Văn"));
        list.add(new LandScape("thacbandoc","Thác bản Dốc"));
        list.add(new LandScape("tranan","Tràng An"));
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewCau3 =inflater.inflate(R.layout.fragment_cau3, container, false);
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