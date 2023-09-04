public abstract class Person {

    // Attributes
    private String name;

    // Constructors
    public Person(String name){
        this.name = name;
    }

    // Methods
    public String getName(){
        return name;
    }

    public abstract String getDescription();

}
