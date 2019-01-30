package com.liuqi.v6;

/**
 * 设计模式之适配器模式
 * 适配器模式(Adapter Pattern)：将一个接口转换成客户希望的另一个接口，使接口不兼容的那些类可以一起工作，其别名为包装器(Wrapper)。
 * 适配器模式既可以作为类结构型模式，也可以作为对象结构型模式。
 *
 * 在对象适配器模式中，适配器与适配者之间是关联关系；在类适配器模式中，适配器与适配者之间是继承（或实现）关系。
 * --------------------------------
 * 操作适配器：适配器
 */
public class OperationAdapter implements ScoreOperation {

    //定义适配者QuickSort对象
    private QuickSort sortObj;
    //定义适配者BinarySearch对象
    private BinarySearch searchObj;

    public OperationAdapter() {
        sortObj = new QuickSort();
        searchObj = new BinarySearch();
    }

    @Override
    public int[] sort(int[] array) {
        //调用适配者类QuickSort的排序方法
        return sortObj.quickSort(array);
    }

    @Override
    public int search(int[] array, int key) {
        //调用适配者类BinarySearch的查找方法
        return searchObj.binarySearch(array,key);
    }
}
