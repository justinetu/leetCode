/* 
  Convert Binary Number in a Linked List to Integer
  Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.

  Return the decimal value of the number in the linked list.

  The most significant bit is at the head of the linked list.
  
  Input: head = [1,0,1]
  Output: 5
  Explanation: (101) in base 2 = (5) in base 10
  
  Input: head = [0]
  Output: 0
  */
class binaryNumberToInteger {
    public int getDecimalValue(ListNode head) {
        int decimalValue = 0;
        int base2 = 1;
        int numOfNodes = 0;
        int [] array;
        String str = "";
        String s = "";
        while(head != null) {
            ++numOfNodes;
            str += head.val;
            head = head.next;
        }
        array = new int[numOfNodes]; // Initialize the length of the area to numNodes
        for(int i = 0; i < array.length; i++) {
            // Converting individual chars in str to strings to convert them to ints to put in array
             s = Character.toString(str.charAt(i)); 
            // created temps to hold each value in s and converts them to int
             int temp = Integer.parseInt(s);
            // store values in array
            array[i] = temp;
        }
        for(int j = array.length - 1; j >= 0; j--) {
            if(array[j] == 1) {
                decimalValue += base2;
                base2 *= 2;
            }
            else
                base2 *= 2;
        }
        return decimalValue;
    }
}

/*
  This was my off the top approach where basically I traverse the list to count the # of nodes and append the value at each node to a string while simultaneously
  counting the number of nodes/values in the list. After traversal, I convert the individual numbers in the string to integers by first taking them as characters 
  to convert them to strings and from strings to ints. I create an array giving it a size of the number of nodes/values in the list then I put each value in the
  string that gets converted to an int into the array. In addition, I have a variable called base 2 which basically helped me know which number of base 2 we had
  or didn't have, I multiply this number by 2 each iteration. If the number in the array is 1, we add the value at base 2 to the variable decimalValue.
*/
