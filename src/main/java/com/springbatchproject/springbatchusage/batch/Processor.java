package com.springbatchproject.springbatchusage.batch;

import com.springbatchproject.springbatchusage.model.User;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Processor implements ItemProcessor<User, User> {

    private static final Map<String, String> DEPT_NAMES = new HashMap<>();

    public Processor() {
        DEPT_NAMES.put("001", "Technology");
        DEPT_NAMES.put("002", "Operations");
        DEPT_NAMES.put("003L", "Accounts");
    }

    @Override
    public User process(User user) throws Exception {
        String deptCode = user.getDepartmentId();
        String dept = DEPT_NAMES.get(deptCode);
        user.setDepartmentId(dept);

        return user;
    }
}
