/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package tootle

import org.lwjgl.generator.*

fun config() {
    packageInfo(
        Module.TOOTLE,
        """
        Contains bindings to ${url("https://github.com/GPUOpen-Tools/amd-tootle", "AMD Tootle")}.

        AMD Tootle (Triangle Order Optimization Tool) is a 3D triangle mesh optimization library that improves on existing mesh preprocessing techniques. By
        using AMD Tootle, developers can optimize their models for pixel overdraw as well as vertex cache performance. This can provide significant performance
        improvements in pixel limited situations, with no penalty in vertex-limited scenarios, and no runtime cost.
        """
    )
}

val TootleResult = "TootleResult".enumType
val TootleFaceWinding = "TootleFaceWinding".enumType
val TootleVCacheOptimizer = "TootleVCacheOptimizer".enumType
val TootleOverdrawOptimizer = "TootleOverdrawOptimizer".enumType