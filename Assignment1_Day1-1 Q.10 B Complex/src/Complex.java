
public class Complex {
	
	private float real;
	private float imaginary;
	
	public Complex() {
		real = (float)0.0;
		imaginary = (float)0.0;
		
	}
	
	public Complex(float real, float imaginary) {
		super();
		this.real = real;
		this.imaginary = imaginary;
	}

	public float getReal() {
		return real;
	}
	public void setReal(float real) {
		this.real = real;
	}
	public float getImaginary() {
		return imaginary;
	}
	public void setImaginary(float imaginary) {
		this.imaginary = imaginary;
	}

	public Complex addition(Complex c) {
		Complex add = new Complex();
		add.setReal(real+c.getReal());
		add.setImaginary(imaginary+c.getImaginary());
		return add;
	}
	
	public Complex subtraction(Complex c) {

		Complex sub = new Complex();
		sub.setReal(real-c.getReal());
		sub.setImaginary(imaginary-c.getImaginary());
		return sub;
	}
	
	
}
