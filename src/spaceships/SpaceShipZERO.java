package spaceships;

import main.MainClass;
import spaceships_laserguns.Lasergun;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.Objects;

public class SpaceShipZERO extends SpaceShip {
    public static Image img;

    static {
        try {
            SpaceShipZERO.img = ImageIO.read(new File("images/ZERO.png"));
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public SpaceShipZERO() {
        spaceShipWidth = 106;
        spaceShipHeight = 110;
        SpaceShipName = "ZERO";
        horPace = 5;
        verPace = 5;
        xCoord = 0;
        yCoord = MainClass.cosmosHeight - spaceShipHeight - MainClass.yOffSet;
        super.SpaceShipImageIcon = new ImageIcon(SpaceShipZERO.img);

        gun = new Lasergun(Color.BLUE);
    }
}

