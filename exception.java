public class exception {
    public static void main(String[] args){
        String[] chest= {"Gold","Silver","Loot"};

        try{
            System.out.println("I want 5Th iteam"+ chest[5]);
            System.out.println("Got It...");
        }catch(ArrayIndexOutOfBoundsException error){
            System.out.println("The chest dont have that iteam ");
        }
        System.out.println("Find another iteam  .");
    }
}
