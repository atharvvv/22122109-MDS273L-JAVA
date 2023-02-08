import java.util.Scanner;



public class LAB2 {
    
    public static void main(String[] args) {

        
        String[] names = new String[1048];
        int k = 0;
        int c =0;
        Scanner scan = new Scanner(System.in);
       

        do{
            System.out.println("1.Enter a name  ");
            System.out.println("2. Remove the name");
            System.out.println("3.Search for name");
            System.out.println("4.Search all name");
    
           
            System.out.print("Enter option you want ");

           
            Scanner myobj= new Scanner(System.in); 
            int Usersdetails = Integer.parseInt(myobj.nextLine());
                    switch(Usersdetails){
                        case 1:
                            int key = 1;
                            System.out.println("Enter your name ");
                            String name = scan.nextLine();
                            for(int i = 0;i<=c;i++){
                                if(names[i] == null) break;
                                if(names[i].equals(name)){
                                    key =0;
                                    System.out.println("this name already exist");
                                }
                            }
                            if(key == 1){
                                names[c] = name;
                                c++;
                            }
                                                        
                            
                            break;
                                      
                                        
                        case 2:
                        System.out.println("Enter the element to delete");
                        String name3 = myobj.nextLine();
                        int m=0;
                        for(int i =0; i<c;i++){
                            if(names[i].equals(name3)){
                                System.out.println("Element remove ");
                                m=1;

                            }
                            names[i] = names[i+m];
                        }
                            break;
                        
            
                        case 3:
                            System.out.println("Enter the name you want to search ");
                            String name2 = myobj.nextLine();
                            for(int i =0; i<c;i++)
                            {
                                if(names[i].equals(name2)){
                                    System.out.println("Name  exists at " +names[i] + " index " + +i);
                                }
                           
                        } break;
                         case 4 : 
                            for(int i =0; i<c;i++){

                                if(names[i] == null) break;
                                else{
                                    System.out.println(names[i]);
                                }
                                 
                            }
                               
                         }
                                     
                        System.out.println("do you want to continue press 1 or 0  ");

                        k = Integer.parseInt(myobj.nextLine());
                        } while(k==1);
                    } 
            
            
       
       
        
    }

    





   