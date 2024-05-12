/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.List;
import DAOdatamovie.datamovieDAO;
import DAOImplement.dataimplement;
import model.*;
import pbomovie.mainview;
/**
 *
 * @author USER
 */
public class datamoviecontroller {
    mainview frame;
    dataimplement impldatamovie;
    List<datamovie> dp;
    
    public datamoviecontroller(mainview frame) {
        this.frame = frame;
        impldatamovie = new datamovieDAO();
        dp = impldatamovie.getAll();
    }
    
    public void isitabel() {
        dp = impldatamovie.getAll();
        modeltabeldatamovie mp = new modeltabeldatamovie(dp);
        frame.getTabeldatamovie().setModel(mp);
    }
    
    public void insert(){
        try {
        datamovie dp = new datamovie();
        dp.setJudul(frame.getJTxtjudul().getText());
        double alur = Double.parseDouble(frame.getJTxtalur().getText());
        double penokohan = Double.parseDouble(frame.getJTxtpenokohan().getText());
        double akting = Double.parseDouble(frame.getJTxtakting().getText());
        double nilai = (alur + penokohan + akting) / 3.0;
        
        dp.setAlur(alur);
        dp.setPenokohan(penokohan);
        dp.setAkting(akting); 
        dp.setNilai(nilai);
        impldatamovie.insert(dp);
        
        
        }catch(NumberFormatException e){
            
        }
    }
    
    public void update(){
        try {
        datamovie dp = new datamovie();
        dp.setJudul(frame.getJTxtjudul().getText());
        double alur = Double.parseDouble(frame.getJTxtalur().getText());
        double penokohan = Double.parseDouble(frame.getJTxtpenokohan().getText());
        double akting = Double.parseDouble(frame.getJTxtakting().getText());
        double nilai = (alur + penokohan + akting) / 3.0;
        
        dp.setAlur(alur);
        dp.setPenokohan(penokohan);
        dp.setAkting(akting); 
        dp.setNilai(nilai);
        impldatamovie.update(dp);
        
        
        }catch(NumberFormatException e){
            
        }
    }
    
    public void delete(){
        String judul = frame.getJTxtjudul().getText();
        impldatamovie.delete(judul);
        
    }
}
