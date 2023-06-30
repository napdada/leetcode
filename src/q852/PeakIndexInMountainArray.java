package q852;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 0}, arr2 = {0, 2, 1, 0}, arr3 = {0, 10, 5, 2};
        System.out.println(PeakIndexInMountainArray.peakIndexInMountainArray(arr1));
        System.out.println(PeakIndexInMountainArray.peakIndexInMountainArray(arr2));
        System.out.println(PeakIndexInMountainArray.peakIndexInMountainArray(arr3));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int l = 0, r = arr.length, m = (l + r) / 2;
        while (l < r) {
            if (arr[m] > arr[m - 1] && arr[m] > arr[m + 1]) {
                return m;
            } else if (arr[m] > arr[m - 1] && arr[m] < arr[m + 1]) {
                l = m;
            } else if (arr[m] < arr[m - 1] && arr[m] > arr[m + 1]) {
                r = m;
            }
            m = (l + r) / 2;
        }
        return m;
    }
}
