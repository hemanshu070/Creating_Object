package Builder_Methods;

public class Driver {

	public static void main(String[] args) {
		
		NutritionFacts cocacola = new NutritionFacts.Builder(240,8).calories(100).sodium(35).fat(67).build();
		// TODO Auto-generated method stub
        System.out.println(cocacola.toString());
	}

}
