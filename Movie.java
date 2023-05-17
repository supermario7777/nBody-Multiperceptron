public class Movie {

    // parameters = instance variables
    private String name;
    private int year;
    private String producer;
    private double rate;

    public Movie(String n, int y, String p, double r) {
        name = n;
        year = y;
        producer = p;
        rate = r;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getProducer() {
        return producer;
    }

    public double getRate() {
        return rate;
    }

    public static void main(String[] args) {
        int n = StdIn.readInt();

        double rating = 0;

        for (int i = 0; i < n; i++) {
            Movie newMov = new Movie(StdIn.readString(), StdIn.readInt(),
                                     StdIn.readString(),
                                     StdIn.readDouble());

            if (newMov.getRate() > rating) {
                rating = newMov.getRate();
            }

        }
        System.out.println(rating);
    }
}
