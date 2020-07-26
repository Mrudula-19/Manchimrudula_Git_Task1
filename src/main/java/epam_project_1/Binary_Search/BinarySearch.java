package epam_project_1.Binary_Search;
import java.util.*;
class BSearch 
{ 
	public void search()
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total number of array elements:");
		int tot=sc.nextInt();
		System.out.println("Enter array elements:");
		int arr[]=new int[tot];
		for(int i=0;i<tot;i++) 
	    {
	        arr[i] = sc.nextInt();
	    }
		System.out.println("Enter the Search element:");
		int s=sc.nextInt();
		int mid = tot/2;
		int low=0;
		int high=tot;
		   while( low <= high )
		   {  
		      if ( arr[mid] < s )
		      {  
		        low = mid + 1;     
		      }
		      else if ( arr[mid] == s )
		      {  
		        System.out.println("Element is found at index: " + mid);  
		        break;  
		      }
		      else
		      {  
		         high = mid - 1;  
		      }  
		      mid = (low + high)/2;  
		   }  
		   if ( low > high )
		   {  
		      System.out.println("Search element  not found!");  
		   }
	}
}
public class BinarySearch
{
	  public static void main(String args[])
	  {  
		    BSearch b=new BSearch();
		    b.search();
		    
	 }
}
