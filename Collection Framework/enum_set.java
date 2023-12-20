import java.util.*;
public class enum_set {
     enum Size {
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }
    
    public static void main(String[] args) {

        // Creating an EnumSet using allOf()
        EnumSet<Size> sizes = EnumSet.allOf(Size.class);
        System.out.println("EnumSet: " + sizes);

        //Non off
        EnumSet<Size> sizes2 = EnumSet.noneOf(Size.class);
        System.out.println("Empty EnumSet: " + sizes2);
    
        //range
        EnumSet<Size> sizes3 = EnumSet.range(Size.MEDIUM, Size.EXTRALARGE);
        System.out.println(sizes3);

        sizes2.add(Size.MEDIUM);

        System.out.println(sizes2);

        //iterator
        sizes.remove(Size.EXTRALARGE);
        Iterator<Size> iterate = sizes.iterator();

        System.out.print("EnumSet: ");
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
    }
}
