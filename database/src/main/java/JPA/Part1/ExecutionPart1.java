package JPA.Part1;

import JPA.Classes.State;
import JPA.Classes.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ExecutionPart1 {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("part1-DIO");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        State stateToAdd = new State("Rio de Janeiro", "RJ");
        Student studentToAdd = new Student("Daniel", 29, stateToAdd);

        entityManager.getTransaction().begin();

        entityManager.persist(stateToAdd);
        entityManager.persist(studentToAdd);

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
