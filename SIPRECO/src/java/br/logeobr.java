package br;

import be.logeobe;
import dao.logeodao;

public class logeobr {
    public logeobr(){
            }
    public int NuevoUsuarioLogeo(logeobe o){
        return  new logeodao().registrarusuariologin(o);
    }
}
