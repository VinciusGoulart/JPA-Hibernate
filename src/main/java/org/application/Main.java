package org.application;



import org.model.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {
    public static void main(String[] args) {

        Person p1 = new Person(null,"Mercury", "mercury@gmail.com");
        Person p2 = new Person(null,"Venus", "venus@gmail.com");
        Person p3 = new Person(null,"Earth", "earth@gmail.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();


        em.getTransaction().begin();
        em.persist(p2);
        em.getTransaction().commit();

        System.out.println(p2);

        em.close();
        emf.close();


    }
}