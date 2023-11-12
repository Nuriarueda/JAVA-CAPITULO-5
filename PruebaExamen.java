import java.util.Scanner;
public class PruebaExamen{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
        System.out.print("Escribe el texto que quieres enviar: ");
        String texto=sc.nextLine();
        int longitudTexto= texto.length();
        int anchura=longitudTexto+4;
    
        int espaciosDerecha=anchura/2-1;

            //depende de si es impar se le suma uno y si es par se deja igual

            if(anchura%2!=0){
              
                for(int i=1;i<=(anchura/2)+1;i++){
                    System.out.print("* ");
                }
    
                System.out.println();
    
    
                for(int i=1;i<(anchura/4)+1;i++){
    
                    System.out.print("* ");
    
                    for(int j=1;j<=(anchura/2)-1;j++){
    
                        if(i==j || espaciosDerecha==j){
                            System.out.print("* ");
                        }else{
                            System.out.print("  ");
                        }
                    }
                    espaciosDerecha--;
                    System.out.println("*");
                }
    
                for(int i=1;i<=anchura/2+1;i++){
                    System.out.print("* ");
                }
                
                System.out.println();
    
                System.out.printf("* %"+(anchura-longitudTexto)/2+"s",texto);

                for(int i=1;i<=((anchura-longitudTexto)/2-1);i++){
                    System.out.print(" ");
                }

                System.out.println("*");
    
                for(int i=1;i<=anchura/2+1;i++){
                    System.out.print("* ");
                }

            }else{

                anchura--;

                if(anchura/2<=3){
                    for(int i=1;i<=(anchura/2)+1;i++){
                        System.out.print("* ");
                    }

                    System.out.println();

                    for(int i=1;i<(anchura/4)+1;i++){

                        System.out.print("* ");

                        for(int j=1;j<=(anchura/2)-1;j++){

                            if(i==j || espaciosDerecha==j-1){
                                System.out.print("* ");
                            }else{
                                System.out.print("  ");
                            }
                        }
                        espaciosDerecha--;
                        System.out.println("*");
                    }

                    for(int i=1;i<=anchura/2+1;i++){
                        System.out.print("* ");
                    }
                    
                    System.out.println();
                    

                    System.out.printf("* %"+((anchura-longitudTexto+2)/2+1)+"s",texto);

                    for(int i=1;i<=((anchura-longitudTexto)/2);i++){
                        System.out.print(" ");
                    }

                    System.out.println("*");

                    for(int i=1;i<=anchura/2+1;i++){
                        System.out.print("* ");
                    }



                }else{


                    if(anchura/2==6 || anchura/2==8){

                        for(int i=1;i<=(anchura/2)+2;i++){
                            System.out.print("* ");
                        }

                        System.out.println();


                        for(int i=1;i<(anchura/4)+2;i++){

                            System.out.print("* ");

                            for(int j=1;j<=(anchura/2)+1;j++){

                                if(i==j || espaciosDerecha==j-1){
                                    System.out.print("* ");
                                }else{
                                    System.out.print("  ");
                                }
                            }
                            espaciosDerecha--;
                            System.out.println("*");
                        }

                        for(int i=1;i<=anchura/2+2;i++){
                            System.out.print("* ");
                        }
                        
                        System.out.println();
                        

                        System.out.printf("*  %"+((anchura-longitudTexto+2)/2+1)+"s",texto);

                        for(int i=1;i<=((anchura-longitudTexto)/2+2);i++){
                            System.out.print(" ");
                        }

                        System.out.println("*");

                        for(int i=1;i<=anchura/2+2;i++){
                            System.out.print("* ");
                        }

                    }else{

                        for(int i=1;i<=(anchura/2)+3;i++){
                            System.out.print("* ");
                        }

                        System.out.println();


                        for(int i=1;i<(anchura/4)+2;i++){

                            System.out.print("* ");

                            for(int j=1;j<=(anchura/2)+1;j++){

                                if(i==j || espaciosDerecha==j-1){
                                    System.out.print("* ");
                                }else{
                                    System.out.print("  ");
                                }
                            }
                            espaciosDerecha--;
                            System.out.println("*");
                        }

                        for(int i=1;i<=anchura/2+3;i++){
                            System.out.print("* ");
                        }
                        
                        System.out.println();
                        

                        System.out.printf("*  %"+((anchura-longitudTexto+2)/2+1)+"s",texto);

                        for(int i=1;i<=((anchura-longitudTexto)/2+2);i++){
                            System.out.print(" ");
                        }

                        System.out.println("*");

                        for(int i=1;i<=anchura/2+3;i++){
                            System.out.print("* ");
                        }

                    }

                }
            }

        sc.close();
        }
    
	}
