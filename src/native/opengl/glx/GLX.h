/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */

// GLX definitions

#ifndef __LWJGL_GLX_H__
#define __LWJGL_GLX_H__

typedef struct {
	int type;
	unsigned long serial;
	Bool send_event;
	Display *display;
	int extension;
	int evtype;
	GLXDrawable window;
	Bool stereo_tree;
} GLXStereoNotifyEventEXT;

#endif
