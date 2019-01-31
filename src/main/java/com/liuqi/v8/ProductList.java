package com.liuqi.v8;

import java.util.List;

/**
 * 商品数据类：具体聚合类
 */
public class ProductList extends AbstractObjectList {
    public ProductList(List objects) {
        super(objects);
    }

    @Override
    public AbstractIterator createIterator() {
        return new ProductIterator(this);
    }
}
