package com.masai.problem4;

public class Main {
    public static void main(String[] args) {
        EPFOAccount epfoAccount = new EPFOAccount("EPF001", 25500);
        Employee e1 = new Employee("1", "vikas", 90000, epfoAccount);
        System.out.println( );
        Employee e2 = new Employee("2", "bholu", 100000, epfoAccount);
        
        System.out.println( );
        System.out.println( );
        
        System.out.println("emp 1 " + e1);
        System.out.println( );
        System.out.println("emp 2 " + e2);
        System.out.println( );
        System.out.println( );
        System.out.println("emp-1 and emp-2 are equal? " + e1.equals(e2));
        System.out.println( );
        System.out.println( );
        System.out.println("Hashcode of emp-1 " + e1.hashCode());
        System.out.println( );
        System.out.println("Hashcode of emp-2 " + e2.hashCode());
    }
}
