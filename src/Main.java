import java.util.List;

public class Main {
    public static void main(String[] args) {
        int budget = 300000;

        System.out.println("犬を飼いたい‼︎︎");
        System.out.println("家が狭く小型犬しか飼えそうにないし予算は" + budget+ "円");
        System.out.println("条件に合うのは・・・");

        Dog dog1 = new Dog("サモエド", 500000, "大型");

        Dog dog2 = new Dog("ポメラニアン", 300000, "小型");

        Dog dog3 = new Dog("ボーダーコリー", 280000,"中型");

        Dog dog4 = new Dog("チワワ", 400000, "小型");

        List<Dog> dogList = List.of(dog1,dog2,dog3,dog4);

        for (Dog dog : dogList) {
            if (dog.getSize().equals("小型")) {
                if (dog.getPrice() <= budget) {
                    System.out.println(dog.getName() + "は飼えそう‼︎");
                } else {
                    System.out.println(dog.getName() + "を飼うにはお金が足りない‼︎");
                }
            } else {
                System.out.println(dog.getName() +"は" + dog.getSize() + "だから飼うには家が狭い‼︎");
            }
        }

    }
}