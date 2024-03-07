package kr.co.user.dao;

import kr.co.user.dto.User2DTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class User2DAO {

    private final SqlSessionTemplate mybatis;

    @Autowired
    public User2DAO(SqlSessionTemplate mybatis) {
        this.mybatis = mybatis;
    }

    public void insertUser2(User2DTO user2DTO){
        mybatis.insert("user2.insertUser2", user2DTO);
    }
    public User2DTO selectUser2(String id){
        return mybatis.selectOne("user2.selectUser2", id);
    }
    public List<User2DTO> selectUser2s(){
        return mybatis.selectList("user2.selectUser2s");
    }
    public void updateUser2(User2DTO user2DTO){
        mybatis.update("user2.updateUser2", user2DTO);
    }
    public void deleteUser2(String id){
        mybatis.update("user2.deleteUser2", id);
    }
}
