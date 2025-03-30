package edu.asestatuas.golfstrokes;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class Course {

    private final Table<String, Byte, Byte> playersCourse = HashBasedTable.create();

    public Course() {};

    // interfaz manipular Table y devolver List
    
    // añadir recorrido de un jugador
    public void addPlayerCourse(Player player, Byte[] playerCourse) {
        Byte holeNumber = 0;
        for (Byte holeStrokes : playerCourse) {
            this.playersCourse.put(player.getInitials(), holeNumber++, holeStrokes);
        } 
    }
    
}
