package thi.hoang63134085.dethi1;

public class LandScape {
    String landImageFileName;
    String landCaption;
    String landCountry;

    public LandScape(String landImageFileName, String landCaption, String landCountry) {
        this.landImageFileName = landImageFileName;
        this.landCaption = landCaption;
        this.landCountry = landCountry;
    }

    public String getLandImageFileName() {
        return landImageFileName;
    }

    public void setLandImageFileName(String landImageFileName) {
        this.landImageFileName = landImageFileName;
    }

    public String getLandCaption() {
        return landCaption;
    }

    public void setLandCaption(String landCaption) {
        this.landCaption = landCaption;
    }

    public String getLandCountry() {
        return landCountry;
    }

    public void setLandCountry(String landCountry) {
        this.landCountry = landCountry;
    }
}
