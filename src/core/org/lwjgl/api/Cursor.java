/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.api;

/**
 * Cursor interface based on the LWJGL 2.x code
 *
 * @author Brian Matzon <brian@matzon.dk>
 */
public interface Cursor {

    /**
     * 1 bit transparency for native cursor
     */
    public static final int CURSOR_ONE_BIT_TRANSPARENCY = 1;

    /**
     * 8 bit alpha native cursor
     */
    public static final int CURSOR_8_BIT_ALPHA = 2;

    /**
     * animation native cursor
     */
    public static final int CURSOR_ANIMATION = 4;

    /**
     * Gets the minimum size of a native cursor. Can only be called if
     * The Mouse is created and cursor caps includes at least
     * CURSOR_ONE_BIT_TRANSPARANCY.
     *
     * @return the minimum size of a native cursor
     */
    public int getMinSize();

    /**
     * Gets the maximum size of a native cursor. Can only be called if
     * The Mouse is created and cursor caps includes at least
     * CURSOR_ONE_BIT_TRANSPARANCY.
     *
     * @return the maximum size of a native cursor
     */
    public int getMaxSize();

    /**
     * Get the capabilities of the native cursor. Return a bit mask of the native cursor capabilities.
     * The CURSOR_ONE_BIT_TRANSPARANCY indicates support for cursors with one bit transparancy,
     * the CURSOR_8_BIT_ALPHA indicates support for 8 bit alpha and CURSOR_ANIMATION indicates
     * support for cursor animations.
     *
     * @return A bit mask with native cursor capabilities.
     */
    public int getCapabilities();
}
