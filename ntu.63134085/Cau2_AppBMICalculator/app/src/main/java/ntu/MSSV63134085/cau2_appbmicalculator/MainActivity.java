package ntu.MSSV63134085.cau2_appbmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton r_chauau, r_chaua;
    EditText edtChieuCao;
    EditText edtCanNang;
    EditText edtKQ;
    TextView tvCmt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getControls();
    }
    public void getControls(){
        r_chaua = (RadioButton) findViewById(R.id.radioChauA);
        r_chauau = (RadioButton) findViewById(R.id.radioChauAu);
        tvCmt = (TextView) findViewById(R.id.tvComment);
        edtChieuCao = (EditText) findViewById(R.id.edtHeight);
        edtCanNang = (EditText) findViewById(R.id.edtWeight);
        edtKQ = (EditText) findViewById(R.id.edtKQ);
    }
    public void BMICalculator(){
        try {
            double chieuCao = Double.parseDouble(edtChieuCao.getText().toString());
            double canNang = Double.parseDouble(edtCanNang.getText().toString());
            double BMI = canNang/(chieuCao*chieuCao);
            edtKQ.setText(String.valueOf(BMI));
            if (r_chaua.isChecked()){
                CommentChauA(BMI);
            }
            else CommentChauAu(BMI);
        }
        catch (NumberFormatException e)
        {
            Toast.makeText(this, "Vui lòng nhập dữ liệu", Toast.LENGTH_SHORT).show();
        }
    }
    void CommentChauAu(double BMI){
        String comment;
        if (BMI < 18.5) {
            comment = "Gầy";
        } else if (BMI < 24.5) {
            comment = "Bình thường";
        } else if (BMI < 25) {
            comment = "Thừa cân";
        } else if (BMI < 30) {
            comment = "Tiền béo phì";
        } else if (BMI < 35) {
            comment = "Béo phì độ I";
        } else if (BMI < 40) {
            comment = "Béo phì độ II";
        } else {
            comment = "Béo phì độ III";
        }
        tvCmt.setText(comment);
    }
    void CommentChauA(double BMI){
        String comment;
        if (BMI < 18.5) {
            comment = "Gầy";
        } else if (BMI < 22.9) {
            comment = "Bình thường";
        } else if (BMI < 23) {
            comment = "Thừa cân";
        } else if (BMI < 24.9) {
            comment = "Tiền béo phì";
        } else if (BMI < 29.9) {
            comment = "Béo phì độ I";
        } else if (BMI < 40) {
            comment = "Béo phì độ II";
        }
        tvCmt.setText(comment);
    }
}