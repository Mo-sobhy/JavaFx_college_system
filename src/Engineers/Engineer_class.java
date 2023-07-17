
package Engineers;

public class Engineer_class {
     Integer Engineer_id ;
    String Engineer_name , Engineer_sub , Engineer_Level_1,Engineer_Level_2,Engineer_Level_3,Engineer_Level_4 , Place_id;
    String Time_Id ;

    public Engineer_class(int Engineer_id, String Engineer_name, String Engineer_sub, String Engineer_Level_1, String Engineer_Level_2, String Engineer_Level_3, String Engineer_Level_4, String Place_id, String Time_Id) {
        this.Engineer_id = Engineer_id;
        this.Engineer_name = Engineer_name;
        this.Engineer_sub = Engineer_sub;
        this.Engineer_Level_1 = Engineer_Level_1;
        this.Engineer_Level_2 = Engineer_Level_2;
        this.Engineer_Level_3 = Engineer_Level_3;
        this.Engineer_Level_4 = Engineer_Level_4;
        this.Place_id = Place_id;
        this.Time_Id = Time_Id;
    }

    public Integer getEngineer_id() {
        return Engineer_id;
    }

    public void setEngineer_id(Integer Engineer_id) {
        this.Engineer_id = Engineer_id;
    }

    public String getEngineer_name() {
        return Engineer_name;
    }

    public void setEngineer_name(String Engineer_name) {
        this.Engineer_name = Engineer_name;
    }

    public String getEngineer_sub() {
        return Engineer_sub;
    }

    public void setEngineer_sub(String Engineer_sub) {
        this.Engineer_sub = Engineer_sub;
    }

    public String getEngineer_Level_1() {
        return Engineer_Level_1;
    }

    public void setDoctor_Level_1(String Engineer_Level_1) {
        this.Engineer_Level_1 = Engineer_Level_1;
    }

    public String getEngineer_Level_2() {
        return Engineer_Level_2;
    }

    public void setEngineer_Level_2(String Engineer_Level_2) {
        this.Engineer_Level_2 = Engineer_Level_2;
    }

    public String getEngineer_Level_3() {
        return Engineer_Level_3;
    }

    public void setEngineer_Level_3(String Engineer_Level_3) {
        this.Engineer_Level_3 = Engineer_Level_3;
    }

    public String getEngineer_Level_4() {
        return Engineer_Level_4;
    }

    public void setEngineer_Level_4(String Engineer_Level_4) {
        this.Engineer_Level_4 = Engineer_Level_4;
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
