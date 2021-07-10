package com.example.famouspersonalitiesrecyclerview;

public class Data {
    private int image;
    private String CompanyName;
    private String age;
    private String occupation;

    public Data(int image, String companyName, String age, String occupation) {
        this.image = image;
        CompanyName = companyName;
        this.age = age;
        this.occupation = occupation;
    }

    public int getImage() {
        return image;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public String getAge() {
        return age;
    }

    public String getOccupation() {
        return occupation;
    }
}
