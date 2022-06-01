public class WateringTheGarden {
    public static void main(String[] args) {
        Plant plant1 = new Plant();
        plant1.name = "Aglaonema";
        plant1.description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce ut posuere urna, pharetra convallis tellus. Vivamus consectetur est et tortor volutpat, a fringilla felis tristique. Pellentesque sodales, quam ut gravida mollis, enim tortor rhoncus turpis, in feugiat mauris mi non turpis. Proin eget est at felis lacinia rutrum. Sed nec ligula libero. Cras in congue tellus. Aliquam erat volutpat.";
        plant1.dailyWaterRequirement = 0.2;

        Plant plant2 = new Plant();
        plant2.name = "Sansewieria gwinejska";
        plant2.description = "Nullam eget est ante. Vivamus sed vestibulum purus. Vestibulum nec tempor quam. Nullam dui nulla, porttitor vitae ipsum sed, hendrerit pharetra ligula. Donec fringilla, lacus non faucibus interdum, nisi lorem pulvinar odio, quis sagittis tellus lectus nec magna. Sed mattis odio nec lectus vestibulum facilisis. Nulla interdum lectus urna, eu laoreet dolor consequat ac. ";
        plant2.dailyWaterRequirement = 0.3;

        Plant plant3 = new Plant();
        plant3.name = "Areka";
        plant3.description = "Morbi vitae cursus ante. Quisque varius massa aliquet est fringilla, euismod tristique est elementum. Nunc a ligula id nibh gravida pellentesque. Phasellus sed molestie sem. Nulla vel massa nec nulla porttitor sodales. Duis ligula libero, lacinia eu mauris at, fermentum viverra metus. Aenean id iaculis ligula. Sed feugiat nunc vel leo euismod consectetur. In commodo aliquet leo eu facilisis. ";
        plant3.dailyWaterRequirement = 0.4;

        double dailyWaterConsumption = plant1.dailyWaterRequirement + plant2.dailyWaterRequirement + plant3.dailyWaterRequirement;
        double weeklyWaterConsumption = 7 * dailyWaterConsumption;
        double annualWaterConsumption = 365 * dailyWaterConsumption;

        System.out.println("Dzienne zużycie wody przez wszystkie rośliny (w litrach): " + dailyWaterConsumption);
        System.out.println("Tygodniowe zużycie wody (w litrach): " + weeklyWaterConsumption);
        System.out.println("Roczne zużycie wody (w litrach): " + annualWaterConsumption);
    }
}