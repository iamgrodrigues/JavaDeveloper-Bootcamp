package part3;

import classes.Student;
import classes.State;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ExecutionPart3 {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("part2-DIO");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        State stateToAdd = new State("Rio de Janeiro", "RJ");
        entityManager.persist(stateToAdd);
        entityManager.persist(new State("Sao Paulo", "SP"));
        entityManager.persist(new Student("Daniel", 29, stateToAdd));
        entityManager.persist(new Student("Joao", 20, stateToAdd));
        entityManager.persist(new Student("Pedro", 30, stateToAdd));

        entityManager.getTransaction().commit();

        // 2 - Let's use the find() method of EntityManager, native SQL, JPQL and JPA Criteria API to perform a query
        // that returns the same results to the following SQL:
        // SELECT * FROM Student WHERE id = 1 (Equals to the find() method of EntityManager on part 2.2)
        // SELECT * FROM Student WHERE name = 'Daniel' (Equals to the queries on parts 2.3 - 2.4 - 2.5)

        // 2.1 The parameter to be used on next queries
        String name = "Daniel";

        // =============================================================================================================

        // 2.2 - Performing the find() method of EntityManager
        // Returns only 1 result
        Student studentEntityManager = entityManager.find(Student.class, 1);

        // To return a list as result we have to use the methods on parts 2.3 - 2.4 - 2.5

        System.out.println("Query studentEntityManager: " + studentEntityManager);

        // =============================================================================================================

        // 2.3 - Native SQL

//        // Returns only 1 result
//        String sql = "SELECT * FROM Student WHERE name = :name ";
//        Student studentSQL = (Student) entityManager
//                .createNativeQuery(sql, Student.class)
//                .setParameter("name", name)
//                .getSingleResult();
//
//        // Returns a list as result
//        String sqlList = "SELECT * FROM Student";
//        List<Student> studentSQLList = entityManager
//                .createNativeQuery(sqlList, Student.class)
//                .getResultList();
//
//        System.out.println("Query studentSQL: " + studentSQL);
//        studentSQLList.forEach(Student -> System.out.println("Query studentSQLList: " + Student));

        // =============================================================================================================

        // 2.4 - JPQL

//        // Returns only 1 result
//        String jpql = "select a from Student a where a.name = :name";
//        Student studentJPQL = entityManager
//                .createQuery(jpql, Student.class)
//                .setParameter("name", name)
//                .getSingleResult();
//
//        // Returns a list as result
//        String jpqlList = "select a from Student a where a.state = :state";
//        List<Student> studentJPQLList = entityManager
//                .createQuery(jpqlList, Student.class)
//                .setParameter("state", stateToAdd)
//                .getResultList();
//
//        System.out.println("Query studentJPQL: " + studentJPQL);
//        studentJPQLList.forEach(Student -> System.out.println("Query studentJPQLList: " + Student));

        // =============================================================================================================

        // 2.5 - JPA Criteria API + JPA Metamodel

//        // Returns only 1 result
//        CriteriaQuery<Student> criteriaQuery = entityManager.getCriteriaBuilder().createQuery(Student.class);
//        Root<Student> studentRoot = criteriaQuery.from(Student.class);
//        CriteriaBuilder.In<String> inClause = entityManager.getCriteriaBuilder().in(studentRoot.get(Student_.name));
//        inClause.value(name);
//        criteriaQuery.select(studentRoot).where(inClause);
//        Student studentAPICriteria = entityManager.createQuery(criteriaQuery).getSingleResult();
//
//        // Returns a list as result
//        CriteriaQuery<Student> criteriaQueryList = entityManager.getCriteriaBuilder().createQuery(Student.class);
//        Root<Student> studentRootList = criteriaQueryList.from(Student.class);
//        List<Student> studentAPICriteriaList = entityManager.createQuery(criteriaQueryList).getResultList();
//
//        System.out.println("Query studentAPICriteria: " + studentAPICriteria);
//        studentAPICriteriaList.forEach(Student -> System.out.println("Query studentAPICriteriaList: " + Student));
    }
}

