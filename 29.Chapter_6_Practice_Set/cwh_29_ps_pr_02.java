public class cwh_29_ps_pr_02 {
    public static void main(String[] args) {
        int [] marks = {45, 67, 63, 99, 100};
        int num = 495;
        boolean isInArray = false;
        for(int element:marks){
            if(num==element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The value is present in the array");
        }
        else{
            System.out.println("The value is not present in the array");
        }
    }
}