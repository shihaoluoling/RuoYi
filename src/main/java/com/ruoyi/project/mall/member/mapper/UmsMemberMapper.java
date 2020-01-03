package com.ruoyi.project.mall.member.mapper;

import com.ruoyi.project.mall.member.domain.UmsMember;

import java.util.List;

/**
 * 会员Mapper接口
 *
 * @author mallplus
 * @date 2019-09-17
 */
public interface UmsMemberMapper {
    /**
     * 查询会员
     *
     * @param id 会员ID
     * @return 会员
     */
    public UmsMember selectUmsMemberById(Long id);

    /**
     * 查询会员列表
     *
     * @param umsMember 会员
     * @return 会员集合
     */
    public List<UmsMember> selectUmsMemberList(UmsMember umsMember);

    /**
     * 新增会员
     *
     * @param umsMember 会员
     * @return 结果
     */
    public int insertUmsMember(UmsMember umsMember);

    /**
     * 修改会员
     *
     * @param umsMember 会员
     * @return 结果
     */
    public int updateUmsMember(UmsMember umsMember);

    /**
     * 删除会员
     *
     * @param id 会员ID
     * @return 结果
     */
    public int deleteUmsMemberById(Long id);

    /**
     * 批量删除会员
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteUmsMemberByIds(String[] ids);
}
