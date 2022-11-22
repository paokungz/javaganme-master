package com.SPACEINVADER.sprite;

import javax.swing.ImageIcon;


public class boss extends Sprite{
    private Bomb2 bomb2;
    public boss(int x , int y){
        initboss(x, y);
    }
    private void initboss(int x, int y) 
        {
            int hp = 1000;
            this.x = x;
            this.y = y;
    
            bomb2 = new Bomb2(x, y);
            var bossImg ="src/images/boss.png";
            var il =new ImageIcon(bossImg);

            setImage(il.getImage());

    }
    public void act(int direction) {

        this.x += direction;
    }
    public Bomb2 getBomb() {

        return bomb2;
    }
    public class Bomb2 extends Sprite{
        private boolean destroyed;
        public Bomb2(int x, int y) {

            initBomb2(x, y);
        }
        private void initBomb2(int x, int y) {

            setDestroyed2(true);

            this.x = x;
            this.y = y;

            var bombImg = "src/images/alshoot.png";
            var ii = new ImageIcon(bombImg);
            setImage(ii.getImage());
        }
        public void setDestroyed2(boolean destroyed) {

            this.destroyed = destroyed;
        }
        public boolean isDestroyed() {

            return destroyed;
        }
    }
}

