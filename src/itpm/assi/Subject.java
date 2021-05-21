/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpm.assi;

/**
 *
 * @author Praveen Pemasinghe
 */
public class Subject {
    
    
        private int numlechours,numtuthours,numlabhours,numevehours;
    private String Ofyear, Ofsem, Subjectname , Subjectcode, subid;

    public Subject (String subid,int numlechours ,int numtuthours ,int numlabhours ,int numevehours,String Ofyear,String Ofsem,String Subjectname,String Subjectcode ) {

        this.subid = subid;
         this.Ofyear = Ofyear;
        this.Ofsem = Ofsem;
        this.Subjectname = Subjectname;
        this.Subjectcode = Subjectcode;
        this.numlechours = numlechours;
        this.numtuthours = numtuthours;
        this.numlabhours = numlabhours;
        this.numevehours = numevehours;
    }

    /**
     * @return the numlechours
     */
    public int getNumlechours() {
        return numlechours;
    }

    /**
     * @param numlechours the numlechours to set
     */
    public void setNumlechours(int numlechours) {
        this.numlechours = numlechours;
    }

    /**
     * @return the numtuthours
     */
    public int getNumtuthours() {
        return numtuthours;
    }

    /**
     * @param numtuthours the numtuthours to set
     */
    public void setNumtuthours(int numtuthours) {
        this.numtuthours = numtuthours;
    }

    /**
     * @return the numlabhours
     */
    public int getNumlabhours() {
        return numlabhours;
    }

    /**
     * @param numlabhours the numlabhours to set
     */
    public void setNumlabhours(int numlabhours) {
        this.numlabhours = numlabhours;
    }

    /**
     * @return the numevehours
     */
    public int getNumevehours() {
        return numevehours;
    }

    /**
     * @param numevehours the numevehours to set
     */
    public void setNumevehours(int numevehours) {
        this.numevehours = numevehours;
    }

    /**
     * @return the Ofyear
     */
    public String getOfyear() {
        return Ofyear;
    }

    /**
     * @param Ofyear the Ofyear to set
     */
    public void setOfyear(String Ofyear) {
        this.Ofyear = Ofyear;
    }

    /**
     * @return the Ofsem
     */
    public String getOfsem() {
        return Ofsem;
    }

    /**
     * @param Ofsem the Ofsem to set
     */
    public void setOfsem(String Ofsem) {
        this.Ofsem = Ofsem;
    }

    /**
     * @return the Subjectname
     */
    public String getSubjectname() {
        return Subjectname;
    }

    /**
     * @param Subjectname the Subjectname to set
     */
    public void setSubjectname(String Subjectname) {
        this.Subjectname = Subjectname;
    }

    /**
     * @return the Subjectcode
     */
    public String getSubjectcode() {
        return Subjectcode;
    }

    /**
     * @param Subjectcode the Subjectcode to set
     */
    public void setSubjectcode(String Subjectcode) {
        this.Subjectcode = Subjectcode;
    }

    /**
     * @return the subid
     */
    public String getSubid() {
        return subid;
    }
    
    
}
