package encapsulation;

public class Human {
	 private String nameLastName="Fazli Kuzhan";
	    private int age =36;
	    private String date;// bos birak
	    private String adress="Kayseri";
		private float weight=65f;// bos birak
	    private float height;//bos birak
	    private float bmi;// bos birak
	   
		public String getNameLastName() {
			return nameLastName;
		}
		public void setNameLastName(String nameLastName) {
			this.nameLastName = nameLastName;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getAdress() {
			return adress;
		}
		public void setAdress(String adress) {
			this.adress = adress;
		}
		public float getWeight() {
			return weight;
		}
		public void setWeight(float weight) {
			this.weight = weight;
		}
		public float getHeight() {
			return height;
		}
		public void setHeight(float height) {
			this.height = height;
		}
		public float getBmi() {
			return bmi;
		}
		public void setBmi(float bmi) {
			this.bmi = bmi;
		}
	    
}
