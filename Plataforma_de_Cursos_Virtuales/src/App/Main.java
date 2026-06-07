package App;

import Adapter.*;
import Builder.Certificado;
import Builder.DirectorCertificado;
import Composite.CursoComposite;
import Composite.Leccion;
import Composite.Modulo;
import Decorator.*;
import Factory.Curso;
import Factory.CursoFactory;
import Factory.ProgramacionFactory;
import Singleton.GestorSeccion;

public class Main {
    public static void main(String [] args){
        System.out.println("[---FACTORY---]");
        CursoFactory factory= new ProgramacionFactory();
        Curso curso = factory.crearCurso();
        curso.mostrarCurso();
        System.out.println("[---SINGLETON---]");

        GestorSeccion.getInstance()
                .iniciarSeccion("Carlos");
        GestorSeccion.getInstance()
                        .iniciarSeccion("luis ");

        System.out.println("[---BUILDER---]");

        DirectorCertificado director = new DirectorCertificado();
        Certificado certificado = director.crearCertificado(
                        "Carlos",
                        "Java Avanzado",
                        " 22/07/2026");
        System.out.println(certificado);
        Certificado certificado1 = director.crearCertificado(
                        "Luis",
                        "Redes de computadora",
                        "20/07/2026");
        System.out.println(certificado1);

        System.out.println("[---COMPOSITE---]");

        System.out.println("Composite de carlos");
        Leccion l1 = new Leccion("POO");
        Leccion l2 = new Leccion("Patrones de Diseño");
        Modulo modulo1 = new Modulo("Java");
        modulo1.agregar(l1);
        modulo1.agregar(l2);
       CursoComposite cursoCompleto = new CursoComposite("Java Intell");
        cursoCompleto.agregar(modulo1);
        cursoCompleto.mostrar();

        System.out.println("composite de luis");
        Leccion l01= new Leccion("BD");
        Leccion l02= new Leccion("Bases de datos");
        Modulo modulo02= new Modulo("SQL server");
        modulo02.agregar(l01);
        modulo02.agregar(l02);
        CursoComposite cursoCompleto1 = new CursoComposite("sql");
        cursoCompleto1.agregar(modulo02);
        cursoCompleto1.mostrar();


        System.out.println("[---ADAPTER---");

        System.out.println("Adarter de carlos");
        PlataformaVideo zoom = new ZoomAdapter(new Zoom());
        zoom.conectar();
        PlataformaVideo meet = new GoogleMeetAdapter(new GoogleMeet());
        meet.conectar();

        System.out.println("adarter de luis");
        PlataformaVideo zoom1 = new ZoomAdapter(new Zoom());
        zoom1.conectar();
        PlataformaVideo meet1 = new GoogleMeetAdapter(new GoogleMeet());
        meet1.conectar();

        System.out.println("[---DECORATOR---");

        System.out.println("decorator de carlos");
        CursoOnline premium = new AccesoVIP(new MaterialExtra(
                                new CertificadoPremium(
                                        new CursoBase()
                                )
                        )
                );

        premium.descripcion();
        System.out.println("decorator de luis");
        CursoOnline Premiun1 = new AccesoVIP(new MaterialExtra(
                new CertificadoPremium(
                        new CursoBase()
                )
        ));
        premium.descripcion();
    }
}