/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.jokamaven;

/**
 *
 * @author aphel
 */
public class Animals {
    private String dog;
    private String cat;
    
      public Animals(String dog, String cat)
    {
        this.dog = dog;
        this.cat = cat;
    }
    
    public String getDog()
    {
        return dog;
    }

    public void setDog(String dog)
    {
        this.dog = dog;
    }

    public String getCat()
    {
        return cat;
    }

    public void setCat(String cat)
    {
        this.cat = cat;
    }

    @Override
    public String toString()
    {
        return "Animals{" + "dog=" + dog + 
                ", cat=" + cat + '}';
    }
}




