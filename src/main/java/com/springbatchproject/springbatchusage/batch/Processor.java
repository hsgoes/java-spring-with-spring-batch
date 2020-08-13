package com.springbatchproject.springbatchusage.batch;

import com.springbatchproject.springbatchusage.model.User;
import org.springframework.batch.item.ItemProcessor;

import java.util.HashMap;
import java.util.Map;

public class Processor implements ItemProcessor<User, User> {

    private static final Map<Long, String> DEPT_NAMES = new HashMap<>();

    public Processor() {
        DEPT_NAMES.put(001L, "Technology");
        DEPT_NAMES.put(002L, "Operations");
        DEPT_NAMES.put(003L, "Accounts");
    }

    @Override
    public User process(User user) throws Exception {
        Long deptCode = user.getDepartmentId();
        String dept = DEPT_NAMES.get(deptCode);
        user.setDepartmentId(dept);

        return user;
    }
}
