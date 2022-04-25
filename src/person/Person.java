package person;

public class Person {


    static int version;
    // constanta -> static int VERSION_APP = 1;
    // -> static int[] VERSION_APP = {1, 2, 3, 4};
    // -> static person.Person.person.Person[] VERSION_APP = {1, 2, 3, 4};

    //public default protected private

    private String name;
    private int age;
    private char gender;




    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

        PersonHelper.getMinAge(null);
    }

//getter setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    /*
    String getName() {
        if (gender == 'M') {
            return "Mr. " + name;
        } else {
            return "Mrs. " + name;
        }

    }
*/

    Person getMinAge(Person[] arr) {
        Person min = null;
        for (int i = 0; i < arr.length; i++) {
            if (min == null || min.age > arr[i].age) {
                min = arr[i];
            }

        }

        return min;
    }


}


// сhar сравнивается через оператор == а не через equals -
// ПРАВИЛО: всегда используем equals - а если не можем - используем двойное равно
// gender. - нажимаем точку - если нет equals (char - примитивный тип, поскольку он с малой буквы и подсвеч синеньким) -
// ref types - не подсвеч синим