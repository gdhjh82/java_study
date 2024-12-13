package com.gn.strudy.cotrller;

import com.gn.strudy.mpdel.vo.Alarm;
import com.gn.strudy.mpdel.vo.Animal;
import com.gn.strudy.mpdel.vo.Beverage;
import com.gn.strudy.mpdel.vo.Cat;
import com.gn.strudy.mpdel.vo.Coffee;
import com.gn.strudy.mpdel.vo.Dog;
import com.gn.strudy.mpdel.vo.Earth;
import com.gn.strudy.mpdel.vo.FireAlarm;
import com.gn.strudy.mpdel.vo.Mars;
import com.gn.strudy.mpdel.vo.OrangeJuice;
import com.gn.strudy.mpdel.vo.Planet;

public class Run {
	public static void main(String[] args) {
		
		// 1. 기본 자료형의 업캐스팅.
		int i_num = 3;
		double d_num = i_num;
		System.out.println(d_num);
		
		// 다형성의 형변환 (업캐스팅)
		Beverage b1 = new Coffee();
		Beverage b2 = new OrangeJuice();
		
		
		//다운 캐스팅 할거면 굳이 쓸 필요는 없다. 밑에것들을
		b1.drink();
		//b1. ice();
		
		//부모를 자식으로 낮추는 법.
		((Coffee)b1).ice();
		((OrangeJuice)b2).fresh();
		
		Coffee b3 = new Coffee();
		//위에꺼 아래에 이렇게도 쓸수 있다. 
		b3 = (Coffee)b1;
		b3.ice();
		b2.drink();
		
		//2. 객체 배열과 다형성
		//부모 배열 칸에 자식 놈들도 들어올 수 있다.
		Beverage[] arr = new Beverage[3];
		
		Beverage bev = new Beverage();
		arr[0] = bev;
		
		Coffee cof = new Coffee();
		arr[1] = cof;
		
		OrangeJuice oj = new OrangeJuice();
		arr[2] = oj;
		
		// 업캐스팅, 객체 배열을 이용하고 for each를 이용해서
		//베버리지 안에 자식들 까지 싹다 호출이 된다.
		for(Beverage b : arr) {
			b.drink();
			//만약에 진짜 데이터가 Coffee면 ice()메소드 호출하고.
			if(b instanceof Coffee) {
				((Coffee)b).ice();
			}
			//만약에 진짜 데이터가 OrangeJuice면 fresh()메소드 호출
			else if(b instanceof OrangeJuice){
				((OrangeJuice)b).fresh();
			}
			
		
		}
		
		// 3. 클래스 타운캐스팅.
		
		// 4. 정적 바인딩 -> 오버로딩
		System.out.println("==================");
		Planet myPlanet = new Planet();
		myPlanet.description();
		myPlanet.description(46);
		
		// 5. 동적 바인딩 ->
		Planet p1 = new Earth();
		Planet p2 = new Mars();
		p1.material();
		p2.material();
		
		
		//6. 추상 메소드
		//Aimal a = new Animal();
		
		Animal dog = new Dog();
		dog.sound();
		Animal cat = new Cat();
		cat.sound();
		cat.breath();
		
		
		// 7. 인터페이스
		Alarm a = new FireAlarm();
		System.out.println(a.MAX_VOLUME);
		a.soundAlarm();
	}
}
