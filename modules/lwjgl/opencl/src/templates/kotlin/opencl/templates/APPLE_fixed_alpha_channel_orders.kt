/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val APPLE_fixed_alpha_channel_orders = "APPLEFixedAlphaChannelOrders".nativeClassCL("APPLE_fixed_alpha_channel_orders", APPLE) {
    IntConstant(
        "1RGB_APPLE"..0x10000006,
        "BGR1_APPLE"..0x10000007
    )
}