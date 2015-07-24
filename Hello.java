import static java.lang.System.out;

public class Hello {
	Runnable hilo1 = () -> {out.println(this);out.println("1");};
	Runnable hilo2 = () -> {out.println(toString());out.println('2');};

	public String toString() { return "¡¡¡ Hola, mundo !!!"; }

	public static void main(String... args) {
		new Hello().hilo1.run(); //Hello, world!
		new Hello().hilo2.run(); //Hello, world!
	}
}

