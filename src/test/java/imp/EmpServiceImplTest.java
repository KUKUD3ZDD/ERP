package imp;

import com.zking.erp.sys.model.Emp;
import com.zking.erp.sys.service.IEmpService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmpServiceImplTest extends  BaseTestCase{
    @Autowired
    private IEmpService empService;
    private Emp emp;
    @Before
    public void setUp() throws Exception {
        emp=new Emp();
    }

    @Test
    public void queryLstEmp() {
        List<Emp> emps = empService.queryLstEmp(emp);
        for (Emp emp1 : emps) {
            System.out.println(emp1);
        }

    }
}