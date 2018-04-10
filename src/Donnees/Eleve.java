package Donnees;

class Eleve {
    private int id;
    private String nom;
    private String prenom;
    private Double noteMiSession;
    private Double noteProjet;
    private Double noteExamenFinal;
    private boolean situation;

    public Eleve() {
        this.id = 0;
        this.nom = "";
        this.prenom = "";
        this.noteMiSession = 0.0;
        this.noteProjet = 0.0;
        this.noteExamenFinal = 0.0;
        this.situation = false;
    }

    public Eleve(int id, String nom, String prenom, Double noteMiSession, Double noteProjet, Double noteExamenFinal, boolean situation) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.noteMiSession = noteMiSession;
        this.noteProjet = noteProjet;
        this.noteExamenFinal = noteExamenFinal;
        this.situation = situation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Double getNoteMiSession() {
        return noteMiSession;
    }

    public void setNoteMiSession(Double noteMiSession) {
        this.noteMiSession = noteMiSession;
    }

    public Double getNoteProjet() {
        return noteProjet;
    }

    public void setNoteProjet(Double noteProjet) {
        this.noteProjet = noteProjet;
    }

    public Double getNoteExamenFinal() {
        return noteExamenFinal;
    }

    public void setNoteExamenFinal(Double noteExamenFinal) {
        this.noteExamenFinal = noteExamenFinal;
    }

    public boolean getSituation() {
        return situation;
    }

    public void setSituation(boolean situation) {
        this.situation = false;
    }

    @Override
    public String toString() {
        return "Eleve {" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", noteMiSession=" + noteMiSession +
                ", noteProjet=" + noteProjet +
                ", noteExamenFinal=" + noteExamenFinal +
                ", situation='" + situation + '\'' +
                '}';
    }
}
