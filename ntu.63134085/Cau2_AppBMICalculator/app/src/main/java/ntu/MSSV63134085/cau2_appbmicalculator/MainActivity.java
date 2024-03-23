package ntu.MSSV63134085.cau2_appbmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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
    public void BMICalculator(View v){
        try {
            double chieuCao = Double.parseDouble(edtChieuCao.getText().toString());
            double canNang = Double.parseDouble(edtCanNang.getText().toString());
            double BMI = canNang/(chieuCao*chieuCao);
            edtKQ.setText(String.format("%.2f", BMI));
            if (r_chaua.isChecked()){
                CommentChauA(BMI, canNang, chieuCao);
            }
            else CommentChauAu(BMI, canNang, chieuCao);
        }
        catch (NumberFormatException e)
        {
            Toast.makeText(this, "Vui lòng nhập dữ liệu", Toast.LENGTH_SHORT).show();
        }
    }
    void CommentChauAu(double BMI, double canNang, double chieuCao){
        String comment, advice, fullText;
        if (BMI < 18.5) {
            comment = "Bạn bị gầy";
        } else if (BMI < 24.5) {
            comment = "Bạn khoẻ mạnh";
        } else if (BMI < 25) {
            comment = "Bạn thừa cân";
        } else if (BMI < 30) {
            comment = "Bạn bị tiền béo phì";
        } else if (BMI < 35) {
            comment = "Bạn bị béo phì độ I";
        } else if (BMI < 40) {
            comment = "Bạn bị béo phì độ II";
        } else {
            comment = "Bạn bị béo phì độ III";
        }
        if (BMI<18.5) {
            advice = String.format("Bạn cần tăng thêm %.2f kg để đạt trạng thái khoẻ mạnh", (18.5 * chieuCao * chieuCao) - canNang);
        }
        else if (BMI < 24.5) {advice ="";}
        else {advice = String.format("Bạn cần giảm đi %.2f kg để đạt trạng thái khoẻ mạnh", canNang - (24.5 * chieuCao * chieuCao) );}
        fullText=comment+"\n"+advice;
        tvCmt.setText(fullText);
    }
    void CommentChauA(double BMI, double canNang, double chieuCao){
        String comment, advice, fullText;
        if (BMI < 18.5) {
            comment = "Bạn bị gầy";
        } else if (BMI < 22.9) {
            comment = "Bạn khoẻ mạnh";
        } else if (BMI < 23) {
            comment = "Bạn thừa cân";
        } else if (BMI < 24.9) {
            comment = "Bạn bị tiền béo phì";
        } else if (BMI < 29.9) {
            comment = "Bạn bị béo phì độ I";
        } else if (BMI < 40) {
            comment = "Bạn bị béo phì độ II";
        } else {
            comment = "Bạn bị béo phì độ III";
        }
        if (BMI<18.5) {
            advice = String.format("Bạn cần tăng thêm %.2f kg để đạt trạng thái khoẻ mạnh", (18.5 * chieuCao * chieuCao) - canNang);
        }
        else if (BMI < 22.9) {advice ="";}
        else {advice = String.format("Bạn cần giảm đi %.2f kg để đạt trạng thái khoẻ mạnh", canNang - (22.9 * chieuCao * chieuCao) );}
        fullText=comment+"\n"+advice;
        tvCmt.setText(fullText);
    }
}