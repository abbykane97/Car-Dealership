import com.pluralsight.Contract;
import com.pluralsight.LeaseContract;
import com.pluralsight.SalesContract;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ContractFileManager {
    private static final String Contracts_File_Path = "contracts.csv";

    public void saveContract(Contract contract) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(Contracts_File_Path, true))) {
            if (contract instanceof SalesContract) {
                writer.write("SALE" + contract.getDate() + "|" + contract.getCustomerName() + "|" + contract.getCustomerEmail() + "|" + contract.getVehicle().getVin() + "|");

            } else if (contract instanceof LeaseContract){

                writer.write("LEASE" + contract.getDate() + "|" + contract.getCustomerName() + "|" + contract.getCustomerEmail() + "|" + contract.getVehicle().getVin() + "|");


            }
            writer.newLine();

        } catch (IOException e) {

        }
    }
}