package com.example.caveatemptor.models;
import javax.persistence.*;

@Entity
public class Image {

    @ManyToOne
    @JoinColumn(name = "Items_id", nullable = false)
    private Items items;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Image_id;
    private String title;
    private String filename;

    protected Image() {}

    public Image(String title, String filename) {
        this.title = title;
        this.filename = filename;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
