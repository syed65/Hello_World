imprt java.util.*
public class Test1{
    public ArrayList demo(){
      ArrayList al= new ArrayList();
      al.add(12);
      al.add("Orange");
      al.add(23.5f);
      al.add(null);
      for(Object l:al){
      System.out.println(l);
      }
      return al;
    }
    public static void main(String[] args){
    Test1 t=new Test1();
    t.demo();
    }
}
