import java.util.Iterator;
import java.util.NoSuchElementException;

public class Bag<Element> implements Iterable<Element> {
  private Node<Element> firstElement;
  private int size;

  private static class Node<Element> {
    private Element content;
    private Node<Element> nextElement;
  }

  public Bag() {
    firstElement = null;
    size = 0;
  }

  public void add(Element element) {
    Node<Element> oldfirst = firstElement;
    firstElement = new Node<>();
    firstElement.content = element;
    firstElement.nextElement = oldfirst;
    size++;
  }

  public boolean contains(Element element) {
    Iterator<Element> iterator = this.iterator();
    while (iterator.hasNext()) {
      if (iterator.next().equals(element)) {
        return true;
      }
    }
    return false;
  }

  public boolean isEmpty() {
    return firstElement == null;
  }

  public int size() {
    return size;
  }

  public Iterator<Element> iterator() {
    return new ListIterator<>(firstElement);
  }

  // To suppress warnings relative to locals that hide variable
  @SuppressWarnings("hiding")
  private class ListIterator<Element> implements Iterator<Element> {
    private Node<Element> currentElement;

    public ListIterator(Node<Element> firstElement) {
      currentElement = firstElement;
    }

    public boolean hasNext() {
      return currentElement != null;
    }

    public Element next() {
      if (!hasNext()) throw new NoSuchElementException();
      Element element = currentElement.content;
      currentElement = currentElement.nextElement;
      return element;
    }

    @Override
    public void remove() {
      throw new UnsupportedOperationException();
    }
  }

  public static void main(String[] args) {
    Bag<String> bag = new Bag<>();

    bag.add("a");
    bag.add("a");
    bag.add("b");

    System.out.println("size of bag = " + bag.size());
    
    for (String s : bag) {
      System.out.println(s);
    }

    System.out.println(bag.contains(null));
    System.out.println(bag.contains("a"));
    System.out.println(bag.contains("c"));
  }
}
