//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Java2HW.obstances;

import Java2HW.animals.Animal;

public class Track implements Let {
    private int length;

    public Track(int length) {
        this.length = length;
    }

    public boolean doIt(Animal animal) {
        return animal.run(this.length);
    }

    public int getLength() {
        return this.length;
    }
}
