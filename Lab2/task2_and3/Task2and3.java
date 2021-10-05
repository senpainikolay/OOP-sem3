package task2_and3;

public class Task2and3 {


    public static void main(String[] args) {


        Queue qObj =  new Queue();
        Queue qObj2 =  new Queue(3);


   // --- First Object

        qObj.push(6);
        qObj.push(3);
        qObj.push(9);
        qObj.pop();

        System.out.println("//////////////////The first Queue after one .pop()///////////////// ");
        for ( int i = 0; i <  qObj.numberElements; i++) {
            System.out.println(qObj.qArray[i]);
        }


        System.out.println(" ! First Queue check on isFull and isEmpty");
        qObj.isFull();
        qObj.isEmpty();


 /// ---- Second Object
        qObj2.push(2);
        qObj2.push(8);
        qObj2.push(7);
         qObj2.pop();
        System.out.println("//////////////// The second Queue after one .pop()//////////// ");
        for ( int i = 0; i <  qObj2.numberElements; i++) {
            System.out.println(qObj2.qArray[i]);
        }

        System.out.println("!  Second Queue check on isFull and isEmpty");
        qObj2.isFull();
        qObj2.isEmpty();



    }

}
