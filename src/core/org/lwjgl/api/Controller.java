/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.api;

/**
 * Controller interface based on the LWJGL 2.x code
 *
 * @author Kevin Glass
 */
public interface Controller {
    /**
     * Get the name assigned to this controller.
     *
     * @return The name assigned to this controller
     */
    String getName();

    /**
     * Get the index of this controller in the collection
     *
     * @return The index of this controller in the collection
     */
    int getIndex();

    /**
     * Retrieve the number of buttons available on this controller
     *
     * @return The number of butotns available on this controller
     */
    int getButtonCount();

    /**
     * Get the name of the specified button. Be warned, often this is
     * as exciting as "Button X"
     *
     * @param index The index of the button whose name should be retrieved
     * @return The name of the button requested
     */
    String getButtonName(int index);

    /**
     * Check if a button is currently pressed
     *
     * @param index The button to check
     * @return True if the button is currently pressed
     */
    boolean isButtonPressed(int index);

    /**
     * Poll the controller for new data. This will also update
     * events
     */
    void poll();

    /**
     * Get the X-Axis value of the POV on this controller
     *
     * @return The X-Axis value of the POV on this controller
     */
    float getPovX();

    /**
     * Get the Y-Axis value of the POV on this controller
     *
     * @return The Y-Axis value of the POV on this controller
     */
    float getPovY();

    /**
     * Get the dead zone for a specified axis
     *
     * @param index The index of the axis for which to retrieve the dead zone
     * @return The dead zone for the specified axis
     */
    float getDeadZone(int index);

    /**
     * Set the dead zone for the specified axis
     *
     * @param index The index of hte axis for which to set the dead zone
     * @param zone  The dead zone to use for the specified axis
     */
    void setDeadZone(int index, float zone);

    /**
     * Retrieve the number of axes available on this controller.
     *
     * @return The number of axes available on this controller.
     */
    int getAxisCount();

    /**
     * Get the name that's given to the specified axis
     *
     * @param index The index of the axis whose name should be retrieved
     * @return The name of the specified axis.
     */
    String getAxisName(int index);

    /**
     * Retrieve the value thats currently available on a specified axis. The
     * value will always be between 1.0 and -1.0 and will calibrate as values
     * are passed read. It may be useful to get the player to wiggle the joystick
     * from side to side to get the calibration right.
     *
     * @param index The index of axis to be read
     * @return The value from the specified axis.
     */
    float getAxisValue(int index);

    /**
     * Get the value from the X axis if there is one. If no X axis is
     * defined a zero value will be returned.
     *
     * @return The value from the X axis
     */
    float getXAxisValue();

    /**
     * Get the dead zone for the X axis.
     *
     * @return The dead zone for the X axis
     */
    float getXAxisDeadZone();

    /**
     * Set the dead zone for the X axis
     *
     * @param zone The dead zone to use for the X axis
     */
    void setXAxisDeadZone(float zone);

    /**
     * Get the value from the Y axis if there is one. If no Y axis is
     * defined a zero value will be returned.
     *
     * @return The value from the Y axis
     */
    float getYAxisValue();

    /**
     * Get the dead zone for the Y axis.
     *
     * @return The dead zone for the Y axis
     */
    float getYAxisDeadZone();

    /**
     * Set the dead zone for the Y axis
     *
     * @param zone The dead zone to use for the Y axis
     */
    void setYAxisDeadZone(float zone);

    /**
     * Get the value from the Z axis if there is one. If no Z axis is
     * defined a zero value will be returned.
     *
     * @return The value from the Z axis
     */
    float getZAxisValue();

    /**
     * Get the dead zone for the Z axis.
     *
     * @return The dead zone for the Z axis
     */
    float getZAxisDeadZone();

    /**
     * Set the dead zone for the Z axis
     *
     * @param zone The dead zone to use for the Z axis
     */
    void setZAxisDeadZone(float zone);

    /**
     * Get the value from the RX axis if there is one. If no RX axis is
     * defined a zero value will be returned.
     *
     * @return The value from the RX axis
     */
    float getRXAxisValue();

    /**
     * Get the dead zone for the RX axis.
     *
     * @return The dead zone for the RX axis
     */
    float getRXAxisDeadZone();

    /**
     * Set the dead zone for the RX axis
     *
     * @param zone The dead zone to use for the RX axis
     */
    void setRXAxisDeadZone(float zone);

    /**
     * Get the value from the RY axis if there is one. If no RY axis is
     * defined a zero value will be returned.
     *
     * @return The value from the RY axis
     */
    float getRYAxisValue();

    /**
     * Get the dead zone for the RY axis.
     *
     * @return The dead zone for the RY axis
     */
    float getRYAxisDeadZone();

    /**
     * Set the dead zone for the RY axis
     *
     * @param zone The dead zone to use for the RY axis
     */
    void setRYAxisDeadZone(float zone);

    /**
     * Get the value from the RZ axis if there is one. If no RZ axis is
     * defined a zero value will be returned.
     *
     * @return The value from the RZ axis
     */
    float getRZAxisValue();

    /**
     * Get the dead zone for the RZ axis.
     *
     * @return The dead zone for the RZ axis
     */
    float getRZAxisDeadZone();

    /**
     * Set the dead zone for the RZ axis
     *
     * @param zone The dead zone to use for the RZ axis
     */
    void setRZAxisDeadZone(float zone);


    /**
     * Returns the number of rumblers this controller supports
     */
    int getRumblerCount();

    /**
     * Returns the name of the specified rumbler
     *
     * @param index The rumbler index
     */
    String getRumblerName(int index);

    /**
     * Sets the vibration strength of the specified rumbler
     *
     * @param index    The index of the rumbler
     * @param strength The strength to vibrate at
     */
    void setRumblerStrength(int index, float strength);
}