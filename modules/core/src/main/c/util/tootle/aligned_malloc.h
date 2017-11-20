/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
// This is the interface of address-aligned malloc and free.
****************************************************************************************/
#ifndef _ALIGNED_MALLOC_H
#define _ALIGNED_MALLOC_H

//=================================================================================================================================
/// \brief Allocate a memory such that the starting address will be aligned to the specified alignment.
//=================================================================================================================================
void* aligned_malloc(size_t bytes, size_t alignment);

//=================================================================================================================================
/// \brief Free the memory allocated by aligned_malloc().
//=================================================================================================================================
void aligned_free(void* p);

#endif
