public interface Search {
  public List<Item> searchByTitle(String title);
  public List<Item> searchByAuthor(String author);
  public List<Book> searchByCategory(String category);
  public List<Item> searchByPubDate(Date publishDate);
  public List<Book> searchByISBN(String isbn);
}

public class Catalog implements Search {
  private HashMap<String, List<Item>> bookTitles;
  private HashMap<String, List<Item>> bookAuthors;
  private HashMap<String, List<Book>> bookCategory;
  private HashMap<String, List<Item>> bookPublicationDates;
  private HashMap<String, List<Book>> bookISBN;
  
  public List<Item> searchByTitle(String query) {
    // return all books containing the string query in their title.
    return ItemTitles.get(query);
  }

  public List<Item> searchByAuthor(String query) {
    // return all books containing the string query in their author's name.
    return ItemAuthors.get(query);
  }
  
  public List<Book> searchByCategory(String query) {
    // return all books containing the string query in their category.
    return bookCategory.get(query);
  }
  
  public List<Item> searchByPublicationDates(String query) {
    // return all books containing the string query in their Publication Dates.
    return ItemPublicationDates.get(query);
  }
  
  public List<Book> searchByISBN(String query) {
    // return all books containing the string query in their ISBN.
    return bookISBN.get(query);
  }
}
