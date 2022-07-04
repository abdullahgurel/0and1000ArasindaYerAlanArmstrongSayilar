public class ucBasamakliArmstrongSayilariEkranaYazdirma {
    public static void main(String[] args) {
        int a=1000,b,c,d,e,f,g,h,sCounter=0;
        for(int i = 1;i<a;i++) {
            b = i%10;
            c = i/10;
            e = c/10;
            d = c%10;
            e = e*e*e;
            d = d*d*d;
            b = b*b*b;
            f = e+d+b;
            if (i==f) {
                System.out.print(i+",");
            }
        }
    }
}
