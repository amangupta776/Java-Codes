import java.util.Scanner;

public class armstronf {
    public static void main(String[] args) {
        int r,d=0;

for(int i=100;i<1000;i++){
    while(i>0){
int n=i;
        r=n%10;
        d=d+(r*r*r);
        n=n/10;
        }
        if(d==i){
            System.out.println(i+" is armstrong number");
        }
        else{
            System.out.println(i+" is not armstrong number");
        }
}

    }
}
