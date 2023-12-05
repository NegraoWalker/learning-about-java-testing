package mocks.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.walker.model.CourseBusiness;
import org.walker.service.CourseService;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.*;

@ExtendWith(MockitoExtension.class)
class CourseBusinessInjectMocksTest {

    /*Quero mockar a dependência da interface CourseService na classe CourseBusiness para usar no método de testeDeCursosRelacionadosComSpringUtilizandoMock*/
    @Mock
    private CourseService courseService;
    @InjectMocks
    private CourseBusiness courseBusiness;

    @Test
    public void testeDeCursosRelacionadosComSpringUtilizandoMock(){

//        courseBusiness = new CourseBusiness(courseService);
        Mockito.when(courseService.recuperarCursos("Walker")).thenReturn(exemploCursos("Walker"));

        var cursosFiltrados = courseBusiness.recuperarCursosRelacionadosComSpring("Walker");
        assertEquals(4, cursosFiltrados.size());

    }

    @Test
    public void testeDeletarCursosNaoRelacionadosComSpringUsandoMockitoVerify(){
//        courseBusiness = new CourseBusiness(courseService);
        Mockito.when(courseService.recuperarCursos("Walker")).thenReturn(exemploCursos("Walker"));
        courseBusiness.deletarCursosNaoRelacionadosComSpring("Walker");

        //Vamos verificar se o método deletarCurso foi chamado para cursos não relacionados com Spring:
        Mockito.verify(courseService).deletarCurso("REST API's RESTFul do 0 à Azure com ASP.NET Core 5 e Docker");
        Mockito.verify(courseService).deletarCurso("Agile Desmistificado com Scrum, XP, Kanban e Trello");
        Mockito.verify(courseService).deletarCurso("Spotify Engineering Culture Desmistificado");
        Mockito.verify(courseService).deletarCurso("Kotlin para DEV's Java: Aprenda a Linguagem Padrão do Android");
        

        //Usando paramêtros do verify:
        Mockito.verify(courseService,Mockito.times(1)).deletarCurso("Docker para Amazon AWS Implante Apps Java e .NET com Travis CI");
        Mockito.verify(courseService,Mockito.atLeast(1)).deletarCurso("Docker para Amazon AWS Implante Apps Java e .NET com Travis CI");
        Mockito.verify(courseService,Mockito.atLeastOnce()).deletarCurso("Docker para Amazon AWS Implante Apps Java e .NET com Travis CI");
        Mockito.verify(courseService,Mockito.never()).deletarCurso("REST API's RESTFul do 0 à AWS com Spring Boot 3 Java e Docker");
    }

    @Test
    public void testeDeletarCursosNaoRelacionadosComSpringUsandoMockitoVerifyVersao2(){
//        courseBusiness = new CourseBusiness(courseService);
        Mockito.when(courseService.recuperarCursos("Walker")).thenReturn(exemploCursos("Walker"));
        courseBusiness.deletarCursosNaoRelacionadosComSpring("Walker");

        //Vamos verificar se o método deletarCurso foi chamado para cursos não relacionados com Spring:
        then(courseService).should().deletarCurso("REST API's RESTFul do 0 à Azure com ASP.NET Core 5 e Docker");
        then(courseService).should().deletarCurso("Agile Desmistificado com Scrum, XP, Kanban e Trello");
        then(courseService).should().deletarCurso("Spotify Engineering Culture Desmistificado");
        then(courseService).should().deletarCurso("Kotlin para DEV's Java: Aprenda a Linguagem Padrão do Android");

        //Usando paramêtros do then should:
        then(courseService).should(never()).deletarCurso("REST API's RESTFul do 0 à AWS com Spring Boot 3 Java e Docker");


    }

    @Test
    public void testeDeletarCursosNaoRelacionadosComSpringCapturandoArgumentosUsandoMockito(){
//        courseBusiness = new CourseBusiness(courseService);

        ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);

        Mockito.when(courseService.recuperarCursos("Walker")).thenReturn(exemploCursos("Walker"));
        courseBusiness.deletarCursosNaoRelacionadosComSpring("Walker");

        Mockito.verify(courseService,times(7)).deletarCurso(argumentCaptor.capture());
        Assertions.assertEquals(7,argumentCaptor.getAllValues().size());

    }



    public List<String> exemploCursos(String aluno) {
        return Arrays.asList(
                "REST API's RESTFul do 0 à Azure com ASP.NET Core 5 e Docker",
                "Agile Desmistificado com Scrum, XP, Kanban e Trello",
                "Spotify Engineering Culture Desmistificado",
                "REST API's RESTFul do 0 à AWS com Spring Boot 3 Java e Docker",
                "Docker do Zero à Maestria - Contêinerização Desmistificada",
                "Docker para Amazon AWS Implante Apps Java e .NET com Travis CI",
                "Microsserviços do 0 com Spring Cloud, Spring Boot e Docker",
                "Arquitetura de Microsserviços do 0 com ASP.NET, .NET 6 e C#",
                "REST API's RESTFul do 0 à AWS com Spring Boot 3 Kotlin e Docker",
                "Kotlin para DEV's Java: Aprenda a Linguagem Padrão do Android",
                "Microsserviços do 0 com Spring Cloud, Kotlin e Docker"
        );
    }
}