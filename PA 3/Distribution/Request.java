public class Request {
    private String name;
    public final boolean isMember;
    public final int requestNum;

    public Request(String name, boolean isMember, int requestNum) {
	this.name = name;
	this.isMember = isMember;
	this.requestNum = requestNum;
    }

    @Override
    public String toString() {
	return "name: " + this.name + ", member: " + isMember + ", request number: " + requestNum;
    }
}
