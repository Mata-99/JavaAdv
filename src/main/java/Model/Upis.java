package Model;

 class Upis {

    private Long UpisId;
    private int IdProgramObrazovanja;
    private int CSVET;

    public Upis() {
    }

    public Upis(int idProgramObrazovanja, int CSVET) {
        IdProgramObrazovanja = idProgramObrazovanja;
        this.CSVET = CSVET;
    }

    public Long getUpisId() {
        return UpisId;
    }

    public void setUpisId(Long upisId) {
        UpisId = upisId;
    }

    public int getIdProgramObrazovanja() {
        return IdProgramObrazovanja;
    }

    public void setIdProgramObrazovanja(int idProgramObrazovanja) {
        IdProgramObrazovanja = idProgramObrazovanja;
    }

    public int getCSVET() {
        return CSVET;
    }

    public void setCSVET(int CSVET) {
        this.CSVET = CSVET;
    }
}

