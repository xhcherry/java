package javaLesson.Ex4.Exa4_8;

public class Exa4_8 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(10);
        Circular circular = new Circular();
        System.out.println("circle�����ã�" + circle);
        System.out.println("Բ׶��bottom���ã�" + circular.bottom);
        circular.setHeight(5);
        circular.setBottom(circle);
        System.out.println("circle�����ã�" + circle);
        System.out.println("Բ׶��bottom���ã�"+ circular.bottom);
        System.out.println("Բ׶�������"+circular.getVolume());
        System.out.println("�޸�circle�İ뾶��bottom�İ뾶ͬ���仯");
        circle.setRadius(20);
        System.out.println("bottom�İ뾶��"+circular.getBottomRadius());
        System.out.println("���´���circle,circle�����ý������仯");
        circle = new Circle();
        System.out.println("corcle�����ã�"+circle);
        System.out.println("���ǲ�Ӱ��circular��bottom������");
        System.out.println("Բ׶��bottom������:"+circular.bottom);
    }
}
