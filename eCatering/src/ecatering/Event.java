/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecatering;

/**
 *
 * @author Jason M.
 */
public class Event {
       private int eventid;
       private String event_type;
       private String location;
       private String date;
       private int guestnum;
       private boolean aggreement;

    public Event() {
    }

    public int getEventid() {
        return eventid;
    }

    public void setEventid(int eventid) {
        this.eventid = eventid;
    }

    public String getEvent_type() {
        return event_type;
    }

    public void setEvent_type(String event_type) {
        this.event_type = event_type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getGuestnum() {
        return guestnum;
    }

    public void setGuestnum(int guestnum) {
        this.guestnum = guestnum;
    }

    public boolean isAggreement() {
        return aggreement;
    }

    public void setAggreement(boolean aggreement) {
        this.aggreement = aggreement;
    }
       
    
    
}
