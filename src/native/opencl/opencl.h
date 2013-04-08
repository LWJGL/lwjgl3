/*******************************************************************************
 * Copyright (c) 2008-2012 The Khronos Group Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a
 * copy of this software and/or associated documentation files (the
 * "Materials"), to deal in the Materials without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Materials, and to
 * permit persons to whom the Materials are furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Materials.
 *
 * THE MATERIALS ARE PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY
 * CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * MATERIALS OR THE USE OR OTHER DEALINGS IN THE MATERIALS.
 ******************************************************************************/

/* $Revision: 11708 $ on $Date: 2010-06-13 23:36:24 -0700 (Sun, 13 Jun 2010) $ */

#ifndef __OPENCL_H
#define __OPENCL_H

#ifdef __APPLE__

#include <OpenCL/cl.h>
#include <OpenCL/cl_gl.h>

#else

#include "CL/cl.h"
#include "CL/cl_gl.h"

#endif

#ifndef APIENTRY
	#define APIENTRY CL_API_CALL
#endif
#ifndef CALLBACK
	#define CALLBACK CL_CALLBACK
#endif

// Custom typedefs

typedef void cl_void;

// Callback function typedefs

typedef void (CL_CALLBACK * cl_program_callback)(cl_program program, void *user_data);
typedef void (CL_CALLBACK * cl_create_context_callback)(const char *errinfo, const void *private_info, size_t cb, void *user_data);
typedef void (CL_CALLBACK * cl_native_kernel_func)(void *args);
typedef void (CL_CALLBACK * cl_mem_object_destructor_callback)(cl_mem memobj, void *user_data);
typedef void (CL_CALLBACK * cl_event_callback)(cl_event event, cl_int event_command_exec_status, void *user_data);
typedef void (CL_CALLBACK * cl_printf_callback)(cl_context context, cl_uint printf_data_len, char *printf_data_ptr, void *user_data);

// Extension struct typedefs

typedef union {
    struct { cl_uint type; cl_uint data[5]; } raw;
    struct { cl_uint type; cl_char unused[17]; cl_char bus; cl_char device; cl_char function; } pcie;
} cl_device_topology_amd;

typedef struct {
	cl_ulong surface_bus_address;
	cl_ulong marker_bus_address;
} cl_bus_address_amd;

#endif  /* __OPENCL_H   */

