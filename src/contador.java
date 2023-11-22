public class contador {

    // dos variables, una almacena el valor por el cual se parte, otra el valor que se expone a ser modificado a lo largo del tiempo
    private int startNumber;
    private int number;

    public contador() {
        this.startNumber =0;
        this.number = 0;
    }

    // un parametro que sirva para base para el valor incial y el numero que experimenta las modificaciones
    public contador(int start) {
        this.startNumber = start;
        this.number = start;
    }

    // Constructor copia,  crea un objeto en base a otro objeto sin alterar el original
    public contador(contador other) {
        this.startNumber = other.startNumber;
        this.number = other.number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getStartNumber() {
        return startNumber;
    }

    public void setStartNumber(int startNumber) {
        this.startNumber = startNumber;
    }

     // metodo para modificar el valor numero añadiendo como parametro el numero que significa el valor que se va a sumar a atributo number
    public String add(int aumentar){
        int initial = this.number;
        this.number += aumentar;

        return "El valor inicial era de "+ initial+" y al aumentar "+aumentar+" el valor paso a ser: "+ this.number;
    }

    // metodo para modificar el valor sin añadir parametro y aumentnado dos por defecto
    public String add(){
        int initial = this.number;
        this.number += 2;

        return "El valor inicial era de "+ initial+" y al aumentar "+2+" el valor paso a ser: "+ this.number;
    }

    // metodo para modificar el valor numero añadiendo como parametro el numero que significa el valor que se va a restar a atributo number
    public String rest(int valorARestar){
        int initial = this.number;
        this.number -= valorARestar;

        return "El valor inicial era de "+ initial+" y al restar "+valorARestar+" el valor paso a ser: "+ this.number;
    }

    // metodo para modificar el valor sin añadir parametro y restando dos por defecto
    public String rest(){
        int initial = this.number;
        this.number -= 2;

        return "El valor inicial era de "+ initial+" y al restar "+2+" el valor paso a ser: "+ this.number;
    }
}
