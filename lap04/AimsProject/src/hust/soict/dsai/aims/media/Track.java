//Họ Và Tên: Lê Thế Anh
//MSSV: 20200018
//Mã lớp TH: 721428
// Lap 04: 08/12/2022
package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Track implements Playable  {

	private String title;
	private int length;
	
	
	public Track() {
		// TODO Auto-generated constructor stub
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public Track(String title, int length) {
		super();
		this.title = title;
		this.length = length;
	}
	
	// Triển khai phương thứ play cho lớp Track
	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	
	@Override
	// Ghi đè phương thức equals trong lớp Objects
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		if (this == o) return true;
		if (o == null || getClass()!= o.getClass()) return false;
		Track temp = (Track) o;
		return title == temp.title && length == temp.length;
	}
}
