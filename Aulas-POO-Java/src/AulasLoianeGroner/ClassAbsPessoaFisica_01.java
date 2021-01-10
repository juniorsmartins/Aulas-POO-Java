package AulasLoianeGroner;

public abstract class ClassAbsPessoaFisica_01 extends ClassAbsCliente_01
{
    /* -------------- ÁREA DE ATRIBUTOS --------------- */
    // Atributos de Classe
    protected static long totalPF;

    // Atributos de Instância
    private String cpfPF;
    private String nomePF;
    private String sobrenomePF;
    private String dataNascimentoPF;
    private EnumClasseSocialPF classeSocialPF;
    private EnumSexoPF sexoPF;
    private EnumEscolaridadePF escolaridadePF;
    private EnumTipoPF tipoPF;

    /* -------------- ÁREA DE MÉTODOS --------------- */
    // Métodos Construtores
    protected ClassAbsPessoaFisica_01()
    {
        ClassAbsPessoaFisica_01.totalPF += 1;
    }

    // Métodos Especiais de Classe
    // Métodos Especiais de Instância
    // Métodos Setters e Getters    
}
