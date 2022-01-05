package spaceships_laserguns;

import spaceships.SpaceShip;

import java.awt.*;
import java.util.LinkedList;

public class Lasergun {
    public Color lasercolor;
    public LinkedList<Laser> laserShootersLinkedList = new LinkedList<Laser>();

    public Lasergun (Color lasercolor) {
        this.lasercolor = lasercolor;
    }

    public void fire (int x, int y, SpaceShip userSpaceShip) {
        laserShootersLinkedList.add(laserShootersLinkedList.size(), new Laser(x, y, userSpaceShip));
    }
}
