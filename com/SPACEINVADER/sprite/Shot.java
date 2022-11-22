package com.SPACEINVADER.sprite;

import javax.swing.ImageIcon;

public class Shot extends Sprite {

    public Shot() {
    }

    public Shot(int x, int y) {

        initShot(x, y);
    }

    private void initShot(int x, int y) {

        var shotImg = "src/images/alshoot.png";
        var ii = new ImageIcon(shotImg);
        setImage(ii.getImage());

        int H_SPACE = 20;
        setX(x + H_SPACE);

        int V_SPACE = 6;
        setY(y - V_SPACE);
    }
}
