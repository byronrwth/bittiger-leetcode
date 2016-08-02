public class Solution {
    public String reverseString(String s) {
        
        String reverse = "";
        
        if (s == null || s.length() == 0) {
            return reverse;
        }
        if (s.length() == 1) {
        	return s;
        }
        
		int end = s.length()-1;
		int mid = s.length()/2;
		String first="", second= "";
		
		if ( mid >= 0) {
			 first = s.substring(0, mid); // 0 ~ mid-1
		}
		else {
			 first = s.substring(0);
		}
		//System.out.println("first= " + first);
		if ( end+1 >= mid) {
			 second = s.substring( mid, end+1);  //mid ~ end
		}
		else {
			 second = s.substring( mid);
		}
		
		
		reverse = reverseString(second) + reverseString(first);
		return reverse;
		
		
		/*
		for( ;  end >= 0; end--) {
			
			reverse += s.substring( end  , end+1 );
			
		}
		
		return reverse ; 
		*/
		
		/*
		if (s == null || s.length() == 0) {
            return "";
        }

        String[] array = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = array.length - 1; i >= 0; --i) {
            if (!array[i].equals("")) {
                sb.append(array[i]).append(" ");
            }
        }

        //remove the last " "
        return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
        */

    }
}