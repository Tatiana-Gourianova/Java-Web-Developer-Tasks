package by.tc.task01.entity;


public abstract class Appliance implements Equals {
//    public AppliancesType type;

    public void Appliance() {

    }

    public Appliance(AppliancesType apppliancesType, Integer countOfParams) {
        //this.type=apppliancesType;

    }
}
  //  public abstract boolean equals(Oven oven2);


//public abstract boolean Equals(Appliance appliance)

    /*
    public Appliance Appliance(Object... params) {
        Appliance appliance = null;
        ApppliancesType type = (ApppliancesType) params[0];

        //Integer.valueOf((String) object);

        switch (type) {
            case OVEN:
       //         appliance = new Oven(Integer.valueOf((String) params[1]),
         //               Float.valueOf((String) params[2]),
           //             Float.valueOf((String) params[3]),
             //           Float.valueOf((String) params[4]),
               //         Float.valueOf((String) params[5]),
                 //       Float.valueOf((String) params[6]));
                break;

            case LAPTOP:
                break;
            case REFRIGERATOR:
                break;
            case SPEAKERS:
                break;
            case TABLET_PC:
                break;
            case VACUUM_CLEANER:
                break;
            default:
                throw new IllegalArgumentException("Wrong equipment type:" + type);
        }
        return appliance;
    }

}

   /* public Appliance(int powerConsumption, float weight, float capacity, float depth, float height, float width) {
    }

    public Appliance(ApppliancesType oven, int powerConsumption, float weight, float capacity, float depth, float width) {
    }

    public Appliance(ApppliancesType laptop, float batteryCapacity, int os, int memoryRom, int systemMemory, float cpu, int displayInchs) {
    }


    //public Appliance (int powerConsumption, float weight, float capacity, float depth, float height, float width){}

    public Appliance Appliance(Object... params) {
        Appliance appliance =null;
         ApppliancesType type= (ApppliancesType)params[0];

 //Integer.valueOf((String) object);

        switch (type) {
            case OVEN:
                appliance = new Oven( Integer.valueOf((String)params[1]),
                        Float.valueOf((String)params[2]),
                        Float.valueOf((String)params[3]),
                        Float.valueOf((String)params[4]),
                        Float.valueOf((String)params[5]),
                        Float.valueOf((String)params[6]));
                break;

            case LAPTOP:
                break;
            case REFRIGERATOR:
                break;
            case SPEAKERS:
                break;
            case TABLET_PC:
                break;
            case VACUUM_CLEANER:
                break;
            default:
                throw new IllegalArgumentException("Wrong equipment type:" + type);
        }
        return appliance;
    }
*/


