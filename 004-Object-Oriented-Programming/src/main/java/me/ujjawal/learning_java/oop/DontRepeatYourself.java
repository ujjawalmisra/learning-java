package me.ujjawal.learning_java.oop;

/**
 * If there is a block of code that you have to use at multiple places, probably its a functionality in itself and is
 * a candidate for being abstracted into a function. You have to be judicious about what you abstract to a function
 * and what you don't.
 */
public class DontRepeatYourself {

    public static void main(String[] args) {
        Person person = new Person("Nitin", null, 30, Gender.MALE, null);

        System.out.println("~~~~ RepeatedCodeSample ~~~~");
        RepeatedCodeSample repeatedCodeSample = new RepeatedCodeSample();
        repeatedCodeSample.print(person);

        System.out.println("~~~~ NonRepeatedCodeSample ~~~~");
        NonRepeatedCodeSample nonRepeatedCodeSample = new NonRepeatedCodeSample();
        nonRepeatedCodeSample.print(person);
    }

    static class RepeatedCodeSample {
        public void print(Person person) {
            if(null != person.getFirstName()) {
                System.out.println("firstName --> " + person.getFirstName());
            }
            if(null != person.getLastName()) {
                System.out.println("lastName --> " + person.getLastName());
            }
            if(null != person.getAge()) {
                System.out.println("age --> " + person.getAge());
            }
            if(null != person.getGender()) {
                System.out.println("gender --> " + person.getGender());
            }
            if(null != person.getZipcode()) {
                System.out.println("zipcode --> " + person.getZipcode());
            }
        }
    }

    static class NonRepeatedCodeSample {
        public void print(Person person) {
            print("firstName", person.getFirstName());
            print("lastName", person.getLastName());
            print("age", person.getAge());
            print("gender", person.getGender());
            print("zipcode", person.getZipcode());
        }

        private void print(String propertyName, Object propertyValue) {
            if(null != propertyValue) {
                System.out.println(propertyName + " --> " + propertyValue);
            }
        }
    }

    private static enum Gender {
        MALE, FEMALE;
    }

    private static class Person {
        private String firstName;
        private String lastName;
        private Integer age;
        private Gender gender;
        private String zipcode;

        public Person(String firstName, String lastName, Integer age, Gender gender, String zipcode) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.gender = gender;
            this.zipcode = zipcode;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public Integer getAge() {
            return age;
        }

        public Gender getGender() {
            return gender;
        }

        public String getZipcode() {
            return zipcode;
        }
    }
}
