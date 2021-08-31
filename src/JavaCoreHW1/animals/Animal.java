package Java2HW.animals;

public abstract class Animal {
    protected String name;
    protected int run_limit;
    protected boolean passing;

    public Animal() {
    }

    public abstract String voice();

    public boolean run(int length) {
        return this.run_limit >= length;
    }

    public String toString() {
        String var10000 = this.getClass().getSimpleName();
        return var10000 + " " + this.name;
    }

    public void setPassing(boolean passing) {
        this.passing = passing;
    }
}

