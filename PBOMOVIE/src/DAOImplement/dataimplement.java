/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOImplement;
import java.util.List;
import model.*;
/**
 *
 * @author zalfa
 */
public interface dataimplement {
    public void insert(datamovie p);
    public void update(datamovie p);
    public void delete(String judul);
    public List<datamovie> getAll();
}
