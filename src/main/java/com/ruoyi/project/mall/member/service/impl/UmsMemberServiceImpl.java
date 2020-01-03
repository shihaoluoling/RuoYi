package com.ruoyi.project.mall.member.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.text.Convert;
import com.ruoyi.project.mall.member.domain.UmsMember;
import com.ruoyi.project.mall.member.mapper.UmsMemberMapper;
import com.ruoyi.project.mall.member.service.IUmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 会员Service业务层处理
 *
 * @author mallplus
 * @date 2019-09-17
 */
@Service
public class UmsMemberServiceImpl implements IUmsMemberService {
    @Autowired
    private UmsMemberMapper umsMemberMapper;

    /**
     * 查询会员
     *
     * @param id 会员ID
     * @return 会员
     */
    @Override
    public UmsMember selectUmsMemberById(Long id) {
        return umsMemberMapper.selectUmsMemberById(id);
    }

    /**
     * 查询会员列表
     *
     * @param umsMember 会员
     * @return 会员
     */
    @Override
    public List<UmsMember> selectUmsMemberList(UmsMember umsMember) {
        return umsMemberMapper.selectUmsMemberList(umsMember);
    }

    /**
     * 新增会员
     *
     * @param umsMember 会员
     * @return 结果
     */
    @Override
    public int insertUmsMember(UmsMember umsMember) {
        umsMember.setCreateTime(DateUtils.getNowDate());
        return umsMemberMapper.insertUmsMember(umsMember);
    }

    /**
     * 修改会员
     *
     * @param umsMember 会员
     * @return 结果
     */
    @Override
    public int updateUmsMember(UmsMember umsMember) {
        umsMember.setUpdateTime(DateUtils.getNowDate());
        return umsMemberMapper.updateUmsMember(umsMember);
    }

    /**
     * 删除会员对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteUmsMemberByIds(String ids) {
        return umsMemberMapper.deleteUmsMemberByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除会员信息
     *
     * @param id 会员ID
     * @return 结果
     */
    public int deleteUmsMemberById(Long id) {
        return umsMemberMapper.deleteUmsMemberById(id);
    }
}
