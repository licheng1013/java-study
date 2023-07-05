package com.demo.命令模式;

import com.demo.命令模式.impl.Broker;
import com.demo.命令模式.impl.BuyStock;
import com.demo.命令模式.impl.SellStock;
import com.demo.命令模式.impl.Stock;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();
        //Stock 里面有多种命令

        //但具体得执行交由Order的实现去调用，但不执行
        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        //在Broker里面去添加执行的命令，并且进行批量执行
        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();

        //命令类 > 具体命令执行类 > 执行器。
    }
}