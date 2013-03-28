/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.api;

import java.nio.ByteBuffer;

/**
 * Window interface based on the LWJGL 2.x Display code
 *
 * @author Brian Matzon <brian@matzon.dk>
 */
public interface Window {
    /**
     * @return this method will return the x position (top-left) of the window.
     *         <p/>
     *         If running in fullscreen mode it will return 0.
     */
    public int getX();

    /**
     * @return this method will return the y position (top-left) of the window.
     *         <p/>
     *         If running in fullscreen mode it will return 0.
     */
    public int getY();

    /**
     * @return this method will return the width of the window.
     *         <p/>
     *         If running in fullscreen mode it will return the width of the current set DisplayMode.
     */
    public int getWidth();

    /**
     * @return this method will return the height of the window.
     *         <p/>
     *         If running in fullscreen mode it will return the height of the current set DisplayMode.
     */
    public int getHeight();

    /**
     * @return the title of the window
     */
    public String getTitle();

    /**
     * Set the title of the window. This may be ignored by the underlying OS.
     *
     * @param newTitle The new window title
     */
    public void setTitle(String newTitle);

    /**
     * Sets this windows fullscreen mode. The native cursor position is also reset.
     *
     * @param fullscreen Whether or not to enter fullscreen mode
     */
    public void setFullscreen(boolean fullscreen);

    /**
     * @return whether the Display is in fullscreen mode
     */
    public boolean isFullscreen();

    /**
     * @return true if the user or operating system has asked the window to close
     */
    public boolean isCloseRequested();

    /**
     * @return true if the window is visible, false if not
     */
    public boolean isVisible();

    /**
     * @return true if window is active, that is, the foreground display of the operating system.
     */
    public boolean isActive();

    /**
     * Determine if the window's contents have been damaged by external events.
     * If you are writing a straightforward game rendering loop and simply paint
     * every frame regardless, you can ignore this flag altogether. If you are
     * trying to be kind to other processes you can check this flag and only
     * redraw when it returns true. The flag is cleared when update() or isDirty() is called.
     *
     * @return true if the window has been damaged by external changes
     *         and needs to repaint itself
     */
    public boolean isDirty();

    /**
     * Update the window.
     */
    public void update();

    /**
     * Set the initial color of the Window. This method is called before the Window is created and will set the
     * background color to the one specified in this method.
     *
     * @param red   - color value between 0 - 1
     * @param green - color value between 0 - 1
     * @param blue  - color value between 0 - 1
     */
    public void setInitialBackground(float red, float green, float blue);

    /**
     * Set the window's location. This is a no-op on fullscreen windows.
     * The window is clamped to remain entirely on the screen. If you attempt
     * to position the window such that it would extend off the screen, the window
     * is simply placed as close to the edge as possible.
     * <br><b>note</b>If no location has been specified (or x == y == -1) the window will be centered
     *
     * @param new_x The new window location on the x axis
     * @param new_y The new window location on the y axis
     */
    public void setLocation(int new_x, int new_y);

    /**
     * Sets one or more icons for the Window.
     * <ul>
     * <li>On Windows you should supply at least one 16x16 icon and one 32x32.</li>
     * <li>Linux (and similar platforms) expect one 32x32 icon.</li>
     * <li>Mac OS X should be supplied one 128x128 icon</li>
     * </ul>
     * The implementation will use the supplied ByteBuffers with image data in RGBA and perform any conversions necessary for the specific platform.
     * <p/>
     * <b>NOTE:</b> The window will make a deep copy of the supplied byte buffer array, for the purpose
     * of recreating the icons when you go back and forth fullscreen mode. You therefore only need to
     * set the icon once per instance.
     *
     * @param icons Array of icons in RGBA mode. Pass the icons in order of preference.
     * @return number of icons used, or 0 if display hasn't been created
     */
    public int setIcon(ByteBuffer[] icons);

    /**
     * Enable or disable the window to be resized.
     *
     * @param resizable set to true to make the window resizable;
     *                  false to disable resizing on the window.
     */
    public void setResizable(boolean resizable);

    /**
     * @return true if the window is resizable.
     */
    public boolean isResizable();

    /**
     * @return true if the window has been resized.
     *         <p/>
     *         This will return false if running in fullscreen
     */
    public boolean wasResized();
}
