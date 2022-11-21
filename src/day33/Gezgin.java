package day33;

public class Gezgin {
    private int[] gidilenYol;

    public int[] getYolListesi(){
        return gidilenYol;
    }
    public int addYol(int km){
        if (gidilenYol==null){
            gidilenYol=new int[1];
            gidilenYol[0]=km;
        }else {
            int[] tmp=new int[gidilenYol.length];
            for (int i = 0; i < gidilenYol.length; i++) {
                tmp[i]=gidilenYol[i];
            }
            gidilenYol=new int[gidilenYol.length+1];
            for (int i = 0; i < tmp.length; i++) {
                gidilenYol[i]=tmp[i];
            }
            gidilenYol[gidilenYol.length-1]=km;
        }
        int toplam=0;
        for (int i = 0; i < gidilenYol.length; i++) {
            toplam+=gidilenYol[i];
        }
        return toplam;
    }
}
