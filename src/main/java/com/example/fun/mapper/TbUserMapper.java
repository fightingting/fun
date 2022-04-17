package com.example.fun.mapper;

import com.example.fun.entity.TbUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户信息表 Mapper 接口
 * </p>
 *
 * @author tingting
 * @since 2022-04-17
 */
@Mapper
public interface TbUserMapper extends BaseMapper<TbUser> {

}
