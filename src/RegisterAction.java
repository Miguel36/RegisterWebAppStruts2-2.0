import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.opensymphony.xwork2.ActionSupport;


@SuppressWarnings("serial")
public class RegisterAction extends ActionSupport{

	private String firstName;
	private String lastName;
	private String gender;
	private Integer age;
	private String email;
	private String address;
	private List<String> colors;
	private String selectedColor;
	private boolean subscription;
	private List<String> hobbies;
	private String selectedHobbies;
	private List<Product> products;
	
	
	public String initializeFormFields() {
		initializeColors();
		initializeHobbies();
		initializeProducts();
		return INPUT;
	}
	
	private void initializeColors() {
		colors = new ArrayList<>(
				Arrays.asList("Blue", "Red", "Green", "White")
		);
	}
	
	private void initializeHobbies() {
		hobbies = new ArrayList<String>(
				Arrays.asList("Drawing", "Teaching", "Singing", "Programming")
		);
	}
	
	private void initializeProducts() {
		products = new ArrayList<Product>();
		products.add(new Product(111, "Mobile phone", 10000));
		products.add(new Product(222, "Camera", 30000));
		products.add(new Product(333, "TV", 20000));
		products.add(new Product(444, "Laptop", 30000));
	}

	public String execute() {

		System.out.println("execute() method called");
		if (subscription) {
			System.out.println("You are a subscriber");
		}
		else {
			System.out.println("You are NOT a subscriber");
		}
		
		return "success";
	}
	
	
//	public void validate() {
//		if (firstName == null || firstName.equals("")) {
//			addFieldError("firstName", "First Name is required");
//		}
//		if (lastName == null || lastName.equals("")) {
//			addFieldError("lastName", "Last Name is required");
//		}
//		
//		if (gender == null) {
//			addFieldError("gender", "Gender is required");
//		}
//		
//		if (age == null) {
//			addFieldError("age", "Age is required");
//		}
//		else if (age <= 18) {
//			addFieldError("age", "Age should be above 18");
//		}
//		if (email == null || email.equals("")) {
//			addFieldError("email", "Email is required");
//		}
//	}
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getSelectedColor() {
		return selectedColor;
	}
	
	public void setSelectedColor(String selectedColor) {
		this.selectedColor = selectedColor;
	}
	
	public List<String> getColors() {
		return colors;
	}

	public void setColors(List<String> colors) {
		this.colors = colors;
	}

	public boolean isSubscription() {
		return subscription;
	}

	public void setSubscription(boolean subscription) {
		this.subscription = subscription;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public String getSelectedHobbies() {
		return selectedHobbies;
	}

	public void setSelectedHobbies(String selectedHobbies) {
		this.selectedHobbies = selectedHobbies;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
