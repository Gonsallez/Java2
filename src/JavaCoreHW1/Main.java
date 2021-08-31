package Java2HW;

import Java2HW.animals.Team;
import Java2HW.obstances.Course;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Список участников: \n");
        Team team = new Team("Svetlana Loboda");
        team.printInformationAboutTheTeam();
        Course course = new Course();
        course.printInformationAboutTheObstacle();
        course.passObstacles(team);
        team.passedTheDistance();
    }
}
