/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package nanovg

import org.lwjgl.generator.*

val int32_tb = PrimitiveType("int32_t", PrimitiveMapping.BOOLEAN4)
val ViewId = typedef(uint16_t, "bgfx_view_id_t")
val AllocatorI = "bgfx_allocator_interface_t".opaque.p