//O(n)
public class BestInsertionSort 
{
    int iteration = 1;

    void insertionSort(int array[]) 
    {
    	for (int j = 1; j < array.length; j++) 
        {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array [i] > key))
			{
            	System.out.println("\nIteration "+ iteration + ":" + 
                 		"\nSwapped Elements: " + array[i+1] + " and " + array[i]);
            	array[i + 1] = array [i];
            	 
            	i--;
            
            array[i+1] = key;  
			}
            {
            	System.out.println("\nIteration "+ iteration + ":" + " Swapping is not needed.");
            	
            }
        iteration++;
        System.out.print("The Array Becomes: ");
        
        showArray(array);
        
	     }
	}          

    void showArray(int array[]) 
    {
        int n = array.length;
        for (int i = 0; i < n; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
      
    }
    
    void no_of_Iteration(int array[])
    {
    	System.out.print("Total Iteration/s: " + iteration);
    }
    
    public static void main(String args[]) 
    {
        BestInsertionSort wss = new BestInsertionSort();
        
        int array[] = {1,2,3,4,5,6,7,8};
        
        System.out.print("Before the Insertion Sort: ");
        wss.showArray(array);
        wss.insertionSort(array);
        System.out.println("");
        wss.no_of_Iteration(array);
        System.out.println("");
        System.out.print("\nAfter the Insertion Sort: ");
        wss.showArray(array);
    }
}