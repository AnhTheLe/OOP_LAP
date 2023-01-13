//Họ Và Tên: Lê Thế Anh
//MSSV: 20200018
//Mã lớp TH: 721428
// Lap 05: 29/12/2022
package hust.soict.globalict.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingAccumulator extends JFrame {
    private JTextField tfInput;
    private JTextField tfOutput;
    private int sum = 0;

    // Render UI
    public SwingAccumulator() {
        Container cp = getContentPane();
        // Layout Grid
        cp.setLayout(new GridLayout(2, 2));

        // Input number
        cp.add(new JLabel("Enter an Integer: "));
        tfInput = new JTextField(10);
        cp.add(tfInput);
        tfInput.addActionListener(new TFInputListener());

        // Total
        cp.add(new JLabel("The Accumulated Sum is: "));
        tfOutput = new JTextField(10);
        cp.add(tfOutput);
        tfOutput.setEditable(false);
        setTitle("Swing Accumulator");
        setSize(350, 120);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SwingAccumulator();
    }

    // event listener
    private class TFInputListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int numberIn = Integer.parseInt(tfInput.getText());
            sum += numberIn;
            tfInput.setText("");
            tfOutput.setText(sum + "");
        }
    }
}
