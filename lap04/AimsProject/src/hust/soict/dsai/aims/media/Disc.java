//Họ Và Tên: Lê Thế Anh
//MSSV: 20200018
//Mã lớp TH: 721428
//Lap 04:08/12/2022
package hust.soict.dsai.aims.media;

public class Disc extends Media{
	private int length;
	private String director;

	// Tạo getter and setter của các field
	public void setLength(int length) {
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public String getDirectory() {
		return director;
	}
	public void setDirectory(String directory) {
		this.director = directory;
	}
    public Disc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public Disc(String title, String category, float cost, String director, int length) {
        super(title, category, cost);
        this.director = director;
        this.length = length;
    }

    public Disc(String title, String category, float cost, String director) {
        super(title, category, cost);
        this.director = director;
    }
    public Disc(String title) {
        super(title);
    }

	@Override
	public String toString() {
		return "Media [id=" + id + ", title=" + getTitle() + ", category=" + getCategory() + ", cost=" + getCost() + "]";
	}
}
