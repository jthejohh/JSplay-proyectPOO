/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.DAO;

import java.awt.List;
import java.util.ArrayList;
import modelo.beans.Usuario;

/**
 *
 * @author Familia García Escob
 */
public class UsuarioDAO {
    
    private ArrayList<Usuario> usuarios;

    public UsuarioDAO() {
        usuarios= new ArrayList<Usuario>();
    }
    
    public int buscar(String usuario){
        int n=-1;
        for (int i = 0; i < usuarios.size(); i++) {
//            System.out.println(usuarios.get(i).getCorreo());
//            System.out.println(usuario);
             if (usuarios.get(i).getUsuario().equals(usuario)) {                //toString().trim().toLowerCase() == correo.toString().trim().toLowerCase()){
                 n=i;
                 break;
             }
        }
        return n;
    } 
    
    public boolean insertar(Usuario usuario){
        if(buscar(usuario.getUsuario())==-1) {                                                                        //usuarios.add(usuario);
       
        usuarios.add(usuario);
        return true;
        
        } else {
            return false;
        }
        }
                                                                                    //    public int getTamaño(){
                                                                                     //        return usuarios.size();
                                                                                                //}
    
    


    public boolean modificar(Usuario usuario){
        if (buscar(usuario.getUsuario()) != -1) {
             Usuario usuarioaux=obtener(usuario.getUsuario());
                                                                                     //usuarios.remove(buscar(usuario.getCorreo()));
           
              usuarioaux.setContraseña(usuario.getContraseña());
              usuarioaux.setCorreo(usuario.getCorreo());
              usuarioaux.setDocumento(usuario.getDocumento());
              usuarioaux.setNombre(usuario.getNombre());
             return true;  
             }else{  
              return false;
                                                                                   // insertar(usuario);
       
                                                                                   //insertar(usuario);
        }
       
    }

    public boolean eliminar(String usuario){
//        usuarios.removeIf(e -> e.getCorreo() == usuario.getCorreo());
//        return true;
            if(buscar(usuario)!=-1){
                usuarios.remove(buscar(usuario));
                return true;
            }else{
                return false;
            }

    }

    
    public Usuario obtener(String usuario){
           if(buscar(usuario)!=-1) {
              return usuarios.get(buscar(usuario));                                                                       // for (int i = 0; i < usuarios.size(); i++) {
                                                                                 // if (usuarios.get(i).getDocumento() == usuario) {
          }else{
               return null;
        }
        
    }
    
    public Usuario usuarioPorIndex(int index){
        return usuarios.get(index);
    }
}
       