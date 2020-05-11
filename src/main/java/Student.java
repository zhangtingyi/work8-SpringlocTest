public class Student {
    int id;
    String name;

    Student(){
        id=0;
        name="哈哈哈";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(name);
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public void  initName(){
        name="我我";
        System.out.println(name);
    }

    Lesson lesson;

}
