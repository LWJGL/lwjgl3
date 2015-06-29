/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux.templates

import org.lwjgl.generator.*
import org.lwjgl.system.linux.*

val Xatom = "Xatom".nativeClass(LINUX_PACKAGE) {

	documentation = "Native bindings to Xatom.h."

	LongConstant(
		"Predefined atoms.",

		"XA_PRIMARY" _ 1L,
		"XA_SECONDARY" _ 2L,
		"XA_ARC" _ 3L,
		"XA_ATOM" _ 4L,
		"XA_BITMAP" _ 5L,
		"XA_CARDINAL" _ 6L,
		"XA_COLORMAP" _ 7L,
		"XA_CURSOR" _ 8L,
		"XA_CUT_BUFFER0" _ 9L,
		"XA_CUT_BUFFER1" _ 10L,
		"XA_CUT_BUFFER2" _ 11L,
		"XA_CUT_BUFFER3" _ 12L,
		"XA_CUT_BUFFER4" _ 13L,
		"XA_CUT_BUFFER5" _ 14L,
		"XA_CUT_BUFFER6" _ 15L,
		"XA_CUT_BUFFER7" _ 16L,
		"XA_DRAWABLE" _ 17L,
		"XA_FONT" _ 18L,
		"XA_INTEGER" _ 19L,
		"XA_PIXMAP" _ 20L,
		"XA_POINT" _ 21L,
		"XA_RECTANGLE" _ 22L,
		"XA_RESOURCE_MANAGER" _ 23L,
		"XA_RGB_COLOR_MAP" _ 24L,
		"XA_RGB_BEST_MAP" _ 25L,
		"XA_RGB_BLUE_MAP" _ 26L,
		"XA_RGB_DEFAULT_MAP" _ 27L,
		"XA_RGB_GRAY_MAP" _ 28L,
		"XA_RGB_GREEN_MAP" _ 29L,
		"XA_RGB_RED_MAP" _ 30L,
		"XA_STRING" _ 31L,
		"XA_VISUALID" _ 32L,
		"XA_WINDOW" _ 33L,
		"XA_WM_COMMAND" _ 34L,
		"XA_WM_HINTS" _ 35L,
		"XA_WM_CLIENT_MACHINE" _ 36L,
		"XA_WM_ICON_NAME" _ 37L,
		"XA_WM_ICON_SIZE" _ 38L,
		"XA_WM_NAME" _ 39L,
		"XA_WM_NORMAL_HINTS" _ 40L,
		"XA_WM_SIZE_HINTS" _ 41L,
		"XA_WM_ZOOM_HINTS" _ 42L,
		"XA_MIN_SPACE" _ 43L,
		"XA_NORM_SPACE" _ 44L,
		"XA_MAX_SPACE" _ 45L,
		"XA_END_SPACE" _ 46L,
		"XA_SUPERSCRIPT_X" _ 47L,
		"XA_SUPERSCRIPT_Y" _ 48L,
		"XA_SUBSCRIPT_X" _ 49L,
		"XA_SUBSCRIPT_Y" _ 50L,
		"XA_UNDERLINE_POSITION" _ 51L,
		"XA_UNDERLINE_THICKNESS" _ 52L,
		"XA_STRIKEOUT_ASCENT" _ 53L,
		"XA_STRIKEOUT_DESCENT" _ 54L,
		"XA_ITALIC_ANGLE" _ 55L,
		"XA_X_HEIGHT" _ 56L,
		"XA_QUAD_WIDTH" _ 57L,
		"XA_WEIGHT" _ 58L,
		"XA_POINT_SIZE" _ 59L,
		"XA_RESOLUTION" _ 60L,
		"XA_COPYRIGHT" _ 61L,
		"XA_NOTICE" _ 62L,
		"XA_FONT_NAME" _ 63L,
		"XA_FAMILY_NAME" _ 64L,
		"XA_FULL_NAME" _ 65L,
		"XA_CAP_HEIGHT" _ 66L,
		"XA_WM_CLASS" _ 67L,
		"XA_WM_TRANSIENT_FOR" _ 68L,

		"XA_LAST_PREDEFINED" _ 68L
	)

}