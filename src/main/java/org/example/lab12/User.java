package org.example.lab12;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("broadcast_name")
    public String broadcastName;

    @SerializedName("country_code")
    public String countryCode;

    @SerializedName("driver_number")
    public int driverNumber;

    @SerializedName("first_name")
    public String firstName;

    @SerializedName("full_name")
    public String fullName;

    @SerializedName("headshot_url")
    public String headshotUrl;

    @SerializedName("last_name")
    public String lastName;

    @SerializedName("meeting_key")
    public int meetingKey;

    @SerializedName("name_acronym")
    public String nameAcronym;

    @SerializedName("session_key")
    public int sessionKey;

    @SerializedName("team_colour")
    public String teamColour;

    @SerializedName("team_name")
    public String teamName;

    // Getters and Setters
    public String getBroadcastName() {
        return broadcastName;
    }

    public void setBroadcastName(String broadcastName) {
        this.broadcastName = broadcastName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public int getDriverNumber() {
        return driverNumber;
    }

    public void setDriverNumber(int driverNumber) {
        this.driverNumber = driverNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getHeadshotUrl() {
        return headshotUrl;
    }

    public void setHeadshotUrl(String headshotUrl) {
        this.headshotUrl = headshotUrl;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getMeetingKey() {
        return meetingKey;
    }

    public void setMeetingKey(int meetingKey) {
        this.meetingKey = meetingKey;
    }

    public String getNameAcronym() {
        return nameAcronym;
    }

    public void setNameAcronym(String nameAcronym) {
        this.nameAcronym = nameAcronym;
    }

    public int getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(int sessionKey) {
        this.sessionKey = sessionKey;
    }

    public String getTeamColour() {
        return teamColour;
    }

    public void setTeamColour(String teamColour) {
        this.teamColour = teamColour;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public String toString() {
        return "User{" +
                "broadcastName='" + broadcastName + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", driverNumber=" + driverNumber +
                ", firstName='" + firstName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", headshotUrl='" + headshotUrl + '\'' +
                ", lastName='" + lastName + '\'' +
                ", meetingKey=" + meetingKey +
                ", nameAcronym='" + nameAcronym + '\'' +
                ", sessionKey=" + sessionKey +
                ", teamColour='" + teamColour + '\'' +
                ", teamName='" + teamName + '\'' +
                '}';
    }
}
