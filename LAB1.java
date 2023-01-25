import java.util.Scanner;

public class LAB1 {
    public static void main(String[] args) {
        Scanner newobj = new Scanner(System.in);
        System.out.print("Enter your name ");
        String name  = newobj.nextLine();
        System.out.print("Enter your Age ");
      
        int Age = Integer.parseInt(newobj.nextLine());
        System.out.print("Enter your class ");
        String myclass = newobj.nextLine();
        System.out.println("Write m if you are male \n or Write f if you are female");

        char mygender = newobj.nextLine().charAt(0);
        System.out.println("Enter the state");
        String state = newobj.nextLine();

       
       

        System.out.println("********* Users details******************");

        System.out.println("Users name is " +name);
        System.out.println("Users Age is " +Age);
        System.out.println("Users class is " +myclass);
        System.out.println("Users State is " +state);


    

        if(mygender == 'm'){
            System.out.println( "Gender : Male");

        }else if(mygender == 'f'){
            System.out.println("Gender : Female");
        }else{
            System.out.println("please enter m or f only");
        }

      


    
      
        switch(state){
            case "Chandigarh" :{
                System.out.println("Region : North");
                break;
            }

            case "Delhi":{
                System.out.println("Region : North");
                break;
            }

            case "Haryana":{
                System.out.println("Region : North");
                break;
            }
            case "Jammu kashmir":{
                System.out.println("Region : North");
                break;
            }
            case "Karnataka":{
                System.out.println("Region : South");
                break;
            }
            case "Kerala":{
                System.out.println("Region : South");
                break;
            }
            case "Andhra Pradesh":{
                System.out.println("Region : South");
                break;
            }
            case "Telangana":{
                System.out.println("Region : South");
                break;
            }
            case "Arunachal Pradesh":{
                System.out.println("Region : East");
                break;
            }
            case "Mizoram":{
                System.out.println("Region : East");
                break;
            }
            case "Odisha":{
                System.out.println("Region : East");
                break;
            }
            case "Jharkhand":{
                System.out.println("Region : East ");
                break;
            }
            case "AndhraPradesh":{
                System.out.println("Region : East ");
                break;
            }
            case "Bihar" :{
                System.out.println("Region : East ");
                break;

            }
            case "Nagaland" :{
                System.out.println("Region : East ");
                break;

            }
            case "Assam" :{
                System.out.println("Region : East ");
                break;

            }
            
          
          
           
        }






     

        




    }
    
}
