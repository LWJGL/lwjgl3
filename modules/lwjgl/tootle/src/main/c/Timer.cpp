/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#include "TootlePCH.h"
#ifdef _WIN32
    #include <windows.h>
#else
    #include <time.h>
    #include <sys/time.h>
#endif

#include "Timer.h"

Timer::
Timer()
{
    Reset();
}

void
Timer::
Reset(void)
{
    time = Get();
}

double
Timer::
GetElapsed(void)
{
    return Get() - time;
}

double
Timer::Get(void)
{
#ifdef _WIN32
    FILETIME ft;
    GetSystemTimeAsFileTime(&ft);
    return ft.dwLowDateTime / 1.0e7 + ft.dwHighDateTime * (4294967296.0 / 1.0e7);
#else
    struct timeval v;
    gettimeofday(&v, (struct timezone*) NULL);
    return v.tv_sec + v.tv_usec / 1.0e6;
#endif
}
