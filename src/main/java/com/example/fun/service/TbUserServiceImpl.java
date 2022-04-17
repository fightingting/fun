package com.example.fun.service;

import com.example.fun.entity.TbUser;
import com.example.fun.mapper.TbUserMapper;
import com.example.fun.service.TbUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author tingting
 * @since 2022-04-17
 */
@Service
public class TbUserServiceImpl extends ServiceImpl<TbUserMapper, TbUser> implements TbUserService {

}
