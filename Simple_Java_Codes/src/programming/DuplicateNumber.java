package programming;

public class DuplicateNumber {
    public static void main(String[] args) {
        String arr[] = {"anil", "arun", "naga", "sandeep", "anil", "sandeep"};

        for (int i = 0; i < arr.length; i++) {                     
            int count = 0;

            
            for (int j = 0; j < i; j++) {
                if (arr[i]==(arr[j])) {
                    count++;
                    break; 
                }
            }

            if (count == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}

//String[] a = values.toArray(new String[0]);
//System.out.println(Arrays.toString(a));
//values.add(arr[i]);