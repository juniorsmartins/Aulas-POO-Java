package BootcampInterJavaDIO;


// Com lambda
public class AulaParadigma_Funcional_Lambda 
{
    public static void main(String[] args) 
    {
        Funcao colocarPrefixoSenhorNaString = (String valor) -> "Sr. " + valor;
        System.out.println(colocarPrefixoSenhorNaString.gerar("João"));
    }
}

@FunctionalInterface
interface Funcao 
{
    String gerar(String valor);
}


// Sem Lambda (com classe anônima)
//public class AulaParadigma_Funcional_Lambda 
//{
//    public static void main(String[] args) 
//    {
//        Funcao colocarPrefixoSenhorNaString = new Funcao()
//        {
//            @Override
//            public String gerar(String valor)
//            {
//                return "Sr. " + valor;
//            }
//        };
//        System.out.println(colocarPrefixoSenhorNaString.gerar("João"));
//    }
//}
//
//@FunctionalInterface
//interface Funcao 
//{
//    String gerar(String valor);
//}