package Java2HW1;
import Java2HW1.animals.*;
import Java2HW1.obstances.*;
/**
 * Выполнил: Осыкин Александр
 * Факультет "Тестирование ПО"
 * Lesson1 Java core для тестировщиков
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Список участников: "+ "\n");
        Team team = new Team("Svetlana Loboda"); //Создаем команду!
        team.printInformationAboutTheTeam(); // Выводим список участников!
//        Team team2 = new Team("Team 2");
//        team2.printInformationAboutTheTeam();
        Course course = new Course(); //Создаем полосу!/параметры полосы
        course.printInformationAboutTheObstacle();
        course.passObstacles(team);// Проходим полосу препятствий
//        course.passObstacles(team2);
        team.passedTheDistance();
//        team2.passedTheDistance();
    }
}
