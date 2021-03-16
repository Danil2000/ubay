package world.ucode.Controllers;

import org.apache.commons.lang3.builder.EqualsBuilder;
import world.ucode.Model.UserDAO;

import javax.persistence.*;
import java.sql.Timestamp;

public class Lot {

    public String title = "qwe";
    public double startPrice = 15;
    public double bidStep = 5;
    public int duration = 3;
    public String description = "qwee";
    public String category = "car";
    public int startTime = 15;
    public int finishTime = 16;
    public Integer active = 1;
    public String scrimage = "https://www.apple.com/ac/structured-data/images/knowledge_graph_logo.png?201809240700";

//    public byte[] image;



    public UserDAO seller;

    public Lot() {}

//    public int getId() { return id; }

    public void setTitle(String title) { this.title = title; }
    public String getTitle() { return title; }

    public void setStartPrice(double startPrice) { this.startPrice = startPrice; }
    public double getStartPrice() { return startPrice; }

    public void setBidStep(double bidStep) { this.bidStep = bidStep; }
    public double getBidStep() { return bidStep; }

    public void setDuration(int duration) { this.duration = duration; }
    public int getDuration() { return duration; }

    public void setDescription(String description) { this.description = description; }
    public String getDescription() { return description; }

    public void setCategory(String category) { this.category = category; }
    public String getCategory() { return category; }

    public void setSeller(UserDAO seller) { this.seller = seller; }
    public UserDAO getSeller() { return seller; }

    public void setStartTime(int startTime) { this.startTime = startTime; }
    public int getStartTime() { return startTime; }

    public void setFinishTime(int finishTime) { this.finishTime = finishTime; }
    public int getFinishTime() { return finishTime; }

    public void setActive(Integer active) { this.active = active; }
    public Integer getActive() { return active; }

//    public byte[] getImage() {
//        return image;
//    }
//    public void setImage(byte[] image) {
//        this.image = image;
//    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof Lot) {
//            final Lot lot = (Lot) obj;
//
//            return new EqualsBuilder()
//                    .append(id, lot.id)
//                    .isEquals();
//        } else {
//            return false;
//        }
//    }

}
