/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux.templates

import org.lwjgl.generator.*
import org.lwjgl.system.linux.*

fun Xatom() = "Xatom".nativeClass(LINUX_PACKAGE) {

	javaDoc("Native bindings to Xatom.h.")

	LongConstant.block(
		"Predefined atoms.",

		"XA_PRIMARY" _ 1.L,
		"XA_SECONDARY" _ 2.L,
		"XA_ARC" _ 3.L,
		"XA_ATOM" _ 4.L,
		"XA_BITMAP" _ 5.L,
		"XA_CARDINAL" _ 6.L,
		"XA_COLORMAP" _ 7.L,
		"XA_CURSOR" _ 8.L,
		"XA_CUT_BUFFER0" _ 9.L,
		"XA_CUT_BUFFER1" _ 10.L,
		"XA_CUT_BUFFER2" _ 11.L,
		"XA_CUT_BUFFER3" _ 12.L,
		"XA_CUT_BUFFER4" _ 13.L,
		"XA_CUT_BUFFER5" _ 14.L,
		"XA_CUT_BUFFER6" _ 15.L,
		"XA_CUT_BUFFER7" _ 16.L,
		"XA_DRAWABLE" _ 17.L,
		"XA_FONT" _ 18.L,
		"XA_INTEGER" _ 19.L,
		"XA_PIXMAP" _ 20.L,
		"XA_POINT" _ 21.L,
		"XA_RECTANGLE" _ 22.L,
		"XA_RESOURCE_MANAGER" _ 23.L,
		"XA_RGB_COLOR_MAP" _ 24.L,
		"XA_RGB_BEST_MAP" _ 25.L,
		"XA_RGB_BLUE_MAP" _ 26.L,
		"XA_RGB_DEFAULT_MAP" _ 27.L,
		"XA_RGB_GRAY_MAP" _ 28.L,
		"XA_RGB_GREEN_MAP" _ 29.L,
		"XA_RGB_RED_MAP" _ 30.L,
		"XA_STRING" _ 31.L,
		"XA_VISUALID" _ 32.L,
		"XA_WINDOW" _ 33.L,
		"XA_WM_COMMAND" _ 34.L,
		"XA_WM_HINTS" _ 35.L,
		"XA_WM_CLIENT_MACHINE" _ 36.L,
		"XA_WM_ICON_NAME" _ 37.L,
		"XA_WM_ICON_SIZE" _ 38.L,
		"XA_WM_NAME" _ 39.L,
		"XA_WM_NORMAL_HINTS" _ 40.L,
		"XA_WM_SIZE_HINTS" _ 41.L,
		"XA_WM_ZOOM_HINTS" _ 42.L,
		"XA_MIN_SPACE" _ 43.L,
		"XA_NORM_SPACE" _ 44.L,
		"XA_MAX_SPACE" _ 45.L,
		"XA_END_SPACE" _ 46.L,
		"XA_SUPERSCRIPT_X" _ 47.L,
		"XA_SUPERSCRIPT_Y" _ 48.L,
		"XA_SUBSCRIPT_X" _ 49.L,
		"XA_SUBSCRIPT_Y" _ 50.L,
		"XA_UNDERLINE_POSITION" _ 51.L,
		"XA_UNDERLINE_THICKNESS" _ 52.L,
		"XA_STRIKEOUT_ASCENT" _ 53.L,
		"XA_STRIKEOUT_DESCENT" _ 54.L,
		"XA_ITALIC_ANGLE" _ 55.L,
		"XA_X_HEIGHT" _ 56.L,
		"XA_QUAD_WIDTH" _ 57.L,
		"XA_WEIGHT" _ 58.L,
		"XA_POINT_SIZE" _ 59.L,
		"XA_RESOLUTION" _ 60.L,
		"XA_COPYRIGHT" _ 61.L,
		"XA_NOTICE" _ 62.L,
		"XA_FONT_NAME" _ 63.L,
		"XA_FAMILY_NAME" _ 64.L,
		"XA_FULL_NAME" _ 65.L,
		"XA_CAP_HEIGHT" _ 66.L,
		"XA_WM_CLASS" _ 67.L,
		"XA_WM_TRANSIENT_FOR" _ 68.L,

		"XA_LAST_PREDEFINED" _ 68.L
	)

}