package vn.edu.thaihuy.hocnauan;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by thaih on 12/7/2016.
 */

public class MonAn implements Serializable{

    int id;
    String title;
    byte[] image;
    String content;
    String nguyenlieu;
public MonAn(){

    }
    public MonAn(int id, String title, byte[] image, String content, String nguyenlieu) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.content = content;
        this.nguyenlieu = nguyenlieu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNguyenlieu() {
        return nguyenlieu;
    }

    public void setNguyenlieu(String nguyenlieu) {
        this.nguyenlieu = nguyenlieu;
    }

    @Override
    public String toString() {
        return "MonAn{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", image=" + Arrays.toString(image) +
                ", content='" + content + '\'' +
                ", nguyenlieu='" + nguyenlieu + '\'' +
                '}';
    }
}
