//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Java2HW.animals;

public class Hen extends Animal implements Jumpable {
    private final int RUN_LIMIT = 100;
    private final float JUMP_LIMIT = 10.0F;
    private float jump_limit;

    public Hen(String name) {
        this.name = name;
        this.run_limit = 100;
        this.jump_limit = 10.0F;
    }

    public Hen(String name, int run_limit, float jump_limit) {
        this.name = name;
        this.run_limit = run_limit;
        this.jump_limit = jump_limit;
    }

    public String voice() {
        return "ko-ko-ko";
    }

    public boolean jump(float height) {
        return this.jump_limit >= height;
    }

    public float getJumpLimit() {
        return this.jump_limit;
    }
}
