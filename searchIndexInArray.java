//Take an array as input from user. Search for a given number x and print the index at which it occurs.
import java.util.*;

class SearchIndexInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            int size;

            System.out.println("Enter Length Of Array");
            size = sc.nextInt();

            int arr[] = new int[size];

            System.out.println("Enter " + size + " elements of array");

            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }


            System.out.println("Enter Element to Search");
            int element = sc.nextInt();

            for (int i = 0; i < size; i++) {
                if (element == arr[i]) {
                    System.out.println(element + " is present at " + i + " index");
                    break;
                } else {
                    System.out.println(element + " not found!");
                    break;
                }
            }
        }
    }
