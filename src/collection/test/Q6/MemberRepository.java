package collection.test.Q6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MemberRepository {
    private HashMap<String, Member> map = new HashMap<>();

    public void save(Member member) {
        map.put(member.getId(), member);
    }
    public Member findById(String id) {
        if(map.containsKey(id)) {
            return map.get(id);
        }
        return null;
    }
    public Member findByName(String name) {
        for(Member member : map.values()) {
            if(member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }
    public void remove(String id) {
        map.remove(id);
    }
}
