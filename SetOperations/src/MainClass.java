
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		int set1[] = new int[20];
		int set2[] = new int[20];
		int setUnion[] = new int[40];
		int setIntersection[] = new int[20];
		int setDifference[] = new int[40];
		int size1 = 20, size2 = 20;
		int i, j, k=0, l=0, m=0, pos;
		int ch;
		String str;
		boolean b;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("\n1 : Insert\n2 : Display\n3 : Union\n4 : Intersection\n5 : Diffrence\n6 : Cyclic Print");
			ch = sc.nextInt();
			switch(ch) {
			case 1:
				//Insert in Set 1
				System.out.println("Enter Size for Set 1 : ");
				size1 = sc.nextInt();
				System.out.println("Enter Elements For Set 1 : ");
				for(i=0; i<size1; i++) {
					set1[i] = sc.nextInt();
				}

				//Insert in Set 2
				System.out.println("Enter Size for Set 2 : ");
				size2 = sc.nextInt();
				System.out.println("Enter Elements For Set 2 : ");
				for(i=0; i<size2; i++) {
					set2[i] = sc.nextInt();
				}
				System.out.println("Elements Inserted !!");
			break;
			
			case 2:
				//Elements of Set 1
				System.out.println("\nElements Of Set 1 : \n");
				for(i=0; i<size1; i++) {
					System.out.print(" "+set1[i]);
				}
				//Elements of Set 2
				System.out.println("\nElements Of Set 2 : \n");
				for(i=0; i<size2; i++) {
					System.out.print(" "+set2[i]);
				}

			break;
			
			case 3:
				//copying set1 to setUnion
				for(i=0; i<size1; i++, k++) {
					setUnion[k] = set1[i];
				}
				//Inserting Elements of set 2 to setUnion
				for(j=0; j<size2; j++) {
					b = true;
					for(i=0; i<size1; i++) {
						if(set1[i] == set2[j]){
							b = false;
							break;
						}
					}
					if(b) {
						setUnion[k] = set2[j];
						k++;
					}
				}
				
				//Display..
				//Elements of Set 1
				System.out.println("\nElements Of Set 1 : \n");
				for(i=0; i<size1; i++) {
					System.out.print(" "+set1[i]);
				}
				//Elements of Set 2
				System.out.println("\nElements Of Set 2 : \n");
				for(i=0; i<size2; i++) {
					System.out.print(" "+set2[i]);
				}
				System.out.println("\nUnion : \n ");
				for(i=0; i<k; i++) {
					System.out.print(" "+setUnion[i]);
				}
				System.out.println();
			break;
			
			case 4 :
				
				for(j=0; j<size2; j++) {
				
					for(i=0; i<size1; i++) {
						if(set2[j] == set1[i]) {
							b=true;
							for(int n=0; n<l; n++) {
								if(set2[j] == setIntersection[n]) {
									b=false;
									break;
								}
							}
							if(b) {
								setIntersection[l] = set2[j];
								l++;	
							}
							
							break;
						}
					}
					
				}
				//display
				//Elements of Set 1
				System.out.println("\nElements Of Set 1 : \n");
				for(i=0; i<size1; i++) {
					System.out.print(" "+set1[i]);
				}
				//Elements of Set 2
				System.out.println("\nElements Of Set 2 : \n");
				for(i=0; i<size2; i++) {
					System.out.print(" "+set2[i]);
				}
				System.out.println("\nIntersection : \n ");
				for(i=0; i<l; i++) {
					
					System.out.print(" "+setIntersection[i]);
				}
				System.out.println();
			break;
			
			case 5:
				for(j=0; j<size2; j++) {
					b = true;
					for(i=0; i<size1; i++) {
						if(set1[i] == set2[j]){
							b = false;
							break;
						}
					}
					if(b) {
						setDifference[m] = set2[j];
						m++;
					}
				}
				//display
				//Elements of Set 1
				System.out.println("\nElements Of Set 1 : \n");
				for(i=0; i<size1; i++) {
					System.out.print(" "+set1[i]);
				}
				//Elements of Set 2
				System.out.println("\nElements Of Set 2 : \n");
				for(i=0; i<size2; i++) {
					System.out.print(" "+set2[i]);
				}
				System.out.println("\nDifference : \n ");
				for(i=0; i<m; i++) {
					
					System.out.print(" "+setDifference[i]);
				}
				System.out.println();
			break;
			
			case 6:
				System.out.println("Enter Position to print elements from set1: ");
				pos = sc.nextInt();
				System.out.println("Cyclically Rotated Array is : \n");
				
				for(i=pos; i<size1+pos; i++) {
					System.out.print(" "+set1[i%size1]);
				}
				
			break;
			
			default:System.out.println("Invalid Choice..!");
				
			}
			
		System.out.println("\nYou Want to Continue (Y/N) : ");
		str = sc.next();
			
		}while(str.equals("Y") || str.equals("y"));
		
		
		System.out.println("Thank You..Visit Again.!!");
		
		

	}

}

//circular array
//difference
//intersection
