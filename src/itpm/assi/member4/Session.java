/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpm.assi.member4;

/**
 *
 * @author Msi 9RDS
 */
public class Session {
    
         int ses_id ;
        String lecturer ;
        String lecturer_2 ;
        String subject_code;
        String subject_name ;
        String group_id ;
        String tag;
        String no_of_students ;
        String duration;

    public Session(int ses_id, String lecturer, String lecturer_2, String subject_code, String subject_name, String group_id, String tag, String no_of_students, String duration) {
        this.ses_id = ses_id;
        this.lecturer = lecturer;
        this.lecturer_2 = lecturer_2;
        this.subject_code = subject_code;
        this.subject_name = subject_name;
        this.group_id = group_id;
        this.tag = tag;
        this.no_of_students = no_of_students;
        this.duration = duration;
    }

    public int getSes_id() {
        return ses_id;
    }

    public void setSes_id(int ses_id) {
        this.ses_id = ses_id;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public String getLecturer_2() {
        return lecturer_2;
    }

    public void setLecturer_2(String lecturer_2) {
        this.lecturer_2 = lecturer_2;
    }

    public String getSubject_code() {
        return subject_code;
    }

    public void setSubject_code(String subject_code) {
        this.subject_code = subject_code;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    public String getGroup_id() {
        return group_id;
    }

    public void setGroup_id(String group_id) {
        this.group_id = group_id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getNo_of_students() {
        return no_of_students;
    }

    public void setNo_of_students(String no_of_students) {
        this.no_of_students = no_of_students;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
        
    
    
        
    
}
