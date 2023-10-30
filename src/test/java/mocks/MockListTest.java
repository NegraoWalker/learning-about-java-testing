package mocks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class MockListTest {
    @Mock
    private List<?> list;
    @Test
    public void testeListaMockadaDeveRetornar10QuandoOMetodoSizeForChamado(){
        //Given:
        Mockito.when(list.size()).thenReturn(10);
        //When & Then:
        Assertions.assertEquals(10,list.size());
    }

    @Test
    public void testeListaMockadaDeveRetornarMultiplosValoresQuandoOMetodoSizeForChamado(){
        //Given:
        Mockito.when(list.size()).thenReturn(10).thenReturn(20).thenReturn(30);
        //When & Then:
        Assertions.assertEquals(10,list.size());
        Assertions.assertEquals(20,list.size());
        Assertions.assertEquals(30,list.size());
    }

    @Test
    public void testeListaMockadaDeveRetornarWalkerQuandoOMetodoGetNaPosicao0ForChamado(){
        //Given:
        List list1 = mock(List.class);
        Mockito.when(list1.get(0)).thenReturn("Walker");
        //When & Then:
        Assertions.assertEquals("Walker",list1.get(0));
        Assertions.assertNull(list1.get(1));
    }

    @Test
    public void testeListaMockadaDeveRetornarWalkerQuandoOMetodoGetEmQualquerPosicaoForChamado(){
        //Given:
        List list2 = mock(List.class);
        Mockito.when(list2.get(anyInt())).thenReturn("Walker");
        //When & Then:
        Assertions.assertEquals("Walker",list2.get(anyInt()));
        Assertions.assertNotNull(list2.get(3));
    }

    @Test
    public void testeListaMockadaDeveRetornarUmaRuntimeException(){
        List list3 = mock(List.class);
        Mockito.when(list3.get(anyInt())).thenThrow(new RuntimeException("Exceção lançada!"));
        Assertions.assertThrows(RuntimeException.class,()->{list3.get(anyInt());},()-> "Deveria ter lançado uma RuntimeException!");
    }
}
