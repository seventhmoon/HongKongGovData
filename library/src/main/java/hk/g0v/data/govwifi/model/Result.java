package hk.g0v.data.govwifi.model;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

/**
 * Created by fung on 3/5/2017.
 */

public class Result {

    @SerializedName("name-en")
    private String nameEn;

    @SerializedName("address-zh")
    private String addressZh;

    @SerializedName("district-zh")
    private String distrctZh;

    @SerializedName("type-zh")
    private String typeZh;

    @SerializedName("address-en")
    private String addressEn;

    @SerializedName("district-en")
    private String districtEn;

    @SerializedName("type-en")
    private String typeEn;

    @SerializedName("lat-long")
    private double[] latLong;

    @SerializedName("name-zh")
    private String nameZh;

    @Override
    public String toString() {
        return "Result{" +
                "nameEn='" + nameEn + '\'' +
                ", addressZh='" + addressZh + '\'' +
                ", distrctZh='" + distrctZh + '\'' +
                ", typeZh='" + typeZh + '\'' +
                ", addressEn='" + addressEn + '\'' +
                ", districtEn='" + districtEn + '\'' +
                ", typeEn='" + typeEn + '\'' +
                ", latLong=" + Arrays.toString(latLong) +
                ", nameZh='" + nameZh + '\'' +
                '}';
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getAddressZh() {
        return addressZh;
    }

    public void setAddressZh(String addressZh) {
        this.addressZh = addressZh;
    }

    public String getDistrctZh() {
        return distrctZh;
    }

    public void setDistrctZh(String distrctZh) {
        this.distrctZh = distrctZh;
    }

    public String getTypeZh() {
        return typeZh;
    }

    public void setTypeZh(String typeZh) {
        this.typeZh = typeZh;
    }

    public String getAddressEn() {
        return addressEn;
    }

    public void setAddressEn(String addressEn) {
        this.addressEn = addressEn;
    }

    public String getDistrictEn() {
        return districtEn;
    }

    public void setDistrictEn(String districtEn) {
        this.districtEn = districtEn;
    }

    public String getTypeEn() {
        return typeEn;
    }

    public void setTypeEn(String typeEn) {
        this.typeEn = typeEn;
    }

    public double[] getLatLong() {
        return latLong;
    }

    public void setLatLong(double[] latLong) {
        this.latLong = latLong;
    }

    public String getNameZh() {
        return nameZh;
    }

    public void setNameZh(String nameZh) {
        this.nameZh = nameZh;
    }
}
