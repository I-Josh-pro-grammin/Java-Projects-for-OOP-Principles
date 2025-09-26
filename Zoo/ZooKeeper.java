package Zoo;

import animals.Animal;

public class ZooKeeper extends Animal {
    public void display() {
        Animal animal = new Animal();
        System.out.println(name);
    }

    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        zooKeeper.display();
    }
}
