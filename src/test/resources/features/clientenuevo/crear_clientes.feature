#language:es

Característica:Crear usuario en la plataforma SIIGO
  Yo como usuario de la plataforma requiero crear usuario en la plataforma

  Esquema del escenario:Crear usuario nuevo en SIIGO
    Dado Inicio sesion en la plataforma de SIIGO
    Cuando Estoy en el menu de clientes
    Y Diligencio el formulario con lo siguiente
      | nombre   | apellido   | documento   | direccion   | correo   | edad   |
      | <nombre> | <apellido> | <documento> | <direccion> | <correo> | <edad> |
    Entonces valido la creacion del cliente
    Ejemplos:
      | nombre | apellido | documento   | direccion      | correo                    | edad |
      | Carlos | Ramirez  | 10949352123 | calle 2#11-471 | carlosramirez@ejemplo.com | 23   |

