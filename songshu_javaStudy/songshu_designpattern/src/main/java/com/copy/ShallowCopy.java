package com.copy;

public class ShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {

        Teacher teacher = new Teacher();
        teacher.setName("张三");
        teacher.setAge(20);

        Student student = new Student();
        student.setName("李同学");
        student.setAge(21);
        student.setTeacher(teacher);
        Student student1 = (Student) student.clone();

        System.out.println("-----------拷贝后的数据-----------");
        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getTeacher().getName());
        System.out.println(student1.getTeacher().getAge());

        System.out.println("-----------修改被拷贝对象的数据后-----------");
        student.setName("刘同学");
        student.setAge(90);
        teacher.setName("体育老师");
        teacher.setAge(29);
        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getTeacher().getName());
        System.out.println(student1.getTeacher().getAge());



    }
}
