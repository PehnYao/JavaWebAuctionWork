package org.csu.demo;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@org.apache.ibatis.annotations.Mapper
public interface Mapper {
    @Select("SELECT password FROM User WHERE id =#{id}")
    int getPassword(int id);
    @Insert("INSERT INTO user VALUES(id =#{id},password =#{password})")
    boolean sentUser(int password);
    @Insert("INSERT INTO googs VALUES(price =#{price})")
    boolean sentGoods(int price);
    @Delete("DELETE FROM goods WHERE id =#{ID}")
    boolean discardGoods(int id);
    @Update("UPDATE pirce FROM goods WHERE id =#{id}")
    boolean changePrice(int id);
}
