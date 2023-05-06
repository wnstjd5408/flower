package pakaCoding.flower.dto;

import lombok.Getter;
import lombok.Setter;
import pakaCoding.flower.domain.entity.OrderItem;

@Getter
@Setter
public class OrderItemDto {

    //리뷰 시 사용
    private Long orderItemId;
    private String flowerName;
    private int count;
    private int orderPrice;
    private String reviewYn;

    private String imgUrl;

    public OrderItemDto(OrderItem orderItem, String imgUrl) {
        this.orderItemId = orderItem.getId();
        this.flowerName = orderItem.getFlower().getName();
        this.count = orderItem.getCount();
        this.orderPrice = orderItem.getOrderPrice();
        this.reviewYn = orderItem.getReviewYn();
        this.imgUrl = imgUrl;
    }
}
