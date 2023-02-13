public class Main {
    public static void main(String[] args) {

      Student student = new Student("Ayjamal","Jumakova","Java -8",4);
      Student student1 = new Student("Anvar","Ismailov","Java -9",5);
      Aspirant aspirant = new Aspirant("Ayjamal","Jumakova","Java -8",4);
      Aspirant aspirant1 = new Aspirant("Anvar","Ismailov","Java-9",5);
      Student [] students = {student ,student1};
      Aspirant[] aspirants ={aspirant,aspirant1};
      for (Student s:students) {
        System.out.println(s.toString());

      }




            
        }

        }

