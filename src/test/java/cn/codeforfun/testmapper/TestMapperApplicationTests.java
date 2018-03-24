package cn.codeforfun.testmapper;

import cn.codeforfun.testmapper.generator.mapper.TUserMapper;
import cn.codeforfun.testmapper.generator.model.TUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMapperApplicationTests {

  @Resource
  private TUserMapper tUserMapper;

  @Test
  public void contextLoads() {
    List<TUser> tUsers = tUserMapper.selectAll();
    System.out.println(tUsers.size());
  }

}
