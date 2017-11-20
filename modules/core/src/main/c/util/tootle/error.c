/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#include "TootlePCH.h"



void error_output(const char *fmt, ...)
{
   // disable all console output if ERROR_SILENT is defined
#ifndef ERROR_SILENT
    va_list ap;
    va_start(ap, fmt);
    vfprintf(stderr, fmt, ap);
    va_end(ap);
#else
    (void)fmt;
#endif
}
