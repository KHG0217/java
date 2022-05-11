package test.dto;

public class UserInfoDto {
	//필드의 접근 지정자는 private로 지정
	private int num;
	private String name;
	private String addr;
	private String food;
	private String allergy;
	private int visited;
	private String lastvisited;
	//default 생성자가 있어야 한다.
	
	public UserInfoDto() {}

	public UserInfoDto(int num, String name, String addr, String food, String allergy, int visited, String lastvisited) {
		super();
		this.num = num;
		this.name = name;
		this.addr = addr;
		this.food = food;
		this.allergy = allergy;
		this.visited = visited;
		this.lastvisited = lastvisited;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getAllergy() {
		return allergy;
	}

	public void setAllergy(String allergy) {
		this.allergy = allergy;
	}

	public int getVisited() {
		return visited;
	}

	public void setVisited(int visited) {
		
	
		this.visited = visited;
		
	}

	public String getLastvisited() {
		return lastvisited;
	}

	public void setLastvisited(String lastvisited) {
		this.lastvisited = lastvisited;
	}


	
}
