public class igor
{
    public String name = "igor";
    boolean DeDeurIsDicht = false;


    public igor(String newName)
    {
        name = newName;
    }

    public void RoepNaam()
    {
        System.out.println(name);
    }

    public void DeDeurIsOpen() {

        if (DeDeurIsDicht == true) {

            System.out.println("De deur is dicht!");
            System.out.println("Controle: " + DeDeurIsDicht);
            System.out.println("Igor loopt naar de deur en doet de deur open");
        } else {
            System.out.println("De deur gaat nu open!");
            System.out.println("Controle: " + DeDeurIsDicht);
        }}
}