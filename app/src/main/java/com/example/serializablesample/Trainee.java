package com.example.serializablesample;

import android.os.Parcel;
import android.os.Parcelable;

public class Trainee implements Parcelable {
   private String account;
   private String name;
   private int yearOfBirth;

   public Trainee(String account, String name, int yearOfBirth){
       this.account = account;
       this.name = name;
       this.yearOfBirth = yearOfBirth;
   }

    protected Trainee(Parcel in) {
        account = in.readString();
        name = in.readString();
    }

    public static final Creator<Trainee> CREATOR = new Creator<Trainee>() {
        @Override
        public Trainee createFromParcel(Parcel in) {
            return new Trainee(in);
        }

        @Override
        public Trainee[] newArray(int size) {
            return new Trainee[size];
        }
    };

    public String getAccount() {
        return account;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(account);
        parcel.writeString(name);
    }
}
