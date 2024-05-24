package entities;
import java.util.Scanner;
public class Video extends ElementoMultimediale implements Play{
    public Video(String titolo,int volumeVideo,int luminositàVideo,int durata) {
        super(titolo);
        this.volumeVideo=volumeVideo;
        this.luminositàVideo=luminositàVideo;
        this.durataVideo=durata;
    }
Scanner sc= new Scanner(System.in);
    protected int durataVideo;
    protected int volumeVideo;
    protected int luminositàVideo;

    public void aumentaLuminosità(){
        System.out.println("di quando vuoi aumentare la luminosità?");
        int addLuminosità=sc.nextInt();
        luminositàVideo+=addLuminosità;
        System.out.println("la luminosità dei video adesso è di "+this.luminositàVideo);
    }

    public void abbassaLuminosità(){
        System.out.println("di quanto vuoi abbassare la luminosità?");
        int menoLuminositò=sc.nextInt();
        luminositàVideo-=menoLuminositò;
        System.out.println("la luminosità del video adesso è di "+this.luminositàVideo);
    }
@Override
    public void play(){
        String titolon="";
for(int i=0;i<durataVideo;i++){
    titolon+=titolo;
}

for(int i=0;i<volumeVideo;i++){
    titolon+="!";
}

for(int i=0;i<luminositàVideo;i++){
    titolon+="*";
}
    System.out.println(titolon);
    }

}
