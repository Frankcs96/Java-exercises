public class Time {

  private int hours;
  private int minutes;
  private int seconds;

  public Time(int hours, int minutes, int seconds) {
    this.hours = hours;
    this.minutes = minutes;
    this.seconds = seconds;
  }


  public Time sum(Time interval) {
    Time newTime = new Time(0, 0, 0);

    newTime.seconds = this.seconds + interval.seconds;
    newTime.minutes = this.minutes + interval.minutes;
    newTime.hours = this.hours + interval.hours;
    if (newTime.seconds >= 60) {
      newTime.minutes++;
      newTime.seconds = newTime.seconds - 60;
    }

    if (newTime.minutes >= 60) {
      newTime.hours++;
      newTime.minutes = newTime.minutes - 60;

    }

    return newTime;
  }



  @Override
  public String toString() {

    return this.hours + "h" + " " + this.minutes + "m" + " " + this.seconds + "s";
  }
}
