package vn.edu.thaihuy.hocnauan;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ChiTietMonAn extends AppCompatActivity {
    TextView txtTenLoai;
    ImageButton btnQuayLai;
    ListView listViewDS;
    ArrayList<MonAn> list;
    CustomAdapter customAdapter;
    private final String DATABASE_NAME = "db_MonAn.sqlite";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet_mon_an);

        txtTenLoai = (TextView) findViewById(R.id.txtTenLoai);
        listViewDS = (ListView) findViewById(R.id.listViewDS);
        btnQuayLai = (ImageButton) findViewById(R.id.btnQuayLai);

        Intent callerIntent = getIntent();
        Bundle bundle = callerIntent.getBundleExtra("LOAI");
        txtTenLoai.setText(bundle.getString("TEN"));
        int id = bundle.getInt("ID");

        SQLiteDatabase database = CopyDatabase.initDatabase(this, DATABASE_NAME);
        Cursor cursor = database.rawQuery("SELECT id, title, image, content, nguyenlieu " +
                "FROM MonAn where idLoai = ?", new String[] {id+""});
        list = new ArrayList<>();
        if (cursor.moveToFirst()) {
            do {
                    int idMon = cursor.getInt(0);
                    String title = cursor.getString(1);
                    byte[] img = cursor.getBlob(2);
                    String content =cursor.getString(3);
                    String nguyenLieu = cursor.getString(4);
                    list.add(new MonAn(idMon, title, img, content, nguyenLieu));
            } while (cursor.moveToNext());
        }
        btnQuayLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        listViewDS.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 MonAn mon = list.get(position);

                 Bundle bundle1 = new Bundle();
                 bundle1.putString("TITLE", mon.getTitle());
                 bundle1.putByteArray("IMAGE", mon.getImage());
                 bundle1.putString("NGUYENLIEU", mon.getNguyenlieu());
                 bundle1.putString("CACHLAM", mon.getContent());

                Intent intent = new Intent(ChiTietMonAn.this, ChiTietTungMon.class);
                intent.putExtra("MonAn", bundle1);
                startActivity(intent);
            }
        });

        customAdapter= new CustomAdapter(ChiTietMonAn.this, list);
        listViewDS.setAdapter(customAdapter);



    }
}
