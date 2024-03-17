package com.cuhoangdk.w3_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText edtThongTin;
    EditText edtNhap;
    ListView lsvTen;
    ArrayList<String> dsTen;
    ArrayAdapter<String> bo_nguon;
    void getControls(){
        edtThongTin = (EditText) findViewById(R.id.edThongTin);
        edtNhap = (EditText) findViewById(R.id.edtNhap);
        lsvTen = (ListView) findViewById(R.id.lvTen);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getControls();
        dsTen = new ArrayList<String>();
        dsTen.add("Hiệu");
        dsTen.add("Hoàng");
        dsTen.add("Lâm");
        dsTen.add("Mỹ");
        bo_nguon = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1 , dsTen);
        lsvTen.setAdapter(bo_nguon);
        lsvTen.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                edtThongTin.setText(dsTen.get(position));
                Toast.makeText(MainActivity.this, dsTen.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void ThemPhanTu (View v){
        EditText editTenMoi = (EditText) findViewById(R.id.edtNhap);
        String tenNhap = editTenMoi.getText().toString();
        dsTen.add(tenNhap);
        bo_nguon.notifyDataSetChanged();
    }
    public void XoaPhanTu(View v){
        String tenXoa = edtThongTin.getText().toString();

        if (dsTen.contains(tenXoa)) {
            dsTen.remove(tenXoa);
            bo_nguon.notifyDataSetChanged();
            Toast.makeText(this, "Đã xóa " + tenXoa, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Không tồn tại " + tenXoa, Toast.LENGTH_SHORT).show();

        }

    }
}