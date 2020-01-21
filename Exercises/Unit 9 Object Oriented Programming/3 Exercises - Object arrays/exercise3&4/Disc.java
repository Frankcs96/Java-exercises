public class Disc {



  private String code;
  private String author;
  private String title;
  private String genre;
  private int duration;

  public Disc(String code, String author, String title, String genre, int duration) {
    this.code = code;
    this.author = author;
    this.title = title;
    this.genre = genre;
    this.duration = duration;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }

  @Override
  public String toString() {
    String message = "\n*********************************************";
    message += "\nCode: " + this.code;
    message += "\nAuthor: " + this.author;
    message += "\nTitle: " + this.title;
    message += "\nGenre: " + this.genre;
    message += "\nDuration: " + this.duration;
    message += "\n*********************************************";
    return message;
  }
}