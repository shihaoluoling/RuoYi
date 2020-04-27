package com.ruoyi.project.mall.product.service;

import com.ruoyi.project.mall.product.domain.PmsProduct;

import java.util.List;

/**
 * 商品信息Service接口
 *
 * @author mallplus
 * @date 2019-09-17
 */
public interface IPmsProductService {
    /**
     * 查询商品信息
     *
     * @param id 商品信息ID
     * @return 商品信息
     */
    public PmsProduct selectPmsProductById(Long id);

    /**
     * 查询商品信息列表
     *
     * @param pmsProduct 商品信息
     * @return 商品信息集合
     */
    public List<PmsProduct> selectPmsProductList(PmsProduct pmsProduct);

    /**
     * 新增商品信息
     *
     * @param pmsProduct 商品信息
     * @return 结果
     */
    public int insertPmsProduct(PmsProduct pmsProduct);

    /**
     * 修改商品信息
     *
     * @param pmsProduct 商品信息
     * @return 结果
     */
    public int updatePmsProduct(PmsProduct pmsProduct);

    /**
     * 批量删除商品信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deletePmsProductByIds(String ids);

    /**
     * 删除商品信息信息
     *
     * @param id 商品信息ID
     * @return 结果
     */
    public int deletePmsProductById(Long id);
}
