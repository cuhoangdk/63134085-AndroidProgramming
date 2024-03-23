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

        }
        catch (NumberFormatException e)
        {
            Toast.makeText(this, "Vui lòng nhập dữ liệu", Toast.LENGTH_SHORT).show();
        }
    }
}