/*
Lê Thế Anh
MSSV: 20200018
Ma Lop TH: 721428
Lap 05: 29/12/2022
 */
package hust.soict.dsai.aims.screen;

import hust.soict.dsai.aims.Aims;

import javax.swing.*;
import java.awt.*;

public class Layout extends JFrame {
    private JComponent currentScene;

    //Đặt layout cho cửa sổ
    public Layout() {
        this.setLayout(new BorderLayout());
        this.add(createNorth(), BorderLayout.NORTH);
        setVisible(true);
        setTitle("Store");
        setSize(1024, 768);
    }


    public void setCurrentScene(JComponent currentScene) {
        this.currentScene = currentScene;
        this.add(currentScene);
    }

    JPanel createNorth() {
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());
        return north;
    }

    JMenuBar createMenuBar() {
        JMenu menu = new JMenu("Options");

        // Tạo 3 menu con từ menu UpdateStore
        JMenu smUpdateStore = new JMenu("Update Store");
        smUpdateStore.add(new JMenuItem("Add Book"));
        smUpdateStore.add(new JMenuItem("Add CD"));
        smUpdateStore.add(new JMenuItem("Add DVD"));

        // Thêm menu con vào menu UpdateStore
        menu.add(smUpdateStore);
        Aims.MenuItemListener menuItemListener = new Aims.MenuItemListener();


        JMenuItem viewStoreMenu = new JMenuItem("View Store");
        viewStoreMenu.setActionCommand("view_store");   // Đặt tên cho menu
        viewStoreMenu.addActionListener(menuItemListener);  // Thêm sự kiện cho menu
        menu.add(viewStoreMenu);    // Thêm menu vào menu chính

        JMenuItem viewCartMenu = new JMenuItem("View Cart");    //  Tạo menu View Cart
        viewCartMenu.setActionCommand("view_cart"); // Đặt tên cho menu
        viewCartMenu.addActionListener(menuItemListener);   //  Thêm sự kiện cho menu
        menu.add(viewCartMenu);



        JMenuBar menuBar = new JMenuBar();
        // Đặt layout cho menu
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);
        return menuBar;
    }

    JPanel createHeader() {
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        title.setForeground(Color.RED);

        JButton cart = new JButton("View Cart");
        cart.setPreferredSize(new Dimension(100, 50));  //  Đặt kích thước cho nút với chiều rộng 100 và chiều cao 50
        cart.setMaximumSize(new Dimension(100, 50));    //  Đặt kích thước tối đa cho nút với chiều rộng 100 và chiều cao 50

        header.add(Box.createRigidArea(new Dimension(10, 10))); //  Tạo khoảng cách giữa các thành phần với chiều rộng 10 và chiều cao 10

        header.add(title);  //  Thêm tiêu đề vào header
        header.add(Box.createHorizontalGlue()); //
        header.add(cart);
        header.add(Box.createRigidArea(new Dimension(10, 10)));
        return header;
    }
}
