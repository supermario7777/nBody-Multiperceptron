public class Dates {

    private int currentDay, currentMonth, currentYear;

    private Dates(int day, int month, int year) {

        this.currentDay = day;
        this.currentMonth = month;
        this.currentYear = year;

    }

    public String toString() {
        String[] months = {
                "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov",
                "Dec"
        };

        String m = months[currentMonth - 1];


        return m + " " + currentDay + " " + currentYear;
    }

    public boolean after(Dates given) {

        if (this.currentYear > given.currentYear) {
            return true;
        }
        else if (this.currentYear == given.currentYear && this.currentMonth > given.currentMonth) {
            return true;

        }
        else if (this.currentYear == given.currentYear && this.currentMonth == given.currentMonth
                && this.currentDay > given.currentDay) {
            return true;
        }
        return false;

    }

    private boolean before(Dates given) {

        if (this.currentYear == given.currentYear && this.currentMonth == given.currentMonth
                && this.currentDay == given.currentDay) {
            return false;
        }
        return true;

    }

    private int toCompare(Dates given) {

        if (after(given)) return 1;
        else if (before(given)) return -1;
        else return 0;

    }

    public static void main(String[] args) {

        Dates myDate = new Dates(23, 3, 2022);
        Dates otherDate = new Dates(24, 4, 2022);

        System.out.println(myDate.after(otherDate));
        System.out.println(myDate.before(otherDate));
        System.out.println(myDate.toCompare(otherDate));
        System.out.println(otherDate);


    }
}
