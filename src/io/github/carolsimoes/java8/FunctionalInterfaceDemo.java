package io.github.carolsimoes.java8;

@FunctionalInterface
public interface FunctionalInterfaceDemo {
	
	public void test();
	
	public default void defaultMethod() {
		System.out.println("default method");
	}
	
	public static void staticMethod() {
		System.out.println("static method");
	}
}
