import java.util.Scanner;
public class monster {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
   
    int n=sc.nextInt();
    int e=sc.nextInt(); 
    int power[]= new int[n];
    int bonus[]= new int[n];
    for(int i=0;i<n;i++){
        power[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
        bonus[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
    
        if(e<power[i]){
            break;
        }
        else{
            System.out.println("Defeat the monster");
            e=e+bonus[i];
        }
    }
    System.out.println(n);
}
}
