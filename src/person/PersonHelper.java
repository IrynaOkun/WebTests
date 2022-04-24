package person;

import person.Person;

public class git PersonHelper {

    public static Person getMinAge(Person[] arr) {
        Person min = null;
        for (int i = 0; i < arr.length; i++) {
            if (min == null || min.getAge() > arr[i].getAge()) {
                min = arr[i];
            }

        }

        return min;
    }
}
