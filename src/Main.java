public class Main {
    public static void main(String[] args) {

        Well well = new Well();
        well.setName("Azamat");
        well.setNumber(708286212);
        well.setTeacherSName("Azamat Agai");
        well.setCourseStartDate("28th of February");
        System.out.println("Name: "+well.getName()+"\n"+"Number: "+well.getNumber()+"\n"+"TeacherSName: "+well.getTeacherSName()
        +"\n"+"CourseStartDate: "+well.getCourseStartDate());


    }
}