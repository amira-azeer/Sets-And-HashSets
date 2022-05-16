import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBodies { // The class is declared as final thus cannot be sub classes
    private final String name; // Planet name
    private final double orbitalPeriod;
    private final Set<HeavenlyBodies> satellites; // The moons

    public HeavenlyBodies(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>(); // Initializing it as a Hash Set within the constructor
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenlyBodies moon){
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBodies> getSatellites() {
        // Does not have access to the original hash set => line 12
        return new HashSet<>(this.satellites); // Immutability (Security provision)
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());
        if(obj == null || (obj.getClass() != this.getClass())){ // Prevents Null Pointer exception
            return false;
        }
        String objName = ((HeavenlyBodies) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() { // Generating Hash Codes for the Heavenly Bodies names
//        System.out.println("Hash Code called");
        return this.name.hashCode() + 57;
    }
}
