package vn.edu.thaihuy.hocnauan;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static vn.edu.thaihuy.hocnauan.R.id.imageViewCustom;

/**
 * Created by thaih on 12/7/2016.
 */

public class CustomAdapter extends BaseAdapter {

    Activity context;
    ArrayList<MonAn> list;

    public CustomAdapter(Activity context, ArrayList<MonAn> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.custom_activity, null);

        ImageView img = (ImageView) view.findViewById(imageViewCustom);
        TextView title = (TextView) view.findViewById(R.id.textViewTenCustom);

        MonAn temp = list.get(position);
        title.setText(temp.getTitle());
        byte[] mangHinh = temp.getImage();
        Bitmap hinhDaiDien = BitmapFactory.decodeByteArray(mangHinh, 0, mangHinh.length);
        img.setImageBitmap(hinhDaiDien);

        return view;
    }
}
