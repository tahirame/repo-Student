package listofstudents;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shaim
 */
public class Student {
  private String name;
  private int id;
  private String DoB;
  
  //this property id to add partt time strufent 
  private int maxHrs;
  public Student()
  {
       this.id =0;
       this.name = "Not Set";
  }
  
  public Student(String givenName, int givenId)
  {
      this.name = givenName;
      this.id = givenId;
  }
  
  public void setName (String givenName)
  {
      this.name = givenName;
  }
  public String getName()
  {     
      return name;
  }
  
  public void setId(int givenId)
  {
      this.id = givenId;
  }
  /**
   * what it does 
   */
  
  public int getId()
  {
      return id;
  }

    /**
     * @return the DoB
     */
    //THis used to be DOB

    /**
     * @param DoB the DoB to set
     */
    public void setDoB(String DoB) {
        this.DoB = DoB;
    }

    /**
     * @return the maxHrs
     */
    public int getMaxHrs() {
        return maxHrs;
    }

    /**
     * @param maxHrs the maxHrs to set
     */
    public void setMaxHrs(int maxHrs) {
        this.maxHrs = maxHrs;
    }
  
}
