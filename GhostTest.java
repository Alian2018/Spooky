import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class GhostTest 
{
    class Point implements Comparable<GhostTest.Point>
    {
        private Integer x;
        private Integer y;
        
        public Point(Integer inX, Integer inY)
        {
            x = inX;
            y = inY;
        }
        
        public Integer getX()
        {
            return x;
        }
        
        public Integer getY()
        {
            return y;
        }
        
        public boolean equals(Point p)
        {
            return x.equals(p.getX()) && p.getY().equals(y);
        }
        
        /**
         * Compare method
         * @return 1,-1,0 
         */
        @Override
        public int compareTo(Point p)
        {
            if (x >p.getX())
            {
                return 1;
            }
            else if (x<p.getX())
            {
                return -1;
            }
            else
            {
                return 0;
            }
        }
    }

    public GhostTest()
    {
    }
    
    public static void main(String[] args)
    {
        ArrayList<String> keys = new ArrayList<>();
        keys.add("ghost");
        keys.add("alien");
        keys.add("alien");
        keys.add("spiderman");
        keys.add("adiabatman");
        keys.add("scaryInversion");
        
        Integer[] values = {
                new Integer(1),
                new Integer(2),
                new Integer(100)
        };
        
        // How to fix this error?
        // Cast into array list of Integer
        //ArrayList<Integer> scaryKeys = (ArrayList<Integer>) Arrays.asList(values);
        
        ArrayList <Integer> scaryKeys = new ArrayList<>(Arrays.asList(values));
        keys.forEach(k -> System.out.println(k));
        
        keys.removeIf(k -> k.equalsIgnoreCase("alien"));
        
        GhostTest gt = new GhostTest();
        GhostTest.Point p1 = gt.new Point(1,1);
        GhostTest.Point p2 = gt.new Point(new Integer(2), new Integer(2));
        
        if (p1.equals(p2))
            System.out.println("wow");
        else
        {
            System.out.println("aha");
        }
        Set<GhostTest.Point> tp = new TreeSet<GhostTest.Point>();

        ArrayList<GhostTest.Point> points = new ArrayList<>();
        for (int index = 0; index < 5; ++index)
        {
            points.add(p1);
            // How to fix this?
            // Implement comparable inteface and change Treeset to Set and add point p1
            //tp.add(p1);
            tp.add(p1);
            
        }
        tp.forEach(p -> System.out.println(p.getX()));
        points.forEach(p -> System.out.println(p.getX()));
               
        // How to fix this?
        // add point 2 to the array list points
        // tp.addAll(points);
        System.out.println("print for add All");
        points.add(p2);
        tp.addAll(points);
        tp.forEach(p -> System.out.println(p.getX()));

        
        

    }



}
