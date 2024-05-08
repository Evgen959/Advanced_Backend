public class Person {
        private String firstName;
        private String lastName;

        public Person(String firstName,String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        @java.lang.Override
        public String toString() {
            return  firstName + " " + lastName;
        }

        //Getter
        public String getFirstName(){
            return firstName;
        }
        //Setter
        public  void setFirstName(String firstName){
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
}

