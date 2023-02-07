public class SteppedProblem {
public static int isStepped(int[] arr) {
        if (arr.length < 3) return 0;
        int prev = arr[0];
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > prev) {
                if (count < 3) return 0;
                prev = arr[i];
                count = 1;
            } else if (arr[i] == prev) {
                count++;
            } else {
                return 0;
            }
        }
        if (count < 3) return 0;
        return 1;
    }


    public static void main(String[] args) {
        int[] arr1 = {1,1,1, 5, 5, 5, 5, 8, 8, 8};
        int[] arr2 = {1, 1, 5, 5, 5, 5, 8, 8, 8};
        int[] arr3 = {5, 5, 5, 15};
        int[] arr4 = {1, 1, 1, 1, 1, 1, 1};
        System.out.println(isStepped(arr1));
        System.out.println(isStepped(arr2));
        System.out.println(isStepped(arr3));
        System.out.println(isStepped(arr4));
    }
}
