package by.tc.task01.entity;

public class Speakers extends Appliance{
    public Speakers(){
        super(AppliancesType.SPEAKERS,4);
    }

    public boolean Equals(Appliance appliance) {
        VacuumCleaner VacuumCleaner = (VacuumCleaner) appliance;

        return true;
    }

}
