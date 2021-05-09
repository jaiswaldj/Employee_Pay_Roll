import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
/*import static EmployeePayrollService.IOService.FILE_IO;*/

public class EmployeePayrollServiceTest {
    @Test
    public void given3EmployeesWhenWrittenToFileShouldMatchEmployeeEntries(){
        EmployeePayrollData[] arrayOfEmps = {
                new EmployeePayrollData(1, "Jeff Bezos", 1000000.0),
                new EmployeePayrollData(2, "Bill Gates", 2000000.0),
                new EmployeePayrollData(3, "Mark Zuckerberg", 3000000.0),

        };
        EmployeePayrollService employeePayrollService;
        employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmps));
        employeePayrollService.writeEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);
        employeePayrollService.printData(EmployeePayrollService.IOService.FILE_IO);
        long entries = employeePayrollService.countEntries(EmployeePayrollService.IOService.FILE_IO);
        Assert.assertEquals(3, entries);
    }
   /* @Test
    public void givenEmployeePayrollINDB_WhenRetrieved_ShouldMatchEmployeeCount(){
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        List<EmployeePayrollData> employeePayrollData = employeePayrollService.readEmployeePayrollData(EmployeePayrollService.IOService.DB_IO);

    }*/
}
