import java.util.Scanner;
public class CuadradoPiramide {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
        int height=sc.nextInt();

        for(int i=0;i<=height+1;i++){
            String line="";

            if(i==0 || i== height+1){
                for(int j=0;j<(height*2+1);j++){
                    line+="*";
                }
                System.out.printf("*%s*",line);
            }else{
                for(int j=0;j<(i*2-1);j++){
                    line+="*";
                }
                System.out.printf("*%" + (height-i+1) + "s%s%" + (height-i+1) + "s*", "",line,"");
            }
            System.out.println();
        }

        sc.close();
        
    }

}
