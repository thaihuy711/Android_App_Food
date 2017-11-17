package vn.edu.thaihuy.hocnauan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (ImageButton) findViewById(R.id.btn1);
        btn2 = (ImageButton) findViewById(R.id.btn2);
        btn3 = (ImageButton) findViewById(R.id.btn3);
        btn4 = (ImageButton) findViewById(R.id.btn4);
        btn5 = (ImageButton) findViewById(R.id.btn5);
        btn6 = (ImageButton) findViewById(R.id.btn6);
        btn7 = (ImageButton) findViewById(R.id.btn7);
        btn8 = (ImageButton) findViewById(R.id.btn8);
        btn9 = (ImageButton) findViewById(R.id.btn9);
        btn10 = (ImageButton) findViewById(R.id.btn10);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChiTietMonAn.class);
                int id = 1;
                String tenLoai = "Điểm Tâm Sáng";
                Bundle bundle = new Bundle();
                bundle.putInt("ID", id);
                bundle.putString("TEN", tenLoai);
                intent.putExtra("LOAI", bundle);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChiTietMonAn.class);
                int id = 2;
                String tenLoai = "Món canh";
                Bundle bundle = new Bundle();
                bundle.putInt("ID", id);
                bundle.putString("TEN", tenLoai);
                intent.putExtra("LOAI", bundle);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChiTietMonAn.class);
                int id = 3;
                String tenLoai = "Món ngon ngày lễ";
                Bundle bundle = new Bundle();
                bundle.putInt("ID", id);
                bundle.putString("TEN", tenLoai);
                intent.putExtra("LOAI", bundle);
                startActivity(intent);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChiTietMonAn.class);
                int id = 4;
                String tenLoai = "Món ngon mỗi ngày";
                Bundle bundle = new Bundle();
                bundle.putInt("ID", id);
                bundle.putString("TEN", tenLoai);
                intent.putExtra("LOAI", bundle);
                startActivity(intent);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChiTietMonAn.class);
                int id = 5;
                String tenLoai = "Ẩm thực thế giới";
                Bundle bundle = new Bundle();
                bundle.putInt("ID", id);
                bundle.putString("TEN", tenLoai);
                intent.putExtra("LOAI", bundle);
                startActivity(intent);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChiTietMonAn.class);
                int id = 6;
                String tenLoai = "Món đãi tiệc";
                Bundle bundle = new Bundle();
                bundle.putInt("ID", id);
                bundle.putString("TEN", tenLoai);
                intent.putExtra("LOAI", bundle);
                startActivity(intent);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChiTietMonAn.class);
                int id = 7;
                String tenLoai = "Món chay";
                Bundle bundle = new Bundle();
                bundle.putInt("ID", id);
                bundle.putString("TEN", tenLoai);
                intent.putExtra("LOAI", bundle);
                startActivity(intent);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChiTietMonAn.class);
                int id = 8;
                String tenLoai = "Món ăn vặt";
                Bundle bundle = new Bundle();
                bundle.putInt("ID", id);
                bundle.putString("TEN", tenLoai);
                intent.putExtra("LOAI", bundle);
                startActivity(intent);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChiTietMonAn.class);
                int id = 9;
                String tenLoai = "Cháo dinh dưỡng";
                Bundle bundle = new Bundle();
                bundle.putInt("ID", id);
                bundle.putString("TEN", tenLoai);
                intent.putExtra("LOAI", bundle);
                startActivity(intent);
            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChiTietMonAn.class);
                int id = 10;
                String tenLoai = "Nước uống";
                Bundle bundle = new Bundle();
                bundle.putInt("ID", id);
                bundle.putString("TEN", tenLoai);
                intent.putExtra("LOAI", bundle);
                startActivity(intent);
            }
        });
    }
}
