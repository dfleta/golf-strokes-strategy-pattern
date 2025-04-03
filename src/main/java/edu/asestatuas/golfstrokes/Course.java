package edu.asestatuas.golfstrokes;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.google.common.primitives.Bytes;

public class Course {

    private final Table<String, Byte, Byte> playersCourse = HashBasedTable.create();

    public Course() {};
    
    // añadir recorrido de un jugador
    public void addPlayerCourse(Player player, Byte[] playerCourse) {
        Byte holeNumber = 0;
        for (Byte holeStrokes : playerCourse) {
            this.playersCourse.put(player.getInitials(), holeNumber++, holeStrokes);
        } 
    }

    // obtener el recorrido de un jugador
    public byte[] getPlayerCourse(Player player) {
        return Bytes.toArray(this.playersCourse.row(player.getInitials()).values());
    }
    
}
