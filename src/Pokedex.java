public class Pokedex {
    public static void main(String[] args) throws Exception {
        Eevee e = new Eevee();
        Jolteon j = new Jolteon();

        System.out.println("Eu sou Eevee");
        System.out.println("Ataque: "+ e.ataque());
        System.out.println("defesa: "+ e.defesa());
        System.out.println("especial: "+ e.especial());

        System.out.println(" ");

        System.out.println("Eu sou Jolteon");
        System.out.println("Ataque: "+ j.ataque());
        System.out.println("defesa: "+ j.defesa());
        System.out.println("especial: "+ j.especial());
    
     e=j;
     System.out.println("Eu sou Eevee");
     System.out.println("Ataque: "+ e.ataque());
     System.out.println("defesa: "+ e.defesa());
     System.out.println("especial: "+ e.especial());
}
}
