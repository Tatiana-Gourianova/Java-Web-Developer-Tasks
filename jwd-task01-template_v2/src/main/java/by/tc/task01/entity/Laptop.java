package by.tc.task01.entity;

public class Laptop extends Appliance{
    private float BatteryCapacity;
    private int OS ;
    private int MemoryRom ;
    private int SystemMemory;
    private float CPU;
    private int DisplayInchs;

    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    //  public Laptop(){
    //   super(ApppliancesType.LAPTOP, 6);
   //}

    public Laptop(float batteryCapacity, int os, int memoryRom, int systemMemory, float cpu, int displayInchs){
        super(AppliancesType.LAPTOP, 6);
    setBatteryCapacity(batteryCapacity);
    setOS(os);
    setMemoryRom(memoryRom);
    setSystemMemory(systemMemory);
    setCPU(cpu);
    setDisplayInchs(displayInchs);
}

public void setBatteryCapacity(float batteryCapacity){ this.BatteryCapacity=batteryCapacity; }
public float getBatteryCapacity(){  return this.BatteryCapacity;}
public void setOS(int os){ this.OS=os;}
public int getOS(){ return this.OS;}
public void setMemoryRom(int memoryRom){this.MemoryRom=memoryRom;}
public int getMemoryRom(){ return this.MemoryRom;}
public void setSystemMemory(int systemMemory){ this.SystemMemory=systemMemory;}
public int getSystemMemory(){return this.SystemMemory;}
public void setCPU(float cpu){this.CPU=cpu;}
public float getCPU(){return this.CPU;}
public void setDisplayInchs(int displayInchs){this.DisplayInchs=displayInchs;}
public int getDisplayInchs(){return this.DisplayInchs;}


    @Override
    public String toString() {
        return "Laptop : " +
                "BATTERY_CAPACITY=" + BatteryCapacity +
                ", OS='" + OS + '\'' +
                ", MEMORY_ROM=" + MemoryRom +
                ", SYSTEM_MEMORY=" + SystemMemory +
                ", CPU=" + CPU +
                ", DISPLAY_INCHS=" + DisplayInchs;
    }


    public boolean Equals(Appliance appliance) {
        Laptop laptop = (Laptop) appliance;

        return true;
    }


     /*   if(
                ((this.PowerConsumption==oven.PowerConsumption)||(oven.PowerConsumption==0)||(this.PowerConsumption==0))&&
                        ((this.Weight==oven.Weight)||(oven.Weight==0)||(this.Weight==0))&&
                        ((this.Capacity==oven.Capacity)||(oven.Capacity==0)||(this.Capacity==0))&&
                        ((this.Depth==oven.Depth)||(oven.Depth==0)||(this.Depth==0))&&
                        ((this.Height==oven.Height)||(oven.Height==0)||(this.Height==0))&&
                        ((this.Weight==oven.Height)||(oven.Width==0)||(this.Width==0)))
        {isEquals=true;}

      */


}


