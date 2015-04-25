/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package maps;

import java.util.ArrayList;
import note.SNote;

/**
 *
 * @author Ben
 */
public interface NoteMapADT {
    public SNote note(String name) throws Exception;
    public String random();
    @Override
    public String toString();
    ArrayList<String> names();   
}
