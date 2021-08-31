//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Java2HW.animals;

import java.util.Random;

public class Team {
    private String nameTeam = "unknown";
    Animal[] zoo = new Animal[]{new Cat("Murzik"), new Hen("Izzy"), new Hippo("Hippopo")};
    public Animal[] teamAnimal = new Animal[4];
    Random random = new Random();

    public Team(String nameTeam) {
        this.nameTeam = nameTeam;

        for(int i = 0; i < 4; ++i) {
            int ran = this.random.nextInt(3);
            this.teamAnimal[i] = this.zoo[ran];
        }

    }

    public void printInformationAboutTheTeam() {
        System.out.println("Team: " + this.nameTeam);
        Animal[] var1 = this.teamAnimal;
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            Animal a = var1[var3];
            System.out.println(a);
            System.out.println("Run limit: " + a.run_limit);
            if (a instanceof Swimable) {
                System.out.println("Swim limit: " + ((Swimable)a).getSwimLimit());
            }

            if (a instanceof Jumpable) {
                System.out.println("Jump limit: " + ((Jumpable)a).getJumpLimit());
            }
        }

        System.out.println();
    }

    public void passedTheDistance() {
        System.out.println(this.nameTeam + " проходит полосу!\n");
        Animal[] var1 = this.teamAnimal;
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            Animal a = var1[var3];
            if (a.passing) {
                System.out.println(a + " successfully passed the distance.\n");
            } else {
                System.out.println(a + " did not pass the distance.\n");
            }
        }

        System.out.println();
    }
}
