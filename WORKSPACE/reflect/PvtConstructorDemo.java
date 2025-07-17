package com.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

class Vehicle {

	private Integer vId;
	private String vName;

	private Vehicle() {
		super();
	}

	private Vehicle(Integer vId, String vName) {
		this.vId = vId;
		this.vName = vName;
	}

	public void setVehicleId(Integer vId) {
		this.vId = vId;
	}

	public void setVehicleName(String vName) {
		this.vName = vName;
	}

	public Integer getVehicleId() {
		return vId;
	}

	public String getVehicleName() {
		return vName;
	}
}

public class PvtConstructorDemo {
	
	public void craeteObj(int vId, String vName) throws Exception {
		
		Constructor<Vehicle> constt = Vehicle.class.getDeclaredConstructor();

		constt.setAccessible(true);
		Object obj = constt.newInstance();
		if (obj instanceof Vehicle) {
			Vehicle v = (Vehicle) obj;
			v.setVehicleId(vId);
			v.setVehicleName(vName);
			System.out.println("Vehicle Id: " + v.getVehicleId());
			System.out.println("Vehicle Name: " + v.getVehicleName());
		}
	}

	public void craeteObjByConstructorName(int vId, String vName) throws Exception {

		Constructor<Vehicle> constt = Vehicle.class.getDeclaredConstructor(Integer.class, String.class);

		if (Modifier.isPrivate(constt.getModifiers())) {
			constt.setAccessible(true);

			Object obj = constt.newInstance(vId, vName);
			if (obj instanceof Vehicle) {
				Vehicle v = (Vehicle) obj;
				System.out.println("Vehicle Id: " + v.getVehicleId());
				System.out.println("Vehicle Name: " + v.getVehicleName());
			}
		}
	}

	public static void main(String argvs[]) throws Exception {

		PvtConstructorDemo ob = new PvtConstructorDemo();
		ob.craeteObj(20, "Indica");
		System.out.println(" -------------------------- ");
		ob.craeteObjByConstructorName(30, "Alto");
	}
}