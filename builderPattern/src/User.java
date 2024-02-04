public class User{

    //Vince Ted Matthew D. Chua
    //February 04th, 2024
    //gather materials //setting up
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String address;
    private final Integer phone;
    private final Integer age;

    private User (UserBuilder myUser) {
//imports //sets
        this.firstName = myUser.firstName;
        this.lastName = myUser.lastName;
        this.email = myUser.email;
        this.address = myUser.address;
        this.phone = myUser.phone;
        this.age = myUser.age;
    }

    //constructs
    public static class UserBuilder {
        private String firstName;
        private String lastName;
        private String email;
        private String address;
        private Integer phone;
        private Integer age;

        //Set the types
        public UserBuilder (String firstName) {
            this.firstName = firstName;
            //calls the data sets
        }
        public UserBuilder lastName (String lastName) {
            this.lastName = lastName;
            return this;
        }
        public UserBuilder email (String email) {
            this.email = email;
            return this;
        }
        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }
        public UserBuilder phone (Integer phone) {
            this.phone = phone;
            return this;
        }
        public UserBuilder age (Integer age) {
            this.age = age;
            return this;
        }
        //this condition explains if all of the given information are null
        //Optional Fields will be acquired
        //Registration forms are also in order
        public User build() {
            if (firstName == null || firstName.isEmpty() ||
                 lastName == null || lastName.isEmpty() ||
                    email == null || email.isEmpty()  ||
                    address == null || address.isEmpty() ||
                    phone == null  || age == null) {
                throw new IllegalStateException("Information cannot be blank (null), Please input the necessary information, Thank you.");
            } //it will print this out
            return new User(this);
            // this will return all the user input if all fields
            //are non-null = meaning filled out.
        }

    }
//getters & setters
//Initially I had setters but removing it based on my readings, will help a step to making code
//more immutable or immutable in the sense UNCHANGEABLE.

    public String getName() {
        return firstName;

    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;

    }


    public String getAddress() {
        return address;
    }


    public Integer getPhone() {
        return phone;
    }

    public Integer getAge() {
        return age;
    }


}
