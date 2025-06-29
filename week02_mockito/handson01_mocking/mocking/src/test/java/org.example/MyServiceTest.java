package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class MyServiceTest {
    @Test
    public void testExternalApi() {
        // 1. Create a mock for ExternalApi
        ExternalApi mockApi = mock(ExternalApi.class);

        // 2. Stub the getData() method
        when(mockApi.getData()).thenReturn("Mock Data");

        // 3. Inject mock into service
        MyService service = new MyService(mockApi);

        // 4. Call service method and verify
        String result = service.fetchData();
        assertEquals("Mock Data", result);
    }
}
