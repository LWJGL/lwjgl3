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

#ifndef __LWJGL_OPENGL_TYPES_H__
#define __LWJGL_OPENGL_TYPES_H__

// Base GL types

// TODO: Do we really need this for MACOSX?
#ifdef _MACOSX
	typedef unsigned long   GLenum;
	typedef unsigned char   GLboolean;
	typedef unsigned long   GLbitfield;
	typedef signed char     GLbyte;
	typedef short           GLshort;
	typedef long            GLint;
	typedef long            GLsizei;
	typedef unsigned char   GLubyte;
	typedef unsigned short  GLushort;
	typedef unsigned long   GLuint;
	typedef float           GLfloat;
	typedef float           GLclampf;
	typedef double          GLdouble;
	typedef double          GLclampd;
	typedef void            GLvoid;
#else
	typedef unsigned int    GLenum;
	typedef unsigned char   GLboolean;
	typedef unsigned int    GLbitfield;
	typedef signed char     GLbyte;
	typedef short           GLshort;
	typedef int             GLint;
	typedef int             GLsizei;
	typedef unsigned char   GLubyte;
	typedef unsigned short  GLushort;
	typedef unsigned int    GLuint;
	typedef unsigned short  GLhalf;
	typedef float           GLfloat;
	typedef float           GLclampf;
	typedef double          GLdouble;
	typedef double          GLclampd;
	typedef void            GLvoid;
#endif

// Define int32_t, int64_t, and uint64_t types for UST/MSC
#if defined(__STDC_VERSION__) && __STDC_VERSION__ >= 199901L
	#include <inttypes.h>
#elif defined(__sun__) || defined(__digital__)
	#include <inttypes.h>
	#if defined(__STDC__)
		#if defined(__arch64__) || defined(_LP64)
			typedef long int int64_t;
			typedef unsigned long int uint64_t;
		#else
			typedef long long int int64_t;
			typedef unsigned long long int uint64_t;
		#endif /* __arch64__ */
	#endif /* __STDC__ */
#elif defined( __VMS ) || defined(__sgi)
	#include <inttypes.h>
#elif defined(__SCO__) || defined(__USLC__)
	#include <stdint.h>
#elif defined(__UNIXOS2__) || defined(__SOL64__)
	typedef long int int32_t;
	typedef long long int int64_t;
	typedef unsigned long long int uint64_t;
#elif defined(_WIN32) && defined(__GNUC__)
	#include <stdint.h>
#elif defined(_WIN32)
	typedef __int32 int32_t;
	typedef __int64 int64_t;
	typedef unsigned __int64 uint64_t;
#else
	/* Fallback if nothing above works */
	#include <inttypes.h>
#endif

// OpenGL 1.5
typedef ptrdiff_t GLintptr;
typedef ptrdiff_t GLsizeiptr;

// OpenGL 2.0
typedef char GLchar;

// OpenGL 3.2
typedef int64_t GLint64;
typedef uint64_t GLuint64;

// GL_ARB_vertex_buffer_object
typedef ptrdiff_t GLintptrARB;
typedef ptrdiff_t GLsizeiptrARB;

// GL_ARB_shader_objects
typedef char GLcharARB;
typedef unsigned int GLhandleARB;

// GL_ARB_half_float_pixel
typedef unsigned short GLhalfARB;

// GL_ARB_sync
typedef struct __GLsync * GLsync;

// GL_ARB_cl_event
#ifndef __OPENCL_H
	typedef struct _cl_context * cl_context;
	typedef struct _cl_event * cl_event;
#endif

// GL_EXT_timer_query
typedef int64_t GLint64EXT;
typedef uint64_t GLuint64EXT;

// GL_NV_half_float
typedef unsigned short GLhalfNV;

// GL_NV_vdpau_interop
typedef GLintptr GLvdpauSurfaceNV;

#endif
