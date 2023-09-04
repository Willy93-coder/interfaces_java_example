public class Student extends Person{

    // Attributes
    private String optional;
    private String classroom;

    // Constructor
    public Student(String name, String optional, String classroom) {
        super(name);
        this.optional = optional;
        this.classroom = classroom;
    }

    // Methods
    @Override
    public String getDescription() {
        return "El alumno " + this.getName() + " esta en el aula " + classroom +
                " y ha escogido la asignatura " + optional;
    }
}
