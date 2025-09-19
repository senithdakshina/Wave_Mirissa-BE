package com.wave.Mirissa.dtos;

import com.wave.Mirissa.models.OrderStatus;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class OrderResponseDTO {
    private String orderId;
    private OrderStatus orderStatus;
    private String paymentMethod;
    private BigDecimal amount;
    private List<OrderItemResponseDTO> items;

    // New fields
    private String trackingNumber;
    private Date estimateDate;
    private Date createdAt;


    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public List<OrderItemResponseDTO> getItems() {
        return items;
    }

    public void setItems(List<OrderItemResponseDTO> items) {
        this.items = items;
    }

    // --- New getters and setters ---
    public String getTrackingNumber() { return trackingNumber; }
    public void setTrackingNumber(String trackingNumber) { this.trackingNumber = trackingNumber; }

    public Date getEstimateDate() { return estimateDate; }
    public void setEstimateDate(Date estimateDate) { this.estimateDate = estimateDate; }
    public Date getCreatedAt() { return createdAt; }
    public void setCreatedAt(Date createdAt) { this.createdAt = createdAt; }
}
