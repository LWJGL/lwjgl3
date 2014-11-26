/*
** Copyright (c) 2007-2012 The Khronos Group Inc.
**
** Permission is hereby granted, free of charge, to any person obtaining a
** copy of this software and/or associated documentation files (the
** "Materials"), to deal in the Materials without restriction, including
** without limitation the rights to use, copy, modify, merge, publish,
** distribute, sublicense, and/or sell copies of the Materials, and to
** permit persons to whom the Materials are furnished to do so, subject to
** the following conditions:
**
** The above copyright notice and this permission notice shall be included
** in all copies or substantial portions of the Materials.
**
** THE MATERIALS ARE PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
** EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
** MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
** IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY
** CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
** TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
** MATERIALS OR THE USE OR OTHER DEALINGS IN THE MATERIALS.
*/

// OpenGL definitions

#ifndef __LWJGL_OPENGL_H__
#define __LWJGL_OPENGL_H__

#include "opengl_types.h"

#ifndef APIENTRY
	#if defined(_WIN32) || defined(_WIN64)
		// This will include <windows.h> which will define APIENTRY properly for us.
	    #include "WindowsLWJGL.h"
	#else
		#define APIENTRY
	#endif
#endif

#ifndef GL_VERSION_4_3
	typedef void (APIENTRY *GLDEBUGPROC)(GLenum, GLenum, GLuint, GLenum, GLsizei, const GLchar*, const void*);
#endif

#ifndef GL_AMD_debug_output
	typedef void (APIENTRY *GLDEBUGPROCAMD)(GLuint, GLenum, GLenum, GLsizei, const GLchar*, GLvoid*);
#endif

#ifndef GL_ARB_debug_output
	typedef void (APIENTRY *GLDEBUGPROCARB)(GLenum, GLenum, GLuint, GLenum, GLsizei, const GLchar*, GLvoid*);
#endif

#endif
