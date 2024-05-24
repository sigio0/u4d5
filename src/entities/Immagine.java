package entities;

public class Immagine extends ElementoMultimediale implements Show{
    public Immagine(String titolo,int luminositàImmagine) {
        super(titolo);
        this.luminositàImmagine=luminositàImmagine;
    }

    protected int luminositàImmagine;

    @Override
    public void show(){
        String titolon="";
        for(int i=0;i<luminositàImmagine;i++){
            titolon+="*";
        }
        System.out.println(titolon);
    }
}
