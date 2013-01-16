/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#ifndef __LWJGL_OPENAL_H__
#define __LWJGL_OPENAL_H__

#define APIENTRY // Default is __cdecl on Windows, no need for anything special here.

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

#endif