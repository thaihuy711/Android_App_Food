package vn.edu.thaihuy.hocnauan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ManHinhChoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_cho);

         Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(3000);

                }catch (Exception e){

                }finally {
                    Intent iMain = new Intent(ManHinhChoActivity.this,MainActivity.class);
                    startActivity(iMain);
                }

            }
        });
        thread.start();
    }
}
