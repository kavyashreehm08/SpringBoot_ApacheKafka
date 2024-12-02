package ApacheKafka.FirstProject.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

class DispatchServiceTest {

    private DispatchService dispatchService;

    @Test
    void process() {
        //Given

        //String valuePayload ="Payload";
        //when
       dispatchService=new DispatchService();
        dispatchService.process("Payload");
        //Then
       // assertEquals("Payload",valuePayload);
    }
}