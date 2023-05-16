package cadastro_pessoa;

public class Teste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Victor");
        pessoa.setNome_Pai("Leonardo");
        pessoa.setNome_Mae("Ana Paula");

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Nome da mamae: " + pessoa.getNome_Mae());
        System.out.println("Nome do papai: " + pessoa.getNome_Pai());

        pessoa.setDia(12);
        pessoa.setMes(5);
        pessoa.setAno(2004);

        System.out.println("Data de nascimento: " + pessoa.getDia() + "/" + pessoa.getMes() + "/" + pessoa.getAno());

        pessoa.setNacionalidade(Nacionalidade.BRASILEIRO);
        pessoa.setSexo(Sexo.MASCULINO);
        pessoa.setEstado_Civil(Estado_Civil.CASADO);

        System.out.println(pessoa.getNome() + " eh " + pessoa.getNacionalidade() + ", tem sexo " + pessoa.getSexo() + " e eh " + pessoa.getEstado_Civil() + " com uma linda madame.");
    }
}