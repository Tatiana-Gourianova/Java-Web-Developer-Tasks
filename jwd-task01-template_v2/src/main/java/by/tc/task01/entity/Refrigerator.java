package by.tc.task01.entity;


public class Refrigerator extends Appliance{
	private int PowerConsumption;
	private float Weight;
	private int FreezerCapacity;
	private int OverallCapacity;
	private float Height;
	private float Width;



	public Refrigerator() {
	    super(ApplianceType.REFRIGERATOR,0);


	}


	public Refrigerator(int powerConsumption, float weight, int freezerCapacity, int overallCapacity, float height, float width) {
		super(ApplianceType.REFRIGERATOR,6);
		setPowerConsumption(powerConsumption);
		setWeight(weight);
		setFreezerCapacity(freezerCapacity);
		setOverallCapacity(overallCapacity);
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

	public void setFreezerCapacity(int freezerCapacity) {
		this.FreezerCapacity=freezerCapacity;
	}

	public int getFreezerCapacity() {

		return this.FreezerCapacity;
	}

	public void setOverallCapacity(int overallCapacity) {
		this.OverallCapacity= overallCapacity;
	}

	public int getOverallCapacity() {

		return this.OverallCapacity;
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
		return "Refrigerator : " +
				"POWER_CONSUMPTION=" + PowerConsumption +
				", WEIGHT=" + Weight +
				", FREEZER_CAPACITY=" + FreezerCapacity +
				", OVERALL_CAPACITY=" + OverallCapacity +
				", HEIGHT=" + Height +
				", WIDTH=" + Width;
	}



	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Oven)) return false;
		Refrigerator refrigerator = (Refrigerator) o;
		return PowerConsumption == refrigerator.PowerConsumption &&
				Float.compare(refrigerator.Weight, Weight) == 0 &&
				Integer.compare(refrigerator.FreezerCapacity, FreezerCapacity) == 0 &&
				Integer.compare(refrigerator.OverallCapacity, OverallCapacity) == 0 &&
				Float.compare(refrigerator.Height, Height) == 0 &&
				Float.compare(refrigerator.Width, Width) == 0;
	}




}
