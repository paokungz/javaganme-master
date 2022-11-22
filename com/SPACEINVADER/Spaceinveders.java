package com.SPACEINVADER;


import javax.swing.JFrame;


import java.awt.EventQueue;

public class Spaceinveders extends JFrame {
    public Spaceinveders()
    {
        initUI();
    }
    private void initUI() {
        Musicclass mu = new Musicclass();
        mu.Bgsound();
        add(new Board());

        setTitle("Space Invaders");
        setSize(Commons.BOARD_WIDTH, Commons.BOARD_HEIGHT);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }
   
      public static void main(String[] args) {

   
        EventQueue.invokeLater(() -> {
            var ex = new Spaceinveders();
            ex.setVisible(true);
        });
    }
}

