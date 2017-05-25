package tecsup.com.municipalalerts.models;

/**
 * Created by Steph on 24/05/2017.
 */

public class Noticia {
    String noticiaId;
    String title;
    String date;
    String picture;
    String content;

    public String getNoticiaId() {
        return noticiaId;
    }

    public void setNoticiaId(String noticiaId) {
        this.noticiaId = noticiaId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }



    public Noticia(){

    }

    public Noticia(String noticiaId, String title, String date, String picture, String content) {
        this.noticiaId = noticiaId;
        this.title = title;
        this.date = date;
        this.picture = picture;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Noticia{" +
                "noticiaId=" + noticiaId +
                ", title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", content='" + content + '\'' +
                ", picture='" + picture + '\'' +
                '}';
    }



}


