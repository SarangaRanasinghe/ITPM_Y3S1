/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpm.assi.member2;

import itpm.assi.*;

/**
 *
 * @author Praveen Pemasinghe
 */
class Lecturer {
    
    
    
    private int EMP_ID;
    private String LectureName, Faculty, Department, Center, Building, Level, Rank;

    public Lecturer(int EMP_ID, String LectureName, String Faculty, String Department, String Center, String Building, String Level, String Rank) {

        this.EMP_ID = EMP_ID;
        this.LectureName = LectureName;
        this.Faculty = Faculty;
        this.Department = Department;
        this.Center = Center;
        this.Building = Building;
        this.Level = Level;
        this.Rank = Rank;
    }

    public int getEMP_ID() {

        return EMP_ID;
    }
    
    
    public String getFaculty(){
        
        return Faculty;
    }
    
      public String getDepartment(){
        
        return Department;
    }
      
        public String getCenter(){
        
        return Center;
    }
        
          public String getBuilding(){
        
        return Building;
    }
          
            public String getLevel(){
        
        return Level;
    }
              public String getRank(){
        
        return Rank;
    }

    /**
     * @param EMP_ID the EMP_ID to set
     */
    public void setEMP_ID(int EMP_ID) {
        this.EMP_ID = EMP_ID;
    }

    /**
     * @return the LectureName
     */
    public String getLectureName() {
        return LectureName;
    }

    /**
     * @param LectureName the LectureName to set
     */
    public void setLectureName(String LectureName) {
        this.LectureName = LectureName;
    }

    /**
     * @param Faculty the Faculty to set
     */
    public void setFaculty(String Faculty) {
        this.Faculty = Faculty;
    }

    /**
     * @param Department the Department to set
     */
    public void setDepartment(String Department) {
        this.Department = Department;
    }

    /**
     * @param Center the Center to set
     */
    public void setCenter(String Center) {
        this.Center = Center;
    }

    /**
     * @param Building the Building to set
     */
    public void setBuilding(String Building) {
        this.Building = Building;
    }

    /**
     * @param Level the Level to set
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * @param Rank the Rank to set
     */
    public void setRank(String Rank) {
        this.Rank = Rank;
    }

    
        
    
}
