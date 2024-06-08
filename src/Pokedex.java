public class Pokedex {
    public static void main(String[] args) throws Exception {
        Eevee e = new Eevee();
        Jolteon j = new Jolteon();
        Espeon es = new Espeon();
        Floreon f = new Floreon();
        Glaceon g = new Glaceon ();
        Leafeon l = new Leafeon();
        Sylveon s = new Sylveon();
        Umbreon u = new Umbreon();
        Vaporeon v = new Vaporeon();


        System.out.println("Eu sou Eevee");
        System.out.println("Ataque: "+ e.ataque());
        System.out.println("defesa: "+ e.defesa());
        System.out.println("especial: "+ e.especial());

        System.out.println(" ");

        System.out.println("Eu sou Vaporeon");
        System.out.println("Ataque: "+ v.ataque());
        System.out.println("defesa: "+ v.defesa());
        System.out.println("especial: "+ v.especial());

        System.out.println(" ");

        System.out.println("Eu sou Umbreon");
        System.out.println("Ataque: "+ u.ataque());
        System.out.println("defesa: "+ u.defesa());
        System.out.println("especial: "+ u.especial());

        System.out.println(" ");

        System.out.println("Eu sou Sylveon");
        System.out.println("Ataque: "+ s.ataque());
        System.out.println("defesa: "+ s.defesa());
        System.out.println("especial: "+ s.especial());

        System.out.println(" ");

        System.out.println("Eu sou Leafeon");
        System.out.println("Ataque: "+ l.ataque());
        System.out.println("defesa: "+ l.defesa());
        System.out.println("especial: "+ l.especial());

        System.out.println(" ");

        System.out.println("Eu sou Glaceon");
        System.out.println("Ataque: "+ g.ataque());
        System.out.println("defesa: "+ g.defesa());
        System.out.println("especial: "+ g.especial());

        System.out.println(" ");

        System.out.println("Eu sou Floreon");
        System.out.println("Ataque: "+ f.ataque());
        System.out.println("defesa: "+ f.defesa());
        System.out.println("especial: "+ f.especial());

        System.out.println(" ");

        System.out.println("Eu sou Espeon");
        System.out.println("Ataque: "+ es.ataque());
        System.out.println("defesa: "+ es.defesa());
        System.out.println("especial: "+ es.especial());

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
