 
public class OpenAddressing {
  static  int[] arr;
   static  int size=0;
   static int cap=8;
   static void initializeMap(){
    arr = new int[cap];
    for (int i = 0; i < cap; i++) {
      arr[i]=-1;
    }
  }
  static void showMap(){
    for (int i = 0; i < cap; i++) {
System.out.println(arr[i]);    }
  } 
  static boolean add(int key){
      if (size==cap) {
        return false;
      }
      int h=hash(key);
      int i=h;
      while (arr[i]!=-1 && arr[i]!=-2 && arr[i]!=key) {
     i=(i+1)%cap;
 
      }
      if (arr[i]==key) {
        return false;
        
      }
        size++;
        arr[i]=key;
        return true; 
    }
    static boolean search(int key){
      int i=hash(key);
      while (arr[i]!=-1) {
        if (arr[i]==key) {
          return true;
        }
        i=(i+1)%cap;
      }
      return false;
    }
    static int hash(int key){
      return key%cap;
    }
  public static void main(String[] var0) {
 initializeMap();
 add(23);
 add(22);
 showMap();
 
System.out.println(search(5));
System.out.println("ff");
  }

   
 
}