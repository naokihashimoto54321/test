package com.example.springsample.repository;
import org.apache.ibatis.annotations.Mapper;
import com.example.springsample.dto.UserSearchRequest;
import com.example.springsample.entity.User;
/**
 * ユーザー情報 Mapper
 */
@Mapper
public interface UserMapper {
    /**
     * ユーザー情報検索
     * @param id ID
     * @return ユーザー情報
     */
    User search(UserSearchRequest user);
}