class FreshJuice {
enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }
FreshJuiceSize size1,size2,size3;
}
public class FreshJuiceTest {
public static void main(String args[]){
FreshJuice juice = new FreshJuice();
juice.size1 = FreshJuice.FreshJuiceSize.SMALL;
juice.size2 = FreshJuice.FreshJuiceSize.MEDIUM ;
juice.size3 = FreshJuice.FreshJuiceSize.LARGE ;
System.out.println("Size: " + juice.size1);
System.out.println("Size: " + juice.size2);
System.out.println("Size: " + juice.size3);
}
}