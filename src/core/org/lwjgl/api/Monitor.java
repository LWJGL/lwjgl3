/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.api;

/**
 * Monitor interface based on the LWJGL 2.x code
 *
 * @author Brian Matzon <brian@matzon.dk>
 */
public interface Monitor {

    /**
     * Returns the entire list of possible fullscreen display modes as an array, in no
     * particular order. Although best attempts to filter out invalid modes are done, any
     * given mode is not guaranteed to be available nor is it guaranteed to be within the
     * current monitor specs (this is especially a problem with the frequency parameter).
     * Furthermore, it is not guaranteed that create() will detect an illegal display mode.
     * <p/>
     * The only certain way to check
     * is to call create() and make sure it works.
     * Only non-palette-indexed modes are returned (ie. bpp will be 16, 24, or 32).
     *
     * @return an array of all display modes the system reckons it can handle.
     */
    public DisplayMode getAvailableDisplayModes();

    /**
     * Return the initial desktop display mode.
     *
     * @return The desktop display mode
     */
    public DisplayMode getDesktopDisplayMode();

    /**
     * Return the current display mode, as set by setDisplayMode().
     *
     * @return The current display mode
     */
    public DisplayMode getDisplayMode();

    /**
     * @return this method will return the width of the Monitor.
     */
    public int getWidth();

    /**
     * @return this method will return the height of the Monitor.
     */
    public int getHeight();

    /**
     * Set the current display mode. The native cursor position
     * is also reset.
     *
     * @param mode The new display mode to set
     */
    public void setDisplayMode(DisplayMode mode);

    /**
     * Set the display configuration to the specified gamma, brightness and contrast.
     * The configuration changes will be reset when destroy() is called.
     *
     * @param gamma      The gamma value
     * @param brightness The brightness value between -1.0 and 1.0, inclusive
     * @param contrast   The contrast, larger than 0.0.
     */
    public void setDisplayConfiguration(float gamma, float brightness, float contrast);

    /**
     * An accurate sync method that will attempt to run at a constant frame rate.
     * It should be called once every frame.
     *
     * @param fps - the desired frame rate, in frames per second
     */
    public void sync(int fps);

    /**
     * Get the driver adapter string. This is a unique string describing the actual card's hardware, eg. "Geforce2", "PS2",
     * "Radeon9700". If the adapter cannot be determined, this function returns null.
     *
     * @return a String
     */
    public String getAdapter();
}
