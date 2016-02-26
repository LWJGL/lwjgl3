/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.vulkan;

import org.lwjgl.PointerBuffer;
import org.lwjgl.glfw.*;
import org.lwjgl.vulkan.*;

import java.nio.*;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.glfw.GLFWVulkan.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.vulkan.EXTDebugReport.*;
import static org.lwjgl.vulkan.KHRSurface.*;
import static org.lwjgl.vulkan.KHRSwapchain.*;
import static org.lwjgl.vulkan.VK10.*;
import static org.lwjgl.vulkan.VKUtil.*;

/*
 * Copyright (c) 2015-2016 The Khronos Group Inc.
 * Copyright (c) 2015-2016 Valve Corporation
 * Copyright (c) 2015-2016 LunarG, Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and/or associated documentation files (the "Materials"), to
 * deal in the Materials without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
 * sell copies of the Materials, and to permit persons to whom the Materials are
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice(s) and this permission notice shall be included in
 * all copies or substantial portions of the Materials.
 *
 * THE MATERIALS ARE PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 *
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE MATERIALS OR THE
 * USE OR OTHER DEALINGS IN THE MATERIALS.
 *
 * Author: Chia-I Wu <olvaffe@gmail.com>
 * Author: Cody Northrop <cody@lunarg.com>
 * Author: Courtney Goeltzenleuchter <courtney@LunarG.com>
 * Author: Ian Elliott <ian@LunarG.com>
 * Author: Jon Ashburn <jon@lunarg.com>
 * Author: Piers Daniell <pdaniell@nvidia.com>
 */

/** Simple Vulkan demo. Ported from the GLFW <a href="https://github.com/glfw/glfw/blob/master/tests/vulkan.c">vulkan</a> test. */
public final class HelloVulkan {

	private static final int DEMO_TEXTURE_COUNT    = 1;
	private static final int VERTEX_BUFFER_BIND_ID = 0;

	private static final ByteBuffer APP_SHORT_NAME = memEncodeUTF8("vulkan");
	private static final ByteBuffer APP_LONG_NAME  = memEncodeUTF8("The Vulkan Triangle Demo Program");

	private static final ByteBuffer KHR_swapchain    = memEncodeASCII(VK_KHR_SWAPCHAIN_EXTENSION_NAME);
	private static final ByteBuffer EXT_debug_report = memEncodeASCII(VK_EXT_DEBUG_REPORT_EXTENSION_NAME);

	private static final byte[] fragShaderCode = {
		0x03, 0x02, 0x23, 0x07, 0x00, 0x00, 0x01, 0x00, 0x01, 0x00, 0x08, 0x00,
		0x14, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x11, 0x00, 0x02, 0x00,
		0x01, 0x00, 0x00, 0x00, 0x0b, 0x00, 0x06, 0x00, 0x01, 0x00, 0x00, 0x00,
		0x47, 0x4c, 0x53, 0x4c, 0x2e, 0x73, 0x74, 0x64, 0x2e, 0x34, 0x35, 0x30,
		0x00, 0x00, 0x00, 0x00, 0x0e, 0x00, 0x03, 0x00, 0x00, 0x00, 0x00, 0x00,
		0x01, 0x00, 0x00, 0x00, 0x0f, 0x00, 0x07, 0x00, 0x04, 0x00, 0x00, 0x00,
		0x04, 0x00, 0x00, 0x00, 0x6d, 0x61, 0x69, 0x6e, 0x00, 0x00, 0x00, 0x00,
		0x09, 0x00, 0x00, 0x00, 0x11, 0x00, 0x00, 0x00, 0x10, 0x00, 0x03, 0x00,
		0x04, 0x00, 0x00, 0x00, 0x08, 0x00, 0x00, 0x00, 0x03, 0x00, 0x03, 0x00,
		0x02, 0x00, 0x00, 0x00, (byte)0x90, 0x01, 0x00, 0x00, 0x04, 0x00, 0x09, 0x00,
		0x47, 0x4c, 0x5f, 0x41, 0x52, 0x42, 0x5f, 0x73, 0x65, 0x70, 0x61, 0x72,
		0x61, 0x74, 0x65, 0x5f, 0x73, 0x68, 0x61, 0x64, 0x65, 0x72, 0x5f, 0x6f,
		0x62, 0x6a, 0x65, 0x63, 0x74, 0x73, 0x00, 0x00, 0x04, 0x00, 0x09, 0x00,
		0x47, 0x4c, 0x5f, 0x41, 0x52, 0x42, 0x5f, 0x73, 0x68, 0x61, 0x64, 0x69,
		0x6e, 0x67, 0x5f, 0x6c, 0x61, 0x6e, 0x67, 0x75, 0x61, 0x67, 0x65, 0x5f,
		0x34, 0x32, 0x30, 0x70, 0x61, 0x63, 0x6b, 0x00, 0x05, 0x00, 0x04, 0x00,
		0x04, 0x00, 0x00, 0x00, 0x6d, 0x61, 0x69, 0x6e, 0x00, 0x00, 0x00, 0x00,
		0x05, 0x00, 0x05, 0x00, 0x09, 0x00, 0x00, 0x00, 0x75, 0x46, 0x72, 0x61,
		0x67, 0x43, 0x6f, 0x6c, 0x6f, 0x72, 0x00, 0x00, 0x05, 0x00, 0x03, 0x00,
		0x0d, 0x00, 0x00, 0x00, 0x74, 0x65, 0x78, 0x00, 0x05, 0x00, 0x05, 0x00,
		0x11, 0x00, 0x00, 0x00, 0x74, 0x65, 0x78, 0x63, 0x6f, 0x6f, 0x72, 0x64,
		0x00, 0x00, 0x00, 0x00, 0x47, 0x00, 0x04, 0x00, 0x09, 0x00, 0x00, 0x00,
		0x1e, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x47, 0x00, 0x04, 0x00,
		0x0d, 0x00, 0x00, 0x00, 0x22, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
		0x47, 0x00, 0x04, 0x00, 0x0d, 0x00, 0x00, 0x00, 0x21, 0x00, 0x00, 0x00,
		0x00, 0x00, 0x00, 0x00, 0x47, 0x00, 0x04, 0x00, 0x11, 0x00, 0x00, 0x00,
		0x1e, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x13, 0x00, 0x02, 0x00,
		0x02, 0x00, 0x00, 0x00, 0x21, 0x00, 0x03, 0x00, 0x03, 0x00, 0x00, 0x00,
		0x02, 0x00, 0x00, 0x00, 0x16, 0x00, 0x03, 0x00, 0x06, 0x00, 0x00, 0x00,
		0x20, 0x00, 0x00, 0x00, 0x17, 0x00, 0x04, 0x00, 0x07, 0x00, 0x00, 0x00,
		0x06, 0x00, 0x00, 0x00, 0x04, 0x00, 0x00, 0x00, 0x20, 0x00, 0x04, 0x00,
		0x08, 0x00, 0x00, 0x00, 0x03, 0x00, 0x00, 0x00, 0x07, 0x00, 0x00, 0x00,
		0x3b, 0x00, 0x04, 0x00, 0x08, 0x00, 0x00, 0x00, 0x09, 0x00, 0x00, 0x00,
		0x03, 0x00, 0x00, 0x00, 0x19, 0x00, 0x09, 0x00, 0x0a, 0x00, 0x00, 0x00,
		0x06, 0x00, 0x00, 0x00, 0x01, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
		0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01, 0x00, 0x00, 0x00,
		0x00, 0x00, 0x00, 0x00, 0x1b, 0x00, 0x03, 0x00, 0x0b, 0x00, 0x00, 0x00,
		0x0a, 0x00, 0x00, 0x00, 0x20, 0x00, 0x04, 0x00, 0x0c, 0x00, 0x00, 0x00,
		0x00, 0x00, 0x00, 0x00, 0x0b, 0x00, 0x00, 0x00, 0x3b, 0x00, 0x04, 0x00,
		0x0c, 0x00, 0x00, 0x00, 0x0d, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
		0x17, 0x00, 0x04, 0x00, 0x0f, 0x00, 0x00, 0x00, 0x06, 0x00, 0x00, 0x00,
		0x02, 0x00, 0x00, 0x00, 0x20, 0x00, 0x04, 0x00, 0x10, 0x00, 0x00, 0x00,
		0x01, 0x00, 0x00, 0x00, 0x0f, 0x00, 0x00, 0x00, 0x3b, 0x00, 0x04, 0x00,
		0x10, 0x00, 0x00, 0x00, 0x11, 0x00, 0x00, 0x00, 0x01, 0x00, 0x00, 0x00,
		0x36, 0x00, 0x05, 0x00, 0x02, 0x00, 0x00, 0x00, 0x04, 0x00, 0x00, 0x00,
		0x00, 0x00, 0x00, 0x00, 0x03, 0x00, 0x00, 0x00, (byte)0xf8, 0x00, 0x02, 0x00,
		0x05, 0x00, 0x00, 0x00, 0x3d, 0x00, 0x04, 0x00, 0x0b, 0x00, 0x00, 0x00,
		0x0e, 0x00, 0x00, 0x00, 0x0d, 0x00, 0x00, 0x00, 0x3d, 0x00, 0x04, 0x00,
		0x0f, 0x00, 0x00, 0x00, 0x12, 0x00, 0x00, 0x00, 0x11, 0x00, 0x00, 0x00,
		0x57, 0x00, 0x05, 0x00, 0x07, 0x00, 0x00, 0x00, 0x13, 0x00, 0x00, 0x00,
		0x0e, 0x00, 0x00, 0x00, 0x12, 0x00, 0x00, 0x00, 0x3e, 0x00, 0x03, 0x00,
		0x09, 0x00, 0x00, 0x00, 0x13, 0x00, 0x00, 0x00, (byte)0xfd, 0x00, 0x01, 0x00,
		0x38, 0x00, 0x01, 0x00
	};

	private static final byte[] vertShaderCode = {
		0x03, 0x02, 0x23, 0x07, 0x00, 0x00, 0x01, 0x00, 0x01, 0x00, 0x08, 0x00,
		0x1e, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x11, 0x00, 0x02, 0x00,
		0x01, 0x00, 0x00, 0x00, 0x0b, 0x00, 0x06, 0x00, 0x01, 0x00, 0x00, 0x00,
		0x47, 0x4c, 0x53, 0x4c, 0x2e, 0x73, 0x74, 0x64, 0x2e, 0x34, 0x35, 0x30,
		0x00, 0x00, 0x00, 0x00, 0x0e, 0x00, 0x03, 0x00, 0x00, 0x00, 0x00, 0x00,
		0x01, 0x00, 0x00, 0x00, 0x0f, 0x00, 0x0b, 0x00, 0x00, 0x00, 0x00, 0x00,
		0x04, 0x00, 0x00, 0x00, 0x6d, 0x61, 0x69, 0x6e, 0x00, 0x00, 0x00, 0x00,
		0x09, 0x00, 0x00, 0x00, 0x0b, 0x00, 0x00, 0x00, 0x13, 0x00, 0x00, 0x00,
		0x17, 0x00, 0x00, 0x00, 0x1c, 0x00, 0x00, 0x00, 0x1d, 0x00, 0x00, 0x00,
		0x03, 0x00, 0x03, 0x00, 0x02, 0x00, 0x00, 0x00, (byte)0x90, 0x01, 0x00, 0x00,
		0x04, 0x00, 0x09, 0x00, 0x47, 0x4c, 0x5f, 0x41, 0x52, 0x42, 0x5f, 0x73,
		0x65, 0x70, 0x61, 0x72, 0x61, 0x74, 0x65, 0x5f, 0x73, 0x68, 0x61, 0x64,
		0x65, 0x72, 0x5f, 0x6f, 0x62, 0x6a, 0x65, 0x63, 0x74, 0x73, 0x00, 0x00,
		0x04, 0x00, 0x09, 0x00, 0x47, 0x4c, 0x5f, 0x41, 0x52, 0x42, 0x5f, 0x73,
		0x68, 0x61, 0x64, 0x69, 0x6e, 0x67, 0x5f, 0x6c, 0x61, 0x6e, 0x67, 0x75,
		0x61, 0x67, 0x65, 0x5f, 0x34, 0x32, 0x30, 0x70, 0x61, 0x63, 0x6b, 0x00,
		0x05, 0x00, 0x04, 0x00, 0x04, 0x00, 0x00, 0x00, 0x6d, 0x61, 0x69, 0x6e,
		0x00, 0x00, 0x00, 0x00, 0x05, 0x00, 0x05, 0x00, 0x09, 0x00, 0x00, 0x00,
		0x74, 0x65, 0x78, 0x63, 0x6f, 0x6f, 0x72, 0x64, 0x00, 0x00, 0x00, 0x00,
		0x05, 0x00, 0x04, 0x00, 0x0b, 0x00, 0x00, 0x00, 0x61, 0x74, 0x74, 0x72,
		0x00, 0x00, 0x00, 0x00, 0x05, 0x00, 0x06, 0x00, 0x11, 0x00, 0x00, 0x00,
		0x67, 0x6c, 0x5f, 0x50, 0x65, 0x72, 0x56, 0x65, 0x72, 0x74, 0x65, 0x78,
		0x00, 0x00, 0x00, 0x00, 0x06, 0x00, 0x06, 0x00, 0x11, 0x00, 0x00, 0x00,
		0x00, 0x00, 0x00, 0x00, 0x67, 0x6c, 0x5f, 0x50, 0x6f, 0x73, 0x69, 0x74,
		0x69, 0x6f, 0x6e, 0x00, 0x06, 0x00, 0x07, 0x00, 0x11, 0x00, 0x00, 0x00,
		0x01, 0x00, 0x00, 0x00, 0x67, 0x6c, 0x5f, 0x50, 0x6f, 0x69, 0x6e, 0x74,
		0x53, 0x69, 0x7a, 0x65, 0x00, 0x00, 0x00, 0x00, 0x06, 0x00, 0x07, 0x00,
		0x11, 0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x67, 0x6c, 0x5f, 0x43,
		0x6c, 0x69, 0x70, 0x44, 0x69, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x00,
		0x05, 0x00, 0x03, 0x00, 0x13, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
		0x05, 0x00, 0x03, 0x00, 0x17, 0x00, 0x00, 0x00, 0x70, 0x6f, 0x73, 0x00,
		0x05, 0x00, 0x05, 0x00, 0x1c, 0x00, 0x00, 0x00, 0x67, 0x6c, 0x5f, 0x56,
		0x65, 0x72, 0x74, 0x65, 0x78, 0x49, 0x44, 0x00, 0x05, 0x00, 0x06, 0x00,
		0x1d, 0x00, 0x00, 0x00, 0x67, 0x6c, 0x5f, 0x49, 0x6e, 0x73, 0x74, 0x61,
		0x6e, 0x63, 0x65, 0x49, 0x44, 0x00, 0x00, 0x00, 0x47, 0x00, 0x04, 0x00,
		0x09, 0x00, 0x00, 0x00, 0x1e, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
		0x47, 0x00, 0x04, 0x00, 0x0b, 0x00, 0x00, 0x00, 0x1e, 0x00, 0x00, 0x00,
		0x01, 0x00, 0x00, 0x00, 0x48, 0x00, 0x05, 0x00, 0x11, 0x00, 0x00, 0x00,
		0x00, 0x00, 0x00, 0x00, 0x0b, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
		0x48, 0x00, 0x05, 0x00, 0x11, 0x00, 0x00, 0x00, 0x01, 0x00, 0x00, 0x00,
		0x0b, 0x00, 0x00, 0x00, 0x01, 0x00, 0x00, 0x00, 0x48, 0x00, 0x05, 0x00,
		0x11, 0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x0b, 0x00, 0x00, 0x00,
		0x03, 0x00, 0x00, 0x00, 0x47, 0x00, 0x03, 0x00, 0x11, 0x00, 0x00, 0x00,
		0x02, 0x00, 0x00, 0x00, 0x47, 0x00, 0x04, 0x00, 0x17, 0x00, 0x00, 0x00,
		0x1e, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x47, 0x00, 0x04, 0x00,
		0x1c, 0x00, 0x00, 0x00, 0x0b, 0x00, 0x00, 0x00, 0x05, 0x00, 0x00, 0x00,
		0x47, 0x00, 0x04, 0x00, 0x1d, 0x00, 0x00, 0x00, 0x0b, 0x00, 0x00, 0x00,
		0x06, 0x00, 0x00, 0x00, 0x13, 0x00, 0x02, 0x00, 0x02, 0x00, 0x00, 0x00,
		0x21, 0x00, 0x03, 0x00, 0x03, 0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00,
		0x16, 0x00, 0x03, 0x00, 0x06, 0x00, 0x00, 0x00, 0x20, 0x00, 0x00, 0x00,
		0x17, 0x00, 0x04, 0x00, 0x07, 0x00, 0x00, 0x00, 0x06, 0x00, 0x00, 0x00,
		0x02, 0x00, 0x00, 0x00, 0x20, 0x00, 0x04, 0x00, 0x08, 0x00, 0x00, 0x00,
		0x03, 0x00, 0x00, 0x00, 0x07, 0x00, 0x00, 0x00, 0x3b, 0x00, 0x04, 0x00,
		0x08, 0x00, 0x00, 0x00, 0x09, 0x00, 0x00, 0x00, 0x03, 0x00, 0x00, 0x00,
		0x20, 0x00, 0x04, 0x00, 0x0a, 0x00, 0x00, 0x00, 0x01, 0x00, 0x00, 0x00,
		0x07, 0x00, 0x00, 0x00, 0x3b, 0x00, 0x04, 0x00, 0x0a, 0x00, 0x00, 0x00,
		0x0b, 0x00, 0x00, 0x00, 0x01, 0x00, 0x00, 0x00, 0x17, 0x00, 0x04, 0x00,
		0x0d, 0x00, 0x00, 0x00, 0x06, 0x00, 0x00, 0x00, 0x04, 0x00, 0x00, 0x00,
		0x15, 0x00, 0x04, 0x00, 0x0e, 0x00, 0x00, 0x00, 0x20, 0x00, 0x00, 0x00,
		0x00, 0x00, 0x00, 0x00, 0x2b, 0x00, 0x04, 0x00, 0x0e, 0x00, 0x00, 0x00,
		0x0f, 0x00, 0x00, 0x00, 0x01, 0x00, 0x00, 0x00, 0x1c, 0x00, 0x04, 0x00,
		0x10, 0x00, 0x00, 0x00, 0x06, 0x00, 0x00, 0x00, 0x0f, 0x00, 0x00, 0x00,
		0x1e, 0x00, 0x05, 0x00, 0x11, 0x00, 0x00, 0x00, 0x0d, 0x00, 0x00, 0x00,
		0x06, 0x00, 0x00, 0x00, 0x10, 0x00, 0x00, 0x00, 0x20, 0x00, 0x04, 0x00,
		0x12, 0x00, 0x00, 0x00, 0x03, 0x00, 0x00, 0x00, 0x11, 0x00, 0x00, 0x00,
		0x3b, 0x00, 0x04, 0x00, 0x12, 0x00, 0x00, 0x00, 0x13, 0x00, 0x00, 0x00,
		0x03, 0x00, 0x00, 0x00, 0x15, 0x00, 0x04, 0x00, 0x14, 0x00, 0x00, 0x00,
		0x20, 0x00, 0x00, 0x00, 0x01, 0x00, 0x00, 0x00, 0x2b, 0x00, 0x04, 0x00,
		0x14, 0x00, 0x00, 0x00, 0x15, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
		0x20, 0x00, 0x04, 0x00, 0x16, 0x00, 0x00, 0x00, 0x01, 0x00, 0x00, 0x00,
		0x0d, 0x00, 0x00, 0x00, 0x3b, 0x00, 0x04, 0x00, 0x16, 0x00, 0x00, 0x00,
		0x17, 0x00, 0x00, 0x00, 0x01, 0x00, 0x00, 0x00, 0x20, 0x00, 0x04, 0x00,
		0x19, 0x00, 0x00, 0x00, 0x03, 0x00, 0x00, 0x00, 0x0d, 0x00, 0x00, 0x00,
		0x20, 0x00, 0x04, 0x00, 0x1b, 0x00, 0x00, 0x00, 0x01, 0x00, 0x00, 0x00,
		0x14, 0x00, 0x00, 0x00, 0x3b, 0x00, 0x04, 0x00, 0x1b, 0x00, 0x00, 0x00,
		0x1c, 0x00, 0x00, 0x00, 0x01, 0x00, 0x00, 0x00, 0x3b, 0x00, 0x04, 0x00,
		0x1b, 0x00, 0x00, 0x00, 0x1d, 0x00, 0x00, 0x00, 0x01, 0x00, 0x00, 0x00,
		0x36, 0x00, 0x05, 0x00, 0x02, 0x00, 0x00, 0x00, 0x04, 0x00, 0x00, 0x00,
		0x00, 0x00, 0x00, 0x00, 0x03, 0x00, 0x00, 0x00, (byte)0xf8, 0x00, 0x02, 0x00,
		0x05, 0x00, 0x00, 0x00, 0x3d, 0x00, 0x04, 0x00, 0x07, 0x00, 0x00, 0x00,
		0x0c, 0x00, 0x00, 0x00, 0x0b, 0x00, 0x00, 0x00, 0x3e, 0x00, 0x03, 0x00,
		0x09, 0x00, 0x00, 0x00, 0x0c, 0x00, 0x00, 0x00, 0x3d, 0x00, 0x04, 0x00,
		0x0d, 0x00, 0x00, 0x00, 0x18, 0x00, 0x00, 0x00, 0x17, 0x00, 0x00, 0x00,
		0x41, 0x00, 0x05, 0x00, 0x19, 0x00, 0x00, 0x00, 0x1a, 0x00, 0x00, 0x00,
		0x13, 0x00, 0x00, 0x00, 0x15, 0x00, 0x00, 0x00, 0x3e, 0x00, 0x03, 0x00,
		0x1a, 0x00, 0x00, 0x00, 0x18, 0x00, 0x00, 0x00, (byte)0xfd, 0x00, 0x01, 0x00,
		0x38, 0x00, 0x01, 0x00
	};

	// buffers for handle output-params
	private final IntBuffer     ip = memAllocInt(1);
	private final LongBuffer    lp = memAllocLong(1);
	private final PointerBuffer pp = memAllocPointer(1);

	private GLFWErrorCallback errorCB;

	boolean validate = true;

	PointerBuffer device_validation_layers = memAllocPointer(10);

	PointerBuffer extension_names = memAllocPointer(64);

	VkInstance       inst;
	VkPhysicalDevice gpu;

	long msg_callback;

	VkPhysicalDeviceProperties gpu_props = VkPhysicalDeviceProperties.malloc();

	VkQueueFamilyProperties.Buffer queue_props;

	int   width          = 300;
	int   height         = 300;
	float depthStencil   = 1.0f;
	float depthIncrement = -0.01f;

	long window;

	long surface;

	int graphics_queue_node_index;

	VkDevice device;
	VkQueue  queue;

	int format;
	int color_space;

	VkPhysicalDeviceMemoryProperties memory_properties = VkPhysicalDeviceMemoryProperties.malloc();

	long            cmd_pool;
	VkCommandBuffer draw_cmd;

	long               swapchain;
	int                swapchainImageCount;
	SwapchainBuffers[] buffers;
	int                current_buffer;

	VkCommandBuffer setup_cmd;

	Depth depth = new Depth();

	boolean use_staging_buffer;

	TextureObject[] textures = new TextureObject[DEMO_TEXTURE_COUNT];

	Vertices vertices = new Vertices();

	long desc_layout;
	long pipeline_layout;

	long render_pass;

	long pipeline;

	long desc_pool;
	long desc_set;

	LongBuffer framebuffers;

	private HelloVulkan() {
		for ( int i = 0; i < textures.length; i++ ) {
			textures[i] = new TextureObject();
		}
	}

	private final VkDebugReportCallbackEXT dbgFunc = new VkDebugReportCallbackEXT() {
		@Override
		public int invoke(int flags, int objectType, long object, long location, int messageCode, long pLayerPrefix, long pMessage, long pUserData) {
			if ( (flags & VK_DEBUG_REPORT_ERROR_BIT_EXT) != 0 ) {
				System.err.format("ERROR: [%s] Code %d : %s\n", pLayerPrefix, messageCode, memDecodeASCII(pMessage));
			} else if ( (flags & VK_DEBUG_REPORT_WARNING_BIT_EXT) != 0 ) {
				System.err.format("WARNING: [%s] Code %d : %s\n", pLayerPrefix, messageCode, memDecodeASCII(pMessage));
			}

			/*
			 * false indicates that layer should not bail-out of an
			 * API call that had validation failures. This may mean that the
			 * app dies inside the driver due to invalid parameter(s).
			 * That's what would happen without validation layers, so we'll
			 * keep that behavior here.
			 */
			return VK_FALSE;
		}
	};

	private static void check(int errcode) {
		if ( errcode != 0 )
			throw new IllegalStateException(Integer.toString(errcode));
	}

	private void demo_init_connection() {
		errorCB = GLFWErrorCallback.createPrint().set();
		if ( glfwInit() != GLFW_TRUE )
			throw new IllegalStateException("Unable to initialize GLFW");

		if ( glfwVulkanSupported() != GLFW_TRUE )
			throw new IllegalStateException("Cannot find a compatible Vulkan installable client driver (ICD)");
	}

	/**
	 * Return true if all layer names specified in {@code check_names} can be found in given {@code layer} properties.
	 */
	private static boolean demo_check_layers(PointerBuffer check_names, VkLayerProperties.Buffer layers) {
		for ( int i = 0; i < check_names.remaining(); i++ ) {
			boolean found = false;

			for ( int j = 0; j < layers.capacity(); j++ ) {
				layers.position(j);
				if ( check_names.getStringASCII(i).equals(layers.layerNameString()) ) {
					found = true;
					break;
				}
			}

			if ( !found ) {
				System.err.format("Cannot find layer: %s\n", check_names.getStringASCII(i));
				return false;
			}
		}

		return true;
	}

	private void demo_init_vk() {
		device_validation_layers
			//.put(memEncodeASCII("VK_LAYER_LUNARG_standard_validation", BufferAllocator.MALLOC))
			//.put(memEncodeASCII("VK_LAYER_LUNARG_api_dump", BufferAllocator.MALLOC))
			.put(memEncodeASCII("VK_LAYER_LUNARG_device_limits", BufferAllocator.MALLOC))
			.put(memEncodeASCII("VK_LAYER_LUNARG_draw_state", BufferAllocator.MALLOC))
			.put(memEncodeASCII("VK_LAYER_LUNARG_image", BufferAllocator.MALLOC))
			.put(memEncodeASCII("VK_LAYER_LUNARG_mem_tracker", BufferAllocator.MALLOC))
			.put(memEncodeASCII("VK_LAYER_LUNARG_object_tracker", BufferAllocator.MALLOC))
			.put(memEncodeASCII("VK_LAYER_LUNARG_param_checker", BufferAllocator.MALLOC))
			.put(memEncodeASCII("VK_LAYER_LUNARG_swapchain", BufferAllocator.MALLOC))
			.put(memEncodeASCII("VK_LAYER_LUNARG_threading", BufferAllocator.MALLOC))
			.put(memEncodeASCII("VK_LAYER_GOOGLE_unique_objects", BufferAllocator.MALLOC))
			.flip();

		PointerBuffer instance_validation_layers = memAllocPointer(device_validation_layers.remaining());
		instance_validation_layers.put(device_validation_layers);
		instance_validation_layers.flip();
		device_validation_layers.flip();

		boolean validation_found = false;
		int err = vkEnumerateInstanceLayerProperties(ip, null);
		check(err);

		if ( ip.get(0) > 0 ) {
			VkLayerProperties.Buffer instance_layers = VkLayerProperties.malloc(ip.get(0));
			err = vkEnumerateInstanceLayerProperties(ip, instance_layers);
			check(err);

			if ( validate )
				validation_found = demo_check_layers(instance_validation_layers, instance_layers);

			instance_layers.free();
		}

		if ( validate && !validation_found )
			throw new IllegalStateException("vkEnumerateInstanceLayerProperties failed to find required validation layer.");

		PointerBuffer required_extensions = glfwGetRequiredInstanceExtensions();
		if ( required_extensions == null )
			throw new IllegalStateException("glfwGetRequiredInstanceExtensions failed to find the platform surface extensions.");

		for ( int i = 0; i < required_extensions.capacity(); i++ ) {
			extension_names.put(required_extensions.get(i));
		}

		err = vkEnumerateInstanceExtensionProperties((String)null, ip, null);
		check(err);

		if ( ip.get(0) != 0 ) {
			VkExtensionProperties.Buffer instance_extensions = VkExtensionProperties.malloc(ip.get(0));
			err = vkEnumerateInstanceExtensionProperties((String)null, ip, instance_extensions);
			check(err);

			for ( int i = 0; i < ip.get(0); i++ ) {
				instance_extensions.position(i);
				if ( VK_EXT_DEBUG_REPORT_EXTENSION_NAME.equals(instance_extensions.extensionNameString()) ) {
					if ( validate ) {
						extension_names.put(EXT_debug_report);
					}
				}
			}
			instance_extensions.free();
		}

		VkApplicationInfo app = VkApplicationInfo.malloc()
			.sType(VK_STRUCTURE_TYPE_APPLICATION_INFO)
			.pNext(NULL)
			.pApplicationName(APP_SHORT_NAME)
			.applicationVersion(0)
			.pEngineName(APP_SHORT_NAME)
			.engineVersion(0)
			.apiVersion(VK_MAKE_VERSION(1, 0, 2));

		extension_names.flip();
		VkInstanceCreateInfo inst_info = VkInstanceCreateInfo.malloc()
			.sType(VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO)
			.pNext(NULL)
			.flags(0)
			.pApplicationInfo(app)
			.ppEnabledLayerNames(instance_validation_layers)
			.ppEnabledExtensionNames(extension_names);
		extension_names.clear();

		try {
			err = vkCreateInstance(inst_info, null, pp);
			if ( err == VK_ERROR_INCOMPATIBLE_DRIVER )
				throw new IllegalStateException("Cannot find a compatible Vulkan installable client driver (ICD).");
			else if ( err == VK_ERROR_EXTENSION_NOT_PRESENT )
				throw new IllegalStateException("Cannot find a specified extension library. Make sure your layers path is set appropriately.");
			else if ( err != 0 )
				throw new IllegalStateException("vkCreateInstance failed. Do you have a compatible Vulkan installable client driver (ICD) installed?");

			inst = new VkInstance(pp.get(0), inst_info);
		} finally {
			inst_info.free();
			app.free();
			memFree(instance_validation_layers);
		}

		/* Make initial call to query gpu_count, then second call for gpu info */
		err = vkEnumeratePhysicalDevices(inst, ip, null);
		check(err);

		if ( ip.get(0) > 0 ) {
			PointerBuffer physical_devices = memAllocPointer(ip.get(0));
			err = vkEnumeratePhysicalDevices(inst, ip, physical_devices);
			check(err);

			/* For tri demo we just grab the first physical device */
			gpu = new VkPhysicalDevice(physical_devices.get(0), inst);
			memFree(physical_devices);
		} else {
			throw new IllegalStateException("vkEnumeratePhysicalDevices reported zero accessible devices.");
		}

		/* Look for validation layers */
		validation_found = false;
		err = vkEnumerateDeviceLayerProperties(gpu, ip, null);
		check(err);

		if ( ip.get(0) > 0 ) {
			VkLayerProperties.Buffer device_layers = VkLayerProperties.malloc(ip.get(0));
			err = vkEnumerateDeviceLayerProperties(gpu, ip, device_layers);
			check(err);

			if ( validate )
				validation_found = demo_check_layers(device_validation_layers, device_layers);

			device_layers.free();
		}

		if ( validate && !validation_found )
			throw new IllegalStateException("vkEnumerateDeviceLayerProperties failed to find a required validation layer.");

		/* Look for device extensions */
		boolean swapchainExtFound = false;
		err = vkEnumerateDeviceExtensionProperties(gpu, (String)null, ip, null);
		check(err);

		if ( ip.get(0) > 0 ) {
			VkExtensionProperties.Buffer device_extensions = VkExtensionProperties.malloc(ip.get(0));
			err = vkEnumerateDeviceExtensionProperties(gpu, (String)null, ip, device_extensions);
			check(err);

			for ( int i = 0; i < ip.get(0); i++ ) {
				device_extensions.position(i);
				if ( VK_KHR_SWAPCHAIN_EXTENSION_NAME.equals(device_extensions.extensionNameString()) ) {
					swapchainExtFound = true;
					extension_names.put(KHR_swapchain);
				}
			}
			device_extensions.free();
		}

		if ( !swapchainExtFound )
			throw new IllegalStateException("vkEnumerateDeviceExtensionProperties failed to find the " + VK_KHR_SWAPCHAIN_EXTENSION_NAME + " extension.");

		if ( validate ) {
			VkDebugReportCallbackCreateInfoEXT dbgCreateInfo = VkDebugReportCallbackCreateInfoEXT.malloc()
				.sType(VK_STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT)
				.pNext(NULL)
				.flags(VK_DEBUG_REPORT_ERROR_BIT_EXT | VK_DEBUG_REPORT_WARNING_BIT_EXT)
				.pfnCallback(dbgFunc)
				.pUserData(NULL);

			err = vkCreateDebugReportCallbackEXT(inst, dbgCreateInfo, null, lp);
			dbgCreateInfo.free();
			switch ( err ) {
				case VK_SUCCESS:
					msg_callback = lp.get(0);
					break;
				case VK_ERROR_OUT_OF_HOST_MEMORY:
					throw new IllegalStateException("CreateDebugReportCallback: out of host memory");
				default:
					throw new IllegalStateException("CreateDebugReportCallback: unknown failure");
			}
		}

		vkGetPhysicalDeviceProperties(gpu, gpu_props);

		// Query with NULL data to get count
		vkGetPhysicalDeviceQueueFamilyProperties(gpu, ip, null);

		queue_props = VkQueueFamilyProperties.malloc(ip.get(0));
		vkGetPhysicalDeviceQueueFamilyProperties(gpu, ip, queue_props);
		if ( ip.get(0) == 0 )
			throw new IllegalStateException();

		// Graphics queue and MemMgr queue can be separate.
		// TODO: Add support for separate queues, including synchronization,
		//       and appropriate tracking for QueueSubmit
	}

	private void demo_init() {
		demo_init_connection();
		demo_init_vk();
	}

	private final GLFWKeyCallback demo_key_callback = new GLFWKeyCallback() {
		@Override
		public void invoke(long window, int key, int scancode, int action, int mods) {
			if ( key == GLFW_KEY_ESCAPE && action == GLFW_RELEASE )
				glfwSetWindowShouldClose(window, GLFW_TRUE);
		}
	};

	private final GLFWWindowRefreshCallback demo_refresh_callback = new GLFWWindowRefreshCallback() {
		@Override
		public void invoke(long window) {
			demo_draw();
		}
	};

	private final GLFWFramebufferSizeCallback demo_resize_callback = new GLFWFramebufferSizeCallback() {
		@Override
		public void invoke(long window, int width, int height) {
			HelloVulkan.this.width = width;
			HelloVulkan.this.height = height;

			if ( width != 0 && height != 0 )
				demo_resize();
		}
	};

	private void demo_create_window() {
		glfwWindowHint(GLFW_CLIENT_API, GLFW_NO_API);

		window = glfwCreateWindow(width, height, APP_LONG_NAME, NULL, NULL);
		if ( window == NULL )
			throw new IllegalStateException("Cannot create a window in which to draw!");

		glfwSetWindowRefreshCallback(window, demo_refresh_callback);
		glfwSetFramebufferSizeCallback(window, demo_resize_callback);
		glfwSetKeyCallback(window, demo_key_callback);
	}

	private void demo_init_device() {
		VkDeviceQueueCreateInfo.Buffer queue = VkDeviceQueueCreateInfo.malloc(1)
			.sType(VK_STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO)
			.pNext(NULL)
			.flags(0)
			.queueFamilyIndex(graphics_queue_node_index)
			.pQueuePriorities(memAllocFloat(1).put(0, 0.0f));

		extension_names.flip();
		VkDeviceCreateInfo device = VkDeviceCreateInfo.malloc()
			.sType(VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO)
			.pNext(NULL)
			.flags(0)
			.pQueueCreateInfos(queue)
			.ppEnabledLayerNames(validate ? device_validation_layers : null)
			.ppEnabledExtensionNames(extension_names)
			.pEnabledFeatures(null);

		try {
			int err = vkCreateDevice(gpu, device, null, pp);
			check(err);

			this.device = new VkDevice(pp.get(0), gpu, device);
		} finally {
			memFree(queue.pQueuePriorities());
			queue.free();
			device.free();
		}
	}

	private void demo_init_vk_swapchain() {
		// Create a WSI surface for the window:
		glfwCreateWindowSurface(inst, window, null, lp);
		surface = lp.get(0);

		// Iterate over each queue to learn whether it supports presenting:
		IntBuffer supportsPresent = memAllocInt(queue_props.capacity());
		int graphicsQueueNodeIndex;
		int presentQueueNodeIndex;
		for ( int i = 0; i < supportsPresent.capacity(); i++ ) {
			supportsPresent.position(i);
			vkGetPhysicalDeviceSurfaceSupportKHR(gpu, i, surface, supportsPresent);
		}

		// Search for a graphics and a present queue in the array of queue
		// families, try to find one that supports both
		graphicsQueueNodeIndex = Integer.MAX_VALUE;
		presentQueueNodeIndex = Integer.MAX_VALUE;
		for ( int i = 0; i < supportsPresent.capacity(); i++ ) {
			if ( (queue_props.get(i).queueFlags() & VK_QUEUE_GRAPHICS_BIT) != 0 ) {
				if ( graphicsQueueNodeIndex == Integer.MAX_VALUE ) {
					graphicsQueueNodeIndex = i;
				}

				if ( supportsPresent.get(i) == VK_TRUE ) {
					graphicsQueueNodeIndex = i;
					presentQueueNodeIndex = i;
					break;
				}
			}
		}
		if ( presentQueueNodeIndex == Integer.MAX_VALUE ) {
			// If didn't find a queue that supports both graphics and present, then
			// find a separate present queue.
			for ( int i = 0; i < supportsPresent.capacity(); ++i ) {
				if ( supportsPresent.get(i) == VK_TRUE ) {
					presentQueueNodeIndex = i;
					break;
				}
			}
		}
		memFree(supportsPresent);

		// Generate error if could not find both a graphics and a present queue
		if ( graphicsQueueNodeIndex == Integer.MAX_VALUE || presentQueueNodeIndex == Integer.MAX_VALUE ) {
			throw new IllegalStateException("Could not find a graphics and a present queue");
		}

		// TODO: Add support for separate queues, including presentation,
		//       synchronization, and appropriate tracking for QueueSubmit.
		// NOTE: While it is possible for an application to use a separate graphics
		//       and a present queues, this demo program assumes it is only using
		//       one:
		if ( graphicsQueueNodeIndex != presentQueueNodeIndex ) {
			throw new IllegalStateException("Could not find a common graphics and a present queue");
		}

		graphics_queue_node_index = graphicsQueueNodeIndex;

		demo_init_device();

		vkGetDeviceQueue(device, graphics_queue_node_index, 0, pp);
		queue = new VkQueue(pp.get(0), device);

		// Get the list of VkFormat's that are supported:
		int err = vkGetPhysicalDeviceSurfaceFormatsKHR(gpu, surface, ip, null);
		check(err);

		VkSurfaceFormatKHR.Buffer surfFormats = VkSurfaceFormatKHR.malloc(ip.get(0));
		err = vkGetPhysicalDeviceSurfaceFormatsKHR(gpu, surface, ip, surfFormats);
		check(err);

		// If the format list includes just one entry of VK_FORMAT_UNDEFINED,
		// the surface has no preferred format.  Otherwise, at least one
		// supported format will be returned.
		if ( ip.get(0) == 1 && surfFormats.get(0).format() == VK_FORMAT_UNDEFINED ) {
			format = VK_FORMAT_B8G8R8A8_UNORM;
		} else {
			assert ip.get(0) >= 1;
			format = surfFormats.get(0).format();
		}
		color_space = surfFormats.get(0).colorSpace();
		surfFormats.free();

		// Get Memory information and properties
		vkGetPhysicalDeviceMemoryProperties(gpu, memory_properties);
	}

	private static class SwapchainBuffers {
		long            image;
		VkCommandBuffer cmd;
		long            view;
	}

	private void demo_set_image_layout(long image, int aspectMask, int old_image_layout, int new_image_layout) {
		if ( setup_cmd == null ) {
			VkCommandBufferAllocateInfo cmd = VkCommandBufferAllocateInfo.malloc()
				.sType(VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO)
				.pNext(NULL)
				.commandPool(cmd_pool)
				.level(VK_COMMAND_BUFFER_LEVEL_PRIMARY)
				.commandBufferCount(1);

			int err = vkAllocateCommandBuffers(device, cmd, pp);
			cmd.free();
			check(err);
			setup_cmd = new VkCommandBuffer(pp.get(0), device);

			VkCommandBufferInheritanceInfo cmd_buf_hinfo = VkCommandBufferInheritanceInfo.malloc()
				.sType(VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO)
				.pNext(NULL)
				.renderPass(VK_NULL_HANDLE)
				.subpass(0)
				.framebuffer(VK_NULL_HANDLE)
				.occlusionQueryEnable(VK_FALSE)
				.queryFlags(0)
				.pipelineStatistics(0);

			VkCommandBufferBeginInfo cmd_buf_info = VkCommandBufferBeginInfo.malloc()
				.sType(VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO)
				.pNext(NULL)
				.flags(0)
				.pInheritanceInfo(cmd_buf_hinfo);
			err = vkBeginCommandBuffer(setup_cmd, cmd_buf_info);
			cmd_buf_info.free();
			cmd_buf_hinfo.free();
			check(err);
		}

		VkImageMemoryBarrier.Buffer image_memory_barrier = VkImageMemoryBarrier.malloc(1)
			.sType(VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER)
			.pNext(NULL)
			.srcAccessMask(0)
			.dstAccessMask(0)
			.oldLayout(old_image_layout)
			.newLayout(new_image_layout)
			.srcQueueFamilyIndex(0)
			.dstQueueFamilyIndex(0)
			.image(image);

		image_memory_barrier.subresourceRange()
			.aspectMask(aspectMask)
			.baseMipLevel(0)
			.levelCount(1)
			.baseArrayLayer(0)
			.layerCount(1);

		if ( new_image_layout == VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL ) {
		/* Make sure anything that was copying from this image has completed */
			image_memory_barrier.dstAccessMask(VK_ACCESS_TRANSFER_READ_BIT);
		}

		if ( new_image_layout == VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL ) {
			image_memory_barrier.dstAccessMask(VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT);
		}

		if ( new_image_layout == VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL ) {
			image_memory_barrier.dstAccessMask(VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT);
		}

		if ( new_image_layout == VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL ) {
		/* Make sure any Copy or CPU writes to image are flushed */
			image_memory_barrier.dstAccessMask(VK_ACCESS_SHADER_READ_BIT | VK_ACCESS_INPUT_ATTACHMENT_READ_BIT);
		}

		int src_stages = VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT;
		int dest_stages = VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT;

		vkCmdPipelineBarrier(setup_cmd, src_stages, dest_stages, 0, 0, null, 0, null, 1, image_memory_barrier);
		image_memory_barrier.free();
	}

	private void demo_prepare_buffers() {
		long oldSwapchain = swapchain;

		// Check the surface capabilities and formats
		VkSurfaceCapabilitiesKHR surfCapabilities = VkSurfaceCapabilitiesKHR.malloc();
		int err = vkGetPhysicalDeviceSurfaceCapabilitiesKHR(gpu, surface, surfCapabilities);
		check(err);

		err = vkGetPhysicalDeviceSurfacePresentModesKHR(gpu, surface, ip, null);
		check(err);

		IntBuffer presentModes = memAllocInt(ip.get(0));
		err = vkGetPhysicalDeviceSurfacePresentModesKHR(gpu, surface, ip, presentModes);
		check(err);

		VkExtent2D swapchainExtent = VkExtent2D.malloc();
		// width and height are either both -1, or both not -1.
		if ( surfCapabilities.currentExtent().width() == -1 ) {
			// If the surface size is undefined, the size is set to
			// the size of the images requested.
			swapchainExtent.width(width);
			swapchainExtent.height(height);
		} else {
			// If the surface size is defined, the swap chain size must match
			swapchainExtent.set(surfCapabilities.currentExtent());
			width = surfCapabilities.currentExtent().width();
			height = surfCapabilities.currentExtent().height();
		}

		int swapchainPresentMode = VK_PRESENT_MODE_FIFO_KHR;

		// Determine the number of VkImage's to use in the swap chain (we desire to
		// own only 1 image at a time, besides the images being displayed and
		// queued for display):
		int desiredNumberOfSwapchainImages = surfCapabilities.minImageCount() + 1;
		if ( (surfCapabilities.maxImageCount() > 0) &&
			(desiredNumberOfSwapchainImages > surfCapabilities.maxImageCount()) ) {
			// Application must settle for fewer images than desired:
			desiredNumberOfSwapchainImages = surfCapabilities.maxImageCount();
		}

		int preTransform;
		if ( (surfCapabilities.supportedTransforms() & VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR) != 0 ) {
			preTransform = VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR;
		} else {
			preTransform = surfCapabilities.currentTransform();
		}
		surfCapabilities.free();

		VkSwapchainCreateInfoKHR swapchain = VkSwapchainCreateInfoKHR.calloc()
			.sType(VK_STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR)
			.surface(surface)
			.minImageCount(desiredNumberOfSwapchainImages)
			.imageFormat(format)
			.imageColorSpace(color_space)
			.imageExtent(swapchainExtent)
			.imageArrayLayers(1)
			.imageUsage(VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT)
			.imageSharingMode(VK_SHARING_MODE_EXCLUSIVE)
			.preTransform(preTransform)
			.compositeAlpha(VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR)
			.presentMode(swapchainPresentMode)
			.clipped(VK_TRUE)
			.oldSwapchain(oldSwapchain);

		err = vkCreateSwapchainKHR(device, swapchain, null, lp);
		swapchain.free();
		swapchainExtent.free();
		check(err);
		this.swapchain = lp.get(0);

		// If we just re-created an existing swapchain, we should destroy the old
		// swapchain at this point.
		// Note: destroying the swapchain also cleans up all its associated
		// presentable images once the platform is done with them.
		if ( oldSwapchain != VK_NULL_HANDLE ) {
			vkDestroySwapchainKHR(device, oldSwapchain, null);
		}

		err = vkGetSwapchainImagesKHR(device, this.swapchain, ip, null);
		check(err);
		swapchainImageCount = ip.get(0);

		LongBuffer swapchainImages = memAllocLong(swapchainImageCount);
		err = vkGetSwapchainImagesKHR(device, this.swapchain, ip, swapchainImages);
		check(err);

		buffers = new SwapchainBuffers[swapchainImageCount];

		for ( int i = 0; i < swapchainImageCount; i++ ) {
			buffers[i] = new SwapchainBuffers();
			buffers[i].image = swapchainImages.get(i);

			// Render loop will expect image to have been used before and in
			// VK_IMAGE_LAYOUT_PRESENT_SRC_KHR
			// layout and will change to COLOR_ATTACHMENT_OPTIMAL, so init the image
			// to that state
			demo_set_image_layout(
				buffers[i].image, VK_IMAGE_ASPECT_COLOR_BIT,
				VK_IMAGE_LAYOUT_UNDEFINED, VK_IMAGE_LAYOUT_PRESENT_SRC_KHR);

			VkImageViewCreateInfo color_attachment_view = VkImageViewCreateInfo.malloc()
				.sType(VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO)
				.pNext(NULL)
				.flags(0)
				.image(buffers[i].image)
				.viewType(VK_IMAGE_VIEW_TYPE_2D)
				.format(format);

			color_attachment_view.components()
				.r(VK_COMPONENT_SWIZZLE_R)
				.g(VK_COMPONENT_SWIZZLE_G)
				.b(VK_COMPONENT_SWIZZLE_B)
				.a(VK_COMPONENT_SWIZZLE_A);

			color_attachment_view.subresourceRange()
				.aspectMask(VK_IMAGE_ASPECT_COLOR_BIT)
				.baseMipLevel(0)
				.levelCount(1)
				.baseArrayLayer(0)
				.layerCount(1);

			err = vkCreateImageView(device, color_attachment_view, null, lp);
			color_attachment_view.free();
			check(err);
			buffers[i].view = lp.get(0);
		}
		memFree(swapchainImages);

		current_buffer = 0;

		memFree(presentModes);
	}

	private static class Depth {
		int format;

		long image;
		long mem;
		long view;
	}

	private boolean memory_type_from_properties(int typeBits, int requirements_mask, VkMemoryAllocateInfo mem_alloc) {
		// Search memtypes to find first index with those properties
		for ( int i = 0; i < 32; i++ ) {
			if ( (typeBits & 1) == 1 ) {
				// Type is available, does it match user properties?
				if ( (memory_properties.memoryTypes().get(i).propertyFlags() & requirements_mask) == requirements_mask ) {
					mem_alloc.memoryTypeIndex(i);
					return true;
				}
			}
			typeBits >>= 1;
		}
		// No memory types matched, return failure
		return false;
	}

	private void demo_prepare_depth() {
		depth.format = VK_FORMAT_D16_UNORM;

		VkImageCreateInfo image = VkImageCreateInfo.calloc()
			.sType(VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO)
			.pNext(NULL)
			.imageType(VK_IMAGE_TYPE_2D)
			.format(depth.format)
			.mipLevels(1)
			.arrayLayers(1)
			.samples(VK_SAMPLE_COUNT_1_BIT)
			.tiling(VK_IMAGE_TILING_OPTIMAL)
			.usage(VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT);
		image.extent()
			.width(width)
			.height(height)
			.depth(1);

	    /* create image */
		int err = vkCreateImage(device, image, null, lp);
		image.free();
		check(err);
		depth.image = lp.get(0);

	    /* get memory requirements for this object */
		VkMemoryRequirements mem_reqs = VkMemoryRequirements.malloc();
		vkGetImageMemoryRequirements(device, depth.image, mem_reqs);

	    /* select memory size and type */
		VkMemoryAllocateInfo mem_alloc = VkMemoryAllocateInfo.malloc()
			.sType(VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO)
			.pNext(NULL)
			.allocationSize(mem_reqs.size())
			.memoryTypeIndex(0);
		boolean pass = memory_type_from_properties(mem_reqs.memoryTypeBits(),
		                                           0, /* No requirements */
		                                           mem_alloc);
		mem_reqs.free();
		assert (pass);

	    /* allocate memory */
		err = vkAllocateMemory(device, mem_alloc, null, lp);
		mem_alloc.free();
		check(err);
		depth.mem = lp.get(0);

	    /* bind memory */
		err = vkBindImageMemory(device, depth.image, depth.mem, 0);
		check(err);

		demo_set_image_layout(depth.image, VK_IMAGE_ASPECT_DEPTH_BIT,
		                      VK_IMAGE_LAYOUT_UNDEFINED,
		                      VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL);

	    /* create image view */
		VkImageViewCreateInfo view = VkImageViewCreateInfo.calloc()
			.sType(VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO)
			.pNext(NULL)
			.flags(0)
			.image(depth.image)
			.viewType(VK_IMAGE_VIEW_TYPE_2D)
			.format(depth.format);
		view.subresourceRange()
			.aspectMask(VK_IMAGE_ASPECT_DEPTH_BIT)
			.baseMipLevel(0)
			.levelCount(1)
			.baseArrayLayer(0)
			.layerCount(1);

		err = vkCreateImageView(device, view, null, lp);
		view.free();
		check(err);
		depth.view = lp.get(0);
	}

	private static class TextureObject {
		long sampler;

		long image;
		int  imageLayout;

		long mem;
		long view;
		int  tex_width, tex_height;
	}

	private void demo_prepare_texture_image(
		int[] tex_colors,
		TextureObject tex_obj, int tiling,
		int usage, int required_props
	) {
		int tex_format = VK_FORMAT_B8G8R8A8_UNORM;
		int tex_width = 2;
		int tex_height = 2;
		boolean pass;

		tex_obj.tex_width = tex_width;
		tex_obj.tex_height = tex_height;

		VkImageCreateInfo image_create_info = VkImageCreateInfo.calloc()
			.sType(VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO)
			.pNext(NULL)
			.imageType(VK_IMAGE_TYPE_2D)
			.format(tex_format)
			.mipLevels(1)
			.arrayLayers(1)
			.samples(VK_SAMPLE_COUNT_1_BIT)
			.tiling(tiling)
			.usage(usage)
			.flags(0);
		image_create_info.extent()
			.width(tex_width)
			.height(tex_height)
			.depth(1);

		int err = vkCreateImage(device, image_create_info, null, lp);
		image_create_info.free();
		check(err);
		tex_obj.image = lp.get(0);

		VkMemoryRequirements mem_reqs = VkMemoryRequirements.malloc();
		vkGetImageMemoryRequirements(device, tex_obj.image, mem_reqs);
		VkMemoryAllocateInfo mem_alloc = VkMemoryAllocateInfo.malloc()
			.sType(VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO)
			.pNext(NULL)
			.allocationSize(mem_reqs.size())
			.memoryTypeIndex(0);
		pass = memory_type_from_properties(mem_reqs.memoryTypeBits(), required_props, mem_alloc);
		mem_reqs.free();
		assert (pass);

	    /* allocate memory */
		err = vkAllocateMemory(device, mem_alloc, null, lp);
		check(err);
		tex_obj.mem = lp.get(0);

	    /* bind memory */
		err = vkBindImageMemory(device, tex_obj.image, tex_obj.mem, 0);
		check(err);

		if ( (required_props & VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT) != 0 ) {
			VkImageSubresource subres = VkImageSubresource.malloc()
				.aspectMask(VK_IMAGE_ASPECT_COLOR_BIT)
				.mipLevel(0)
				.arrayLayer(0);

			VkSubresourceLayout layout = VkSubresourceLayout.malloc();
			vkGetImageSubresourceLayout(device, tex_obj.image, subres, layout);
			subres.free();

			err = vkMapMemory(device, tex_obj.mem, 0, mem_alloc.allocationSize(), 0, pp);
			check(err);

			for ( int y = 0; y < tex_height; y++ ) {
				IntBuffer row = memIntBuffer(pp.get(0) + layout.rowPitch() * y, tex_width);
				for ( int x = 0; x < tex_width; x++ )
					row.put(x, tex_colors[(x & 1) ^ (y & 1)]);
			}
			layout.free();

			vkUnmapMemory(device, tex_obj.mem);
		}
		mem_alloc.free();

		tex_obj.imageLayout = VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL;
		demo_set_image_layout(tex_obj.image, VK_IMAGE_ASPECT_COLOR_BIT, VK_IMAGE_LAYOUT_UNDEFINED, tex_obj.imageLayout);
		/* setting the image layout does not reference the actual memory so no need
		 * to add a mem ref */
	}

	private void demo_destroy_texture_image(TextureObject tex_obj) {
	    /* clean up staging resources */
		vkDestroyImage(device, tex_obj.image, null);
		vkFreeMemory(device, tex_obj.mem, null);
	}

	private void demo_flush_init_cmd() {
		if ( setup_cmd == null )
			return;

		int err = vkEndCommandBuffer(setup_cmd);
		check(err);

		VkSubmitInfo submit_info = VkSubmitInfo.calloc()
			.sType(VK_STRUCTURE_TYPE_SUBMIT_INFO)
			.pCommandBuffers(pp.put(0, setup_cmd));

		err = vkQueueSubmit(queue, submit_info, VK_NULL_HANDLE);
		submit_info.free();
		check(err);

		err = vkQueueWaitIdle(queue);
		check(err);

		vkFreeCommandBuffers(device, cmd_pool, pp);
		setup_cmd = null;
	}

	private void demo_prepare_textures() {
		int tex_format = VK_FORMAT_B8G8R8A8_UNORM;
		int[][] tex_colors = { { 0xffff0000, 0xff00ff00 } };

		VkFormatProperties props = VkFormatProperties.malloc();
		vkGetPhysicalDeviceFormatProperties(gpu, tex_format, props);

		for ( int i = 0; i < DEMO_TEXTURE_COUNT; i++ ) {
			if ( (props.linearTilingFeatures() & VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT) != 0 && !use_staging_buffer ) {
			    /* Device can texture using linear textures */
				demo_prepare_texture_image(tex_colors[i], textures[i],
				                           VK_IMAGE_TILING_LINEAR,
				                           VK_IMAGE_USAGE_SAMPLED_BIT,
				                           VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT);
			} else if ( (props.optimalTilingFeatures() & VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT) != 0 ) {
			    /* Must use staging buffer to copy linear texture to optimized */
				TextureObject staging_texture = new TextureObject();

				demo_prepare_texture_image(tex_colors[i], staging_texture,
				                           VK_IMAGE_TILING_LINEAR,
				                           VK_IMAGE_USAGE_TRANSFER_SRC_BIT,
				                           VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT);

				demo_prepare_texture_image(
					tex_colors[i], textures[i],
					VK_IMAGE_TILING_OPTIMAL,
					(VK_IMAGE_USAGE_TRANSFER_DST_BIT | VK_IMAGE_USAGE_SAMPLED_BIT),
					VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT);

				demo_set_image_layout(staging_texture.image,
				                      VK_IMAGE_ASPECT_COLOR_BIT,
				                      staging_texture.imageLayout,
				                      VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL);

				demo_set_image_layout(textures[i].image,
				                      VK_IMAGE_ASPECT_COLOR_BIT,
				                      textures[i].imageLayout,
				                      VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL);

				VkImageCopy.Buffer copy_region = VkImageCopy.malloc(1);
				copy_region.srcSubresource()
					.aspectMask(VK_IMAGE_ASPECT_COLOR_BIT)
					.mipLevel(0)
					.baseArrayLayer(0)
					.layerCount(1);
				copy_region.srcOffset()
					.x(0)
					.y(0)
					.z(0);
				copy_region.dstSubresource()
					.aspectMask(VK_IMAGE_ASPECT_COLOR_BIT)
					.mipLevel(0)
					.baseArrayLayer(0)
					.layerCount(1);
				copy_region.dstOffset()
					.x(0)
					.y(0)
					.z(0);
				copy_region.extent()
					.width(staging_texture.tex_width)
					.height(staging_texture.tex_height)
					.depth(1);

				vkCmdCopyImage(
					setup_cmd, staging_texture.image,
					VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL, textures[i].image,
					VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL, 1, copy_region);
				copy_region.free();

				demo_set_image_layout(textures[i].image,
				                      VK_IMAGE_ASPECT_COLOR_BIT,
				                      VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL,
				                      textures[i].imageLayout);

				demo_flush_init_cmd();

				demo_destroy_texture_image(staging_texture);
			} else {
			    /* Can't support VK_FORMAT_B8G8R8A8_UNORM !? */
				throw new IllegalStateException("No support for B8G8R8A8_UNORM as texture image format");
			}

			VkSamplerCreateInfo sampler = VkSamplerCreateInfo.calloc()
				.sType(VK_STRUCTURE_TYPE_SAMPLER_CREATE_INFO)
				.pNext(NULL)
				.magFilter(VK_FILTER_NEAREST)
				.minFilter(VK_FILTER_NEAREST)
				.mipmapMode(VK_SAMPLER_MIPMAP_MODE_NEAREST)
				.addressModeU(VK_SAMPLER_ADDRESS_MODE_REPEAT)
				.addressModeV(VK_SAMPLER_ADDRESS_MODE_REPEAT)
				.addressModeW(VK_SAMPLER_ADDRESS_MODE_REPEAT)
				.mipLodBias(0.0f)
				.anisotropyEnable(VK_FALSE)
				.maxAnisotropy(1)
				.compareOp(VK_COMPARE_OP_NEVER)
				.minLod(0.0f)
				.maxLod(0.0f)
				.borderColor(VK_BORDER_COLOR_FLOAT_OPAQUE_WHITE)
				.unnormalizedCoordinates(VK_FALSE);

			/* create sampler */
			int err = vkCreateSampler(device, sampler, null, lp);
			sampler.free();
			check(err);
			textures[i].sampler = lp.get(0);

			VkImageViewCreateInfo view = VkImageViewCreateInfo.malloc()
				.sType(VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO)
				.pNext(NULL)
				.image(VK_NULL_HANDLE)
				.viewType(VK_IMAGE_VIEW_TYPE_2D)
				.format(tex_format)
				.flags(0);
			view.components()
				.r(VK_COMPONENT_SWIZZLE_R)
				.g(VK_COMPONENT_SWIZZLE_G)
				.b(VK_COMPONENT_SWIZZLE_B)
				.a(VK_COMPONENT_SWIZZLE_A);
			view.subresourceRange()
				.aspectMask(VK_IMAGE_ASPECT_COLOR_BIT)
				.baseMipLevel(0)
				.levelCount(1)
				.baseArrayLayer(0)
				.layerCount(1);

	        /* create image view */
			view.image(textures[i].image);
			err = vkCreateImageView(device, view, null, lp);
			view.free();
			check(err);
			textures[i].view = lp.get(0);
		}
		props.free();
	}

	private static class Vertices {
		long buf;
		long mem;

		VkPipelineVertexInputStateCreateInfo     vi          = VkPipelineVertexInputStateCreateInfo.calloc();
		VkVertexInputBindingDescription.Buffer   vi_bindings = VkVertexInputBindingDescription.calloc(1);
		VkVertexInputAttributeDescription.Buffer vi_attrs    = VkVertexInputAttributeDescription.calloc(2);
	}

	private void demo_prepare_vertices() {
		float[][] vb = {
		    /*      position             texcoord */
		    { -1.0f, -1.0f, 0.25f, 0.0f, 0.0f },
		    { 1.0f, -1.0f, 0.25f, 1.0f, 0.0f },
		    { 0.0f, 1.0f, 1.0f, 0.5f, 1.0f },
		    };

		VkBufferCreateInfo buf_info = VkBufferCreateInfo.calloc()
			.sType(VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO)
			.size(/*sizeof(vb)*/ vb.length * vb[0].length * 4)
			.usage(VK_BUFFER_USAGE_VERTEX_BUFFER_BIT)
			.sharingMode(VK_SHARING_MODE_EXCLUSIVE);

		int err = vkCreateBuffer(device, buf_info, null, lp);
		buf_info.free();
		check(err);
		vertices.buf = lp.get(0);

		VkMemoryRequirements mem_reqs = VkMemoryRequirements.malloc();
		vkGetBufferMemoryRequirements(device, vertices.buf, mem_reqs);
		check(err);

		VkMemoryAllocateInfo mem_alloc = VkMemoryAllocateInfo.calloc()
			.sType(VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO)
			.allocationSize(mem_reqs.size());
		boolean pass = memory_type_from_properties(mem_reqs.memoryTypeBits(), VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT, mem_alloc);
		mem_reqs.free();
		assert (pass);

		err = vkAllocateMemory(device, mem_alloc, null, lp);
		check(err);
		vertices.mem = lp.get(0);

		err = vkMapMemory(device, vertices.mem, 0, mem_alloc.allocationSize(), 0, pp);
		check(err);
		FloatBuffer data = pp.getFloatBuffer(0, ((int)mem_alloc.allocationSize()) >> 2);
		data
			.put(vb[0])
			.put(vb[1])
			.put(vb[2])
			.flip();

		mem_alloc.free();

		vkUnmapMemory(device, vertices.mem);

		err = vkBindBufferMemory(device, vertices.buf, vertices.mem, 0);
		check(err);

		vertices.vi
			.sType(VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO)
			.pNext(NULL)
			.pVertexBindingDescriptions(vertices.vi_bindings)
			.pVertexAttributeDescriptions(vertices.vi_attrs);

		vertices.vi_bindings.get(0)
			.binding(VERTEX_BUFFER_BIND_ID)
			.stride(vb[0].length * 4)
			.inputRate(VK_VERTEX_INPUT_RATE_VERTEX);

		vertices.vi_attrs.get(0)
			.binding(VERTEX_BUFFER_BIND_ID)
			.location(0)
			.format(VK_FORMAT_R32G32B32_SFLOAT)
			.offset(0);

		vertices.vi_attrs.get(1)
			.binding(VERTEX_BUFFER_BIND_ID)
			.location(1)
			.format(VK_FORMAT_R32G32_SFLOAT)
			.offset(4 * 3);
	}

	private void demo_prepare_descriptor_layout() {
		VkDescriptorSetLayoutBinding.Buffer layout_binding = VkDescriptorSetLayoutBinding.calloc(1)
			.binding(0)
			.descriptorType(VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER)
			.descriptorCount(DEMO_TEXTURE_COUNT)
			.stageFlags(VK_SHADER_STAGE_FRAGMENT_BIT);

		VkDescriptorSetLayoutCreateInfo descriptor_layout = VkDescriptorSetLayoutCreateInfo.malloc()
			.sType(VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO)
			.pNext(NULL)
			.flags(0)
			.pBindings(layout_binding);

		LongBuffer layouts = memAllocLong(1);
		int err = vkCreateDescriptorSetLayout(device, descriptor_layout, null, layouts);
		check(err);
		desc_layout = layouts.get(0);

		descriptor_layout.free();
		layout_binding.free();

		VkPipelineLayoutCreateInfo pPipelineLayoutCreateInfo = VkPipelineLayoutCreateInfo.calloc()
			.sType(VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO)
			.pNext(NULL)
			.pSetLayouts(layouts);

		err = vkCreatePipelineLayout(device, pPipelineLayoutCreateInfo, null, lp);
		check(err);
		pipeline_layout = lp.get(0);

		memFree(layouts);
		pPipelineLayoutCreateInfo.free();
	}

	private void demo_prepare_render_pass() {
		VkAttachmentDescription.Buffer attachments = VkAttachmentDescription.malloc(2);
		attachments.get(0)
			.flags(0)
			.format(format)
			.samples(VK_SAMPLE_COUNT_1_BIT)
			.loadOp(VK_ATTACHMENT_LOAD_OP_CLEAR)
			.storeOp(VK_ATTACHMENT_STORE_OP_STORE)
			.stencilLoadOp(VK_ATTACHMENT_LOAD_OP_DONT_CARE)
			.stencilStoreOp(VK_ATTACHMENT_STORE_OP_DONT_CARE)
			.initialLayout(VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL)
			.finalLayout(VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL);
		attachments.get(1)
			.flags(0)
			.format(depth.format)
			.samples(VK_SAMPLE_COUNT_1_BIT)
			.loadOp(VK_ATTACHMENT_LOAD_OP_CLEAR)
			.storeOp(VK_ATTACHMENT_STORE_OP_DONT_CARE)
			.stencilLoadOp(VK_ATTACHMENT_LOAD_OP_DONT_CARE)
			.stencilStoreOp(VK_ATTACHMENT_STORE_OP_DONT_CARE)
			.initialLayout(VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL)
			.finalLayout(VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL);

		VkAttachmentReference.Buffer color_reference = VkAttachmentReference.malloc(1)
			.attachment(0)
			.layout(VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL);

		VkAttachmentReference depth_reference = VkAttachmentReference.malloc()
			.attachment(1)
			.layout(VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL);

		VkSubpassDescription.Buffer subpass = VkSubpassDescription.calloc(1)
			.pipelineBindPoint(VK_PIPELINE_BIND_POINT_GRAPHICS)
			.colorAttachmentCount(1)
			.pColorAttachments(color_reference)
			.pDepthStencilAttachment(depth_reference);

		VkRenderPassCreateInfo rp_info = VkRenderPassCreateInfo.calloc()
			.sType(VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO)
			.pAttachments(attachments)
			.pSubpasses(subpass);

		int err = vkCreateRenderPass(device, rp_info, null, lp);
		check(err);
		render_pass = lp.get(0);

		rp_info.free();
		subpass.free();
		depth_reference.free();
		color_reference.free();
		attachments.free();
	}

	private long demo_prepare_shader_module(byte[] code) {
		ByteBuffer pCode = memAlloc(code.length).put(code);
		pCode.flip();

		VkShaderModuleCreateInfo moduleCreateInfo = VkShaderModuleCreateInfo.malloc()
			.sType(VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO)
			.pNext(NULL)
			.flags(0)
			.pCode(pCode);

		int err = vkCreateShaderModule(device, moduleCreateInfo, null, lp);
		check(err);

		memFree(pCode);
		moduleCreateInfo.free();

		return lp.get(0);
	}

	private void demo_prepare_pipeline() {
		VkGraphicsPipelineCreateInfo.Buffer pipeline = VkGraphicsPipelineCreateInfo.calloc(1);

		// Two stages: vs and fs
		long vert_shader_module;
		long frag_shader_module;
		ByteBuffer main = memEncodeUTF8("main", BufferAllocator.MALLOC);

		VkPipelineShaderStageCreateInfo.Buffer shaderStages = VkPipelineShaderStageCreateInfo.calloc(2);
		shaderStages.get(0)
			.sType(VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO)
			.stage(VK_SHADER_STAGE_VERTEX_BIT)
			.module(vert_shader_module = demo_prepare_shader_module(vertShaderCode))
			.pName(main);
		shaderStages.get(1)
			.sType(VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO)
			.stage(VK_SHADER_STAGE_FRAGMENT_BIT)
			.module(frag_shader_module = demo_prepare_shader_module(fragShaderCode))
			.pName(main);

		VkPipelineDepthStencilStateCreateInfo ds = VkPipelineDepthStencilStateCreateInfo.calloc()
			.sType(VK_STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO)
			.depthTestEnable(VK_TRUE)
			.depthWriteEnable(VK_TRUE)
			.depthCompareOp(VK_COMPARE_OP_LESS_OR_EQUAL)
			.depthBoundsTestEnable(VK_FALSE)
			.stencilTestEnable(VK_FALSE);
		ds.back()
			.failOp(VK_STENCIL_OP_KEEP)
			.passOp(VK_STENCIL_OP_KEEP)
			.compareOp(VK_COMPARE_OP_ALWAYS);
		ds.front(ds.back());

		pipeline
			.sType(VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO)
			.pStages(shaderStages)
			.pVertexInputState(vertices.vi)
			.pInputAssemblyState(
				VkPipelineInputAssemblyStateCreateInfo.calloc()
					.sType(VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO)
					.topology(VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST))
			.pViewportState(
				VkPipelineViewportStateCreateInfo.calloc()
					.sType(VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO)
					.viewportCount(1)
					.scissorCount(1))
			.pRasterizationState(
				VkPipelineRasterizationStateCreateInfo.calloc()
					.sType(VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO)
					.polygonMode(VK_POLYGON_MODE_FILL)
					.cullMode(VK_CULL_MODE_BACK_BIT)
					.frontFace(VK_FRONT_FACE_CLOCKWISE)
					.depthClampEnable(VK_FALSE)
					.rasterizerDiscardEnable(VK_FALSE)
					.depthBiasEnable(VK_FALSE))
			.pMultisampleState(
				VkPipelineMultisampleStateCreateInfo.calloc()
					.sType(VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO)
					.pSampleMask(null)
					.rasterizationSamples(VK_SAMPLE_COUNT_1_BIT))
			.pDepthStencilState(ds)
			.pColorBlendState(
				VkPipelineColorBlendStateCreateInfo.calloc()
					.sType(VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO)
					.pAttachments(
						VkPipelineColorBlendAttachmentState.calloc(1)
							.colorWriteMask(0xf)
							.blendEnable(VK_FALSE)
					))
			.pDynamicState(
				VkPipelineDynamicStateCreateInfo.calloc()
					.sType(VK_STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO)
					.pDynamicStates(
						memCallocInt(VK_DYNAMIC_STATE_RANGE_SIZE)
							.put(0, VK_DYNAMIC_STATE_VIEWPORT)
							.put(1, VK_DYNAMIC_STATE_SCISSOR)))
			.layout(pipeline_layout)
			.renderPass(render_pass);

		VkPipelineCacheCreateInfo pipelineCacheCI = VkPipelineCacheCreateInfo.calloc()
			.sType(VK_STRUCTURE_TYPE_PIPELINE_CACHE_CREATE_INFO);

		int err = vkCreatePipelineCache(device, pipelineCacheCI, null, lp);
		check(err);
		long pipelineCache = lp.get(0);

		pipelineCacheCI.free();

		err = vkCreateGraphicsPipelines(device, pipelineCache, pipeline, null, lp);
		check(err);
		this.pipeline = lp.get(0);

		memFree(pipeline.pDynamicState().pDynamicStates());
		pipeline.pDynamicState().free();
		pipeline.pColorBlendState().pAttachments().free();
		pipeline.pColorBlendState().free();
		pipeline.pMultisampleState().free();
		pipeline.pRasterizationState().free();
		pipeline.pViewportState().free();
		pipeline.pInputAssemblyState().free();
		ds.free();
		shaderStages.free();
		memFree(main);
		pipeline.free();

		vkDestroyPipelineCache(device, pipelineCache, null);

		vkDestroyShaderModule(device, frag_shader_module, null);
		vkDestroyShaderModule(device, vert_shader_module, null);
	}

	private void demo_prepare_descriptor_pool() {
		VkDescriptorPoolSize.Buffer type_count = VkDescriptorPoolSize.malloc(1)
			.type(VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER)
			.descriptorCount(DEMO_TEXTURE_COUNT);

		VkDescriptorPoolCreateInfo descriptor_pool = VkDescriptorPoolCreateInfo.calloc()
			.sType(VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO)
			.pNext(NULL)
			.maxSets(1)
			.pPoolSizes(type_count);

		int err = vkCreateDescriptorPool(device, descriptor_pool, null, lp);
		descriptor_pool.free();
		type_count.free();
		check(err);
		desc_pool = lp.get(0);
	}

	private void demo_prepare_descriptor_set() {
		LongBuffer layouts = memAllocLong(1).put(0, desc_layout);
		VkDescriptorSetAllocateInfo alloc_info = VkDescriptorSetAllocateInfo.malloc()
			.sType(VK_STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO)
			.pNext(NULL)
			.descriptorPool(desc_pool)
			.pSetLayouts(layouts);

		int err = vkAllocateDescriptorSets(device, alloc_info, lp);
		alloc_info.free();
		memFree(layouts);
		check(err);
		desc_set = lp.get(0);

		VkDescriptorImageInfo.Buffer tex_descs = VkDescriptorImageInfo.calloc(DEMO_TEXTURE_COUNT);

		for ( int i = 0; i < DEMO_TEXTURE_COUNT; i++ ) {
			tex_descs.get(i)
				.sampler(textures[i].sampler)
				.imageView(textures[i].view)
				.imageLayout(VK_IMAGE_LAYOUT_GENERAL);
		}

		VkWriteDescriptorSet.Buffer write = VkWriteDescriptorSet.calloc(1)
			.sType(VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET)
			.dstSet(desc_set)
			.descriptorType(VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER)
			.pImageInfo(tex_descs);

		vkUpdateDescriptorSets(device, write, null);
		write.free();
		tex_descs.free();
	}

	private void demo_prepare_framebuffers() {
		LongBuffer attachments = memAllocLong(2);
		attachments.put(1, depth.view);

		VkFramebufferCreateInfo fb_info = VkFramebufferCreateInfo.malloc()
			.sType(VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO)
			.pNext(NULL)
			.renderPass(render_pass)
			.pAttachments(attachments)
			.width(width)
			.height(height)
			.layers(1);

		framebuffers = memAllocLong(swapchainImageCount);

		for ( int i = 0; i < swapchainImageCount; i++ ) {
			attachments.put(0, buffers[i].view);
			int err = vkCreateFramebuffer(device, fb_info, null, lp);
			check(err);
			framebuffers.put(i, lp.get(0));
		}

		fb_info.free();
		memFree(attachments);
	}

	private void demo_prepare() {
		VkCommandPoolCreateInfo cmd_pool_info = VkCommandPoolCreateInfo.malloc()
			.sType(VK_STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO)
			.pNext(NULL)
			.flags(VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT)
			.queueFamilyIndex(graphics_queue_node_index);

		int err = vkCreateCommandPool(device, cmd_pool_info, null, lp);
		cmd_pool_info.free();
		check(err);

		cmd_pool = lp.get(0);

		VkCommandBufferAllocateInfo cmd = VkCommandBufferAllocateInfo.malloc()
			.sType(VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO)
			.pNext(NULL)
			.commandPool(cmd_pool)
			.level(VK_COMMAND_BUFFER_LEVEL_PRIMARY)
			.commandBufferCount(1);

		err = vkAllocateCommandBuffers(device, cmd, pp);
		cmd.free();
		check(err);

		draw_cmd = new VkCommandBuffer(pp.get(0), device);

		demo_prepare_buffers();
		demo_prepare_depth();
		demo_prepare_textures();
		demo_prepare_vertices();
		demo_prepare_descriptor_layout();
		demo_prepare_render_pass();
		demo_prepare_pipeline();

		demo_prepare_descriptor_pool();
		demo_prepare_descriptor_set();

		demo_prepare_framebuffers();
	}

	private void demo_draw_build_cmd() {
		VkCommandBufferInheritanceInfo cmd_buf_hinfo = VkCommandBufferInheritanceInfo.malloc()
			.sType(VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO)
			.pNext(NULL)
			.renderPass(VK_NULL_HANDLE)
			.subpass(0)
			.framebuffer(VK_NULL_HANDLE)
			.occlusionQueryEnable(VK_FALSE)
			.queryFlags(0)
			.pipelineStatistics(0);

		VkCommandBufferBeginInfo cmd_buf_info = VkCommandBufferBeginInfo.malloc()
			.sType(VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO)
			.pNext(NULL)
			.flags(0)
			.pInheritanceInfo(cmd_buf_hinfo);

		int err = vkBeginCommandBuffer(draw_cmd, cmd_buf_info);
		cmd_buf_info.free();
		cmd_buf_hinfo.free();
		check(err);

		VkClearValue.Buffer clear_values = VkClearValue.malloc(2);
		clear_values.get(0).color()
			.float32(0, 0.2f)
			.float32(1, 0.2f)
			.float32(2, 0.2f)
			.float32(3, 0.2f);
		clear_values.get(1).depthStencil()
			.depth(depthStencil)
			.stencil(0);

		VkRenderPassBeginInfo rp_begin = VkRenderPassBeginInfo.malloc()
			.sType(VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO)
			.pNext(NULL)
			.renderPass(render_pass)
			.framebuffer(framebuffers.get(current_buffer))
			.pClearValues(clear_values);
		rp_begin.renderArea().offset()
			.x(0)
			.y(0);
		rp_begin.renderArea().extent()
			.width(width)
			.height(height);

		vkCmdBeginRenderPass(draw_cmd, rp_begin, VK_SUBPASS_CONTENTS_INLINE);

		rp_begin.free();
		clear_values.free();

		vkCmdBindPipeline(draw_cmd, VK_PIPELINE_BIND_POINT_GRAPHICS, pipeline);

		lp.put(0, desc_set);
		vkCmdBindDescriptorSets(draw_cmd, VK_PIPELINE_BIND_POINT_GRAPHICS, pipeline_layout, 0, lp, null);

		VkViewport.Buffer viewport = VkViewport.calloc(1)
			.height(height)
			.width(width)
			.minDepth(0.0f)
			.maxDepth(1.0f);
		vkCmdSetViewport(draw_cmd, 0, viewport);
		viewport.free();

		VkRect2D.Buffer scissor = VkRect2D.calloc(1);
		scissor.extent()
			.width(width)
			.height(height);
		scissor.offset()
			.x(0)
			.y(0);
		vkCmdSetScissor(draw_cmd, 0, scissor);
		scissor.free();

		lp.put(0, 0);
		LongBuffer pBuffers = memAllocLong(1).put(0, vertices.buf);
		vkCmdBindVertexBuffers(draw_cmd, VERTEX_BUFFER_BIND_ID, pBuffers, lp);
		memFree(pBuffers);

		vkCmdDraw(draw_cmd, 3, 1, 0, 0);
		vkCmdEndRenderPass(draw_cmd);

		VkImageMemoryBarrier.Buffer prePresentBarrier = VkImageMemoryBarrier.malloc(1)
			.sType(VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER)
			.pNext(NULL)
			.srcAccessMask(VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT)
			.dstAccessMask(VK_ACCESS_MEMORY_READ_BIT)
			.oldLayout(VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL)
			.newLayout(VK_IMAGE_LAYOUT_PRESENT_SRC_KHR)
			.srcQueueFamilyIndex(VK_QUEUE_FAMILY_IGNORED)
			.dstQueueFamilyIndex(VK_QUEUE_FAMILY_IGNORED)
			.image(buffers[current_buffer].image);

		prePresentBarrier.subresourceRange()
			.aspectMask(VK_IMAGE_ASPECT_COLOR_BIT)
			.baseMipLevel(0)
			.levelCount(1)
			.baseArrayLayer(0)
			.layerCount(1);

		vkCmdPipelineBarrier(draw_cmd, VK_PIPELINE_STAGE_ALL_COMMANDS_BIT, VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT, 0, null, null, prePresentBarrier);
		prePresentBarrier.free();

		err = vkEndCommandBuffer(draw_cmd);
		check(err);
	}

	private void demo_draw() {
		VkSemaphoreCreateInfo presentCompleteSemaphoreCreateInfo = VkSemaphoreCreateInfo.malloc()
			.sType(VK_STRUCTURE_TYPE_SEMAPHORE_CREATE_INFO)
			.pNext(NULL)
			.flags(0);

		int err = vkCreateSemaphore(device, presentCompleteSemaphoreCreateInfo, null, lp);
		presentCompleteSemaphoreCreateInfo.free();
		check(err);
		long presentCompleteSemaphore = lp.get(0);

		// Get the index of the next available swapchain image:
		err = vkAcquireNextImageKHR(device, swapchain, ~0L,
		                            presentCompleteSemaphore,
		                            NULL, // TODO: Show use of fence 
		                            ip);
		if ( err == VK_ERROR_OUT_OF_DATE_KHR ) {
			// demo->swapchain is out of date (e.g. the window was resized) and
			// must be recreated:
			demo_resize();
			demo_draw();
			vkDestroySemaphore(device, presentCompleteSemaphore, null);
			return;
		} else if ( err == VK_SUBOPTIMAL_KHR ) {
			// demo->swapchain is not as optimal as it could be, but the platform's
			// presentation engine will still present the image correctly.
		} else {
			check(err);
		}
		current_buffer = ip.get(0);

		// Assume the command buffer has been run on current_buffer before so
		// we need to set the image layout back to COLOR_ATTACHMENT_OPTIMAL
		demo_set_image_layout(buffers[current_buffer].image,
		                      VK_IMAGE_ASPECT_COLOR_BIT,
		                      VK_IMAGE_LAYOUT_PRESENT_SRC_KHR,
		                      VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL);
		demo_flush_init_cmd();

		// Wait for the present complete semaphore to be signaled to ensure
		// that the image won't be rendered to until the presentation
		// engine has fully released ownership to the application, and it is
		// okay to render to the image.

		// FIXME/TODO: DEAL WITH VK_IMAGE_LAYOUT_PRESENT_SRC_KHR
		demo_draw_build_cmd();
		int pipe_stage_flags = VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT;
		VkSubmitInfo.Buffer submit_info = VkSubmitInfo.malloc(1)
			.sType(VK_STRUCTURE_TYPE_SUBMIT_INFO)
			.pNext(NULL)
			.waitSemaphoreCount(1)
			.pWaitSemaphores(lp.put(0, presentCompleteSemaphore))
			.pWaitDstStageMask(ip.put(0, pipe_stage_flags))
			.pCommandBuffers(pp.put(0, draw_cmd))
			.pSignalSemaphores(null);

		err = vkQueueSubmit(queue, 1, submit_info, VK_NULL_HANDLE);
		submit_info.free();
		check(err);

		VkPresentInfoKHR present = VkPresentInfoKHR.calloc()
			.sType(VK_STRUCTURE_TYPE_PRESENT_INFO_KHR)
			.pNext(NULL)
			.swapchainCount(1)
			.pSwapchains(lp.put(0, swapchain))
			.pImageIndices(ip.put(0, current_buffer));

		// TBD/TODO: SHOULD THE "present" PARAMETER BE "const" IN THE HEADER?
		err = vkQueuePresentKHR(queue, present);
		present.free();
		if ( err == VK_ERROR_OUT_OF_DATE_KHR ) {
			// demo->swapchain is out of date (e.g. the window was resized) and
			// must be recreated:
			demo_resize();
		} else if ( err == VK_SUBOPTIMAL_KHR ) {
			// demo->swapchain is not as optimal as it could be, but the platform's
			// presentation engine will still present the image correctly.
		} else {
			check(err);
		}

		err = vkQueueWaitIdle(queue);
		check(err);

		vkDestroySemaphore(device, presentCompleteSemaphore, null);
	}

	private void demo_resize() {
		for ( int i = 0; i < swapchainImageCount; i++ ) {
			vkDestroyFramebuffer(device, framebuffers.get(i), null);
		}
		memFree(framebuffers);
		vkDestroyDescriptorPool(device, desc_pool, null);

		if ( setup_cmd != null ) {
			vkFreeCommandBuffers(device, cmd_pool, setup_cmd);
		}
		vkFreeCommandBuffers(device, cmd_pool, draw_cmd);
		vkDestroyCommandPool(device, cmd_pool, null);

		vkDestroyPipeline(device, pipeline, null);
		vkDestroyRenderPass(device, render_pass, null);
		vkDestroyPipelineLayout(device, pipeline_layout, null);
		vkDestroyDescriptorSetLayout(device, desc_layout, null);

		vkDestroyBuffer(device, vertices.buf, null);
		vkFreeMemory(device, vertices.mem, null);

		for ( int i = 0; i < DEMO_TEXTURE_COUNT; i++ ) {
			vkDestroyImageView(device, textures[i].view, null);
			vkDestroyImage(device, textures[i].image, null);
			vkFreeMemory(device, textures[i].mem, null);
			vkDestroySampler(device, textures[i].sampler, null);
		}

		for ( int i = 0; i < swapchainImageCount; i++ ) {
			vkDestroyImageView(device, buffers[i].view, null);
		}

		vkDestroyImageView(device, depth.view, null);
		vkDestroyImage(device, depth.image, null);
		vkFreeMemory(device, depth.mem, null);

		buffers = null;

		// Second, re-perform the demo_prepare() function, which will re-create the
		// swapchain:
		demo_prepare();
	}

	private void demo_run() {
		while ( glfwWindowShouldClose(window) == GLFW_FALSE ) {
			glfwPollEvents();

			demo_draw();

			if ( depthStencil > 0.99f )
				depthIncrement = -0.001f;
			if ( depthStencil < 0.8f )
				depthIncrement = 0.001f;

			depthStencil += depthIncrement;

			// Wait for work to finish before updating MVP.
			vkDeviceWaitIdle(device);
		}
	}

	private void demo_cleanup() {
		for ( int i = 0; i < swapchainImageCount; i++ ) {
			vkDestroyFramebuffer(device, framebuffers.get(i), null);
		}
		memFree(framebuffers);
		vkDestroyDescriptorPool(device, desc_pool, null);

		if ( setup_cmd != null ) {
			vkFreeCommandBuffers(device, cmd_pool, setup_cmd);
		}
		vkFreeCommandBuffers(device, cmd_pool, draw_cmd);
		vkDestroyCommandPool(device, cmd_pool, null);

		vkDestroyPipeline(device, pipeline, null);
		vkDestroyRenderPass(device, render_pass, null);
		vkDestroyPipelineLayout(device, pipeline_layout, null);
		vkDestroyDescriptorSetLayout(device, desc_layout, null);

		vkDestroyBuffer(device, vertices.buf, null);
		vkFreeMemory(device, vertices.mem, null);
		vertices.vi.free();
		vertices.vi_bindings.free();
		vertices.vi_attrs.free();

		for ( int i = 0; i < DEMO_TEXTURE_COUNT; i++ ) {
			vkDestroyImageView(device, textures[i].view, null);
			vkDestroyImage(device, textures[i].image, null);
			vkFreeMemory(device, textures[i].mem, null);
			vkDestroySampler(device, textures[i].sampler, null);
		}

		for ( int i = 0; i < swapchainImageCount; i++ ) {
			vkDestroyImageView(device, buffers[i].view, null);
		}

		vkDestroyImageView(device, depth.view, null);
		vkDestroyImage(device, depth.image, null);
		vkFreeMemory(device, depth.mem, null);

		vkDestroySwapchainKHR(device, swapchain, null);
		buffers = null;

		vkDestroyDevice(device, null);
		vkDestroySurfaceKHR(inst, surface, null);
		if ( msg_callback != NULL ) {
			vkDestroyDebugReportCallbackEXT(inst, msg_callback, null);
			dbgFunc.release();
		}
		vkDestroyInstance(inst, null);

		gpu_props.free();
		queue_props.free();
		memory_properties.free();

		glfwDestroyWindow(window);
		glfwTerminate();

		demo_resize_callback.release();
		demo_refresh_callback.release();
		demo_key_callback.release();
		errorCB.release();

		for ( int i = 0; i < device_validation_layers.remaining(); i++ )
			nmemFree(device_validation_layers.get(i));
		memFree(device_validation_layers);

		memFree(extension_names);

		memFree(pp);
		memFree(lp);
		memFree(ip);
	}

	private void run() {
		demo_init();
		demo_create_window();
		demo_init_vk_swapchain();

		demo_prepare();
		demo_run();

		demo_cleanup();
	}

	public static void main(String[] args) {
		new HelloVulkan().run();
	}

}