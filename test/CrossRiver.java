import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class CrossRiver {

	private static int count  = 3;
	
	private static List<Container> leftContainer = new ArrayList<Container>();
	private static List<Container> rightContainer = new ArrayList<Container>();
	
	private static boolean isLeft = false;
	
	
	public static void main(String[] args) {
//		init();
//		while(rightContainer.size()>0){
//			crossRiver();
//		}
		int i =1;
		System.out.println(i+++i+++i+++i++);
		
	}
	
	private static boolean crossRiver() {
		Container c1 = null;
		Container c2 = null;
		boolean canCross = true;
		Random random =new Random();
		while(canCross){
			canCross = false;
			if(!isLeft){
				//move left
				c1 = rightContainer.remove(random.nextInt(rightContainer.size()));
				c2 = rightContainer.remove(random.nextInt(rightContainer.size()));
				leftContainer.add(c1);
				leftContainer.add(c2);
				if(check(leftContainer)&&check(rightContainer)){
					System.out.println("move ok, right to left");
					isLeft = !isLeft;
					return true;
				}else{
					rightContainer.add(c1);
					rightContainer.add(c2);
					leftContainer.remove(c1);
					leftContainer.remove(c2);
					continue;
				}
			}else{
				//move right
				c1 = leftContainer.remove(random.nextInt(leftContainer.size()));
				c2 = leftContainer.remove(random.nextInt(leftContainer.size()));
				rightContainer.add(c1);
				rightContainer.add(c2);
				if(check(leftContainer)&&check(rightContainer)){
					System.out.println("move ok, left to right");
					isLeft = !isLeft;
					return true;
				}else{
					rightContainer.add(c1);
					rightContainer.add(c2);
					leftContainer.remove(c1);
					leftContainer.remove(c2);
					continue;
				}
			}
		}
		isLeft = !isLeft;
		return true;
	}
	
	
	private static boolean check(List<Container> checkList){
		if(checkList.size()<=0){
			return true;
		}
		int personCount = 0;
		int ghostCount = 0;
		for(Container c: checkList){
			if(c instanceof Person){
				personCount ++;
			}else{
				ghostCount ++;
			}
		}
		return personCount>=ghostCount;
	}
	

	private static void init(){
		isLeft = false;
		for(int i=0;i<count;i++){
			rightContainer.add(new Person());
			System.out.println("init person "+i);
			rightContainer.add(new Ghost());
			System.out.println("init ghost "+i);
		}
	}
}

class Container{
	
}

class Person extends Container{
	int mask = 0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + mask;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (mask != other.mask)
			return false;
		return true;
	}
	
}

class Ghost extends Container{
	int mask = 1;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + mask;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ghost other = (Ghost) obj;
		if (mask != other.mask)
			return false;
		return true;
	}
	
}



