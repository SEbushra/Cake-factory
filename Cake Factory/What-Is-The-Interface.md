### Java Interfaces

An **interface** is like a contract that defines what a class must provide, without necessarily defining how it should be implemented.

A class uses the `implements` keyword to implement an interface:

```java
interface Cake {
    void bake();
}

class ChocolateCake implements Cake {

    @Override
    public void bake() {
        System.out.println("Baking chocolate cake");
    }
}
```

The interface defines the method, while the implementing class provides its implementation.

### Interface and Polymorphism

Interfaces can be used with **polymorphism**:

```java
Cake cake = new ChocolateCake();
```

The reference type is `Cake`, while the actual object is `ChocolateCake`.

Different classes can implement the same interface and provide their own implementations:

```java
Cake cake1 = new ChocolateCake();
Cake cake2 = new VanillaCake();
```

This allows the code to work with different implementations through the same interface.

### Variables in Interfaces

Fields declared inside an interface are automatically:

```
java
public static final
```

Therefore, they are **constants**, not instance variables.

For example:

```java
interface Cake {
    int MAX_SIZE = 20;
}
```

This is equivalent to:

```java
public static final int MAX_SIZE = 20;
```

The value must be assigned when the constant is declared.

Classes that implement the interface **do not need to declare `MAX_SIZE` again**:

```
java
class ChocolateCake implements Cake {
}
```

They can access it directly:

```
java
System.out.println(MAX_SIZE);
```

or explicitly through the interface:

```
java
System.out.println(Cake.MAX_SIZE);
```

Each implementing class does **not** get its own copy of `MAX_SIZE`, because it is `static` and belongs to the interface itself.

An interface in Java does not have a constructor because we cannot create an object directly from an interface.

For example:

```
java
interface Animal {
    void makeSound();
}

// ❌ Not allowed
Animal a = new Animal();
```

Instead, a class implements the interface, and we create an object from that class:

```
java
class Cat implements Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}

Cat cat = new Cat(); // ✅
```

We can also use the interface as the reference type:

```
java
Animal cat = new Cat(); // ✅
```

Here, the object is still a `Cat` object. `Animal` is only the reference type.

**In short:**
An interface cannot be instantiated directly, so it does not have a constructor for creating objects.
