public class Book {
  private String title;
  private String author;
  
  private int year;
  
  // technique is called constructor chaining 

  public Book() // no information is sent in
  {
    this("none", "unknown", 1450);
    // this() method directly calls another constructor in the same class
  }
  
  public Book(String t) // only title is set in
  {
    this(t, "unknown", 1450);
  }
  
  // set values in one spot
  public Book(String t, String a, int y)
  {
    setTitle(t);
    setAuthor(a);
    setYear(y);
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
