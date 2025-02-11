package org.example.smart_warehouse_system;
import java.util.List;
// Utility class to display items
public class WarehouseUtil {
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item);
        }
    }
}