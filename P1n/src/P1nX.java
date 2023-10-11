public class P1nX {
    public static void main(String[] args) {
        Pessoa[] pessoas;
        pessoas = new Pessoa[10];
        //pessoas[0] = new Pessoa("Rafael","Manteiga",3,6,1999,17183623742L,60,1.70f);
        //System.out.println(pessoas[0].toString());
        pessoas[1] = new Homem("Gabriel", "Manteiga", 3, 6, 1999, 17183653730L, 80, 1.80f);
        System.out.println(pessoas[1].toString());
    }
}
