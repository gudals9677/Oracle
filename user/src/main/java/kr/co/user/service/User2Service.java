package kr.co.user.service;

import kr.co.user.dao.User2DAO;
import kr.co.user.dto.User2DTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class User2Service {

    private final User2DAO dao;

    @Autowired
    public User2Service(User2DAO dao) {
        this.dao = dao;
    }

    public void insertUser2(User2DTO user2DTO){
        dao.insertUser2(user2DTO);
    }
    public User2DTO selectUser2(String id){
        return dao.selectUser2(id);
    }
    public List<User2DTO> selectUser2s(){
        return dao.selectUser2s();
    }
    public void updateUser2(User2DTO user2DTO){
        dao.updateUser2(user2DTO);
    }
    public void deleteUser2(String id){
        dao.deleteUser2(id);
    }
}
