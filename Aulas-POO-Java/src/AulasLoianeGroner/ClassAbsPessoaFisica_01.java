package AulasLoianeGroner;

public abstract class ClassAbsPessoaFisica_01 extends ClassAbsCliente_01
{
    /* -------------- ÁREA DE ATRIBUTOS --------------- */
    // Atributos de Classe
    protected static long totalPF;

    // Atributos de Instância
    protected String cpfPF;
    protected String nomePF;
    protected String sobrenomePF;
    protected String dataNascimentoPF;
    protected EnumClasseSocialPF classeSocialPF;
    protected EnumSexoPF sexoPF;
    protected EnumEscolaridadePF escolaridadePF;
    protected EnumTipoPF tipoPF;

    /* -------------- ÁREA DE MÉTODOS --------------- */
    // Métodos Construtores
    protected ClassAbsPessoaFisica_01()
    {
        ClassAbsPessoaFisica_01.totalPF += 1;
    }

    // Métodos Especiais de Classe
    // Métodos Especiais de Instância
    // Métodos Setters e Getters
    public abstract void setCpfPF(String cpf);
    public abstract void setNomePF(String nome);
    public abstract void setSobrenomePF(String sobrenome);
    public abstract void setDataNascimentoPF(String data);
    public abstract void setClasseSocialPF(Enum classeSocial);
    public abstract void setSexoPF(Enum sexo);
    public abstract void setEscolaridadePF(Enum escolaridade);
    public abstract void setTipoPF(Enum tipo);
    public abstract String getCpfPF();
    public abstract String getNomePF();
    public abstract String getSobrenomePF();
    public abstract String getDataNascimentoPF();
    public abstract EnumClasseSocialPF getClasseSocialPF();
    public abstract EnumSexoPF getSexoPF();
    public abstract EnumEscolaridadePF getEscolaridadePF();
    public abstract EnumTipoPF getTipoPF();
}
