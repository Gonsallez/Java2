//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Java2HW.obstances;

import Java2HW.animals.Animal;
import Java2HW.animals.Jumpable;

public class Wall implements Let {
    private float height;

    public Wall(float height) {
        this.height = height;
    }

    public boolean doIt(Animal animal) {
        return animal instanceof Jumpable ? ((Jumpable)animal).jump(this.height) : false;
    }

    public float getHeight() {
        return this.height;
    }
}
