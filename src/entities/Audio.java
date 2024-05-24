package entities;
import java.util.Scanner;
public class Audio extends ElementoMultimediale implements Play{

    Scanner scan= new Scanner(System.in);
    //attributo aggiunto per la classe audio per regolare il volume
    public int volumeAudio;
    public int durata;
    //costruttore con il titolo del audio e il volume iniziale
    public Audio(String titolo,int volumeAudio, int durata) {
        super(titolo);
        this.volumeAudio=volumeAudio;
        this.durata=durata;

    }



//metodo per alzare il volume attraverso lo scanner
    public void alzaVolume(){
        System.out.println("Di quanto vuoi alzare il volume del audio?");
        int addVolume=scan.nextInt();
       volumeAudio=volumeAudio+addVolume;
        System.out.println("il volume del audio adesso è di "+volumeAudio);
    }
//metodo per abbassare il volume attraverso lo scanner
    public void abbassaVolume(){
        System.out.println("Quando vuoi abbassare l audio?");
        int menoVolume=scan.nextInt();
        volumeAudio=volumeAudio-menoVolume;
        System.out.println("il volume del audio adesso è di "+volumeAudio);
    }
@Override
    public void play(){
        String result="";
        for(int i=0;i<durata;i++){
            result+=titolo;

        }
        for(int i=0;i<volumeAudio;i++){
            titolon+="!";
        }

        System.out.println(titolon);


    }



}
