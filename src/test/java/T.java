import java.util.ArrayList;
import java.util.List;

import com.ffzx.orm.common.GenericExample;
import com.ffzx.orm.common.GenericExample.GeneratedCriteria;
import com.ffzx.stms.model.BillDetailExample;

public class T {
	public static void main(String[] args) {
		
		List<GenericExample> examples=new ArrayList<GenericExample>();
		examples.add(new BillDetailExample());
		
		List<GeneratedCriteria> oredCriteria=new ArrayList<BillDetailExample.Criteria>();
	}

}
