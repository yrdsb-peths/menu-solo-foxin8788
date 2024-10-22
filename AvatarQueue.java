import java.util.LinkedList;
import java.util.Queue;

public class AvatarQueue
{

    private Queue<String> avatarQueue;
    

    public AvatarQueue() {
        avatarQueue = new LinkedList<>();
        avatarQueue.add("face_a");
        avatarQueue.add("face_b");
        avatarQueue.add("face_c");
    }

    public String getNextAvatar() {
        String nextAvatar = avatarQueue.poll();
        avatarQueue.add(nextAvatar); // Re-enqueue the avatar to the end of the queue
        return nextAvatar;
    }
}