public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("A Tv está ligada?  " + smartTv.ligada);
        System.out.println("Qual canal atual : " + smartTv.canal);
        System.out.println("Qual altura do volume : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status A Tv está ligada?  " + smartTv.ligada);


        smartTv.aumentarVolume();
        System.out.println("Novo volume: " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Novo volume: " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Novo canal: " + smartTv.canal);
      

        smartTv.desligar();
        System.out.println("Novo status A Tv está ligada?  " + smartTv.ligada);

    }
}
