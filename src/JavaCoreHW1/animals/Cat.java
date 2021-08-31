package Java2HW.animals;

public class Cat extends Animal implements Jumpable, Swimable {
    private final int RUN_LIMIT = 100;
    private final int SWIM_LIMIT = 100;
    private final float JUMP_LIMIT = 3.8F;
    private int swim_limit;
    private float jump_limit;

    public Cat(String name) {
        this.name = name;
        this.run_limit = 100;
        this.swim_limit = 100;
        this.jump_limit = 3.8F;
    }

    public Cat(String name, int run_limit, int swim_limit, float jump_limit) {
        this.name = name;
        this.run_limit = run_limit;
        this.swim_limit = swim_limit;
        this.jump_limit = jump_limit;
    }

    public String voice() {
        return "meow";
    }

    public boolean swim(int length) {
        return this.swim_limit >= length;
    }

    public boolean jump(float height) {
        return this.jump_limit >= height;
    }

    public int getSwimLimit() {
        return this.swim_limit;
    }

    public float getJumpLimit() {
        return this.jump_limit;
    }
}