package com.company;
/**
 * lab5.Circle
 * @author Oleinych Danyil
 * @vesrsion 1.0
 * @since 2020-10-30|20.00
 */
import java.util.Objects;

public class Circle implements IGeometry,IPackage {
    private double radius;
    private double angle;

    public Circle(double radius, double angle) {
        this.radius = radius;
        this.angle = angle;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    @Override
    public double getPerimeter() {
        return (2 * Math.PI * this.getRadius());
    }

    @Override
    public double getArea() {
        return (Math.PI * this.getRadius() * this.getRadius());
    }

    public double getArcLength() {
        return ((this.getAngle() * this.getPerimeter()) / 360);
    }

    public double getInscribedAngle() {
        return (this.getAngle() / 2);
    }

    public double getSector() {
        return (this.getArea() * (this.getAngle() / 360));
    }

    public double getChordLength() {
        double rad = Math.toRadians(this.getAngle());
        return (2 * Math.PI * Math.sin(rad / 2));
    }

    public double getSegmentArea() {
        double rad = Math.toRadians(this.getAngle());
        return (this.getRadius() * this.getRadius() * 0.5 * (rad - Math.sin(rad)));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.getRadius(), getRadius()) == 0 &&
                Double.compare(circle.getAngle(), getAngle()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRadius(), getAngle());
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", angle=" + angle +
                '}';
    }

    @Override
    public String toJSON() {
        return " \n \"Circle\": {" +
                "\n \"radius\": " + this.getRadius() + "," +
                "\n \"angle\": " + this.getAngle() + "," +
                "\n}";
    }

    @Override
    public String toXML(){
        return "<Circle>"
                + "<radius>" + this.getRadius() + "</radius"
                + "<angle>" + this.getAngle() + "</angle"
                + "</Triangle";
    }
}
