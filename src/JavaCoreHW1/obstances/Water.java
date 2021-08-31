//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Java2HW.obstances;

import Java2HW.animals.Animal;
import Java2HW.animals.Swimable;

public class Water implements Let {
    private int length;

    public Water(int length) {
        this.length = length;
    }

    public boolean doIt(Animal animal) {
        return animal instanceof Swimable ? ((Swimable)animal).swim(this.length) : false;
    }

    public int getLength() {
        return this.length;
    }
}
