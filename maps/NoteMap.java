/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package maps;

import java.util.ArrayList;
import java.util.Random;
import note.SNote;

/**
 *
 * @author Ben
 */
public class NoteMap implements NoteMapADT {
    protected final ArrayList<String> names;
    protected final ArrayList<SNote> notes;
    
    //creates a new NoteMap instance.
    
    public NoteMap(){
        this.names = new ArrayList<>();
        this.notes = new ArrayList<>();
        names.add("do"); notes.add(doNote());
        names.add("re"); notes.add(reNote());
        names.add("mi"); notes.add(miNote());
        names.add("fa"); notes.add(faNote());
        names.add("so"); notes.add(soNote());
        names.add("la"); notes.add(laNote());
        names.add("ti"); notes.add(tiNote());     
    }

    private SNote doNote() {
        SNote n = new SNote();
        return n;
    }

    private SNote reNote() {
        SNote n = new SNote();
        n.rp();
        return n;
    }

    private SNote miNote() {
        SNote n = new SNote();
        n.rp(); n.rp();
        return n;
    }

    private SNote faNote() {
        SNote n = new SNote();
        n.rp(); n.rp(); n.rp();
        return n;
    }

    private SNote soNote() {
        SNote n = new SNote();
        n.rp(); n.rp(); n.rp(); n.rp();
        return n;
    }

    private SNote laNote() {
        SNote n = new SNote();
        n.rp(); n.rp(); n.rp(); n.rp(); n.rp();
        return n;
    }

    private SNote tiNote() {
        SNote n = new SNote();
        n.rp(); n.rp(); n.rp(); n.rp(); n.rp(); n.rp();
        return n;
    }
    
    //Returns a simple note object corresponding to the given solfege name.
    @Override
    public SNote note(String name) throws Exception{
        for (int i = 0; i < names.size(); i++) {
            if( names.get(i).equalsIgnoreCase(name)) {
                return notes.get(i);
            }
            
        }
        throw new Exception("### not a solfege name: " + name);
    }
    
    //returns a textual representation of the note map.
    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < names.size(); i++) {
            result = result + names.get(i) + "-->" + notes.get(i).toString() + "\n";          
        }
        return result;
    }
    
    //returns a solfege name chosen at random from the source domain of the map.
    @Override
    public String random() {
        Random generator = new Random();
        int rn = generator.nextInt(7);
        return names.get(rn);
    }
    
    //returns the source domain of the map --  all the solfege names.
    @Override
    public ArrayList<String> names() {
        return names();
    }
    
}
