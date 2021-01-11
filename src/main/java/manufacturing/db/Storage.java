package manufacturing.db;

import manufacturing.model.Manufacturer;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private static final List<Manufacturer> manufacturers = new ArrayList<>();
    private static Long manufacturerId = 0L;

    public static void addManufacturer(Manufacturer manufacturer) {
        manufacturer.setId(++manufacturerId);
        manufacturers.add(manufacturer);
    }
}
