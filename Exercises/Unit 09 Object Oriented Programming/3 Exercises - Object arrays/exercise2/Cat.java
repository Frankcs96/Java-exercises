public class Cat {

  private String name;
  private String color;
  private String breed;
  private Sex sex;

  public Cat(String name, String color, String breed, Sex sex) {
    this.name = name;
    this.color = color;
    this.breed = breed;
    this.sex = sex;
  }

  @Override
  public String toString() {
    return "**************\nName: " + this.name + "\n" + "Color: " + this.color + "\n" + "Breed: "
        + this.breed + "\n" + "Sex: " + this.sex  + "\n" + "**************";
  }
}
