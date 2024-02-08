public class Usuario {
    
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.definirCanal(25);
        System.out.println("Canal Atual: " + smartTv.canal);


        System.out.println("Volume Atual: " +smartTv.volume);

       

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV Ligada? " + smartTv.ligada);
        
    }
}
