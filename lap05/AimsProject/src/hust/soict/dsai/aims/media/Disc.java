/*
Lê Thế Anh
MSSV: 20200018
Ma Lop TH: 721428
Lap 05: 29/12/2022
 */
package hust.soict.dsai.aims.media;

public class Disc extends Media{
    private int length;
    private String director;

    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Disc() {
        super();
    }
    public Disc(int length, String director) {
        super();
        this.length = length;
        this.director = director;
    }
}
