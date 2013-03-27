/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.api;

/**
 * Mouse interface based on the LWJGL 2.x code
 *
 * @author Brian Matzon <brian@matzon.dk>
 */
public interface Mouse {
    /**
     * Gets the currently bound cursor, if any.
     *
     * @return the currently bound cursor, if any.
     */
    public Cursor getCursor();

    /**
     * Binds a cursor. If the cursor argument is null, any
     * currently bound cursor is disabled, and the cursor reverts
     * to the default operating system supplied cursor.
     * <p/>
     * NOTE: The cursor is not constrained to the window, but
     * relative events will not be generated if the cursor is outside.
     *
     * @param cursor the cursor object to bind. May be null.
     * @return The previous Cursor object set, or null.
     */
    public Cursor setCursor(Cursor cursor);

    /**
     * Set the position of the cursor. If the cursor is not grabbed,
     * the cursor is moved to the new position.
     *
     * @param new_x The x coordinate of the new cursor position in OpenGL coordinates relative
     *              to the window origin.
     * @param new_y The y coordinate of the new cursor position in OpenGL coordinates relative
     *              to the window origin.
     */
    public void setPosition(int new_x, int new_y);

    /**
     * See if a particular mouse button is down.
     *
     * @param button The index of the button you wish to test (0..getButtonCount-1)
     * @return true if the specified button is down
     */
    public boolean isButtonDown(int button);

    /**
     * Gets a button's name
     *
     * @param button The button
     * @return a String with the button's human readable name in it or null if the button is unnamed
     */
    public String getButtonName(int button);

    /**
     * Get's a button's index. If the button is unrecognised then -1 is returned.
     *
     * @param buttonName The button name
     */
    public int getButtonIndex(String buttonName);

    /**
     * @return Number of buttons on this mouse
     */
    public int getButtonCount();

    /**
     * @return Whether or not this mouse has wheel support
     */
    public boolean hasWheel();

    /**
     * @return whether or not the mouse has grabbed the cursor
     */
    public boolean isGrabbed();

    /**
     * Sets whether or not the mouse has grabbed the cursor
     * (and thus hidden). If grab is false, the getX() and getY()
     * will return delta movement in pixels clamped to the display
     * dimensions, from the center of the display.
     *
     * @param grab whether the mouse should be grabbed
     */
    public void setGrabbed(boolean grab);

    /**
     * Retrieves whether or not the mouse cursor is within the bounds of the window.
     * If the mouse cursor was moved outside the display during a drag, then the result of calling
     * this method will be true until the button is released.
     *
     * @return true if mouse is inside display, false otherwise.
     */
    public boolean isInsideWindow();

    /**
     * Retrieves the absolute position. It will be clamped to
     * 0...width-1.
     *
     * @return Absolute x axis position of mouse
     */
    public int getX();

    /**
     * Retrieves the absolute position. It will be clamped to
     * 0...height-1.
     *
     * @return Absolute y axis position of mouse
     */
    public int getY();

    /**
     * @return Movement on the x axis since last time getDX() was called.
     */
    public int getDX();

    /**
     * @return Movement on the y axis since last time getDY() was called.
     */
    public int getDY();

    /**
     * @return Movement of the wheel since last time getDWheel() was called
     */
    public int getDWheel();

    /**
     * Gets the next mouse event. You can query which button caused the event by using
     * <code>getEventButton()</code> (if any). To get the state of that key, for that event, use
     * <code>getEventButtonState</code>. To get the current mouse delta values use <code>getEventDX()</code>,
     * <code>getEventDY()</code> and <code>getEventDZ()</code>.
     * @see org.lwjgl.api.Mouse#getEventButton()
     * @see org.lwjgl.api.Mouse#getEventButtonState()
     * @return true if a mouse event was read, false otherwise
     */
    public boolean nextEvent();

    /**
     * @return Current events button. Returns -1 if no button state was changed
     */
    public int getEventButton();

    /**
     * Get the current events button state.
     *
     * @return Current events button state.
     */
    public boolean getEventButtonState();

    /**
     * @return Current events delta x.
     */
    public int getEventDX();

    /**
     * @return Current events delta y.
     */
    public int getEventDY();

    /**
     * @return Current events absolute x.
     */
    public int getEventX();

    /**
     * @return Current events absolute y.
     */
    public int getEventY();

    /**
     * @return Current events delta z
     */
    public int getEventDWheel();

    /**
     * Gets the time in nanoseconds of the current event.
     * Only useful for relative comparisons with other
     * Mouse events, as the absolute time has no defined
     * origin.
     *
     * @return The time in nanoseconds of the current event
     */
    public long getEventNanoseconds();
}
