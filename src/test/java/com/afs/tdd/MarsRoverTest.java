package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    @Test
    void should_get_to_0_1_N_when_execute_command_M_given_0_0_N() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "N");

        // when
        marsRover.executeCommand("M");

        // then
        assertEquals(0, marsRover.getXLocation());
        assertEquals(1, marsRover.getYLocation());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    void should_get_to_0_0_W_when_execute_command_L_given_0_0_N() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "N");

        // when
        marsRover.executeCommand("L");

        // then
        assertEquals(0, marsRover.getXLocation());
        assertEquals(0, marsRover.getYLocation());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    void should_get_to_0_0_E_when_execute_command_R_given_0_0_N() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "N");

        // when
        marsRover.executeCommand("R");

        // then
        assertEquals(0, marsRover.getXLocation());
        assertEquals(0, marsRover.getYLocation());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    void should_get_to_0_negative1_S_when_execute_command_M_given_0_0_S() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "S");

        // when
        marsRover.executeCommand("M");

        // then
        assertEquals(0, marsRover.getXLocation());
        assertEquals(-1, marsRover.getYLocation());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    void should_get_to_0_0_E_when_execute_command_L_given_0_0_S() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "S");

        // when
        marsRover.executeCommand("L");

        // then
        assertEquals(0, marsRover.getXLocation());
        assertEquals(0, marsRover.getYLocation());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    void should_get_to_0_0_W_when_execute_command_R_given_0_0_S() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "S");

        // when
        marsRover.executeCommand("R");

        // then
        assertEquals(0, marsRover.getXLocation());
        assertEquals(0, marsRover.getYLocation());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    void should_get_to_1_0_E_when_execute_command_M_given_0_0_E() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "E");

        // when
        marsRover.executeCommand("M");

        // then
        assertEquals(1, marsRover.getXLocation());
        assertEquals(0, marsRover.getYLocation());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    void should_get_to_0_0_N_when_execute_command_L_given_0_0_E() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "E");

        // when
        marsRover.executeCommand("L");

        // then
        assertEquals(0, marsRover.getXLocation());
        assertEquals(0, marsRover.getYLocation());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    void should_get_to_0_0_S_when_execute_command_R_given_0_0_E() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "E");

        // when
        marsRover.executeCommand("R");

        // then
        assertEquals(0, marsRover.getXLocation());
        assertEquals(0, marsRover.getYLocation());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    void should_get_to_negative1_0_W_when_execute_command_M_given_0_0_W() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "W");

        // when
        marsRover.executeCommand("M");

        // then
        assertEquals(-1, marsRover.getXLocation());
        assertEquals(0, marsRover.getYLocation());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    void should_get_to_0_0_S_when_execute_command_L_given_0_0_W() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "W");

        // when
        marsRover.executeCommand("L");

        // then
        assertEquals(0, marsRover.getXLocation());
        assertEquals(0, marsRover.getYLocation());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    void should_get_to_0_0_N_when_execute_command_R_given_0_0_W() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "W");

        // when
        marsRover.executeCommand("R");

        // then
        assertEquals(0, marsRover.getXLocation());
        assertEquals(0, marsRover.getYLocation());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    void should_get_to_negative3_2_W_when_execute_command_MMMRMML_given_0_0_W() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "W");

        // when
        marsRover.executeCommand("MMMRMML");

        // then
        assertEquals(-3, marsRover.getXLocation());
        assertEquals(2, marsRover.getYLocation());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    void should_get_to_negative3_2_W_when_execute_command_MMMRMMLB_given_0_0_W() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "W");

        // when
        marsRover.executeCommand("MMMRMMLB");

        // then
        assertEquals(-3, marsRover.getXLocation());
        assertEquals(2, marsRover.getYLocation());
        assertEquals("E", marsRover.getDirection());
    }
}
