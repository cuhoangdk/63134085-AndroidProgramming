package thi.hoang63134085.dethi1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class BMIFragment extends Fragment {

    EditText edtChieuCao;
    EditText edtCanNang;
    EditText edtKQ;
    TextView tvCmt;
    Button btnTinh;

    public BMIFragment() {
        // Required empty public constructor
    }


    public static BMIFragment newInstance(String param1, String param2) {
        BMIFragment fragment = new BMIFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       View viewCau1= inflater.inflate(R.layout.fragment_b_m_i, container, false);
        tvCmt = (TextView) viewCau1.findViewById(R.id.tvComment);
        edtChieuCao = (EditText) viewCau1.findViewById(R.id.edtHeight);
        edtCanNang = (EditText) viewCau1.findViewById(R.id.edtWeight);
        edtKQ = (EditText) viewCau1.findViewById(R.id.edtKQ);
        btnTinh = viewCau1.findViewById(R.id.btnTinh);
        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double chieuCao = Double.parseDouble(edtChieuCao.getText().toString());
                    double canNang = Double.parseDouble(edtCanNang.getText().toString());
                    double BMI = canNang/(chieuCao*chieuCao);
                    edtKQ.setText(String.format("%.2f", BMI));

                        Comment(BMI, canNang, chieuCao);


                }
                catch (NumberFormatException e)
                {
                    Toast.makeText(getContext(), "Vui lòng nhập dữ liệu", Toast.LENGTH_SHORT).show();
                }
            }
        });

       return viewCau1;
    }
    void Comment(double BMI, double canNang, double chieuCao){
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