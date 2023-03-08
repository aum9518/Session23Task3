import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        //TODO Task 3
        //Person класс тузунуз( name, age, phoneNumber, gender(enum),
        //role(enum: Student, Mentor) . main ден класстын 10 объектисин
        //тузунуз,  жашы  тамга  менен  же  терс  сан  берилсе  exception
        //ыргытылсын,
        //phoneNumber  0  дон  башталсын  же  болбосо  +996  мн
        //башталсын узундугу 10 же 14 символдон турушу керек, андай
        //болбосо  exception  ыргытылсын.  ArrayList  тузуп  баарын  ошол
        //листке  салыныз.  Анан  аты  А  тамгадан  баштагандарды  башка
        //листке салып коюнуз, роль студент болгондорду башка листке
        //салыныз,  жана  кыздарды  жана  балдарды  башка  башка  листке
        //салыныз.

        Person person1 = new Person("Aibek",27,"+996221788717",Gender.MALE,role.STUDENT);
        Person person2 = new Person("Ulan",27,"+996221374829",Gender.MALE,role.MENTOR);
        Person person3 = new Person("Matmusa",22,"+996221394823",Gender.MALE,role.STUDENT);
        Person person4 = new Person("Datka",22,"+996221374939",Gender.FEMALE,role.MENTOR);
        Person person5 = new Person("Aizat",18,"+996221192847",Gender.FEMALE,role.STUDENT);
        Person person6 = new Person("Torogeldi",16,"+996221385020",Gender.MALE,role.STUDENT);
        Person person7 = new Person("Kanykei",17,"+996221294010",Gender.FEMALE,role.STUDENT);
        Person person8 = new Person("Nurseit",23,"+996221340340",Gender.MALE,role.STUDENT);
        Person person9 = new Person("Aisha",27,"0221788717",Gender.FEMALE,role.STUDENT);
        Person[] people = {person1,person2,person3,person4,person5,person6,person7,person8,person9};

        ArrayList<Person>list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);
        list.add(person6);
        list.add(person7);
        list.add(person8);
        list.add(person9);
        ArrayList<Person>nameStartsWithA = new ArrayList<>();
        ArrayList<Person>girls = new ArrayList<>();
        ArrayList<Person>boys = new ArrayList<>();
        ArrayList<Person> Students = new ArrayList<>();
        ArrayList<Person> Mentors = new ArrayList<>();
        try{
            for (Person a:list) {
                if (a.getName().startsWith("A")){
                    nameStartsWithA.add(a);
                }
                if (a.getGender().equals(Gender.FEMALE)){
                    girls.add(a);
                }
                if (a.getGender().equals(Gender.MALE)){
                    boys.add(a);
                }
                if (a.getRole().equals(role.STUDENT)){
                    Students.add(a);
                }
                if (a.getRole().equals(role.MENTOR)){
                    Mentors.add(a);
                }
            }
            for (Person a:people) {
                if (a.getAge()>0){

                }else {
                    throw new Exception("Can not use negative number");
                }
                if (a.getPhoneNumber().startsWith("+996")||a.getPhoneNumber().startsWith("0")){

                }else {
                    throw new Exception("Use country code or 0");
                }
                if (a.getPhoneNumber().length()==10 || a.getPhoneNumber().length()==13){

                }else {
                    throw new Exception("Phone number length must be 13 or 10");
                }


            }


    } catch (InputMismatchException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("All lists: "+list);
        System.out.println("Who's name starts with 'A': "+nameStartsWithA);
        System.out.println("Girls: "+girls);
        System.out.println("Boys: "+boys);
        System.out.println("Students: "+Students);
        System.out.println("Mentors: "+Mentors);
    }
}
