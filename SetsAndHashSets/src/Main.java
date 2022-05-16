import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private static Map<String, HeavenlyBodies> solarSystem = new HashMap<>(); // Key Value pairs
    private static Set<HeavenlyBodies> planets = new HashSet<>(); // Groups all planets together

    public static void main(String[] args) {
        // MERCURY
        HeavenlyBodies temp = new HeavenlyBodies("Mercury", 88);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        // VENUS
        temp = new HeavenlyBodies("Venus", 225);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        // EARTH & MOON OF EARTH
        temp = new HeavenlyBodies("Earth", 365);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        HeavenlyBodies tempMoon = new HeavenlyBodies("Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        // MAR & MOONS OF MARS
        temp = new HeavenlyBodies("Mars", 687);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBodies("Deimos", 1.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Mars

        tempMoon = new HeavenlyBodies("Phobos", 0.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Mars

        // JUPITER & MOONS OF JUPITER
        temp = new HeavenlyBodies("Jupiter", 4332);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBodies("Io", 1.8);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new HeavenlyBodies("Europa", 3.5);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new HeavenlyBodies("Ganymede", 7.1);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new HeavenlyBodies("Callisto", 16.7);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        // SATURN
        temp = new HeavenlyBodies("Saturn", 10759);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        // URANUS
        temp = new HeavenlyBodies("Uranus", 30660);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        // NEPTUNE
        temp = new HeavenlyBodies("Neptune", 165);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        // PLUTO
        temp = new HeavenlyBodies("Pluto", 248);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        System.out.println("P L A N E T S");
        for(HeavenlyBodies planet : planets){
            System.out.println("\t" + planet.getName());
        }

        HeavenlyBodies body = solarSystem.get("Jupiter");
        System.out.println("MOONS OF "+body.getName());
        for(HeavenlyBodies jupiterMoon : body.getSatellites()){
            System.out.println("\t"+jupiterMoon.getName()); // Prints out all the moons of Jupiter
        }

        // SET HOLDING THE MOONS FROM ALL THE PLANETS
        Set<HeavenlyBodies> moon = new HashSet<>();
        for(HeavenlyBodies planet : planets){
            moon.addAll(planet.getSatellites()); // Adds all the moons onto the new Set Moon
            // Add all method creates a set union => All unique
        };

        System.out.println(" ALL MOONS OF THE PLANETS ");
        for(HeavenlyBodies moonOfPlanet : moon){
            System.out.println("\t"+moonOfPlanet.getName());
        }

        HeavenlyBodies pluto = new HeavenlyBodies("Pluto", 842);
        planets.add(pluto);

        for(HeavenlyBodies planet : planets){
            System.out.println(planet.getName()+" : "+planet.getOrbitalPeriod());
        }

        Object o = new Object(); // Base object all other objects inherit from
        o.equals(o);
        "pluto".equals("");
    }
}