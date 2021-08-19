package com.funny.trade.domain.order.entity;


import com.funny.combo.core.base.BaseEntity;
import com.funny.combo.core.ddd.annotion.Entity;
import lombok.Data;


@Data
@Entity
public class OrderCycleInfoEntity extends BaseEntity {
    private static final long serialVersionUID = 1589179229502L;

    /**
    * 订单ID
    */
    protected String orderId;

    /**
    * 节点编号
    */
    protected Integer nodeId;

    /**
    * 节点名称
    */
    protected String nodeName;

    /**
    * 节点描述
    */
    protected String nodeDesc;

    /**
    * 写入系统
    */
    protected String sys;


}
