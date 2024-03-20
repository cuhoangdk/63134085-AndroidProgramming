package com.cuhoangdk.sum_quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ArrayList<Integer> listNum1;
    ArrayList<Integer> listNum2;
    int countAns=0;
    int count=0;
    EditText edtSo1;
    EditText edtso2;
    Button btnA;
    Button btnB;
    Button btnC;
    Button btnD;
    Button btnGen;
    TextView tvCountAns;
    Random random = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getControls();
    }
    public void getControls(){
        edtSo1 = (EditText) findViewById(R.id.edtso1);
        edtso2 = (EditText) findViewById(R.id.edtso2);
        btnA = (Button) findViewById(R.id.btnA);
        btnB = (Button) findViewById(R.id.btnB);
        btnC = (Button) findViewById(R.id.btnC);
        btnD = (Button) findViewById(R.id.btnD);
        btnGen = (Button) findViewById(R.id.btnGen);
        tvCountAns = (TextView) findViewById(R.id.txtDiem);
    }
    public void gen(View v){
        generationAns();
    }
    public void A(View v){
        if (count <=9 && Integer.parseInt(String.valueOf(btnA.getText())) == listNum1.get(count) + listNum2.get(count)){
            countAns++;
            tvCountAns.setText(countAns + "/10");
        }
        count++;
        if(count == 10){
            Toast.makeText(this, "Bạn làm đúng: " + countAns +"/10 Câu", Toast.LENGTH_SHORT).show();
            generationAns();
        }
        mergeAns(listNum1.get(count) + listNum2.get(count));
        setNum(listNum1.get(count), listNum2.get(count));
    }
    public void B(View v){
        if (count <=9 && Integer.parseInt(String.valueOf(btnB.getText())) == listNum1.get(count) + listNum2.get(count)){
            countAns++;
            tvCountAns.setText(countAns + "/10");
        }
        count++;
        if(count == 10){
            Toast.makeText(this, "Bạn làm đúng: " + countAns +"/10 Câu", Toast.LENGTH_SHORT).show();
            generationAns();
        }
        mergeAns(listNum1.get(count) + listNum2.get(count));
        setNum(listNum1.get(count), listNum2.get(count));
    }
    public void C(View v){
        if (count <=9 && Integer.parseInt(String.valueOf(btnC.getText())) == listNum1.get(count) + listNum2.get(count)){
            countAns++;
            tvCountAns.setText(countAns + "/10");
        }
        count++;
        if(count == 10){
            Toast.makeText(this, "Bạn làm đúng: " + countAns +"/10 Câu", Toast.LENGTH_SHORT).show();
            generationAns();
        }
        mergeAns(listNum1.get(count) + listNum2.get(count));
        setNum(listNum1.get(count), listNum2.get(count));
    }
    public void D(View v){
        if (count <=9 && Integer.parseInt(String.valueOf(btnD.getText())) == listNum1.get(count) + listNum2.get(count)){
            countAns++;
            tvCountAns.setText(countAns + "/10");
        }
        count++;
        if(count == 10){
            Toast.makeText(this, "Bạn làm đúng: " + countAns +"/10 Câu", Toast.LENGTH_SHORT).show();
            generationAns();
        }
        mergeAns(listNum1.get(count) + listNum2.get(count));
        setNum(listNum1.get(count), listNum2.get(count));
    }
    public void mergeAns(int ans){
        ArrayList<Integer> options = new ArrayList<>();
        options.add(ans); // Thêm đáp án đúng

        while (options.size() < 4) {
            int randomOption = random.nextInt(40);
            if (!options.contains(randomOption)) {
                options.add(randomOption);
            }
        }

        Collections.shuffle(options); // Trộn 4 đáp án

        btnA.setText(String.valueOf(options.get(0)));
        btnB.setText(String.valueOf(options.get(1)));
        btnC.setText(String.valueOf(options.get(2)));
        btnD.setText(String.valueOf(options.get(3)));
    }
    public void setNum(int a, int b){
        edtSo1.setText(String.valueOf(a));
        edtso2.setText(String.valueOf(b));
    }
    public void generationAns(){
        listNum1 = new ArrayList<Integer>();
        listNum2 = new ArrayList<Integer>();
        countAns = 0;
        for (int i = 0; i<10; i++){
            listNum1.add(random.nextInt(20));
            listNum2.add(random.nextInt(20));
        }
        setNum(listNum1.get(count), listNum2.get(count));
        mergeAns(listNum1.get(0) + listNum2.get(0));
        tvCountAns.setText(countAns + "/10");
    }
}