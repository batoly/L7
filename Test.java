import java.util.Scanner;

/**
 * Created by Lenovo on 2/20/2022.
 */
public class Test {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        CircularyLinkedList<String>list=new CircularyLinkedList<>();
        System.out.println("1 add first\t 2 add last\t 3remove First"+"\t4 rotate \t"+"0 exit");
        int choice=-1;
        while (choice!=0){
            System.out.println("your choice: ");
            choice=in.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("input Element");
                    list.addFirst(in.next());
                    System.out.println("first element ="+list.first()+"\tlast element="+list.last()+"\t size="+list.size()+"\n\n");
                    break;
                case 2:
                    System.out.println("input Element");
                    list.addLast(in.next());
                    System.out.println("first element ="+list.first()+"\tlast element="+list.last()+"\t size="+list.size()+"\n\n");
                    break;
                case 3:
                    list.rotate();
                    System.out.println("after rotate first element ="+list.first()+"\tlast element="+list.last()+"\t size="+list.size()+"\n\n");
                    break;
                case 4:
                    System.out.println("removed element is"+list.removeFirst());
                    System.out.println("first element ="+list.first()+"\tlast element="+list.last()+"\t size="+list.size()+"\n\n");
                    break;
                case 0:
                    System.exit(0);


            }
        }
    }
}
