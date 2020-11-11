package library;

public class LibraryUsers {
   private String username;
   private int booksneed;

    public String getUsername(String saroj) {
        return username;
    }

    public int getBooksneed() {
        return booksneed;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setBooksneed(int booksneed) {
        this.booksneed = booksneed;
    }

    @Override
    public String toString() {
        return "LibraryUsers{" +
                "username='" + username + '\'' +
                ", booksneed='" + booksneed + '\'' +
                '}';
    }

    public static void main(String[] args) {
        LibraryUsers user1 = new LibraryUsers();
        user1.setUsername("Saroj");
        user1.setBooksneed(2);

    }


}
