import java.util.ArrayList;
import java.util.Scanner;

public class Kitap {
    public String adi;
    public String yazari;
    public String yili;
    public int fiyat;

    public Kitap() {
    }

    public Kitap(String adi, String yazari, String yili, int fiyat) {
        this.adi = adi;
        this.yazari = yazari;
        this.yili = yili;
        this.fiyat = fiyat;
    }

    ArrayList<Object> kitapList=new ArrayList<Object>();


    public void  kitapekle(){

        Scanner a=new Scanner(System.in);
        System.out.println("kitap adi / kitap yazari / kitap yayin yili " );
        int i=0;
            kitapList.add(i,a.nextLine()+"  kitap numarasi= "+(1001+i) );
            System.out.println("kitabiniz eklendi " + kitapList);
        i++;

    }
    public void kitapSil(){

        Scanner b=new Scanner(System.in);
        System.out.println("silmek istenilen kitap no= ");
        kitapList.remove(b.nextInt()-1001);
        System.out.println(b.nextInt() + " sayilli kitap silindi ");


    }
    public void kitapAra(){

        Scanner c=new Scanner(System.in);
        System.out.println("aramak istenilen kitap no= ");
        System.out.println(kitapList.get(c.nextInt()-1001));

    }
    public void kitapGor(){

        for(int i = 0; i< kitapList.size(); i++){
            System.out.println(kitapList.get(i));
        }System.out.println("toplam " + kitapList.size());

    }
    public void giris(){
        String islemler="=====KITAP PROGRAMI======\n"
                + "1:kitap ekleme\n"
                + "2:numara ile kitap sil\n"
                + "3:numara ile kitap ara\n"
                + "4:tumunu listele\n"
                + "5:cikis";
        System.out.println(islemler);
    }




}
