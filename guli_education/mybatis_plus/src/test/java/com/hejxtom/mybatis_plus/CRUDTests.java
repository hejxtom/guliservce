package com.hejxtom.mybatis_plus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hejxtom.mybatis_plus.entity.Product;
import com.hejxtom.mybatis_plus.entity.User;
import com.hejxtom.mybatis_plus.mapper.ProductMapper;
import com.hejxtom.mybatis_plus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Classname CRUDTests
 * @Description TODO
 * @Date 2020/9/19 15:31
 * @Created by hejx
 */
@SpringBootTest
@ComponentScan("com.hejxtom.mybatis_plus.handler")   //扫描handler包下
public class CRUDTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ProductMapper productMapper;

    @Test
    public void testInsert(){

        User user = new User();
        user.setName("Helen");
        user.setEmail("55317332@qq.com");
        user.setAge(18);
//        user.setCreateTime(new Date());
//        user.setUpdateTime(new Date());

        //返回值：影响的行数
        int result = userMapper.insert(user);
        System.out.println("影响的行数：" + result);
        System.out.println("user id：" + user.getId());
    }

    @Test
    public void testUpdateById(){

        User user = new User();
        user.setId(5L);
        user.setAge(28);
        user.setName("Annie");
//        user.setUpdateTime(new Date());

        int result = userMapper.updateById(user);
        System.out.println("影响的行数：" + result);
    }

    @Test
    public void testConcurrentUpdate() {

        //1、小李
        Product p1 = productMapper.selectById(1L);
        System.out.println("小李取出的价格：" + p1.getPrice());

        //2、小王
        Product p2 = productMapper.selectById(1L);
        System.out.println("小王取出的价格：" + p2.getPrice());

        //3、小李将价格加了50元，存入了数据库
        p1.setPrice(p1.getPrice() + 50);
        productMapper.updateById(p1);

        //4、小王将商品减了30元，存入了数据库
        p2.setPrice(p2.getPrice() - 30);
        int result = productMapper.updateById(p2);
        if(result == 0){//更新失败，重试
            //重新获取数据
            p2 = productMapper.selectById(1L);
            //更新
            p2.setPrice(p2.getPrice() - 30);
            productMapper.updateById(p2);
        }

        //最后的结果
        Product p3 = productMapper.selectById(1L);
        System.out.println("最后的结果：" + p3.getPrice());
    }

    @Test
    public void testSelectList() {
        List<User> users = userMapper.selectList(null);  //查询所有列的所有信息
        users.forEach(System.out::println);
    }

    @Test
    public void testSelectBatchIds(){
        User user=new User();
        List<User> users = userMapper.selectBatchIds(Arrays.asList(1, 2, 3));  //按照id批量查询
        users.forEach(System.out::println);
    }

    @Test
    public void testSelectByMap(){

        HashMap<String, Object> map = new HashMap<>();
        //map中的key对应数据库中的列名。如：数据库user_id，实体类是userId，这时map的key需要填写user_id
      //  map.put("name", "Helen");
        map.put("age", 28);
        List<User> users = userMapper.selectByMap(map);   //按照列名条件批量查询

        users.forEach(System.out::println);
    }


    @Test
    public void testSelectPage() {

        QueryWrapper<User> userQueryWrapper=new QueryWrapper<>();
        QueryWrapper<User> select = userQueryWrapper.select("id", "name","email","age"); //与数据库名一致
        /**
         * 查询并显示所有列
         *
         */
        /*Page<User> page = new Page<>(1,5);
        Page<User> pageParam = userMapper.selectPage(page, userQueryWrapper); //null:查询所有;userQueryWrapper按照设定的列查询
        pageParam.getRecords().forEach(System.out::println);*/

        /**
         *
         * 查询并显示设定列
         */
        Page<Map<String,Object>> page = new Page<>(1,5);
        Page<Map<String,Object>> pageParam = userMapper.selectMapsPage(page, userQueryWrapper); //null:查询所有;userQueryWrapper按照设定的列查询
        pageParam.getRecords().forEach(System.out::println);

        System.out.println("当前页数："+pageParam.getCurrent());
        System.out.println("总页数："+pageParam.getPages());
        System.out.println("一页"+pageParam.getSize()+"条数据");
        System.out.println("总条数："+pageParam.getTotal());
        System.out.println("是否有下一页："+pageParam.hasNext());
        System.out.println("是否有上一页："+pageParam.hasPrevious());
    }

    @Test
    public void testDeleteById(){
      //  int result =userMapper.deleteById(5L); //根据id删除

        int result=userMapper.deleteBatchIds(Arrays.asList(1307321880373485570L,1307321899096780801L)); //批量删除
        System.out.println("删除了"+result+"行");
    }

    @Test
    public void testDeleteByMap(){
        /**
         * 简单条件删除
         *
         */
        HashMap<String,Object> hashMap=new HashMap<>();
        hashMap.put("name", "Helen");
        hashMap.put("age", 18);

        int result = userMapper.deleteByMap(hashMap);
        System.out.println("删除了"+result+"行");
    }

    @Test
    public void testDeleteLogicById(){
        int result =userMapper.deleteById(1307326362800951298L); //根据id删除

       // int result=userMapper.deleteBatchIds(Arrays.asList(1307321880373485570L,1307321899096780801L)); //批量删除
        System.out.println("删除了"+result+"行");
    }

    @Test
    public void testLogicSelectList() {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }
}
