public class Person {

    private String name; // instance property



    public String getName(){
//TODO: return the person's name
        return name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        Person onePerson = new Person();
        onePerson.name = "Bobby";
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hey "+ this.name);
    }


}

