public class OrtalamaBulma {
    public static float ortalamaBulanFonksiyon(int [] dizi){
        int toplam=0;
        for (int i =0; i<dizi.length;i++){
            toplam+=dizi[i];
        }

        float ortalama =(float) toplam / dizi.length;

        return ortalama;
    }

    public static void main(String[] args) {
        OrtalamaBulma ortalamabul = new OrtalamaBulma();

        int [] deger1={1,2};
        int [] deger2={1,2,3};
        int [] deger3={1,2,3,4};
        System.out.println( ortalamabul.ortalamaBulanFonksiyon(deger1));  // 20
        System.out.println( ortalamabul.ortalamaBulanFonksiyon(deger2));  // 30
        System.out.println( ortalamabul.ortalamaBulanFonksiyon(deger3));  // 40


    }



}
