package org.usfirst.frc5577.GearsBot;

public class Utility {
  public static double clamp(double value, double low, double high) {
    return Math.max(low, Math.min(value, high));
  }
}
