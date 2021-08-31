//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Java2HW.animals;

public class Hippo extends Animal implements Swimable {
    private int swim_limit;
    private final int RUN_LIMIT = 50;
    private final int SWIM_LIMIT = 200;

    public Hippo(String name) {
        this.name = name;
        this.run_limit = 50;
        this.swim_limit = 200;
    }

    public Hippo(String name, int run_limit, int swim_limit) {
        this.name = name;
        this.run_limit = run_limit;
    }

    public String voice() {
        return "uf-uf-uf";
    }

    public boolean swim(int length) {
        return this.swim_limit >= length;
    }

    public int getSwimLimit() {
        return this.swim_limit;
    }
}
