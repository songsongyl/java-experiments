package example07;

import com.example05.S;

public class Botton extends View{
private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Botton(String name) {
        this.name = name;
    }
}
