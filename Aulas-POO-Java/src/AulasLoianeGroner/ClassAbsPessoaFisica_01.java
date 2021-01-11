package AulasLoianeGroner;

import java.util.Date;
import java.text.SimpleDateFormat;

public abstract class ClassAbsPessoaFisica_01 extends ClassAbsCliente_01
{
    /* -------------- ÁREA DE ATRIBUTOS --------------- */
    // Atributos de Classe
    protected static long totalPF;

    // Atributos de Instância
    protected String dataPF;
    protected String idPF;
    protected String cpfPF;
    protected String nomePF;
    protected String sobrenomePF;
    protected String dataNascimentoPF;
    protected String classeSocialPF;
    protected String sexoPF;
    protected String escolaridadePF;
    protected String tipoPF;

    /* -------------- ÁREA DE MÉTODOS --------------- */
    // Métodos Construtores
    protected ClassAbsPessoaFisica_01()
    {
        ClassAbsPessoaFisica_01.setTotalPF();
        this.setDataPF();
        this.setIdPF();
    }

    // Métodos Especiais de Classe
    protected static void setTotalPF()
    {
        ClassAbsPessoaFisica_01.totalPF += 1;
    }
    public static long getTotalPF()
    {
        return ClassAbsPessoaFisica_01.totalPF;
    }

    // Métodos Especiais de Instância
    // Métodos Setters e Getters
    protected void setDataPF()
    {
        Date data = new Date();
        SimpleDateFormat formatarData = new SimpleDateFormat("ddMMyyyy");
        this.dataPF = formatarData.format(data);
    }
    protected void setIdPF()
    {
        this.idPF = (this.getDataPF() + "-" + ClassAbsCliente_01.getTotalClientes() + "." + ClassAbsPessoaFisica_01.getTotalPF());
    }
    public void setCpfPF(String cpf)
    {
        this.cpfPF = cpf;
    }
    public void setNomePF(String nome)
    {
        this.nomePF = nome;
    }
    public void setSobrenomePF(String sobrenome)
    {
        this.sobrenomePF = sobrenome;
    }
    public void setDataNascimentoPF(String data)
    {
        this.dataNascimentoPF = data;
    }
    public void setClasseSocialPF(String classeSocial)
    {
        this.classeSocialPF = classeSocial;
    }
    public void setSexoPF(String sexo)
    {
        this.sexoPF = sexo;
    }
    public void setEscolaridadePF(String escolaridade)
    {
        this.escolaridadePF = escolaridade;
    }
    public void setTipoPF(String tipo)
    {
        this.tipoPF = tipo;
    }

    public String getDataPF()
    {
        return this.dataPF;
    }
    public String getIdPF()
    {
        return this.idPF;
    }
    public String getCpfPF()
    {
        return this.cpfPF;
    }
    public String getNomePF()
    {
        return this.nomePF;
    }
    public String getSobrenomePF()
    {
        return this.sobrenomePF;
    }
    public String getDataNascimentoPF()
    {
        return this.dataNascimentoPF;
    }
    public String getClasseSocialPF()
    {
        return this.classeSocialPF;
    }
    public String getSexoPF()
    {
        return this.sexoPF;
    }
    public String getEscolaridadePF()
    {
        return this.escolaridadePF;
    }
    public String getTipoPF()
    {
        return this.tipoPF;
    }
}