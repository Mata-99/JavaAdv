package Model;




import java.util.ArrayList;
import java.util.List;


public class Polaznik {

    private  Long polaznikId;
    private String ime;
    private  String prezime;


    public Polaznik() {
    }

    public Polaznik(String prezime, String ime) {
        this.prezime = prezime;
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public Long getPolaznikId() {
        return polaznikId;
    }

    public void setPolaznikId(Long polaznikId) {
        this.polaznikId = polaznikId;
    }


    }





