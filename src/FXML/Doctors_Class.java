
package FXML;
public class Doctors_Class {
    Integer Doctor_id ;
    String Doctor_name , Doctor_sub , Doctor_Level_1,Doctor_Level_2,Doctor_Level_3,Doctor_Level_4 , Place_id;
    String Time_Id ;

    public Doctors_Class(int Doctor_id, String Doctor_name, String Doctor_sub, String Doctor_Level_1, String Doctor_Level_2, String Doctor_Level_3, String Doctor_Level_4, String Place_id, String Time_Id) {
        this.Doctor_id = Doctor_id;
        this.Doctor_name = Doctor_name;
        this.Doctor_sub = Doctor_sub;
        this.Doctor_Level_1 = Doctor_Level_1;
        this.Doctor_Level_2 = Doctor_Level_2;
        this.Doctor_Level_3 = Doctor_Level_3;
        this.Doctor_Level_4 = Doctor_Level_4;
        this.Place_id = Place_id;
        this.Time_Id = Time_Id;
    }

    public Integer getDoctor_id() {
        return Doctor_id;
    }

    public void setDoctor_id(Integer Doctor_id) {
        this.Doctor_id = Doctor_id;
    }

    public String getDoctor_name() {
        return Doctor_name;
    }

    public void setDoctor_name(String Doctor_name) {
        this.Doctor_name = Doctor_name;
    }

    public String getDoctor_sub() {
        return Doctor_sub;
    }

    public void setDoctor_sub(String Doctor_sub) {
        this.Doctor_sub = Doctor_sub;
    }

    public String getDoctor_Level_1() {
        return Doctor_Level_1;
    }

    public void setDoctor_Level_1(String Doctor_Level_1) {
        this.Doctor_Level_1 = Doctor_Level_1;
    }

    public String getDoctor_Level_2() {
        return Doctor_Level_2;
    }

    public void setDoctor_Level_2(String Doctor_Level_2) {
        this.Doctor_Level_2 = Doctor_Level_2;
    }

    public String getDoctor_Level_3() {
        return Doctor_Level_3;
    }

    public void setDoctor_Level_3(String Doctor_Level_3) {
        this.Doctor_Level_3 = Doctor_Level_3;
    }

    public String getDoctor_Level_4() {
        return Doctor_Level_4;
    }

    public void setDoctor_Level_4(String Doctor_Level_4) {
        this.Doctor_Level_4 = Doctor_Level_4;
    }

    public String getPlace_id() {
        return Place_id;
    }

    public void setPlace_id(String Place_id) {
        this.Place_id = Place_id;
    }

    public String getTime_Id() {
        return Time_Id;
    }

    public void setTime_Id(String Time_Id) {
        this.Time_Id = Time_Id;
    }
    
    
    
}
