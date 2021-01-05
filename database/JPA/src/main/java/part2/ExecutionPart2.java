package part2;

import classes.State;
import classes.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ExecutionPart2 {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("part2-DIO");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        State stateToAdd = new State("Rio de Janeiro", "RJ");
        Student studentToAdd = new Student("Daniel", 29, stateToAdd);

        entityManager.getTransaction().begin();

        entityManager.persist(stateToAdd);
        entityManager.persist(studentToAdd);

        entityManager.getTransaction().commit();

//        State stateFound = entityManager.find(State.class, 1);
//        Student studentFound = entityManager.find(Student.class, 1);
//
//        System.out.println(stateFound);
//        System.out.println(studentFound);

//        entityManager.getTransaction().begin();
//
//        studentFound.setName("Karam");
//        studentFound.setAge(20);
//
//        entityManager.getTransaction().commit();

//        entityManager.getTransaction().begin();
//
//        entityManager.remove(studentFound);
//
//        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

    }
}
