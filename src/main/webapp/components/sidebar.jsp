<%@page contentType="text/html" pageEncoding="UTF-8"%>
<ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

    <!-- Sidebar - Brand -->
    <a class="sidebar-brand d-flex align-items-center justify-content-center" href="index.html">
        <div class="sidebar-brand-icon rotate-n-15">
            <i class="fas fa-regular fa-tooth"></i>
        </div>
        <div class="sidebar-brand-text mx-3">Consultorio Odontologico</div>
    </a>

    <!-- Divider -->
    <hr class="sidebar-divider my-0">

    <!-- Nav Item - Dashboard -->
    <li class="nav-item active">
        <a class="nav-link" href="#">
            <i class="fas fa-solid fa-bars"></i>
            <span>Menú</span></a>
    </li>

    <!-- Divider -->
    <hr class="sidebar-divider">

    <!-- Heading -->
    <div class="sidebar-heading">
        Gesti&oacute;n
    </div>

    <!-- Odontologos -->
    <li class="nav-item">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseOdontologos"
            aria-expanded="true" aria-controls="collapseTwo">
            <i class="fas fa-hospital-user"></i>
            <span>Odont&oacute;logos</span>
        </a>
        <div id="collapseOdontologos" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
            <div class="bg-white py-2 collapse-inner rounded">
                <h6 class="collapse-header">Acciones</h6>
                 <a class="collapse-item" href="">Consulta Odont&oacute;logos</a>
                <a class="collapse-item" href="">Registro Odont&oacute;logos</a>
            </div>
        </div>
    </li>

    <!-- Pacientes  -->
    <li class="nav-item">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapsePacientes"
            aria-expanded="true" aria-controls="collapseUtilities">
            <i class="fas fa-solid fa-user"></i>
            <span>Pacientes</span>
        </a>
        <div id="collapsePacientes" class="collapse" aria-labelledby="headingUtilities"
            data-parent="#accordionSidebar">
            <div class="bg-white py-2 collapse-inner rounded">
                <h6 class="collapse-header">Acciones</h6>
                <a class="collapse-item" href="">Consulta Pacientes</a>
                <a class="collapse-item" href="">Registro Pacientes</a>
            </div>
        </div>
    </li>
    
      <!-- Usuarios  -->
    <li class="nav-item">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseUsuarios"
            aria-expanded="true" aria-controls="collapseUtilities">
            <i class="fas fa-solid fa-user"></i>
            <span>Usuarios</span>
        </a>
        <div id="collapseUsuarios" class="collapse" aria-labelledby="headingUtilities"
            data-parent="#accordionSidebar">
            <div class="bg-white py-2 collapse-inner rounded">
                <h6 class="collapse-header">Acciones</h6>
                <a class="collapse-item" href="">Consulta Usuarios</a>
                <a class="collapse-item" href="">Registro Usuarios</a>
            </div>
        </div>
    </li>
</ul>