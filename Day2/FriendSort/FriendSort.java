import java.util.Arrays;

class FriendSort{
    String[] friends;
    int i;
    FriendSort(int size){
        friends=new String[size];
        i=0;
    }
    private void addFriend(String friend) {
        if(i<friends.length){
            friends[i]=friend;
            i++;
        }
        else{System.out.println("no space");}

    }
    public static void main(String[] args) {
        FriendSort friend=new FriendSort(5);
        friend.addFriend("Ravi");
        friend.addFriend("Aravind");
        friend.addFriend("Zariya");
        friend.addFriend("Dennis");
        friend.addFriend("Wipro");
        System.out.println("Before Sorting:");
        friend.printFriends();
        friend.sortFriends();
        System.out.println("After Sorting:");
        friend.printFriends();
    }

    private void printFriends() {
        System.out.println(Arrays.toString(friends));
    }

    private void sortFriends() {
        Arrays.sort(friends);
    }


}