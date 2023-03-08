import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        try{
            Person person1 = new Person("Manas",27,"+996221788717",Gender.MALE,role.STUDENT);
            Person person2 = new Person("Manas",27,"+996221788717",Gender.MALE,role.STUDENT);
            Person person3 = new Person("Manas",27,"+996221788717",Gender.MALE,role.STUDENT);
            Person person4 = new Person("Manas",27,"+996221788717",Gender.MALE,role.STUDENT);
            Person person5 = new Person("Manas",27,"+996221788717",Gender.MALE,role.STUDENT);
            Person person6 = new Person("Manas",27,"+996221788717",Gender.MALE,role.STUDENT);
            Person person7 = new Person("Manas",27,"+996221788717",Gender.MALE,role.STUDENT);
            Person person8 = new Person("Manas",27,"+996221788717",Gender.MALE,role.STUDENT);
            Person person9 = new Person("Manas",27,"0221788717",Gender.MALE,role.STUDENT);
            Person[] people = {person1,person2,person3,person4,person5,person6,person7,person8,person9};

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
    }
}
