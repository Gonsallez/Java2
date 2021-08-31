//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Java2HW.obstances;

import Java2HW.animals.Animal;
import Java2HW.animals.Team;
import java.util.Random;

public class Course {
    Let[] let = new Let[3];
    Random random = new Random();

    public Course() {
        Track track = new Track(this.random.nextInt(100));
        Wall wall = new Wall(this.random.nextFloat() * 10.0F);
        Water water = new Water(this.random.nextInt(100));
        this.let[0] = track;
        this.let[1] = wall;
        this.let[2] = water;
    }

    public void printInformationAboutTheObstacle() {
        System.out.println("Параметры полосы препятствий: ");
        System.out.println("Length track: " + ((Track)this.let[0]).getLength());
        System.out.println("Height wall: " + ((Wall)this.let[1]).getHeight());
        System.out.println("Length water: " + ((Water)this.let[2]).getLength());
        System.out.println();
    }

    public void passObstacles(Team team) {
        Animal[] var2 = team.teamAnimal;
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            Animal animal = var2[var4];
            Let[] var6 = this.let;
            int var7 = var6.length;

            for(int var8 = 0; var8 < var7; ++var8) {
                Let l = var6[var8];
                if (!l.doIt(animal)) {
                    animal.setPassing(l.doIt(animal));
                    break;
                }

                animal.setPassing(true);
            }
        }

    }
}
