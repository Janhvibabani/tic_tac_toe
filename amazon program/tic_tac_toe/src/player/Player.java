package player;

public class Player {
    private String name;
    private int age;
    private String address;
    private String contact_number;
    private String email;
    private char symbol;

    public void setPlayerDetails(String name, int age, String address, String contact_number, String email, char symbol)
    {
        this.name=name;
        this.age=age;
        this.address=address;
        this.contact_number=contact_number;
        this.email=email;
        this.symbol=symbol;
    }

    public void setPlayerNameAndAge(String name, char age)
    {
        this.name=name;
        this.age=age;
    }

    public void setPlayerNameSymbolEmailIdAge(String name, char symbol, String email, int age)
    {
        this.name=name;
        this.symbol=symbol;
        this.email=email;
        this.age=age;
    }
    public void changeSymbol(char symbol)
    {
        this.symbol=symbol;
    }
    public void setPlayerNameAndSymbol(String name, char symbol)
    {
        this.name=name;
        this.symbol=symbol;
    }
    public String getPlayerName()
    {
        return this.name;
    }
    public char getPlayerSymbol()
    {
        return symbol;
    }
    public void getPlayerNameAndSymbol()
    {
        System.out.println("Player's Name: "+this.name);
        System.out.println("Player's Symbol: "+this.symbol);
    }
    public void getPlayerDetails()
    {
        System.out.println("Player's Name: "+this.name);
        System.out.println("Player's Symbol: "+this.symbol);
        System.out.println("Player's EmailId: "+ this.email);
        System.out.println("Player's age: "+this.age);
        System.out.println("Player's address: "+this.address);
        System.out.println("Player's contact_number: "+contact_number);
    }
}
