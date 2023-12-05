package org.walker.model;

import org.walker.service.CourseService;

import java.util.ArrayList;
import java.util.List;

//"System Under Test" (SUT): CourseBusiness
public class CourseBusiness {
    private CourseService courseService;

    public CourseBusiness() {
    }

    public CourseBusiness(CourseService courseService) {
        this.courseService = courseService;
    }

    public List<String> recuperarCursosRelacionadosComSpring(String aluno){
        var cursosFiltrados = new ArrayList<String>();
        var todosOsCursos = courseService.recuperarCursos(aluno);

        for (String curso : todosOsCursos){
            if (curso.contains("Spring")){
                cursosFiltrados.add(curso);
            }
        }
        return cursosFiltrados;
    }

    public void deletarCursosNaoRelacionadosComSpring(String aluno) {
        var todosOsCursos = courseService.recuperarCursos(aluno);

        for (String curso : todosOsCursos){
            if (!curso.contains("Spring")){
                courseService.deletarCurso(curso);
            }
        }
    }
}
