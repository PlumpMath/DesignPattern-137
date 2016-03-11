package com.cbn.immutable;

import java.io.Serializable;

final public class Complex extends Number implements Serializable, Cloneable, Comparable<Complex> {

	/**
	 * 虚数单位
	 */
	static final public Complex i = new Complex(0.0,1.0);
	/**
	 * 复数的实部
	 */
	private double re;
	/**
	 * 复数的虚部
	 */
	private double im;
	
	public Complex(Complex z){
		this.re = z.re;
		this.im = z.im;
	}
	
	public Complex(double d, double e) {
		this.re = d;
		this.im = e;
	}
	
	public Complex(){
		this.re = 0;
		this.re = 0;
	}
	
	@Override
	public int compareTo(Complex o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null){
			return false;
		}else if(obj instanceof Complex){
			return equals((Complex)obj);
		}else
			return false;
	}
	
	public boolean equals(Complex z){
		return (re == z.re && im == z.im);
	}

	@Override
	public int hashCode() {
		long re_bit = Double.doubleToLongBits(re);
		long im_bit = Double.doubleToLongBits(im);
		return (int)((re_bit^im_bit)^((re_bit^im_bit)>>32));
	}
	/**
	 * 返回实部
	 * @param z
	 * @return
	 */
	public static double real(Complex z){
		return z.re;
	}
	
	public static double im(Complex z){
		return z.im;
	}
	/**
	 * 静态方法，返还作为参数传入的复数的相反数-z
	 * @param z
	 * @return
	 */
	public static Complex negate(Complex z){
		return new Complex(-z.re,-z.im);
	}
	/**
	 * 共轭
	 * @param z
	 * @return
	 */
	public static Complex conjugate(Complex z){
		return new Complex(z.re,-z.im);
	}
	/**
	 * 返还两个数的和x+y
	 * @param x
	 * @param y
	 * @return
	 */
	public static Complex add(Complex x, Complex y){
		return new Complex(x.re+y.re,x.im+y.im);
	}
	
	public static Complex add(double x, Complex y){
		return new Complex(x+y.re,y.im);
	}
	public static Complex add(Complex x, double y){
		return new Complex(x.re+y,x.im);
	}
	
	public static Complex subtract(Complex x, Complex y){
		return new Complex(x.re-y.re,x.im-y.im);
	}
	public static Complex subtract(Complex x, double y){
		return new Complex(x.re - y, x.im);
	}
	public static Complex subtract(double x, Complex y){
		return new Complex(x-y.re, -y.im);
	}
	
	public static Complex multiply(Complex x, Complex y){
		return new Complex(x.re*y.re-x.im*y.im, x.re*y.im+x.im*y.re);
	}
	public static Complex multiply(double x, Complex y){
		return new Complex(x*y.re,x*y.im);
	}
	public static Complex multiply(Complex x, double y){
		return new Complex(x.re*y,x.im*y);
	}
}
