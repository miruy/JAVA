package Food;

import java.util.ArrayList;

public interface FoodDAO {
	public int insert(FoodVO fv);
	public ArrayList<FoodVO> select();
	public int update(String food);
	
}
