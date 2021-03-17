package world.ucode.Model;

import java.io.InputStream;
import java.sql.Timestamp;

public class LotDAO {

    public String title;
    public double startPrice;
    public double bidStep;
    public String category;
    public Integer active;
    public String image;
    public String lotId;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLotId() {
        return lotId;
    }

    public void setLotId(String lotId) {
        this.lotId = lotId;
    }

    public void setTitle(String title) { this.title = title; }
    public String getTitle() { return title; }

    public void setStartPrice(double startPrice) { this.startPrice = startPrice; }
    public double getStartPrice() { return startPrice; }

    public void setBidStep(double bidStep) { this.bidStep = bidStep; }
    public double getBidStep() { return bidStep; }

    public void setCategory(String category) { this.category = category; }
    public String getCategory() { return category; }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Integer getActive() {
        return active;
    }
}
