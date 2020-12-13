package by.tc.task01.entity;


//import java.util.Objects;

import java.util.Objects;

import static by.tc.task01.entity.AppliancesType.OVEN;

//import static java.util.Objects.hash;

public class Oven extends Appliance {
    private int PowerConsumption;
    private float Weight;
    private float Capacity;
    private float Depth;
    private float Height;
    private float Width;


    public Oven()
    {super(OVEN,0);
        this.PowerConsumption=0;
        this.Weight=0;
        this.Capacity=0;
    }
    public Oven(int powerConsumption, float weight, float capacity, float depth, float height, float width) {
    super(OVEN,6);
      setPowerConsumption(powerConsumption);
      setWeight(weight);
      setCapacity(capacity);
      setDepth(depth);
      setHeight(height);
      setWidth(width);

    }




    public void setPowerConsumption(int powerConsumption) {
        this.PowerConsumption = powerConsumption;
    }

    public int getPowerConsumption() {
        return this.PowerConsumption;
    }

    public void setWeight(float weight) {
        this.Weight = weight;
    }

    public float getWeight() {
        return this.Weight;
    }

    public void setCapacity(float capacity) {
        this.Capacity = capacity;
    }

    public float getCapacity() {

        return this.Capacity;
    }

    public void setDepth(float depth) {

        this.Depth = depth;
    }

    public float getDepth() {

        return this.Depth;
    }

    public void setHeight(float height) {

        this.Height = height;
    }

    public float getHeight() {

        return this.Height;
    }

    public void setWidth(float width) {

        this.Width = width;
    }

    public float getWidth() {

        return this.Width;
    }

  @Override
    public String toString() {
        return "Oven : " +
                "POWER_CONSUMPTION=" + PowerConsumption +
                ", WEIGHT=" + Weight +
                ", CAPACITY=" + Capacity +
                ", DEPTH=" + Depth +
                ", HEIGHT=" + Height +
                ", WIDTH=" + Width;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Oven)) return false;
        Oven oven = (Oven) o;
        return PowerConsumption == oven.PowerConsumption &&
                Float.compare(oven.Weight, Weight) == 0 &&
                Float.compare(oven.Capacity, Capacity) == 0 &&
                Float.compare(oven.Depth, Depth) == 0 &&
                Float.compare(oven.Height, Height) == 0 &&
                Float.compare(oven.Width, Width) == 0;
    }
/*
   // @Override
    public int hashCode(Appliance appliance) {
        Oven oven = (Oven) appliance;
         String  str = this.toString();
         return str.hashCode();
                //Objects.hash(PowerConsumption, Weight, Capacity, Depth, Height, Width);
    }
*/
    public boolean Equals(Appliance appliance) {
        Oven oven = (Oven) appliance;
System.out.println(oven.Width);
        System.out.println(this.Width);
        //if (appliance.type==AppliancesType.OVEN)
        boolean isEquals=false;
        if(
                ((this.PowerConsumption==oven.PowerConsumption)||(oven.PowerConsumption==0)||(this.PowerConsumption==0))&&
                        ((this.Weight==oven.Weight)||(oven.Weight==0)||(this.Weight==0))&&
                        ((this.Capacity==oven.Capacity)||(oven.Capacity==0)||(this.Capacity==0))&&
                        ((this.Depth==oven.Depth)||(oven.Depth==0)||(this.Depth==0))&&
                        ((this.Height==oven.Height)||(oven.Height==0)||(this.Height==0))&&
                        ((this.Width==oven.Width)||(oven.Width==0)||(this.Width==0)))
        {isEquals=true;}
        return isEquals;
    }



}




