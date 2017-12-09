package com.example.gimenez1.recipelist

/**
 * Created by Gimenez1 on 12/8/2017.
 */

import android.os.Parcel
import android.os.Parcelable


data class Recipe(val name: String = "",
                  val desc: String = "",
                  val inged: String = "",
                  val method: String = "") : Parcelable{
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(desc)
        parcel.writeString(inged)
        parcel.writeString(method)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Recipe> {
        override fun createFromParcel(parcel: Parcel): Recipe {
            return Recipe(parcel)
        }

        override fun newArray(size: Int): Array<Recipe?> {
            return arrayOfNulls(size)
        }
    }

}