package Canines;

public class Dog {
    private String name;
   private  int age;
    private String breed;

    private boolean isFixed;
    private char gender;

    public Dog(String name, int age, String breed, boolean isFixed)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.isFixed = isFixed;

    }

    public void setName(String newName)
    {
        name = newName;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public void ageOneYear()
    {
        age += 1;
    }

    public void fixDog()
    {
        if (!isFixed)
        {
            isFixed = true;
        }
        else
        {
            System.out.println("This animal is already fixed.");
        }
    }

    public String getBreed()
    {
        return breed;
    }

    public void breedDogs(Dog , Dog femaleDog)
    {
        if ()
    }

}

