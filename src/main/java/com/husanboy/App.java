package com.husanboy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId((byte) 101);
        student.setName("Husanboy");
        student.setGPA(4.80f);

        Configuration con = new Configuration().configure();
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        session.save(student);
    }
}
