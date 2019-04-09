package java8;

import people.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class PersonService {
    private List<Person> persons = new ArrayList<>();


    public Optional<Person> getFirstJohn() {
        for (Person p : persons) {
            if ("John".equals(p.getFirstName())) {
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public List<Person> getAdults() {
//        return getByCondition(this::isAdult);
        return getByCondition(Person::isPersonAdult);

//        List<Person> adults = new ArrayList<>();
//        for (Person p : persons) {
//            if (p.getAge() >= 18) {
//                adults.add(p);
//            }
//        }
//        return adults;
    }

    private boolean isAdult(Person p) {
        return p.getAge() >= 18;
    }


    public List<Person> getPersonsBySurname(String surname) {
        Condition surnameCondition = p -> Objects.equals(p.getFirstName(), surname);
        return getByCondition(surnameCondition);

//        List<Person> result = new ArrayList<>();
//        for (Person p : persons) {
//            if (Objects.equals(p.getLastName(), surname)) {
//                result.add(p);
//            }
//        }
//        return result;
    }


    public List<Person> getPersonsByName(String name) {
         Condition nameCondition = p -> Objects.equals(p.getFirstName(), name);

//        Condition nameCondition = new Condition() {
//            @Override
//            public boolean test(Person p) {
//                return Objects.equals(p.getFirstName(), name);
//            }
//        };
        return getByCondition(nameCondition);
    }

    private List<Person> getByCondition(Condition condition) {
        List<Person> result = new ArrayList<>();
        for (Person p : persons) {
            if (condition.test(p)) {
                result.add(p);
            }
        }
        return result;
    }



    @FunctionalInterface
    public interface Condition {
        boolean test(Person p);
    }

    public class AdultCondition implements Condition {
        @Override
        public boolean test(Person p) {
            return p.getAge() >= 18;
        }
    }

    public class SurnameCondition implements Condition {
        private String surname;

        public SurnameCondition(String surname) {
            this.surname = surname;
        }

        @Override
        public boolean test(Person p) {
            return Objects.equals(p.getLastName(), surname);
        }
    }


}
