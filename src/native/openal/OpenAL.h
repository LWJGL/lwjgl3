/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#ifndef __LWJGL_OPENAL_H__
#define __LWJGL_OPENAL_H__

#define APIENTRY // Default is __cdecl on Windows, no need for anything special here.


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

// -----------------[ ALC typedefs ]-----------------

typedef struct ALCdevice_struct ALCdevice;
typedef struct ALCcontext_struct ALCcontext;

typedef char ALCboolean;
typedef char ALCchar;
typedef char ALCbyte;
typedef unsigned char ALCubyte;
typedef short ALCshort;
typedef unsigned short ALCushort;
typedef int ALCint;
typedef unsigned int ALCuint;
typedef int ALCsizei;
typedef int ALCenum;
typedef float ALCfloat;
typedef double ALCdouble;
typedef void ALCvoid;

// -----------------[ AL typedefs ]-----------------

typedef char ALboolean;
typedef char ALchar;
typedef char ALbyte;
typedef unsigned char ALubyte;
typedef short ALshort;
typedef unsigned short ALushort;
typedef int ALint;
typedef unsigned int ALuint;
typedef int ALsizei;
typedef int ALenum;
typedef float ALfloat;
typedef double ALdouble;
typedef void ALvoid;
typedef int64_t ALint64SOFT;
typedef uint64_t ALuint64SOFT;

#endif
