package be;
public class logeobe {
    private int id_logeo;
    private String nomb_logeo;
    private String ape_logeo;
    private int dni_logeo;
    private String pass_logeo;
    private String conf_pass_logeo;
    private String correo_logeo;
    private int  telf_logeo;

    public logeobe() {
    }

    public logeobe(int id_logeo, String nomb_logeo, String ape_logeo, int dni_logeo, String pass_logeo, String conf_pass_logeo, String correo_logeo, int telf_logeo) {
        this.id_logeo = id_logeo;
        this.nomb_logeo = nomb_logeo;
        this.ape_logeo = ape_logeo;
        this.dni_logeo = dni_logeo;
        this.pass_logeo = pass_logeo;
        this.conf_pass_logeo = conf_pass_logeo;
        this.correo_logeo = correo_logeo;
        this.telf_logeo = telf_logeo;
    }

    public int getId_logeo() {
        return id_logeo;
    }

    public void setId_logeo(int id_logeo) {
        this.id_logeo = id_logeo;
    }

    public String getNomb_logeo() {
        return nomb_logeo;
    }

    public void setNomb_logeo(String nomb_logeo) {
        this.nomb_logeo = nomb_logeo;
    }

    public String getApe_logeo() {
        return ape_logeo;
    }

    public void setApe_logeo(String ape_logeo) {
        this.ape_logeo = ape_logeo;
    }

    public int getDni_logeo() {
        return dni_logeo;
    }

    public void setDni_logeo(int dni_logeo) {
        this.dni_logeo = dni_logeo;
    }

    public String getPass_logeo() {
        return pass_logeo;
    }

    public void setPass_logeo(String pass_logeo) {
        this.pass_logeo = pass_logeo;
    }

    public String getConf_pass_logeo() {
        return conf_pass_logeo;
    }

    public void setConf_pass_logeo(String conf_pass_logeo) {
        this.conf_pass_logeo = conf_pass_logeo;
    }

    public String getCorreo_logeo() {
        return correo_logeo;
    }

    public void setCorreo_logeo(String correo_logeo) {
        this.correo_logeo = correo_logeo;
    }

    public int getTelf_logeo() {
        return telf_logeo;
    }

    public void setTelf_logeo(int telf_logeo) {
        this.telf_logeo = telf_logeo;
    }
   
    

}