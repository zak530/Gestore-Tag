public class Test{
    public static void main(String args[]){
        Core c = new Core();
        System.out.println(c);

        Tag borsa = new Tag();
        borsa.setDescrizione("Borsa");
        borsa.setPosizione(3.4,2,5.5);
        Tag chiavi = new Tag();
        chiavi.setDescrizione("Chiavi");
        chiavi.setPosizione(3.4,2,5.5);

        
        c.aggiungiAggiorna(borsa);
        c.aggiungiAggiorna(chiavi);
        System.out.println(c);      

        borsa.setDescrizione("Borsa Blu");
        c.aggiungiAggiorna(borsa);
        
        System.out.println(c);

        c.elimina(borsa);
        System.out.println(c);

        Tag telefono = new Tag();
        telefono.setDescrizione("Iphone 19");
        telefono.setPosizione(3.4,2,5.5);
        c.aggiungiAggiorna(telefono);

        Tag portafoglio = new Tag();
        portafoglio.setDescrizione("portafoglio nero contenente 100$");
        portafoglio.setPosizione(3.4,2,5.5);
        c.aggiungiAggiorna(portafoglio);



        System.out.println(c);

        System.out.println("Finito!");
    }
}