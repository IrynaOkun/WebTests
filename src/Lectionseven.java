import person.Person;
import person.PersonHelper;

public class Lectionseven {

    public static void main(String[] args) {

        Person p1 = new Person("Sergey", 30, 'M' );
        Person p2= new Person("Anna", 20, 'F' );


        Person[] personArray = {p1, p2};
        //person.Person.person.PersonHelper ph = new person.Person.person.PersonHelper();
        Person pMin = PersonHelper.getMinAge(personArray);

//        System.out.println(pMin.getName());

        //p1.version = 1;
        //p2.version = 2;

//        person.Person.version = 1;
//        System.out.println(person.Person.version);
    }
}
