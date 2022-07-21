package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    @Test
    void should_get_to_0_1_N_when_execute_command_M_given_0_0_N() {
        // given
        MarsRover marsRover = new MarsRover(0,0,"N");

        // when
        marsRover.executeCommand("M");

        // then
        assertEquals("location: (x: 0, y: 1), direction: N", marsRover.getLocation());
    }
}
