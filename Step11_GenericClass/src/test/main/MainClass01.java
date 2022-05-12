package test.main;

import test.mypac.Apple;
import test.mypac.Banana;
import test.mypac.FruitBox;

public class MainClass01 {
	public static void main(String[] args) {
		//Generic Ŭ������ Apple�� �����ؼ� FruitBox ��ü �����ϱ�.
		FruitBox<Apple> box1 =new FruitBox<Apple>();
		//�޼ҵ��� ���ڷ� Apple type �����ϱ�
		box1.setItem(new Apple());
		//�޼ҵ尡 �������ִ� Apple type �޾ƿ���.
		Apple item1=box1.getItem();
		System.out.println(item1);
		
		//Generic Ŭ������ Banana�� �����ؼ� FruitBo ��ü�� �����ؼ� ���� ����� �۾��� �غ�����
		FruitBox<Banana> box2 =new FruitBox<Banana>();
		//FruitBox<Banana> box2 =new FruitBox<new �Ҷ� ����� �� ����>();
		box2.setItem(new Banana());
		Banana item2=box2.getItem();
	}
}
