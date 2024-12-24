package day_6;

import java.util.concurrent.ThreadLocalRandom;

public class Teacher {
    public String name;
    public String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLesson(String lesson) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public String evaluate(String studentName) {
        String mark = "";
        int markValue = ThreadLocalRandom.current().nextInt(2, 6);
        switch (markValue) {
            case 5:
                mark = "отлично";
                break;
            case 4:
                mark = "хорошо";
                break;
            case 3:
                mark = "удовлетворительно";
                break;
            case 2:
                mark = "неудовлетворительно";
        }
        return "Преподаватель " + name + " оценил студента с именем " + studentName
                + " по предмету " + subject + " на оценку " + mark + ".";
    }
}
