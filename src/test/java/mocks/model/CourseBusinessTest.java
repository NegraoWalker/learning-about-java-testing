package mocks.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.walker.model.CourseBusiness;
import org.walker.service.CourseService;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CourseBusinessTest {

    /*Quero mockar a dependência da interface CourseService na classe CourseBusiness para usar no método de testeDeCursosRelacionadosComSpringUtilizandoMock*/
    @Mock
    private CourseService courseService;
    private CourseBusiness courseBusiness;

    @Test
    public void testeDeCursosRelacionadosComSpringUtilizandoMock(){

        courseBusiness = new CourseBusiness(courseService);
        Mockito.when(courseService.recuperarCursos("Walker")).thenReturn(exemploCursos("Walker"));

        var cursosFiltrados = courseBusiness.recuperarCursosRelacionadosComSpring("Walker");
        assertEquals(4, cursosFiltrados.size());

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