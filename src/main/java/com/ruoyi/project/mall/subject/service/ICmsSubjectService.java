package com.ruoyi.project.mall.subject.service;

import com.ruoyi.project.mall.subject.domain.CmsSubject;

import java.util.List;

/**
 * 专题Service接口
 *
 * @author mallplus
 * @date 2019-09-17
 */
public interface ICmsSubjectService {
    /**
     * 查询专题
     *
     * @param id 专题ID
     * @return 专题
     */
    public CmsSubject selectCmsSubjectById(Long id);

    /**
     * 查询专题列表
     *
     * @param cmsSubject 专题
     * @return 专题集合
     */
    public List<CmsSubject> selectCmsSubjectList(CmsSubject cmsSubject);

    /**
     * 新增专题
     *
     * @param cmsSubject 专题
     * @return 结果
     */
    public int insertCmsSubject(CmsSubject cmsSubject);

    /**
     * 修改专题
     *
     * @param cmsSubject 专题
     * @return 结果
     */
    public int updateCmsSubject(CmsSubject cmsSubject);

    /**
     * 批量删除专题
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCmsSubjectByIds(String ids);

    /**
     * 删除专题信息
     *
     * @param id 专题ID
     * @return 结果
     */
    public int deleteCmsSubjectById(Long id);
}
