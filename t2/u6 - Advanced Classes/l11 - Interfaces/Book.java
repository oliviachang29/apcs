public class Book implements Comparable
  
{
  private String title;
  private String author;
  
  private int year;
  
  public Book()
  {
    this("none", "unknown", 1450);
  }
  
  public Book(String t)
  {
    this(t, "unknown", 1450);
  }
  
  public Book(String t, String a, int y)
  {
    setTitle(t);
    setAuthor(a);
    setYear(y);
  }

  public int compareTo(Object b) {
    // cast b into a book (because it may not be a book which is passed in)
    Book temp = (Book) b;
    int compare = author.compareTo(temp.author);
    if (compare == 0) {
      return title.compareTo(temp.title);
    }
    return compare;
  }
  
  public String toString()
  {
    return title + "\n\t" + author + "\n\t" + year;
  }
  
  public void setTitle(String t)
  {
    title = t;
  }
  
  public void setAuthor(String a)
  {
    author = a;
  }
  
  public void setYear(int y)
  {
    year = y;
  }

}
