package ApacheKafka.FirstProject.handler;

import ApacheKafka.FirstProject.service.DispatchService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

//@ExtendWith(MockitoExtension.class): This annotation integrates the Mockito framework with JUnit 5.
@ExtendWith(MockitoExtension.class)
class OrderCreatedHandlerTest {

    private static final Logger log = LoggerFactory.getLogger(OrderCreatedHandlerTest.class);

    //@Mock: This annotation creates a mock instance of the DispatchService.
    @Mock
    private DispatchService dispatchService;
    //@InjectMocks: This annotation creates an instance of OrderCreatedHandler and injects the mock DispatchService into it.
    @InjectMocks
    private OrderCreatedHandler orderCreatedHandler;

    @Test
    void testListen() {
        //Given
        String payload= "payload";
        //When
        orderCreatedHandler.listen(payload);
        //Then
        verify(dispatchService, times(1)).process(payload);
        log.info("Verified that DispatchService.process() was called with payload: " + payload);
    }
}