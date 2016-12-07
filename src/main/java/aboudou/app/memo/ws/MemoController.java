package aboudou.app.memo.ws;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import aboudou.app.memo.Utility;
import aboudou.app.memo.entities.Memo;



@RestController
@RequestMapping("/memo")
@CrossOrigin
public class MemoController {


	@RequestMapping(value="add",method=RequestMethod.POST)
	public void addMemo(@RequestBody Memo memo) 
	{
		Utility.addMemo(memo);
	}
	

	@RequestMapping(value="get", method=RequestMethod.GET)
	public List<Memo> getMemo() {
		
		return Utility.readMemos();
	}
	
	
}
