package hello.advanced.app.v5;

import hello.advanced.app.v3.OrderRepositoryV3;
import hello.advanced.trace.callback.TraceCallback;
import hello.advanced.trace.callback.TraceTemplate;
import hello.advanced.trace.logtrace.LogTrace;
import hello.advanced.trace.template.AbstractTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceV5 {

    private final OrderRepositoryV3 orderRepository;
    private final TraceTemplate template;

    public OrderServiceV5(OrderRepositoryV3 orderRepository, LogTrace trace) {
        this.orderRepository = orderRepository;
        this.template = new TraceTemplate(trace);
    }

    public void orderItem(String orderId) {
        template.execute("OrderService.orderItem()", () -> {
            orderRepository.save(orderId);
            return null;
        });
    }
}
