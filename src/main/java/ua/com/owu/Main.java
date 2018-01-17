package ua.com.owu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ua.com.owu.entity.Product;
import ua.com.owu.entity.User;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure()
                .addAnnotatedClass(User.class)
                .addAnnotatedClass(Product.class)
                .buildSessionFactory();

        Session session = factory.openSession();


     /*   session.beginTransaction();
        session.save(new User("Oleg", 22));
        session.getTransaction().commit(); //Інсертр в базу данних//


*/
      /*  session.beginTransaction();
        session.find(User.class, 1);
        session.getTransaction().commit();*/

        /*session.beginTransaction();
        session.save(new User("Petro", 22));
        session.save(new User("Sisa", 222));
        session.save(new User("diablo", 212));
        session.save(new User("Diana", 20));
        session.save(new User("Roman", 30));
        session.getTransaction().commit();*/

        /*session.beginTransaction();
        System.out.println(session.createQuery("from  User u", User.class)
                .getResultList());
        session.getTransaction().commit();*/

       /* session.beginTransaction();
        session.save(new Product("iphone"));
        session.getTransaction().commit();*/

        /*session.beginTransaction();
        List<Product> products = new ArrayList<>();
        products.add(new Product("Iphone"));
        products.add(new Product("nokia"));
        products.add(new Product("samsung"));

        User user = session.find(User.class, 9);
        user.setProducts(products);
        session.save(user);*/
        session.getTransaction().commit();

        session.close();
        factory.close();


    }
}
