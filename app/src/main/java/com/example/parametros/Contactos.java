package com.example.parametros;

import androidx.annotation.NonNull;

public class Contactos {
    public String usuario;
    public String email;
    public String telefono;

    public Contactos(String usuario, String email, String telefono){
        this.usuario=usuario;
        this.email=email;
        this.telefono=telefono;
    }

    @NonNull
    @Override
    public String toString(){
        return this.usuario+"\n"+this.email;
    }

    public String getUsuario(){return usuario;}
    public String getEmail(){return email;}
    public String getTelefono(){return telefono;}
}
