package mocks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.BDDMockito.given;

import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@ExtendWith(MockitoExtension.class)
public class MockListBDDTest {
    @Mock
    private List<?> list;
    @Test
    public void testeListaMockadaDeveRetornar10QuandoOMetodoSizeForChamado(){
        //:
        given(list.size()).willReturn(10);
        //When & Then:
        assertThat(list.size(),is(10));
    }

    @Test
    public void testeListaMockadaDeveRetornarMultiplosValoresQuandoOMetodoSizeForChamado(){
        //:
        given(list.size()).willReturn(10).willReturn(20).willReturn(30);
        //When & Then:
        assertThat(list.size(),is(10));
        assertThat(list.size(),is(20));
        assertThat(list.size(),is(30));
    }

    @Test
    public void testeListaMockadaDeveRetornarWalkerQuandoOMetodoGetNaPosicao0ForChamado(){
        //:
        List list1 = mock(List.class);
        given(list1.get(0)).willReturn("Walker");
        //When & Then:
        assertThat(list1.get(0),is("Walker"));
        assertNull(list1.get(1));
    }

    @Test
    public void testeListaMockadaDeveRetornarWalkerQuandoOMetodoGetEmQualquerPosicaoForChamado(){
        //:
        List list2 = mock(List.class);
        given(list2.get(anyInt())).willReturn("Walker");
        //When & Then:
        assertThat(list2.get(anyInt()),is("Walker"));
        assertThat(list2.get(anyInt()),is("Walker"));
    }

    @Test
    public void testeListaMockadaDeveRetornarUmaRuntimeException(){
        List list3 = mock(List.class);
        given(list3.get(anyInt())).willThrow(new RuntimeException("Exceção lançada!"));
        assertThrows(RuntimeException.class,()->{list3.get(anyInt());},()-> "Deveria ter lançado uma RuntimeException!");
    }
}
