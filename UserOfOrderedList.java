/**
  test OrderedList
 */

public class UserOfOrderedList {
    public static OrderedList_inArraySlots orderedList =
      new OrderedList_inArraySlots();

    public static void main(String[] commandLine) {
        System.out.println( orderedList);
        System.out.println( System.lineSeparator());

	// test add method
        addOne( "populate an empty list"
               , 0
               ,"[0,]"
               );

        addOne( "add an element that belongs at the front"
               , -11
               ,"[-11,-10,]"
               );

        addOne( "add an element that belongs at the back"
               , 5
               ,"[-11,-10,5,]"
               );

        addOne( "add an element that belongs somewhere in the middle"
               , 2
               ,"[-11,0,2,5,]"
               );

        addOne( "add an element that is the same as another element"
               , 0
               ,"[-11,0,0,2,5,]"
               );

	// test get method
	getOne( "get the first element"
               , 0
               , -11
               );
	getOne( "get the second element"
               , 1
               , 0
               );
	getOne( "get the third element"
               , 2
               , 0
               );
	getOne( "get the fourth element"
               , 3
               , 2
               );
	getOne( "get the fifth element"
               , 4
               , 5
               );

	// test remove method
        removeOne( "remove first element"
               , 0
               ,"[0,0,2,5,]"
               );

        removeOne( "remove second element"
               , 1
               ,"[0,2,5,]"
               );

        removeOne( "remove second element"
               , 2
               ,"[0,5,]"
               );

        removeOne( "remove last element"
               , 2
               ,"[0,]"
               );

        removeOne( "remove all elements"
               , 0
               ,"[]"
               );
    }

    
    /**
      run one test
     */
    private static void addOne( String description
                              , int value
                              , String expect
                              ) {
        System.out.println( description);
        orderedList.add( value);

        // check 
        System.out.println( 
            "result:   "
          + orderedList
          + " ...expecting "
	  + expect);
	System.out.println(
	    orderedList.size()
	  + " element(s)"
	  + System.lineSeparator());
     }

    private static void getOne( String description
                              , int index
                              , int expect
                              ) {
	System.out.println( description);

	// check 
        System.out.println( 
            orderedList.get( index)
          + " ...expecting "
	  + expect
	  + System.lineSeparator());
    }

    private static void removeOne( String description
                              , int index
                              , String expect
                              ) {
	System.out.println( description);
        orderedList.remove( index);
	
	// check 
	System.out.println( 
            "result:   "
          + orderedList
          + " ...expecting "
	  + expect);
	System.out.println(
	    orderedList.size()
	  + " element(s)"
	  + System.lineSeparator());
    }
}    
