/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.songbitmaven;

import java.io.Serializable;

/**
 *
 * @author csstudent
 */
public class SongAlbumInfo implements Serializable{
    private String id;
    private String uri;
    private String name;
    
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    
}
