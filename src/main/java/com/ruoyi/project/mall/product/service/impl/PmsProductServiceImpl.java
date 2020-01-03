package com.ruoyi.project.mall.product.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.text.Convert;
import com.ruoyi.project.mall.product.domain.PmsProduct;
import com.ruoyi.project.mall.product.mapper.PmsProductMapper;
import com.ruoyi.project.mall.product.service.IPmsProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品信息Service业务层处理
 *
 * @author mallplus
 * @date 2019-09-17
 */
@Service
public class PmsProductServiceImpl implements IPmsProductService {
    @Autowired
    private PmsProductMapper pmsProductMapper;

    /**
     * 查询商品信息
     *
     * @param id 商品信息ID
     * @return 商品信息
     */
    @Override
    public PmsProduct selectPmsProductById(Long id) {
        return pmsProductMapper.selectPmsProductById(id);
    }

    /**
     * 查询商品信息列表
     *
     * @param pmsProduct 商品信息
     * @return 商品信息
     */
    @Override
    public List<PmsProduct> selectPmsProductList(PmsProduct pmsProduct) {
        return pmsProductMapper.selectPmsProductList(pmsProduct);
    }

    /**
     * 新增商品信息
     *
     * @param pmsProduct 商品信息
     * @return 结果
     */
    @Override
    public int insertPmsProduct(PmsProduct pmsProduct) {
        pmsProduct.setCreateTime(DateUtils.getNowDate());
        return pmsProductMapper.insertPmsProduct(pmsProduct);
    }

    /**
     * 修改商品信息
     *
     * @param pmsProduct 商品信息
     * @return 结果
     */
    @Override
    public int updatePmsProduct(PmsProduct pmsProduct) {
        pmsProduct.setUpdateTime(DateUtils.getNowDate());
        return pmsProductMapper.updatePmsProduct(pmsProduct);
    }

    /**
     * 删除商品信息对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deletePmsProductByIds(String ids) {
        return pmsProductMapper.deletePmsProductByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除商品信息信息
     *
     * @param id 商品信息ID
     * @return 结果
     */
    public int deletePmsProductById(Long id) {
        return pmsProductMapper.deletePmsProductById(id);
    }
}
