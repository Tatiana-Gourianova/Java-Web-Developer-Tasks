package by.tc.task01.entity;

public class TabletPC extends Appliance{
    public TabletPC() {
        //Integer b=3;
        super(AppliancesType.TABLET_PC, 5);
    }
    public boolean Equals(Appliance appliance) {
        TabletPC tabletPC = (TabletPC) appliance;

        return true;
    }



}
