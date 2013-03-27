/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.api;

/**
 * This Interface encapsulates the properties for a given display mode.
 *
 * @see org.lwjgl.api.Monitor#getAvailableDisplayModes()
 *
 * @author cix_foo <cix_foo@users.sourceforge.net>
 * @author Brian Matzon <brian@matzon.dk>
 */
public interface DisplayMode {
    /**
     * True if this instance can be used for fullscreen modes
     */
    public boolean isFullscreenCapable();

    /**
     * @return width of this DisplayMode
     */
    public int getWidth();

    /**
     * @return height of this DisplayMode
     */
    public int getHeight();

    /**
     * @return bits per pixel of this DisplayMode
     */
    public int getBitsPerPixel();

    /**
     * @return frequency of this DisplayMode
     */
    public int getFrequency();
}