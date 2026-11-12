import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    private static final String CONNECTION_STRING = (
            "jdbc:sqlserver://localhost:1433;" +
                    "databaseName=JavaAdv;" +
                    "user=sa;" +
                    "password=sql;" +
                    "trustServerCertificate=true;"
    );
    static Scanner unos = new Scanner(System.in);

    public static void main(String[] args) {


        int izbor;

        do {
            System.out.println("1.Unesite novog polaznika");
            System.out.println("2.Unesite novi program obrazovanja");
            System.out.println("3.Upisi polaznika na program obrazovanja");
            System.out.println("4.Prebaci polaznika iz jednog u drugi program obrazovanja");
            System.out.println("5.Ispisite podatke o polazniku");
            System.out.println("0. Izlaz");
            System.out.println("Odabir: ");

            izbor = Integer.parseInt(unos.nextLine());


            switch (izbor) {
                case 1:
                    unesiPolaznika();
                    break;

                case 2:
                    unesiPo();
                    break;

                case 3:
                    upisiPolaznika();
                    break;

                case 4:
                    prebaciPolaznika();
                    break;

                case 5:
                    ispisiPolaznika();
                    break;

                case 0:
                    System.out.println("Dovidjenja!");
                    break;
                default:
                    System.out.println("Neispravan unos");

            }
        } while (izbor != 0);

    }

    private static void unesiPolaznika() {

        System.out.println("Unesite ime polaznika: ");
        String ime = unos.nextLine();
        System.out.println("Unesite prezime polaznika: ");
        String prezime = unos.nextLine();

        String sql = "INSERT INTO Polaznik (Ime, Prezime) VALUES (?, ?)";
        try (Connection connection = DriverManager.getConnection(CONNECTION_STRING);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, ime);
            preparedStatement.setString(2, prezime);

            preparedStatement.executeUpdate();

            System.out.println("Polaznik uspjesno dodan!");

        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private static void unesiPo(){
        System.out.println("Unesite program obrazovanja: ");
        String naziv = unos.nextLine();

        System.out.println("Unesite broj CSVET bodova: ");
        int csvet = Integer.parseInt(unos.nextLine());

        String sql = "INSERT INTO ProgramObrazovanja (naziv, csvet) VALUES(?, ?)";
        try(Connection connection = DriverManager.getConnection(CONNECTION_STRING);
        PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setString(1, naziv);
            preparedStatement.setInt(2, csvet);

            System.out.println("Program obrazovanja uspjesno dodan!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private static void upisiPolaznika(){
        System.out.println("Unesite ID polaznika: ");
        long polaznikId = Long.parseLong(unos.nextLine());

        System.out.println("Unesite ID programa: ");
        long programId = Long.parseLong(unos.nextLine());

        String sql = "INSERT INTO Upis (IDPolaznik, IDProgramObrazovanja) VALUES (?, ? )";

        try(Connection connection = DriverManager.getConnection(CONNECTION_STRING);
        PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setLong(1, polaznikId);
            preparedStatement.setLong(2, programId);

            System.out.println("Polaznik uspjesno upisan!");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    private static void prebaciPolaznika(){

    }
    private static void ispisiPolaznika(){

    }
}