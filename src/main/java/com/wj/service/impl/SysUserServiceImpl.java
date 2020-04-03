package com.wj.service.impl;

        import com.wj.dao.SysUserMapper;
        import com.wj.pojo.SysUser;
        import com.wj.pojo.SysUserExample;
        import com.wj.service.SysUserService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

        import java.util.List;
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;


    @Override
    public List<SysUser> selAllSysUser(SysUserExample example) {
        return sysUserMapper.selectByExample(example);
    }
}
