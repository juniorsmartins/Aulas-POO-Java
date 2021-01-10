package AulasLoianeGroner;

public abstract class ClassAbsPessoaJuridica_01 extends ClassAbsCliente_01
{
    /* -------------- ÁREA DE ATRIBUTOS --------------- */
    // Atributos de Classe
    protected static long totalPJ;

    // Atributos de Instância
    private String cnpjPJ;
    private String razaoSocialPJ;
    private String nomeFantasiaPJ;
    private String dataAberturaPJ;
    private EnumSetorEconomicoPJ setorEconomicoPJ;
    private EnumPortePJ portePJ;
    private EnumTipoPJ tipoPJ;

    /* -------------- ÁREA DE MÉTODOS --------------- */
    // Métodos Construtores
    protected ClassAbsPessoaJuridica_01()
    {
        ClassAbsPessoaJuridica_01.totalPJ += 1;
    }

    // Métodos Especiais de Classe
    // Métodos Especiais de Instância
    // Métodos Setters e Getters  
}
