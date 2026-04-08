public class Cachorro extends Animal {
    public void fazerSom() {
        System.out.println("O cachorro late: Au Au!");
    }
    
}

abstract class Animal {
    public abstract void fazerSom();
}
