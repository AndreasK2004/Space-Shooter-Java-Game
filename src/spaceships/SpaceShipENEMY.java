package spaceships;

import main.MainClass;
import spaceships_laserguns.Lasergun;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.Random;

public class SpaceShipENEMY extends SpaceShip {
    public static Image img;
    static Random random = new Random();

    static {
        try {
            SpaceShipENEMY.img = ImageIO.read(new File("images/ENEMY.png"));
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public SpaceShipENEMY() {
        spaceShipWidth = 100;
        spaceShipHeight = 100;
        SpaceShipName = "ENEMY";
        horPace = 15;
        verPace = 15;
        xCoord = MainClass.cosmosWidth - spaceShipWidth;
        yCoord = MainClass.yOffSet;
        super.SpaceShipImageIcon = new ImageIcon(SpaceShipENEMY.img);

        gun = new Lasergun(Color.RED);
    }

    public void huntUserSpaceShip(SpaceShip userSpaceShip) {
        int mv = random.nextInt(10);
        if (mv == 0) this.gun.fire(this.getX(), this.getY() + 100, this);
        if (userSpaceShip.xCoord > this.xCoord) this.xCoord = this.moveRIGHT();
        else this.xCoord = this.moveLEFT();

        int res = random.nextInt(4);
        if (res == 2) this.moveLEFT();
        if (res == 3) this.moveRIGHT();
    }
}

