package collection.test.Q6;

public class MemberMain {
    public static void main(String[] args) {

        Member member1 = new Member("id1", "회원1");
        Member member2 = new Member("id2", "회원2");
        Member member3 = new Member("id3", "회원3");
        MemberRepository repository = new MemberRepository();
        repository.save(member1);
        repository.save(member2);
        repository.save(member3);




    }
}
