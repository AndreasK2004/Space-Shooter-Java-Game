package spaceships_laserguns;

import spaceships.SpaceShip;

public class Laser {
    public int x;
    public int y;

    public Laser (int x, int y, SpaceShip userSpaceShip) {
        this.x = x + userSpaceShip.spaceShipWidth / 2;
        this.y = y;
    }
}
