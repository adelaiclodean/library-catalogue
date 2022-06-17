public class ArtAlbums {
    private final int numberOfpages;
    private final String name;
    private final String paperQuality;

        public ArtAlbums (String name, int numberOfpages, String paperQuality){
            this.name=name;
            this.numberOfpages=numberOfpages;
            this.paperQuality=paperQuality;
        }

    public String getPaperQuality() {
        return paperQuality;
    }

    public int getNumberOfpages() {
        return numberOfpages;
    }

    public String getName() {
        return name;
    }
    public String getAlbums() {
        return name;}

    @Override
    public String toString() {
        return name;
    }
}
