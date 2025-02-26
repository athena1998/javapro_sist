package days18;

import java.util.ArrayList;

import days16.Employee;
import days17.Car;
import days17.Engine;

public class Ex04_02 {

	public static void main(String[] args) {
		// Y_Engine -> Car 
		//      Y_Engine engine = new Y_Engine();
		//      Car tCar = new Car(engine);
		//      // tCar.~~~
		//      tCar.speedDown(100);
		//      tCar.speedDown(10);
		//      tCar.stop();



		// 객체는 한개 한번만 생성되니까 정말 딱 한번만 사용할 클래스
		// 여러번 사용할거면 위에 처럼 쓰는게 맞는데 정말 한번만 사용할거라면
		// 굳이 class 를 따로 만들 필요없다. 

		Car tCar = new Car(new Engine() {

			@Override
			public void stop() {
				// TODO Auto-generated method stub

			}

			@Override
			public void moreFuel(int fuel) {
				// TODO Auto-generated method stub

			}

			@Override
			public void lessFuel(int fuel) {
				// TODO Auto-generated method stub

			}

			Employee newTemp = new Employee() {

				@Override
				public int getPay() {
					// TODO Auto-generated method stub
					return 0;
				}
			};
		});
		
		System.out.println(" end ");

	} // main

} // class

//class Y_Engine implements Engine{
//    int speed;
//   
//   @Override
//   public void moreFuel(int fuel) {
//      speed += fuel * 0.5;
//   }
//
//   @Override
//   public void lessFuel(int fuel) {
//      speed -= fuel * 0.5;
//   }
//
//   @Override
//   public void stop() {
//       speed = 0;
//   }
//   
//}

