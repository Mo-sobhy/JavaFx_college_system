package Subject;
public class Subject_class {
       Integer Subject_id ;
    String Subject_name , Doctor_name , Engineer_name,Subject_level_1,Subject_level_2,Subject_level_3 , Subject_level_4,Lec_time,Lec_place,Sec_time,Sec_place,Subject_dept;

    public Subject_class(int Subject_id, String Subject_name, String Doctor_name, String Engineer_name, String Subject_level_1, String Subject_level_2, String Subject_level_3, String Subject_level_4, String Lec_time,String Lec_place,String Sec_time,String Sec_place,String Subject_dept) {
        this.Subject_id = Subject_id;
        this.Subject_name = Subject_name;
        this.Doctor_name = Doctor_name;
        this.Engineer_name = Engineer_name;
        this.Subject_level_1 = Subject_level_1;
        this.Subject_level_2 = Subject_level_2;
        this.Subject_level_3 = Subject_level_3;
        this.Subject_level_4 = Subject_level_4;
        this.Lec_time = Lec_time;
        this.Lec_place = Lec_place;
        this.Sec_time = Sec_time;
        this.Sec_place = Sec_place;
        this.Subject_dept = Subject_dept;
    }

    public Integer getSubject_id() {
        return Subject_id;
    }

    public void setSubject_id(Integer Subject_id) {
        this.Subject_id = Subject_id;
    }

    public String getSubject_name() {
        return Subject_name;
    }

    public void setSubject_name(String Subject_name) {
        this.Subject_name = Subject_name;
    }

    public String getDoctor_name() {
        return Doctor_name;
    }

    public void setDoctor_name(String Doctor_name) {
        this.Doctor_name = Doctor_name;
    }

    public String getEngineer_name() {
        return Engineer_name;
    }

    public void setEngineer_name(String Engineer_name) {
        this.Engineer_name = Engineer_name;
    }

    public String getSubject_level_1() {
        return Subject_level_1;
    }

    public void setSubject_level_1(String Subject_level_1) {
        this.Subject_level_1 = Subject_level_1;
    }

    public String getSubject_level_2() {
        return Subject_level_2;
    }

    public void setSubject_level_2(String Subject_level_2) {
        this.Subject_level_2 = Subject_level_2;
    }

    public String getSubject_level_3() {
        return Subject_level_3;
    }

    public void setSubject_level_3(String Subject_level_3) {
        this.Subject_level_3 = Subject_level_3;
    }

    public String getSubject_level_4() {
        return Subject_level_4;
    }

    public void setSubject_level_4(String Subject_level_4) {
        this.Subject_level_4 = Subject_level_4;
    }

    public String getLec_time() {
        return Lec_time;
    }

    public void setLec_time(String Lec_time) {
        this.Lec_time = Lec_time;
    }
     public String getLec_place() {
        return Lec_place;
    }

    public void setLec_place(String Lec_place) {
        this.Lec_place = Lec_place;
    }
     public String getSec_time() {
        return Sec_time;
    }

    public void setSec_time(String Sec_time) {
        this.Sec_time = Sec_time;
    }
      public String getSec_place() {
        return Sec_place;
    }

    public void setSec_place(String Sec_place) {
        this.Sec_place = Sec_place;
    }
      public String getSubject_dept() {
        return Subject_dept;
    }

    public void setSubject_dept(String Subject_dept) {
        this.Subject_dept = Subject_dept;
    }
    
}
