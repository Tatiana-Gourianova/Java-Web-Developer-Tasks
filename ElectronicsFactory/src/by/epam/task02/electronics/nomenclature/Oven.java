package by.epam.task02.electronics.nomenclature;



public class Oven extends Electronics {
    
        private int PowerConsumption;
        private float Weight;
        private float Capacity;
        private float Depth;
        private float Height;
        private float Width;

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

        public void Oven() {
                setCapacity(10000);
                //setDepth(depth);
                //setHeight(height);
                //setWidth(width);
        }

        public void Oven(int powerConsumption, float weight, float capacity, float depth, float height, float width) {
                setCapacity(capacity);
                setDepth(depth);
                setHeight(height);
                setWidth(width);
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
}

