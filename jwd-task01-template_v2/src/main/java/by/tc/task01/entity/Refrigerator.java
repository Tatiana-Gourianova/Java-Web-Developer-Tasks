package by.tc.task01.entity;

public class Refrigerator extends Appliance{
	public Refrigerator() {
	    super(AppliancesType.REFRIGERATOR,7);

    }

	public boolean Equals(Appliance appliance) {
		VacuumCleaner VacuumCleaner = (VacuumCleaner) appliance;

		return true;
	}

}
