import java.util.Scanner;

public class MudancaClimatica {
    public static void main(String[] args) {
        int dia = 0;
        int mes = 0;
        String ano = "";
        String semana = "";
        double temperatura;
        double somaTemperatura = 0;

        double menor = 999;
        double maior = 0;
        double media = 0;

        double auxMaior = 0;
        double auxMenor = 0;
        
        double diaQuente = 0;


        Scanner ler = new Scanner(System.in);

    //Dezembro, Janeiro, Fevereiro: 24ºC
    //Março, Abril, Maio: 20ºC
    //Junho, Julho, Agosto: 18ºC
    //Setembro, Outubro, Novembro: 23ºC


    System.out.println("Digite o mes: ");
    mes=ler.nextInt();




        for(int i = 1; i <= 7; i++){

            switch (dia = i) {
                case 1:
                    semana = "Domingo";
                    break;
                case 2: 
                    semana = "Segunda-Feira";
                    break;
                case 3:
                    semana = "Terça-Feira";
                    break;
                case 4:
                    semana = "Quarta-Feira";
                    break;
                case 5:
                    semana = "Quinta-Feira";
                    break;
                case 6:
                    semana = "Sexta-Feira";
                    break;
                case 7:
                    semana = "Sábado";
                    break;
                
                default:
                    break;
            }
            System.out.println("Digite a temperatura de " + semana + ": ");
            temperatura=ler.nextDouble();

            somaTemperatura += temperatura;

            if(temperatura > maior){
                auxMaior = temperatura;
                maior = auxMaior;
                
                switch (mes) {
                    case 12:
                    case 1:
                    case 2:
                        if(temperatura > 24)
                        diaQuente++;
                        break;
            
                    case 3:
                    case 4:
                    case 5:
                        if(temperatura > 20)
                        diaQuente++;
                        break;
            
                    case 6:
                    case 7:
                    case 8:
                        if(temperatura > 18)
                        diaQuente++;
                        break;
            
                    case 9:
                    case 10:
                    case 11:
                        if(temperatura > 23)
                        diaQuente++;
                        break;
                    
                    default:
                        break;
                }
            }

            if(temperatura < menor){
                auxMenor = temperatura;
                menor = auxMenor;
            }

        }
        
        media = somaTemperatura/7;

        System.out.println("A média de temperatura foi: " + media + "°C");
        System.out.println("A maior temperatura foi: " + auxMaior + "°C");
        System.out.println("A menor temperatura foi: " + auxMenor + "°C");
        System.out.println("Quantidade de dias com temperatura acima da média: " + diaQuente);


    }
}
