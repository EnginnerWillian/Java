import javax.swing.*;

public class Exercicio {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Olá Mundo!");
        JButton button = new JButton("Clique aqui");

        button.setBounds(50, 100, 150, 40);

        frame.add(button);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
