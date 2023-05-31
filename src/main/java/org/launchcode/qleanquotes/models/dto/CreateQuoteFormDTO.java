package org.launchcode.qleanquotes.models.dto;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import org.launchcode.qleanquotes.models.enums.CleaningOption;


public class CreateQuoteFormDTO {


    @NotNull(message = "Square feet is required")
    @Min(value = 70, message = "Must be at least 70")
    private Integer squareFeet;

    @NotNull (message = "Enter number of rooms")
    @Min(value = 1, message = "Number of rooms is required")
    private Integer numOfRoom;


    private Integer numOfBathroom;


    @NotNull (message = "Please select an option")
    private CleaningOption cleaningOption;


    public CreateQuoteFormDTO() {
    }

    public CreateQuoteFormDTO(Integer squareFeet, Integer numOfRoom, Integer numOfBathroom, String cleaningOption) {
        this.squareFeet = squareFeet;
        this.numOfRoom = numOfRoom;
        this.numOfBathroom = numOfBathroom;
        this.cleaningOption = CleaningOption.valueOf(cleaningOption);

    }


    public  Integer getSquareFeet() {
        return squareFeet;
    }

    public  Integer getNumOfRoom() {
        return numOfRoom;
    }

    public  Integer getNumOfBathroom() {
        return numOfBathroom;
    }

    public void setSquareFeet(Integer squareFeet) {
        this.squareFeet = squareFeet;
    }

    public void setNumOfRoom(Integer numOfRoom) {
        this.numOfRoom = numOfRoom;
    }

    public void setNumOfBathroom(Integer numOfBathroom) {
        this.numOfBathroom = numOfBathroom;
    }

    public CleaningOption getCleaningOption() {
        return cleaningOption;
    }

    public void setCleaningOption(CleaningOption cleaningOptions) {
        this.cleaningOption = cleaningOptions;
    }

}


