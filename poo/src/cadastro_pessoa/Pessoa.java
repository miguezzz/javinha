package cadastro_pessoa;

public class Pessoa {
    private String nome, nome_pai, nome_mae;
    private int dia, mes, ano;
    private Nacionalidade nacionalidade;
    private Sexo sexo;
    private Estado_Civil estado_civil;
    private double altura, peso;


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    //
    public String getNome_Pai() {
        return nome_pai;
    }
    public void setNome_Pai(String nome_pai)
    {
        this.nome_pai = nome_pai;
    }
    //
    public String getNome_Mae() {
        return nome_mae;
    }
    public void setNome_Mae(String nome_mae) {
        this.nome_mae = nome_mae;
    }
    //
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    //
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    //
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    //
    public Nacionalidade getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(Nacionalidade nacionalidade)
    {
        this.nacionalidade = nacionalidade;
    }
    //
    public Sexo getSexo() {
        return sexo;
    }
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    //
    public Estado_Civil getEstado_Civil() {
        return estado_civil;
    }
    public void setEstado_Civil(Estado_Civil estado_civil) {
        this.estado_civil = estado_civil;
    }
    //
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    //
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
}