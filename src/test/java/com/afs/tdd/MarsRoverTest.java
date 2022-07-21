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
        assertEquals(0, marsRover.getxLocation());
        assertEquals(1, marsRover.getyLocation());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    void should_get_to_0_0_W_when_execute_command_L_given_0_0_N() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "N");

        // when
        marsRover.executeCommand("L");

        // then
        assertEquals(0, marsRover.getxLocation());
        assertEquals(0, marsRover.getyLocation());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    void should_get_to_0_0_E_when_execute_command_R_given_0_0_N() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "N");

        // when
        marsRover.executeCommand("R");

        // then
        assertEquals(0, marsRover.getxLocation());
        assertEquals(0, marsRover.getyLocation());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    void should_get_to_0_negative1_S_when_execute_command_M_given_0_0_S() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "S");

        // when
        marsRover.executeCommand("M");

        // then
        assertEquals(0, marsRover.getxLocation());
        assertEquals(-1, marsRover.getyLocation());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    void should_get_to_0_0_E_when_execute_command_L_given_0_0_S() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "S");

        // when
        marsRover.executeCommand("L");

        // then
        assertEquals("location: (x: 0, y: 0), direction: E", marsRover.getLocation());
        assertEquals(0, marsRover.getxLocation());
        assertEquals(0, marsRover.getyLocation());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    void should_get_to_0_0_W_when_execute_command_R_given_0_0_S() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "S");

        // when
        marsRover.executeCommand("R");

        // then
        assertEquals(0, marsRover.getxLocation());
        assertEquals(0, marsRover.getyLocation());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    void should_get_to_1_0_E_when_execute_command_M_given_0_0_E() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "E");

        // when
        marsRover.executeCommand("M");

        // then
        assertEquals("location: (x: 1, y: 0), direction: E", marsRover.getLocation());
        assertEquals(1, marsRover.getxLocation());
        assertEquals(0, marsRover.getyLocation());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    void should_get_to_0_0_N_when_execute_command_L_given_0_0_E() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "E");

        // when
        marsRover.executeCommand("L");

        // then
        assertEquals(0, marsRover.getxLocation());
        assertEquals(0, marsRover.getyLocation());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    void should_get_to_0_0_S_when_execute_command_R_given_0_0_E() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "E");

        // when
        marsRover.executeCommand("R");

        // then
        assertEquals(0, marsRover.getxLocation());
        assertEquals(0, marsRover.getyLocation());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    void should_get_to_negative1_0_W_when_execute_command_M_given_0_0_W() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "W");

        // when
        marsRover.executeCommand("M");

        // then
        assertEquals(-1, marsRover.getxLocation());
        assertEquals(0, marsRover.getyLocation());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    void should_get_to_0_0_S_when_execute_command_L_given_0_0_W() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "W");

        // when
        marsRover.executeCommand("L");

        // then
        assertEquals(0, marsRover.getxLocation());
        assertEquals(0, marsRover.getyLocation());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    void should_get_to_0_0_N_when_execute_command_R_given_0_0_W() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "W");

        // when
        marsRover.executeCommand("R");

        // then
        assertEquals(0, marsRover.getxLocation());
        assertEquals(0, marsRover.getyLocation());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    void should_get_to_negative2_0_N_when_execute_command_MMR_given_0_0_W() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "W");

        // when
        marsRover.executeCommand("MMMRMML");

        // then
        assertEquals(-3, marsRover.getxLocation());
        assertEquals(2, marsRover.getyLocation());
        assertEquals("W", marsRover.getDirection());
    }
}
