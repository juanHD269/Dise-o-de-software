package Package_Persona;

class Persona {
    private String nombre;
    private String apellidos;
    private String id;
    private String estadoCivil;

    public Persona(String nombre, String apellidos, String id, String estadoCivil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.id = id;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getEstadoCivil() { return estadoCivil; }
    public void setEstadoCivil(String estadoCivil) { this.estadoCivil = estadoCivil; }

    public void cambiarEstadoCivil(String nuevoEstadoCivil) {
        this.estadoCivil = nuevoEstadoCivil;
    }

    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre + " " + apellidos);
        System.out.println("ID: " + id);
        System.out.println("Estado Civil: " + estadoCivil);
    }
}

class Empleado extends Persona {
    private int anioIncorporacion;
    private String despacho;

    public Empleado(String nombre, String apellidos, String id, String estadoCivil, int anioIncorporacion, String despacho) {
        super(nombre, apellidos, id, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.despacho = despacho;
    }

    public int getAnioIncorporacion() { return anioIncorporacion; }
    public void setAnioIncorporacion(int anioIncorporacion) { this.anioIncorporacion = anioIncorporacion; }

    public String getDespacho() { return despacho; }
    public void setDespacho(String despacho) { this.despacho = despacho; }

    public void reasignarDespacho(String nuevoDespacho) {
        this.despacho = nuevoDespacho;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Año de Incorporación: " + anioIncorporacion);
        System.out.println("Despacho: " + despacho);
    }
}

class Estudiante extends Persona {
    private String curso;

    public Estudiante(String nombre, String apellidos, String id, String estadoCivil, String curso) {
        super(nombre, apellidos, id, estadoCivil);
        this.curso = curso;
    }

    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }

    public void matricularEnNuevoCurso(String nuevoCurso) {
        this.curso = nuevoCurso;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Curso: " + curso);
    }
}

class Profesor extends Empleado {
    private String departamento;

    public Profesor(String nombre, String apellidos, String id, String estadoCivil, int anioIncorporacion, String despacho, String departamento) {
        super(nombre, apellidos, id, estadoCivil, anioIncorporacion, despacho);
        this.departamento = departamento;
    }

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }

    public void cambiarDepartamento(String nuevoDepartamento) {
        this.departamento = nuevoDepartamento;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Departamento: " + departamento);
    }
}

class PersonalServicio extends Empleado {
    private String seccion;

    public PersonalServicio(String nombre, String apellidos, String id, String estadoCivil, int anioIncorporacion, String despacho, String seccion) {
        super(nombre, apellidos, id, estadoCivil, anioIncorporacion, despacho);
        this.seccion = seccion;
    }

    public String getSeccion() { return seccion; }
    public void setSeccion(String seccion) { this.seccion = seccion; }

    public void trasladarSeccion(String nuevaSeccion) {
        this.seccion = nuevaSeccion;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Sección: " + seccion);
    }
}
