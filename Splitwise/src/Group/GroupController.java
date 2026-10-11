package Group;

import user.User;

import java.util.ArrayList;
import java.util.List;

public class GroupController {

    List<Group> groups;

    public GroupController() {
        this.groups = new ArrayList<>();
    }

    public Group createGroup(Long id, String name, List<User> users) {
        Group group = new Group(id, name, users);
        groups.add(group);
        return group;
    }
}
