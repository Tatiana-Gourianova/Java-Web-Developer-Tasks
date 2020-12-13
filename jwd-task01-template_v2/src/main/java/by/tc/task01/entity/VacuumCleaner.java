package by.tc.task01.entity;

public class VacuumCleaner extends Appliance{
	public VacuumCleaner(){
	    super(AppliancesType.VACUUM_CLEANER,6);
    }
	public boolean Equals(Appliance appliance) {
		VacuumCleaner VacuumCleaner = (VacuumCleaner) appliance;

	return true;
	}
}
