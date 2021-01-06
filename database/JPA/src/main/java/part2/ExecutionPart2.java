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

        State stateToAdd1 = new State("Rio de Janeiro", "RJ");
        State stateToAdd2 = new State("São Paulo", "SP");
        State stateToAdd3 = new State("Mato Grosso", "MT");
        Student studentToAdd1 = new Student("Daniel", 29, stateToAdd1);
        Student studentToAdd2 = new Student("Paulo", 20, stateToAdd2);
        Student studentToAdd3 = new Student("Taisa", 20, stateToAdd2);
        Student studentToAdd4 = new Student("Guilherme", 20, stateToAdd2);
        Student studentToAdd5 = new Student("Fernanda", 17, stateToAdd3);

        entityManager.getTransaction().begin();

        entityManager.persist(stateToAdd1);
        entityManager.persist(stateToAdd2);
        entityManager.persist(stateToAdd3);
        entityManager.persist(studentToAdd1);
        entityManager.persist(studentToAdd2);
        entityManager.persist(studentToAdd3);
        entityManager.persist(studentToAdd4);
        entityManager.persist(studentToAdd5);

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
