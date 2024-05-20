package com.mybatisflex.tutorial;

import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.tutorial.entity.Account;
import com.mybatisflex.tutorial.entity.table.AccountTableDef;
import com.mybatisflex.tutorial.mapper.AccountMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisflexTutorialApplicationTests {

    @Autowired
    private AccountMapper accountMapper;

    @Test
    void contextLoads() {
        QueryWrapper queryWrapper = QueryWrapper.create()
                .select(AccountTableDef.ACCOUNT.ALL_COLUMNS)
                .from(AccountTableDef.ACCOUNT)
                .where(AccountTableDef.ACCOUNT.AGE.eq(18));
        Account account = accountMapper.selectOneByQuery(queryWrapper);
        System.out.println(account);
    }

}
