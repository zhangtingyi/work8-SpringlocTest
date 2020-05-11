public class TestMain {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationtext("applicationContext.xml");

//        Lesson lesson=new Lesson();
//        lesson.setId(1);
//        lesson.setName("ssh");
//
//        Student student=new Student();
//
//        student.setLesson(lesson);
//
//        Lesson lesson1=student.getLesson();
//        lesson1.printlession();

        Student student=(Student) context.getBean("student");
        Lesson lesson=student.getLesson();
                lesson.printlession();

        System.out.println(student.getName());

    }

}
