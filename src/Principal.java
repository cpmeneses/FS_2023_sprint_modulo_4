import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

/**
 * La clase `Principal` es la clase principal del programa. Contiene el método `main` que
 * inicia la ejecución del programa y gestiona las interacciones con el usuario.
 */
public class Principal {
    private static Scanner sc;

    /**
     * El método `main` es el punto de entrada del programa.
     *
     * @param args Los argumentos de línea de comandos pasados al programa.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Contenedor contenedor = new Contenedor();
        inicializarContenedor(contenedor);

        boolean running = true;
        int opcion;
        do {
            System.out.println("Ingrese una opcion:");
            System.out.println("(1) Almacenar Cliente");
            System.out.println("(2) Almacenar Profesional");
            System.out.println("(3) Almacenar Administrativo");
            System.out.println("(4) Listar Usuarios");
            System.out.println("(5) Listar Usuarios por tipo");
            System.out.println("(6) Eliminar Usuarios por run");
            System.out.println("(7) Almacenar Capacitacion");
            System.out.println("(8) Listar Capacitacion");
            System.out.println("(9) Salir");
            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1:
                    // Almacenar Cliente
                    almacenarCliente(contenedor);
                    break;
                case 2:
                    // Almacenar Profesional
                    almacenarProfesional(contenedor);
                    break;
                case 3:
                    // Almacenar Administrativo
                    almacenarAdministrativo(contenedor);
                    break;
                case 4:
                    // Listar Usuarios
                    System.out.println("- Listar Usuarios -");
                    contenedor.listarUsuarios();
                    break;
                case 5:
                    // Listar Usuarios por tipo
                    System.out.println("- Listar Usuarios por tipo -");
                    contenedor.listarUsuariosPorTipo();
                    break;
                case 6:
                    // Eliminar Usuarios por run
                    eliminarUsuario(contenedor);
                    break;
                case 7:
                    // Almacenar Capacitación
                    almacenarCapacitacion(contenedor);
                    break;
                case 8:
                    // Listar Capacitaciones
                    System.out.println("- Listar Capacitaciones -");
                    contenedor.listarCapacitaciones();
                    break;
                case 9:
                    // Salir
                    running = false;
                    break;
                default:
                    System.out.println("Ingrese un número entre 1 y 9");
            }
        } while (running);
    }

    /**
     * El método `leerInformacionUsuario` se utiliza para leer y asignar la información básica
     * de un usuario, como nombre, apellidos, fecha de nacimiento y RUN.
     *
     * @param usuario El objeto `Usuario` al que se asignará la información.
     */
    private static void leerInformacionUsuario(Usuario usuario) {
        Scanner sc = new Scanner(System.in);

        String nombre;
        do {
            System.out.println("Ingrese nombre (campo obligatorio)");
            nombre = sc.nextLine();
        } while (nombre.equals(""));
        usuario.setNombre(nombre);

        String apellido1;
        do {
            System.out.println("Ingrese primer apellido (campo obligatorio)");
            apellido1 = sc.nextLine();
        } while (apellido1.equals(""));
        usuario.setApellido1(apellido1);

        System.out.println("Ingrese segundo apellido");
        usuario.setApellido2(sc.nextLine());

        String inputFechaDeNacimiento;
        System.out.println("Ingrese fecha de nacimiento (YYYY-MM-DD)");
        inputFechaDeNacimiento = sc.nextLine();
        if (!inputFechaDeNacimiento.equals("")) {
            usuario.setFechaDeNacimiento(LocalDate.parse(inputFechaDeNacimiento));
        }

        System.out.println("Ingrese RUN");
        usuario.setRun(Integer.parseInt(sc.nextLine()));
    }

    /**
     * El método `almacenarCliente` se utiliza para almacenar un objeto `Cliente` en el contenedor.
     * La información del Cliente la debe ingresar el usuario.
     *
     * @param contenedor El contenedor donde se almacenará el cliente.
     */
    private static void almacenarCliente(Contenedor contenedor) {
        Scanner sc = new Scanner(System.in);

        Cliente cliente = new Cliente();
        cliente.setTipoUsuario(1);

        System.out.println("- Ingresar Cliente -");
        leerInformacionUsuario(cliente);

        System.out.println("Ingrese razón social");
        cliente.setRazonSocial(sc.nextLine());

        System.out.println("Ingrese RUT");
        cliente.setRut(Integer.parseInt(sc.nextLine()));

        System.out.println("Ingrese Teléfono del representante");
        cliente.setTelefonoRepresentante(Long.parseLong(sc.nextLine()));

        System.out.println("Ingrese dirección de la empresa");
        cliente.setDireccionEmpresa(sc.nextLine());

        System.out.println("Ingrese comuna de la empresa");
        cliente.setComunaEmpresa(sc.nextLine());

        contenedor.almacenarCliente(cliente);
    }

    /**
     * El método `almacenarProfesional` se utiliza para almacenar un objeto `Profesional` en el contenedor.
     * La información del Profesional la debe ingresar el usuario.
     *
     * @param contenedor El contenedor donde se almacenará el profesional.
     */
    public static void almacenarProfesional(Contenedor contenedor) {
        Scanner sc = new Scanner(System.in);
        Profesional profesional = new Profesional();
        profesional.setTipoUsuario(2);

        System.out.println("- Ingresar Profesional -");

        leerInformacionUsuario(profesional);

        System.out.println("Ingrese título del profesional");
        profesional.setTitulo(sc.nextLine());

        System.out.println("Ingrese fecha de ingreso (YYYY-MM-DD)");
        profesional.setFechaIngreso(LocalDate.parse(sc.nextLine()));

        contenedor.almacenarProfesional(profesional);
    }

    /**
     * El método `almacenarAdministrativo` se utiliza para almacenar un objeto `Administrativo` en el contenedor.
     * La información del Administrativo la debe ingresar el usuario.
     *
     * @param contenedor El contenedor donde se almacenará el administrativo.
     */
    public static void almacenarAdministrativo(Contenedor contenedor) {
        Scanner sc = new Scanner(System.in);
        Administrativo administrativo = new Administrativo();
        administrativo.setTipoUsuario(3);

        System.out.println("- Ingresar Administrativo -");

        leerInformacionUsuario(administrativo);

        String area;
        do {
            System.out.println("Ingrese el área (obligatorio, largo 5-20)");
            area = sc.nextLine();
        } while (area.length() < 5 || area.length() > 20);
        administrativo.setArea(area);

        String experienciaPrevia;
        do {
            System.out.println("Ingrese experiencia previa (max 100)");
            experienciaPrevia = sc.nextLine();
        } while (experienciaPrevia.length() > 100);
        administrativo.setExperienciaPrevia(experienciaPrevia);

        contenedor.almacenarAdministrativo(administrativo);
    }

    /**
     * El método `eliminarUsuario` se utiliza para eliminar un usuario del contenedor
     * basado en su RUN.
     * El RUN lo ingresa el usuario.
     *
     * @param contenedor El contenedor del que se eliminará el usuario.
     */
    public static void eliminarUsuario(Contenedor contenedor) {
        Scanner sc = new Scanner(System.in);

        System.out.println("- Eliminar Usuario -");
        System.out.println("Ingrese el RUN del usuario por eliminar");
        int run = Integer.parseInt(sc.nextLine());
        contenedor.eliminarUsuario(run);
    }

    /**
     * El método `almacenarCapacitacion` se utiliza para almacenar un objeto `Capacitacion` en el contenedor.
     * La información de la capacitación la ingresa el usuario.
     *
     * @param contenedor El contenedor donde se almacenará la capacitación.
     */
    public static void almacenarCapacitacion(Contenedor contenedor){

        Capacitacion capacitacion=new Capacitacion();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese ID Capacitacion ");
        capacitacion.setId(Integer.parseInt(sc.nextLine()));

        System.out.println("Ingrese rut Cliente ");
        capacitacion.setRutCliente(Integer.parseInt(sc.nextLine()));
        System.out.println("Ingrese fecha de ingreso (YYYY-MM-DD)");
        capacitacion.setDia(LocalDate.parse(sc.nextLine()));
        System.out.println("Ingrese Hora (HH:MM:SS)");
        capacitacion.setHora(LocalTime.parse(sc.nextLine()));

        String lugar;
        do {
            System.out.println("Ingrese el lugar (obligatorio, largo 10 a 50)");
            lugar = sc.nextLine();
        } while (lugar.length() < 10 || lugar.length() > 50);
        capacitacion.setLugar(lugar);

        System.out.println("Ingrese Duracion Capacitacion ");
        capacitacion.setDuracion(Integer.parseInt(sc.nextLine()));


        int asistentes;
        do {
            System.out.println("Ingrese Cantidad de Asistentes Capacitacion que sea menor a  1000 ");
            asistentes = Integer.parseInt(sc.nextLine());
        } while (asistentes < 0 || asistentes >= 1000);
        capacitacion.setCantidadDeAsistentes(asistentes);

        contenedor.almacenarCapacitacion(capacitacion);

    }

    /**
     * El método `inicializarContenedor` se utiliza para inicializar el contenedor con datos de muestra.
     *
     * @param contenedor El contenedor que se inicializará.
     */
    public static void inicializarContenedor(Contenedor contenedor) {
        contenedor.almacenarCliente(new Cliente("Juan", "Pérez", "Gómez", LocalDate.of(1990, 5, 15), 24681357, 1, 123456789, "Empresa ABC", 987654321, "Calle Principal 123", "Santiago"));
        contenedor.almacenarCliente(new Cliente("María", "López", "García", LocalDate.of(1985, 8, 21), 87654321, 1, 987654321, "Compañía XYZ", 123456789, "Avenida Principal 456", "Valparaíso"));
        contenedor.almacenarCliente(new Cliente("Carlos", "González", "Sánchez", LocalDate.of(1995, 2, 10), 34567890, 1, 456789012, "Empresa 123", 654321987, "Calle Secundaria 789", "Concepción"));
        contenedor.almacenarCliente(new Cliente("Laura", "Rodríguez", "Vargas", LocalDate.of(1992, 11, 7), 56789012, 1, 789012345, "Compañía ABCD", 321987654, "Avenida Secundaria 987", "Antofagasta"));
        contenedor.almacenarCliente(new Cliente("Pedro", "Fernández", "Ramírez", LocalDate.of(1988, 6, 18), 90123456, 1, 890123456, "Empresa XYZ", 987654321, "Calle Principal 654", "Rancagua"));

        contenedor.almacenarProfesional(new Profesional("Juan", "Pérez", "Gómez", LocalDate.of(1990, 5, 15), 4444444, 2, "Ingeniero", LocalDate.of(2010, 7, 1)));
        contenedor.almacenarProfesional(new Profesional("María", "López", "García", LocalDate.of(1985, 9, 20), 2222222, 2, "Doctora", LocalDate.of(2005, 3, 10)));
        contenedor.almacenarProfesional(new Profesional("Ana", "González", "Martínez", LocalDate.of(1995, 3, 10), 5555555, 2, "Licenciada", LocalDate.of(2018, 12, 1)));
        contenedor.almacenarProfesional(new Profesional("Pedro", "Sánchez", "Ramírez", LocalDate.of(1980, 7, 25), 3333333, 2, "Arquitecto", LocalDate.of(2003, 9, 15)));
        contenedor.almacenarProfesional(new Profesional("Laura", "Torres", "Hernández", LocalDate.of(1998, 11, 8), 1111111, 2, "Ingeniera", LocalDate.of(2020, 4, 5)));

        contenedor.almacenarAdministrativo(new Administrativo("Juan", "Gómez", "Pérez", LocalDate.of(1990, 5, 15), 65432198, 3, "Recursos Humanos", "5 años de experiencia en administración"));
        contenedor.almacenarAdministrativo(new Administrativo("María", "López", "García", LocalDate.of(1985, 8, 20), 98765432, 3, "Contabilidad", "2 años de experiencia en contabilidad"));
        contenedor.almacenarAdministrativo(new Administrativo("Carlos", "Martínez", "Rodríguez", LocalDate.of(1992, 10, 10), 54321678, 3, "Ventas", "3 años de experiencia en ventas"));
        contenedor.almacenarAdministrativo(new Administrativo("Laura", "Hernández", "Sánchez", LocalDate.of(1998, 3, 25), 31415926, 3, "Marketing", "1 año de experiencia en marketing"));
        contenedor.almacenarAdministrativo(new Administrativo("Pedro", "Ramírez", "Gutiérrez", LocalDate.of(1994, 12, 5), 13579246, 3, "Logística", "4 años de experiencia en logística"));
    }
}