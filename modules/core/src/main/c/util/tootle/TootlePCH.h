/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#ifndef _TOOTLEPCH_H_
#define _TOOTLEPCH_H_

// disable VC++ 2K5 warnings about deprecated standard C functions
#if defined( _MSC_VER )
    #if _MSC_VER >= 1400
        #define _CRT_SECURE_NO_DEPRECATE
    #endif
#endif

#ifdef _LINUX
    #define __cdecl
    #define _isnan(x) isnan(x)
    #define _finite(x) finite(x)
#endif

#ifdef __cplusplus

    #include <cstddef>
    #include <cstdio>
    #include <cstdlib>
    #include <cstring>
    #include <cmath>
    #include <functional>
    #include <list>
    #include <map>
    #include <queue>
    #include <set>
    #include <string>
    #include <vector>
#else

    #include <stdio.h>
    #include <stdlib.h>
    #include <string.h>
    #include <stdarg.h>

#endif

// suppress Debug and error output stream for both release and debug builds
#define ERROR_SILENT
//#define _SOFTWARE_ONLY_VERSION          // compile with this flag for no dependency on GPU or Direct3D

#include <assert.h>
#include <float.h>

#ifdef _DX11_1_

/*
    Starting with Windows 8, the DirectX SDK is included as part of the Windows SDK.
    more information at https://msdn.microsoft.com/en-us/library/windows/desktop/ee663275(v=vs.85).aspx
*/

#include <DirectXMath.h>

#endif

#endif // _SU_TOOTLEPCH_H_
