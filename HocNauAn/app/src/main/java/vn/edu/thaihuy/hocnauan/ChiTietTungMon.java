
package vn.edu.thaihuy.hocnauan;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class ChiTietTungMon extends AppCompatActivity {
    TextView txtTenMonAn,txtTenNguyenLieu,txtNguyenLieu,txtTenCachLam,txtCachLam;
    ImageView imgAnhMonAn,btnQuayLai;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet_tung_mon);

        txtTenMonAn = (TextView) findViewById(R.id.txtTenMonAn);
        txtTenNguyenLieu = (TextView) findViewById(R.id.txtTenNguyenLieu);
        txtNguyenLieu = (TextView) findViewById(R.id.txtNguyenLieu);
        txtTenCachLam = (TextView) findViewById(R.id.txtTenCachLam);
        txtCachLam = (TextView) findViewById(R.id.txtCachLam);
        imgAnhMonAn = (ImageView) findViewById(R.id.imgAnhMonAn);
        btnQuayLai = (ImageButton) findViewById(R.id.btnQuayLai);

        btnQuayLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Intent intent = getIntent();

        Bundle bundle = intent.getBundleExtra("MonAn");
        txtTenMonAn.setText(bundle.getString("TITLE"));
        byte[] arrImg = bundle.getByteArray("IMAGE");
        Bitmap img = BitmapFactory.decodeByteArray(arrImg, 0, arrImg.length);
        imgAnhMonAn.setImageBitmap(img);
        txtNguyenLieu.setText(bundle.getString("NGUYENLIEU"));
        txtCachLam.setText(bundle.getString("CACHLAM"));
    }
}
