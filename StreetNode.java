import java.util.ArrayList;

public class StreetNode implements Comparable<StreetNode> {
private String street;

private ArrayList<Node<Point>> place;
/**
 * @param street
 */
public StreetNode(String street) {
    this.street = street;
    place = new ArrayList<Node<Point>>();
}
/**
 * @return
 */
public String getStreet() {
    return street;
}
/**
 * @param street
 */
public void setStreet(String street) {
    this.street = street;
}
/**
 * @return
 */
public ArrayList<Node<Point>> getPlace() {
    return place;
}
/**
 * @param place
 */
public void setPlace(ArrayList<Node<Point>> place) {
    this.place = place;
}
/**
 * @param n
 * @return
 */
public boolean addPoint(Node<Point> n) {
    this.place.add(n);
    return true;
}
public String toString() {
    return this.getPlace().toString();
}
/**
 * @param o
 * @return
 */
public int compareTo(StreetNode o) {
    if(this.street.compareTo(o.street) > 0) {
        return 1;
    }
    if(this.street.compareTo(o.street) < 0) {
        return -1;
    }
    return 0;
    
}
}
