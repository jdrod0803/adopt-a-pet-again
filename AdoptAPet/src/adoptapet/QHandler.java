
package adoptapet;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * This class takes care of what comes in and out of the queues
 * as well as handling the priority queue and syncing it with the other queues.
 */
public class QHandler {

    Queue<Pet> catQ = new LinkedList<Pet>();
    Queue<Pet> dogQ = new LinkedList<Pet>();
    PriorityQueue<Pet> priorityQ = new PriorityQueue<Pet>();
    Queue<Pet> tempQ = new LinkedList<Pet>();

    public QHandler() {

    }
    /**
     * This will remove a specified pet from a specified queue.
     * @param pet Pet to be removed
     * @param q Queue to be removed from.
     */
    public void takeSpecificPet(Pet pet, Queue<Pet> q) {
        System.out.println(pet.getName());
        while (!q.isEmpty()) {
            Pet qPet = q.remove();
            if (qPet.getDob() == pet.getDob()) {

            } else {
                tempQ.add(qPet);
            }
        }
        while (!tempQ.isEmpty()) {
            q.add(tempQ.remove());
        }
    }

    public Queue<Pet> getCatQ() {
        return catQ;
    }

    public void setCatQ(Queue<Pet> catQ) {
        this.catQ = catQ;
    }

    public Queue<Pet> getDogQ() {
        return dogQ;
    }

    public void setDogQ(Queue<Pet> dogQ) {
        this.dogQ = dogQ;
    }

    public PriorityQueue<Pet> getPriorityQ() {
        return priorityQ;
    }

    public void setPriorityQ(PriorityQueue<Pet> priorityQ) {
        this.priorityQ = priorityQ;
    }
}
