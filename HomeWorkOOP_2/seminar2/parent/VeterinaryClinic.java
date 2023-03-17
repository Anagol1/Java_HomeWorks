package seminar2.parent;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    /**
     * Список животных - клиентов клиники.
     */
    private final List<Animal> ANIMALS;

    public VeterinaryClinic() {
        this.ANIMALS = new ArrayList<>();
    }

    public VeterinaryClinic addAnimal(Animal animal) {
        ANIMALS.add(animal);
        return this;
    }

    public List<Animal> getANIMALS() {
        return ANIMALS;
    }

    public List<Speakable> getSpeakable() {
        List<Speakable> result = new ArrayList<>();
        for (Animal animal: getANIMALS()) {
            if (animal instanceof Speakable) {
                result.add((Speakable) animal);
            }
        }
        return result;
    }

    public List<Flyable> getFlyable() {
        List<Flyable> result2 = new ArrayList<>();
        for (Animal animal: getANIMALS()) {
            if (animal instanceof Flyable) {
                result2.add((Flyable) animal);
            }
        }
        return result2;
    }

    public List<Runnable> getRunnuble() {
        List<Runnable> result3 = new ArrayList<>();
        for (Animal animal : getANIMALS()) {
            if (animal instanceof Runnable) {
                result3.add((Runnable) animal);
            }
        }
        return result3;
    }

    public List<Animal> getAllAnymals() {
        List<Animal> result4 = new ArrayList<>();
        for (Animal animal : getANIMALS()) {

            result4.add(animal);

        }
        return result4;
    }
}
