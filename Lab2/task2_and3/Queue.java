package task2_and3;

public class Queue {
     int maxSize;
     int[] qArray;
     int numberElements;

     public Queue() {
         maxSize = 9999;
         qArray = new int[maxSize];
          numberElements = 0;


     }

     public Queue(int _maxSize) {
          maxSize = _maxSize;
         qArray = new int[maxSize];
          numberElements = 0;
     }

       public  void push(int x) {
         if ( numberElements >= maxSize  ) { System.out.println("Can not cross the limit ! Pop some!");  }
         else {
             qArray[numberElements] = x;
             numberElements++;
         }

     }

        public void pop() {

          int[] temp = new int[maxSize];
          for ( int i =0; i < numberElements; i++)  {
                if ( i+1 == maxSize ) break;
               temp[i] = qArray[i+1];

               }
          qArray = temp;
          if (numberElements == 0 ) {System.out.println("Can not pop! Push it fella!"); }
          else {
          numberElements--; }

        }

        public boolean isFull() {
          if  ( maxSize == 9999 ) {  System.out.println( "Queue is never full!" ); return false; }
          else if ( numberElements == maxSize ) { System.out.println( "Queue is full! Pop some!" ); return true;  }
          else  { System.out.println( "Nope, Queue is not full, still need to push! " ); return false;  }

        }


        public boolean isEmpty() {
         if( numberElements == 0 ) { System.out.println("Queue is empty! Push some!");  return true; }
         else {  System.out.println("Queue is not empty!  ");  return false; }
        }




}


