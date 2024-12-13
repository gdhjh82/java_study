package com.gn.practice03.controller;

import com.gn.practice03.model.vo.Bicyle;
import com.gn.practice03.model.vo.Car;
import com.gn.practice03.model.vo.Vehicle;

public class Run {
	public static void main(String[] args) {
		Vehicle v1 = new Car();
		v1.go();
		Vehicle v2 = new Bicyle();
		v2.go();
		
		Vehicle myVehicle = new Vehicle();
		
	}

}
