package com.ruoyi.project.mall.subject.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.text.Convert;
import com.ruoyi.project.mall.subject.domain.CmsSubject;
import com.ruoyi.project.mall.subject.mapper.CmsSubjectMapper;
import com.ruoyi.project.mall.subject.service.ICmsSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 专题Service业务层处理
 *
 * @author mallplus
 * @date 2019-09-17
 */
@Service
public class CmsSubjectServiceImpl implements ICmsSubjectService {
    @Autowired
    private CmsSubjectMapper cmsSubjectMapper;

    /**
     * 查询专题
     *
     * @param id 专题ID
     * @return 专题
     */
    @Override
    public CmsSubject selectCmsSubjectById(Long id) {
        return cmsSubjectMapper.selectCmsSubjectById(id);
    }

    /**
     * 查询专题列表
     *
     * @param cmsSubject 专题
     * @return 专题
     */
    @Override
    public List<CmsSubject> selectCmsSubjectList(CmsSubject cmsSubject) {
        return cmsSubjectMapper.selectCmsSubjectList(cmsSubject);
    }

    /**
     * 新增专题
     *
     * @param cmsSubject 专题
     * @return 结果
     */
    @Override
    public int insertCmsSubject(CmsSubject cmsSubject) {
        cmsSubject.setCreateTime(DateUtils.getNowDate());
        return cmsSubjectMapper.insertCmsSubject(cmsSubject);
    }

    /**
     * 修改专题
     *
     * @param cmsSubject 专题
     * @return 结果
     */
    @Override
    public int updateCmsSubject(CmsSubject cmsSubject) {
        cmsSubject.setUpdateTime(DateUtils.getNowDate());
        return cmsSubjectMapper.updateCmsSubject(cmsSubject);
    }

    /**
     * 删除专题对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCmsSubjectByIds(String ids) {
        return cmsSubjectMapper.deleteCmsSubjectByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除专题信息
     *
     * @param id 专题ID
     * @return 结果
     */
    public int deleteCmsSubjectById(Long id) {
        return cmsSubjectMapper.deleteCmsSubjectById(id);
    }
}
