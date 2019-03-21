import java.util.ArrayList;

/**
 * @author Zehui Xiao 80% Haonan Jiang20%
 * @version 2018.04.23
 * 
 * @param <T>
 */
public class Node<T>  implements Comparable<Node<T>>{
    private Point a;
    
    private ArrayList<String> place;
    private ArrayList<String> streets;
    

    private double distance;

    /**
     * @param a
     *            a point parameter
     * @param list
     *            the string array
     */
    public Node(Point a, ArrayList<String> list) {
        this.a = a;
        this.place = list;
        this.distance = 0;
        this.streets = null;
    }

    /**
     * @return the point O(1)
     */
    public Point getPoint() {
        return a;
    }

    /**
     * @param b
     *            the desired point O(1)
     */
    public void setPoint(Point b) {
        this.a = b;

    }

    /**
     * @return the place coor. O(1)
     */
    public ArrayList<String> getPlace() {
        return this.place;
    }

    /**
     * @param p
     *            desired place O(1)
     */
    public void setPlace(ArrayList<String> p) {

        this.place = p;

    }
    /**
     * @return
     */
    public ArrayList<String> getStreets() {
        return streets;
    }

    /**
     * @param streets
     */
    public void setStreets(ArrayList<String> streets) {
        this.streets = streets;
    }

    /**
     * @return
     */
    public double getDistance() {
        return distance;
    }

    /**
     * @param distance
     */
    public void setDistance(double distance) {
        this.distance = distance;
    }
    

    /**
     * @return printed string O(1)
     */
    public String toString() {
        return a.toString() + this.place.toString();
    }

    /**
     * @param o
     * @return
     */
    /* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    public int compareTo(Node<T> o) {
        if(this.distance > o.distance) {
            return 1;
        }
        if(this.distance < o.distance) {
            return -1;
        }
        return 0;
    }
    // create new arrayList that will hold the Nodes that are being pulled
    // out of the MinHeap
    //ArrayList<Node<Point>> secondList = new ArrayList<Node<Point>>();
    //while(minHeap.heapsize() > 0) {
        //secondList.add((Node)minHeap.removemin());
   //}
    
    //ArrayList<Node<Point>> thirdList = new ArrayList();
    
    //thirdList.addAll((Collection<? extends Node<Point>>) secondList);
    //return secondList;

}