package days17;


public interface IDBConn {
	
	public abstract void open();
	void close();
	
	void select();
	void insert();
	void update();
	void delete();
	
}
