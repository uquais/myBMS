public class movies {

    private String movieName;
    private int movieHours;
    private String mType;


    public movies(String movieName, int movieHours, String mtype) {
        this.movieName = movieName;
        this.movieHours = movieHours;
        this.mType = mtype;

    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getMovieHours() {
        return movieHours;
    }

    public void setMovieHours(int movieHours) {
        this.movieHours = movieHours;
    }

    public String getmType() {
        return mType;
    }

    public void setmType(String mType) {
        this.mType = mType;
    }

}
