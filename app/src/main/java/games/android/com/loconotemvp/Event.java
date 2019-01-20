package games.android.com.loconotemvp;

import java.util.ArrayList;
import java.util.List;

public class Event {
    private LatLng latLng;
    private String title;
    private String description;
    private String id;
    private String location;
    private String ownerID;
    private List<String> participants = new ArrayList<String>();
    private List<String> requirements = new ArrayList<>();   //added

    public Event(LatLng latLng, String title, String description, String ownerID, List<String> participants, List<String> requirements,String id){
        this.latLng = latLng;
        this.title = title;
        this.description = title;
        this.ownerID = ownerID;
        this.id = id;
        this.participants = participants;
        this.requirements = requirements;
    }

    public LatLng getLatLng() {
        return latLng;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getOwnerID() {
        return ownerID;
    }

    public List<String> getParticipants() {
        return participants;
    }

    public void addParticipant(String userId){
        this.participants.add(userId);
    }

    public void setLatLng(LatLng latLng) {
        this.latLng = latLng;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setOwnerID(String ownerID) {
        this.ownerID = ownerID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setParticipants(List<String> participants) {
        this.participants = participants;
    }

    public List<String> getRequirements() {
        return requirements;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setRequirements(List<String> requirements) {
        this.requirements = requirements;
    }
}