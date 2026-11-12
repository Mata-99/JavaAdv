package Model;



public class ProgramObrazovanja {


    private Long programObrazovanjaId;
    private int CSVET;
    private String naziv;
    public ProgramObrazovanja() {
    }

    public ProgramObrazovanja(int CSVET, String naziv) {
        this.CSVET = CSVET;
        this.naziv = naziv;
    }

    public ProgramObrazovanja(Long programObrazovanjaId, int CSVET, String naziv) {
        this.programObrazovanjaId = programObrazovanjaId;
        this.CSVET = CSVET;
        this.naziv = naziv;
    }
}
