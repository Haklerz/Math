package com.voidfall.math;

/**
 * Represents a 2-Dimentional cartesian vector.
 */
public class Vector2 {
    private double x;
    private double y;

    /**
     * Creates a vector with cartesian coordinates x and y.
     * 
     * @param x x coordinate
     * @param y y coordinate
     */
    public Vector2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Returns the vector's x coordinate.
     * 
     * @return The vector's x coordinate
     */
    public double getX() {
        return x;
    }

    /**
     * Returns the vector's y coordinate.
     * 
     * @return The vector's y coordinate
     */
    public double getY() {
        return y;
    }

    /**
     * Returns a new vector with the same coordinates.
     * 
     * @return A new vector with the same coordinates
     */
    public Vector2 copy() {
        return new Vector2(x, y);
    }

    /**
     * Adds a vector v to the vector.
     * 
     * @param v The vector to add
     * @return The vector after addition
     */
    public Vector2 add(Vector2 v) {
        x += v.x;
        y += v.y;
        return this;
    }

    /**
     * Subtracts a vector v from the vector.
     * 
     * @param v The vector to add
     * @return The vector after subtraction
     */
    public Vector2 sub(Vector2 v) {
        x -= v.x;
        y -= v.y;
        return this;
    }

    /**
     * Scales the vector by a factor s.
     * 
     * @param v The scalar
     * @return The vector after scaling
     */
    public Vector2 mul(double s) {
        x *= s;
        y *= s;
        return this;
    }

    /**
     * Scales the vector by a factor 1/s.
     * 
     * @param v The inverse scalar
     * @return The vector after scaling
     */
    public Vector2 div(double s) {
        x /= s;
        y /= s;
        return this;
    }

    /**
     * Returns the dot product the vector and a vector v.
     * 
     * @param v The vector to dot
     * @return The dot product
     */
    public double dot(Vector2 v) {
        return x * v.x + y * v.y;
    }

    /**
     * Returns the square of the vector's magnitude.
     * 
     * @return The square of the vector's magnitude
     */
    public double magSq() {
        return dot(this);
    }

    /**
     * Returns the vector's magnitude.
     * 
     * @return The vector's magnitude
     */
    public double mag() {
        return Math.sqrt(magSq());
    }

    /**
     * Returns the vector's angle in radians in the range -pi to pi.
     * 
     * @return The vector's angle
     */
    public double ang() {
        return Math.atan2(y, x);
    }

    /**
     * Normalizes the vector to a length of 1.
     * 
     * @return The vector after normalization
     */
    public Vector2 normalize() {
        return div(mag());
    }

    /**
     * Adds a vector u to a vector v.
     * 
     * @param u The first vector
     * @param v The second vector
     * @return The result of the addition
     */
    public static Vector2 add(Vector2 u, Vector2 v) {
        return u.copy().add(v);
    }

    /**
     * Subtracts a vector u from a vector v.
     * 
     * @param u The first vector
     * @param v The second vector
     * @return The result of the subtraction
     */
    public static Vector2 sub(Vector2 u, Vector2 v) {
        return u.copy().sub(v);
    }

    /**
     * Scales a vector v by a factor s.
     * 
     * @param v The vector
     * @param s The scalar
     * @return The result of the scaling
     */
    public static Vector2 mul(Vector2 v, double s) {
        return v.copy().mul(s);
    }

    /**
     * Scales a vector v by a factor 1/s.
     * 
     * @param v The vector
     * @param s The scalar
     * @return The result of the scaling
     */
    public static Vector2 div(Vector2 v, double s) {
        return v.copy().div(s);
    }

    /**
     * Returns the dot product of two vectors u and v.
     * 
     * @param u The first vector
     * @param v The second vector
     * @return The dot product
     */
    public static double dot(Vector2 u, Vector2 v) {
        return u.dot(v);
    }

    /**
     * Returns the square of the magnitude of a vector v.
     * 
     * @param v The vector
     * @return The square of the magnitude
     */
    public static double magSq(Vector2 v) {
        return v.magSq();
    }

    /**
     * Returns the magnitude of a vector v.
     * 
     * @param v The vector
     * @return The magnitude
     */
    public static double mag(Vector2 v) {
        return v.mag();
    }

    /**
     * Returns the angle of a vector v.
     * 
     * @param v The vector
     * @return The angle of vector v
     */
    public static double ang(Vector2 v) {
        return v.ang();
    }

    /**
     * Returns the normalization of a vector v.
     * 
     * @param v The vector v
     * @return The normalization of vector v
     */
    public static Vector2 normalize(Vector2 v) {
        return v.copy().normalize();
    }

    /**
     * Returns a vector with the magnitude r and angle t.
     * 
     * @param r The magnitude
     * @param t The angle
     * @return A polar vector with magnitude r and angle t
     */
    public static Vector2 polar(double r, double t) {
        return new Vector2(Math.cos(t), Math.sin(t)).mul(r);
    }
}