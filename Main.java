import java.util.Scanner;
import java.util.Random;
class Main {

public static void sort(int Array[],int size) {


for(int i=1; i<size; ++i)
{
int key = Array[i];
int j = i-1;

while (j >= 0 && Array[j] > key)
{
Array[j+1] = Array[j];
j = j-1;
}

Array[j+1] = key;
}
}

public static void Main(String args[])
{

Scanner sc = new Scanner(System.in);

Random rand = new Random();
int i;

System.out.print("Enter Size Of Array: "); int size = sc.nextInt();

int[] Array = new int[size];

for(i=0; i<size; i++)
{

Array[i] = rand.nextInt(100)+1;

}

System.out.print("\nEnter Number to Search : ");
int num = sc.nextInt();

for(i=0; i<size; i++)
{

if(Array[i] == num)
{


System.out.println("Number " + num + " is Present");
break;
}
}

if(i == size)
{

System.out.println("Number " + num + " is Not Present");
}


System.out.println("\nActual Array is : ");
for(i=0; i<size; i++)
{
System.out.print(Array[i] + " ");
}

sort(Array,size);

System.out.println("\n\nSorted Array is : ");
for(i=0;i<size;i++)

{
System.out.print(Array[i] + " ");
}
}
}