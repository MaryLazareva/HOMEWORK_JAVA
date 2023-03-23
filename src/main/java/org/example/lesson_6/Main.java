package org.example.lesson_6;

public class Main {

    public static void main(String[] args) {

        Person[] people = new Person[]{new Person("Петр", "Иванов", 50, "M", "89161234567"),
                new Person("Роман", "Денисов", 36, "M", "89267736538"),
                new Person("Анна", "Зайцева", 27, "F", "89034591243"),
                new Person("Евгений", "Медведев", 19, "M", "89167234545"),
                new Person("Вера", "Петрова", 17, "F", "89056732455"),

        };

        for (Person person : people) {
            if (person.getAge() > 20) {
                System.out.println(person);
            }
        }

        for (Person person : people) {
            if (person.getGender() == "M") {
                person.sayHello();
            }
        }
    }
}
