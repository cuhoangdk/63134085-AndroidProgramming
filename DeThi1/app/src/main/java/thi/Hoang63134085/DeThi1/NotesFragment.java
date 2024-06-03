package thi.hoang63134085.dethi1;

import static android.content.Context.MODE_PRIVATE;
import static android.database.sqlite.SQLiteDatabase.openOrCreateDatabase;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NotesFragment extends Fragment {

    public NotesFragment() {
        // Required empty public constructor
    }

    public static NotesFragment newInstance(String param1, String param2) {
        NotesFragment fragment = new NotesFragment();
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
//        //        // Bước 0. Tạo file cơ sở dữ liệu
//        SQLiteDatabase db = getActivity().openOrCreateDatabase("Notes.db", // tên file = tên DB
//                                                    MODE_PRIVATE,  // giới hạn truy cập
//                                                     null          // con trỏ bản ghi
//                                                 );
//        // B1. Tạo bảng
//          // câu lêệnh tạo bảng
//        String sqlXoaBangNeuDaCo="DROP TABLE IF EXISTS NOTES;";
//
//        String sqlTaoBang = "CREATE TABLE NOTES( id integer PRIMARY KEY, " +
//                                                "title text, " +
//                                                "Description text);";
//            // thực hiện lệnh sql
//        db.execSQL(sqlXoaBangNeuDaCo);
//        db.execSQL(sqlTaoBang);
//        // Thêm một số dòng dữ liệu vào bảng
//        String sqlThem1 = "INSERT INTO NOTES VALUES(1, 'Java', 'note về java');";
//        String sqlThem2 = "INSERT INTO NOTES VALUES(2, 'Android', 'note Android cơ bản');";
//        String sqlThem3 = "INSERT INTO NOTES VALUES(3, 'Học làm giàu', 'note làm giàu');";
//        String sqlThem4 = "INSERT INTO NOTES VALUES(4, 'Note Anh-Việt', 'note 1000 từ');";
//        String sqlThem5 = "INSERT INTO NOTES VALUES(5, 'CNXH', 'note để thi');";
//        String sqlThem6 = "INSERT INTO NOTES VALUES(6, 'Note di động', 'note để thi');";
//        db.execSQL(sqlThem1);
//        db.execSQL(sqlThem2);
//        db.execSQL(sqlThem3);
//        db.execSQL(sqlThem4);
//        db.execSQL(sqlThem5);
//        db.execSQL(sqlThem6);
//        // Để quan sát trực quan file .db ? ==> Dùng ứng dụng DB Browser for SQLite
//        // Để mở được, ta file save file từ điện thoại ra đĩa cứng
//
//        // Ta đóng lại để check
//        db.close();
        //B1. Mở CSDL
        SQLiteDatabase db = getActivity().openOrCreateDatabase("Notes.db", // tên file = tên DB
                MODE_PRIVATE,  // giới hạn truy cập
                null          // con trỏ bản ghi
        );
        //B2. Thực thi câu lệnh select
        String sqlSelect ="Select * from NOTES;";
        Cursor cs = db.rawQuery(sqlSelect,null);
        cs.moveToFirst(); // đưa con trỏ bản ghi về hàng đầu tiên

        // B3: Đổ vào biến nào đó để xử lý
        // 3.1. Xây dựng model/class cho bảng Books, vi dụ: Book.java
        // 3.2. Tạo biến ArrayList<Book> dsSach;
        ArrayList<Note> dsSach = new ArrayList<Note>();
        //3.3. Duyệt qua lần lượt từng bản ghi và thêm vào danhSach
        while (cs.moveToNext()) // còn bản ghi để chuyển tới
        {
            // Lấy dữ liệu từng côột ở dòng hiện tại
            int id = cs.getInt(0);  // lấy dữ liệu ở côt 0, kiểu int
            String ten = cs.getString(1);
            String mota = cs.getString(2);
            // Tạo một đối tượng sách và thêm vào danh sách
            Note b = new Note(id,ten,mota);
            dsSach.add(b);
        }
        //B4, Hiện lên listview, recylerview,..
        // để cho nhanh, ở đây thầy chỉ hiện tên sách
        ArrayList<String> dsTenNote = new ArrayList<String>();
        for (int i=0; i<dsSach.size(); i++ )
            dsTenNote.add(dsSach.get(i).getTitle());
        // Hiển thị lên đk Listview
        // Inflate the layout for this fragment
        View viewCau4= inflater.inflate(R.layout.fragment_notes, container, false);

        ListView listViewTenNote = viewCau4.findViewById(R.id.lvTenSach);
        ArrayAdapter<String> adapterTenNote = new ArrayAdapter<String>(
                getContext(),
                android.R.layout.simple_list_item_1,
                dsTenNote
        );
        listViewTenNote.setAdapter(adapterTenNote);
        // Lắng nghè va xl
        listViewTenNote.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Get the clicked item value
                String clickedItem = (String) parent.getItemAtPosition(position);

                // Show the Toast message
                Toast.makeText(getContext(), "Bạn đã nhấn vào: " + clickedItem, Toast.LENGTH_SHORT).show();
            }
        });
        return viewCau4;
    }
}