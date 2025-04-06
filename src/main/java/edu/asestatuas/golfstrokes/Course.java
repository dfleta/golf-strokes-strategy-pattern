package edu.asestatuas.golfstrokes;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.google.common.primitives.Bytes;

/**
 * Representa un recorrido de golf y gestiona los golpes realizados por cada jugador.
 * Utiliza una estructura de datos Table para almacenar el número de golpes de cada jugador
 * en cada hoyo, donde:
 * - Clave de fila: iniciales del jugador
 * - Clave de columna: número de hoyo
 * - Valor: golpes realizados
 */
class Course {

    private final Table<String, Byte, Byte> playersCourse = HashBasedTable.create();

    /**
     * Crea un nuevo recorrido vacío.
     */
    Course() {};
    
    /**
     * Añade o actualiza el registro de recorrido de un jugador con sus golpes en cada hoyo.
     * 
     * @param player El jugador cuyo registro de recorrido se está añadiendo
     * @param playerCourse Array de golpes para cada hoyo, donde el índice representa el número de hoyo (base 0)
     */
    void addPlayerCourse(Player player, Byte[] playerCourse) {
        Byte holeNumber = 0;
        for (Byte holeStrokes : playerCourse) {
            this.playersCourse.put(player.getInitials(), holeNumber++, holeStrokes);
        } 
    }

    /**
     * Recupera el registro completo del recorrido de un jugador específico.
     * 
     * @param player El jugador cuyo registro de recorrido se está recuperando
     * @return Un array de bytes que representa los golpes en cada hoyo
     */
    byte[] getPlayerCourse(Player player) {
        return Bytes.toArray(this.playersCourse.row(player.getInitials()).values());
    }
    
}
