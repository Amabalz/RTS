package LabSession6.Part2.DataObjects;

import java.io.Serializable;
import LabSession6.Part2.DataOnly.CarQueue;
import LabSession6.Part2.Enumerations.PetriObjectType;
import LabSession6.Part2.Interfaces.PetriObject;

public class DataCarQueue implements LabSession6.Part2.Interfaces.PetriObject, Cloneable, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public void Execute() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Start() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Stop() {
		// TODO Auto-generated method stub

	}

	@Override
	public PetriObjectType GetType() {
		return PetriObjectType.DataCarQueue;
	}

	public CarQueue Value = new CarQueue();

	@Override
	public Object GetValue() {
		return Value;
	}

	@Override
	public void SetValue(Object value) {

	}

	// Overriding clone() method of Object class
	public PetriObject clone() throws CloneNotSupportedException {
		return (DataCarQueue) super.clone();
	}

	public boolean Printable = true;
	@Override
	public boolean IsPrintable() {
		return Printable;
	}
	public String toString() {
		if (Value != null) {
			return GetName() + "|" + Value.toString() + "|";
		} else {
			return GetName() +"(Null)";
		}
	}

	private String name = "";

	@Override
	public String GetName() {
		return name;
	}

	@Override
	public void SetName(String name) {
		this.name = name;
	}

	@Override
	public void AddElement(Object value) {
		if (value == null) {
			Value = null;
			SetToken(false);
		}
		if (value instanceof DataCar) {
			Value.AddCar((DataCar) value);
			SetToken(true);
		}
	}
	
	private boolean token;

	@Override
	public void SetToken(boolean token) {
		this.token = token;
	}

	@Override
	public boolean GetToken() {
		return this.token;
	}
}
