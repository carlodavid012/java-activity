package artifact;

import static org.junit.Assert.*;

import org.junit.Test;
import com.ayannah.artifact.Chess;
import com.ayannah.artifact.MyCalculation;
import com.ayannah.artifact.Name;
import com.ayannah.artifact.TestClass;

public class TestArtifact {

	
	@Test
	public void test() {
		System.out.println("b");
		TestClass testClass = new TestClass();
		testClass.setName("test");
		System.out.println(testClass.getName());
	}

	@Test
	public void test2() {
		System.out.println("b");
		TestClass testClass = new TestClass();
		testClass.setName("test");
		System.out.println(testClass.getName());
	}
	
	@Test
	public void test3() {
		Chess chess = new Chess();
	}
	
	@Test
	public void test4() {
	
		MyCalculation myCalculation = new MyCalculation();
		myCalculation.multiply(5, 5);
	}
	
	@Test
	public void test5() {
	
		Name name = new Name();
		System.out.println(name.getName());
		System.out.println(name.getAge());
		

	}
	
	
	
}
