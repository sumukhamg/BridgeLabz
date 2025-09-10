package realtime_example_to_handle_the_exceptions.problem_2;

public class PrimiumCalculator {

    public static void main(String[] args) {

    }

    public double calculatLifePremium(Integer age) throws DataNotFoundException {
        if (age == null)
            throw new DataNotFoundException();
        return 5000 * (age / 10);
    }

    public double calculateVehiclePrimium(String type, Integer vehicleAge) throws DataNotFoundException {
        if (type == null || vehicleAge == null)
            throw new DataNotFoundException();

        if (type.equalsIgnoreCase("bike"))
            return 10000 * (vehicleAge / 10);
        else
            return 50000 * (vehicleAge / 5);
    }

    public double calculateHealthInsurance(Integer age, boolean condition) throws DataNotFoundException {
        if (age == null)
            throw new DataNotFoundException();

        return (age * 10000) / 2.5;

    }
}
