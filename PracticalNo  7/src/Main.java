//Program:
import java.util.*; 
public class Main 
{ 
 private static int size;
 public static void sort(int elements[]){ 
    buildheap(elements); 
    for (int i = size; i > 0; i--){ 
    swap(elements,0, i); 
    size = size-1; 
    heap(elements, 0); 
 } 
 } 
 public static void buildheap(int elements[]){ 
    size = elements.length-1; 
    for (int i = size/2; i >= 0; i--) 
    heap(elements, i); 
 } 
 public static void heap(int elements[], int i){ 
        int left = 2*i ; 
        int right = 2*i + 1; 
        int max = i; 
        if (left <= size && elements[left] > elements[i]) 
            max = left; 
        if (right <= size && elements[right] > elements[max]) 
            max = right; 
        if (max != i){ 
            swap(elements, i, max); 
            heap(elements, max); 
        } 
 } 
 public static void swap(int elements[], int i, int j){ 
    int tmp = elements[i]; 
    elements[i] = elements[j]; 
    elements[j] = tmp; 
 } 
 public static void main(String[] args) { 
    Scanner in = new Scanner( System.in ); 
    int n; 
    System.out.print("How many elements? :"); 
    n = in.nextInt(); 
    int elements[] = new int[ n ]; 
    System.out.print("Enter "+ n +" integer elements : "); 
    for (int i = 0; i < n; i++) 
    elements[i] = in.nextInt(); 
    sort(elements); 
    System.out.println("Elements After sorting : "); 
    for (int i = 0; i < n; i++) 
    System.out.print(elements[i]+" "); 
 } 
} 

