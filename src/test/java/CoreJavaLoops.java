public class CoreJavaLoops {

    public static void main(String[] args) {

        int[] arr = {1,2,5,6,7,48,57,122,235,488};

        //for loop

        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }

        //enhanced for loop
        for (int j : arr) {
            System.out.println(j);
        }

        String[] name = {"hello","world","good","bye"};

        //enhanced for loop 2
        for (String n: name){
            System.out.println(n);
        }

        System.out.println("** Conditions **");

        for(int j: arr){

            if(j % 2 == 0){
                System.out.println(j);
                //break; --> this will exit the for loop once it enters the IF statement
            }
            else{
                System.out.println(j+" is not multiple of 2");
            }

        }

    }

}
