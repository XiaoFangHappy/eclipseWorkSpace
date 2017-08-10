package test13_4;


/**
 * 创建一个KeyTest类,让这个类的对象作为HashMap 的键Key使用,并找出相应的Value值。
 * @author lenovo
 *
 */
public class KeyTest {
	private String key;

	public KeyTest() {
	}
	
	public KeyTest(String key) {
		super();
		this.key = key;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(obj instanceof KeyTest) {
			KeyTest s = (KeyTest) obj;
			if(this.key.equals(s.key)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return key.hashCode();
	}
}
