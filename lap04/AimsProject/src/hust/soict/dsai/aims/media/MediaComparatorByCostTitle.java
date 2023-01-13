//Họ Và Tên: Lê Thế Anh
//MSSV: 20200018
//Mã lớp TH: 721428
// Lap 04: 08/12/2022
package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {

    @Override
    public int compare(Media o1, Media o2) {
        if (o1.getCost() == o2.getCost()) {
            return o1.getTitle().compareTo(o2.getTitle());
        }
        return Float.compare(o1.getCost(), o2.getCost());
    }
}
