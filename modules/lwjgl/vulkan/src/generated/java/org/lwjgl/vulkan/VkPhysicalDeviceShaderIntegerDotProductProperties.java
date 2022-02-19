/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure containing information about integer dot product support for a physical device.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceShaderIntegerDotProductProperties} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <p>These are properties of the integer dot product acceleration information of a physical device.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>A dot product operation is deemed accelerated if its implementation provides a performance advantage over application-provided code composed from elementary instructions and/or other dot product instructions, either because the implementation uses optimized machine code sequences whose generation from application-provided code cannot be guaranteed or because it uses hardware features that cannot otherwise be targeted from application-provided code.</p>
 * </div>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceShaderIntegerDotProductProperties {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #integerDotProduct8BitUnsignedAccelerated};
 *     VkBool32 {@link #integerDotProduct8BitSignedAccelerated};
 *     VkBool32 {@link #integerDotProduct8BitMixedSignednessAccelerated};
 *     VkBool32 {@link #integerDotProduct4x8BitPackedUnsignedAccelerated};
 *     VkBool32 {@link #integerDotProduct4x8BitPackedSignedAccelerated};
 *     VkBool32 {@link #integerDotProduct4x8BitPackedMixedSignednessAccelerated};
 *     VkBool32 {@link #integerDotProduct16BitUnsignedAccelerated};
 *     VkBool32 {@link #integerDotProduct16BitSignedAccelerated};
 *     VkBool32 {@link #integerDotProduct16BitMixedSignednessAccelerated};
 *     VkBool32 {@link #integerDotProduct32BitUnsignedAccelerated};
 *     VkBool32 {@link #integerDotProduct32BitSignedAccelerated};
 *     VkBool32 {@link #integerDotProduct32BitMixedSignednessAccelerated};
 *     VkBool32 {@link #integerDotProduct64BitUnsignedAccelerated};
 *     VkBool32 {@link #integerDotProduct64BitSignedAccelerated};
 *     VkBool32 {@link #integerDotProduct64BitMixedSignednessAccelerated};
 *     VkBool32 {@link #integerDotProductAccumulatingSaturating8BitUnsignedAccelerated};
 *     VkBool32 {@link #integerDotProductAccumulatingSaturating8BitSignedAccelerated};
 *     VkBool32 {@link #integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated};
 *     VkBool32 {@link #integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated};
 *     VkBool32 {@link #integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated};
 *     VkBool32 {@link #integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated};
 *     VkBool32 {@link #integerDotProductAccumulatingSaturating16BitUnsignedAccelerated};
 *     VkBool32 {@link #integerDotProductAccumulatingSaturating16BitSignedAccelerated};
 *     VkBool32 {@link #integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated};
 *     VkBool32 {@link #integerDotProductAccumulatingSaturating32BitUnsignedAccelerated};
 *     VkBool32 {@link #integerDotProductAccumulatingSaturating32BitSignedAccelerated};
 *     VkBool32 {@link #integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated};
 *     VkBool32 {@link #integerDotProductAccumulatingSaturating64BitUnsignedAccelerated};
 *     VkBool32 {@link #integerDotProductAccumulatingSaturating64BitSignedAccelerated};
 *     VkBool32 {@link #integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated};
 * }</code></pre>
 */
public class VkPhysicalDeviceShaderIntegerDotProductProperties extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        INTEGERDOTPRODUCT8BITUNSIGNEDACCELERATED,
        INTEGERDOTPRODUCT8BITSIGNEDACCELERATED,
        INTEGERDOTPRODUCT8BITMIXEDSIGNEDNESSACCELERATED,
        INTEGERDOTPRODUCT4X8BITPACKEDUNSIGNEDACCELERATED,
        INTEGERDOTPRODUCT4X8BITPACKEDSIGNEDACCELERATED,
        INTEGERDOTPRODUCT4X8BITPACKEDMIXEDSIGNEDNESSACCELERATED,
        INTEGERDOTPRODUCT16BITUNSIGNEDACCELERATED,
        INTEGERDOTPRODUCT16BITSIGNEDACCELERATED,
        INTEGERDOTPRODUCT16BITMIXEDSIGNEDNESSACCELERATED,
        INTEGERDOTPRODUCT32BITUNSIGNEDACCELERATED,
        INTEGERDOTPRODUCT32BITSIGNEDACCELERATED,
        INTEGERDOTPRODUCT32BITMIXEDSIGNEDNESSACCELERATED,
        INTEGERDOTPRODUCT64BITUNSIGNEDACCELERATED,
        INTEGERDOTPRODUCT64BITSIGNEDACCELERATED,
        INTEGERDOTPRODUCT64BITMIXEDSIGNEDNESSACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITUNSIGNEDACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITSIGNEDACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITMIXEDSIGNEDNESSACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDUNSIGNEDACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDSIGNEDACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDMIXEDSIGNEDNESSACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITUNSIGNEDACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITSIGNEDACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITMIXEDSIGNEDNESSACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITUNSIGNEDACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITSIGNEDACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITMIXEDSIGNEDNESSACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITUNSIGNEDACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITSIGNEDACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITMIXEDSIGNEDNESSACCELERATED;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        INTEGERDOTPRODUCT8BITUNSIGNEDACCELERATED = layout.offsetof(2);
        INTEGERDOTPRODUCT8BITSIGNEDACCELERATED = layout.offsetof(3);
        INTEGERDOTPRODUCT8BITMIXEDSIGNEDNESSACCELERATED = layout.offsetof(4);
        INTEGERDOTPRODUCT4X8BITPACKEDUNSIGNEDACCELERATED = layout.offsetof(5);
        INTEGERDOTPRODUCT4X8BITPACKEDSIGNEDACCELERATED = layout.offsetof(6);
        INTEGERDOTPRODUCT4X8BITPACKEDMIXEDSIGNEDNESSACCELERATED = layout.offsetof(7);
        INTEGERDOTPRODUCT16BITUNSIGNEDACCELERATED = layout.offsetof(8);
        INTEGERDOTPRODUCT16BITSIGNEDACCELERATED = layout.offsetof(9);
        INTEGERDOTPRODUCT16BITMIXEDSIGNEDNESSACCELERATED = layout.offsetof(10);
        INTEGERDOTPRODUCT32BITUNSIGNEDACCELERATED = layout.offsetof(11);
        INTEGERDOTPRODUCT32BITSIGNEDACCELERATED = layout.offsetof(12);
        INTEGERDOTPRODUCT32BITMIXEDSIGNEDNESSACCELERATED = layout.offsetof(13);
        INTEGERDOTPRODUCT64BITUNSIGNEDACCELERATED = layout.offsetof(14);
        INTEGERDOTPRODUCT64BITSIGNEDACCELERATED = layout.offsetof(15);
        INTEGERDOTPRODUCT64BITMIXEDSIGNEDNESSACCELERATED = layout.offsetof(16);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITUNSIGNEDACCELERATED = layout.offsetof(17);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITSIGNEDACCELERATED = layout.offsetof(18);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITMIXEDSIGNEDNESSACCELERATED = layout.offsetof(19);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDUNSIGNEDACCELERATED = layout.offsetof(20);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDSIGNEDACCELERATED = layout.offsetof(21);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDMIXEDSIGNEDNESSACCELERATED = layout.offsetof(22);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITUNSIGNEDACCELERATED = layout.offsetof(23);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITSIGNEDACCELERATED = layout.offsetof(24);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITMIXEDSIGNEDNESSACCELERATED = layout.offsetof(25);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITUNSIGNEDACCELERATED = layout.offsetof(26);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITSIGNEDACCELERATED = layout.offsetof(27);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITMIXEDSIGNEDNESSACCELERATED = layout.offsetof(28);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITUNSIGNEDACCELERATED = layout.offsetof(29);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITSIGNEDACCELERATED = layout.offsetof(30);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITMIXEDSIGNEDNESSACCELERATED = layout.offsetof(31);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderIntegerDotProductProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderIntegerDotProductProperties(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 8-bit unsigned dot product operations using the {@code OpUDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct8BitUnsignedAccelerated() { return nintegerDotProduct8BitUnsignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 8-bit signed dot product operations using the {@code OpSDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct8BitSignedAccelerated() { return nintegerDotProduct8BitSignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 8-bit mixed signedness dot product operations using the {@code OpSUDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct8BitMixedSignednessAccelerated() { return nintegerDotProduct8BitMixedSignednessAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 8-bit unsigned dot product operations from operands packed into 32-bit integers using the {@code OpUDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct4x8BitPackedUnsignedAccelerated() { return nintegerDotProduct4x8BitPackedUnsignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 8-bit signed dot product operations from operands packed into 32-bit integers using the {@code OpSDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct4x8BitPackedSignedAccelerated() { return nintegerDotProduct4x8BitPackedSignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 8-bit mixed signedness dot product operations from operands packed into 32-bit integers using the {@code OpSUDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct4x8BitPackedMixedSignednessAccelerated() { return nintegerDotProduct4x8BitPackedMixedSignednessAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 16-bit unsigned dot product operations using the {@code OpUDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct16BitUnsignedAccelerated() { return nintegerDotProduct16BitUnsignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 16-bit signed dot product operations using the {@code OpSDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct16BitSignedAccelerated() { return nintegerDotProduct16BitSignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 16-bit mixed signedness dot product operations using the {@code OpSUDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct16BitMixedSignednessAccelerated() { return nintegerDotProduct16BitMixedSignednessAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 32-bit unsigned dot product operations using the {@code OpUDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct32BitUnsignedAccelerated() { return nintegerDotProduct32BitUnsignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 32-bit signed dot product operations using the {@code OpSDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct32BitSignedAccelerated() { return nintegerDotProduct32BitSignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 32-bit mixed signedness dot product operations using the {@code OpSUDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct32BitMixedSignednessAccelerated() { return nintegerDotProduct32BitMixedSignednessAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 64-bit unsigned dot product operations using the {@code OpUDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct64BitUnsignedAccelerated() { return nintegerDotProduct64BitUnsignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 64-bit signed dot product operations using the {@code OpSDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct64BitSignedAccelerated() { return nintegerDotProduct64BitSignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 64-bit mixed signedness dot product operations using the {@code OpSUDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct64BitMixedSignednessAccelerated() { return nintegerDotProduct64BitMixedSignednessAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 8-bit unsigned accumulating saturating dot product operations using the {@code OpUDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating8BitUnsignedAccelerated() { return nintegerDotProductAccumulatingSaturating8BitUnsignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 8-bit signed accumulating saturating dot product operations using the {@code OpSDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating8BitSignedAccelerated() { return nintegerDotProductAccumulatingSaturating8BitSignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 8-bit mixed signedness accumulating saturating dot product operations using the {@code OpSUDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated() { return nintegerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 8-bit unsigned accumulating saturating dot product operations from operands packed into 32-bit integers using the {@code OpUDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated() { return nintegerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 8-bit signed accumulating saturating dot product operations from operands packed into 32-bit integers using the {@code OpSDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated() { return nintegerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 8-bit mixed signedness accumulating saturating dot product operations from operands packed into 32-bit integers using the {@code OpSUDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated() { return nintegerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 16-bit unsigned accumulating saturating dot product operations using the {@code OpUDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating16BitUnsignedAccelerated() { return nintegerDotProductAccumulatingSaturating16BitUnsignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 16-bit signed accumulating saturating dot product operations using the {@code OpSDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating16BitSignedAccelerated() { return nintegerDotProductAccumulatingSaturating16BitSignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 16-bit mixed signedness accumulating saturating dot product operations using the {@code OpSUDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated() { return nintegerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 32-bit unsigned accumulating saturating dot product operations using the {@code OpUDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating32BitUnsignedAccelerated() { return nintegerDotProductAccumulatingSaturating32BitUnsignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 32-bit signed accumulating saturating dot product operations using the {@code OpSDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating32BitSignedAccelerated() { return nintegerDotProductAccumulatingSaturating32BitSignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 32-bit mixed signedness accumulating saturating dot product operations using the {@code OpSUDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated() { return nintegerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 64-bit unsigned accumulating saturating dot product operations using the {@code OpUDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating64BitUnsignedAccelerated() { return nintegerDotProductAccumulatingSaturating64BitUnsignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 64-bit signed accumulating saturating dot product operations using the {@code OpSDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating64BitSignedAccelerated() { return nintegerDotProductAccumulatingSaturating64BitSignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 64-bit mixed signedness accumulating saturating dot product operations using the {@code OpSUDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated() { return nintegerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderIntegerDotProductProperties sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES} value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderIntegerDotProductProperties sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceShaderIntegerDotProductProperties pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderIntegerDotProductProperties set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderIntegerDotProductProperties set(VkPhysicalDeviceShaderIntegerDotProductProperties src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderIntegerDotProductProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderIntegerDotProductProperties malloc() {
        return wrap(VkPhysicalDeviceShaderIntegerDotProductProperties.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceShaderIntegerDotProductProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderIntegerDotProductProperties calloc() {
        return wrap(VkPhysicalDeviceShaderIntegerDotProductProperties.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceShaderIntegerDotProductProperties} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderIntegerDotProductProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceShaderIntegerDotProductProperties.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderIntegerDotProductProperties} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderIntegerDotProductProperties create(long address) {
        return wrap(VkPhysicalDeviceShaderIntegerDotProductProperties.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderIntegerDotProductProperties createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceShaderIntegerDotProductProperties.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderIntegerDotProductProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderIntegerDotProductProperties malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShaderIntegerDotProductProperties.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderIntegerDotProductProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderIntegerDotProductProperties calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShaderIntegerDotProductProperties.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductProperties.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderIntegerDotProductProperties.PNEXT); }
    /** Unsafe version of {@link #integerDotProduct8BitUnsignedAccelerated}. */
    public static int nintegerDotProduct8BitUnsignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT8BITUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct8BitSignedAccelerated}. */
    public static int nintegerDotProduct8BitSignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT8BITSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct8BitMixedSignednessAccelerated}. */
    public static int nintegerDotProduct8BitMixedSignednessAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT8BITMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct4x8BitPackedUnsignedAccelerated}. */
    public static int nintegerDotProduct4x8BitPackedUnsignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT4X8BITPACKEDUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct4x8BitPackedSignedAccelerated}. */
    public static int nintegerDotProduct4x8BitPackedSignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT4X8BITPACKEDSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct4x8BitPackedMixedSignednessAccelerated}. */
    public static int nintegerDotProduct4x8BitPackedMixedSignednessAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT4X8BITPACKEDMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct16BitUnsignedAccelerated}. */
    public static int nintegerDotProduct16BitUnsignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT16BITUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct16BitSignedAccelerated}. */
    public static int nintegerDotProduct16BitSignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT16BITSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct16BitMixedSignednessAccelerated}. */
    public static int nintegerDotProduct16BitMixedSignednessAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT16BITMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct32BitUnsignedAccelerated}. */
    public static int nintegerDotProduct32BitUnsignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT32BITUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct32BitSignedAccelerated}. */
    public static int nintegerDotProduct32BitSignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT32BITSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct32BitMixedSignednessAccelerated}. */
    public static int nintegerDotProduct32BitMixedSignednessAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT32BITMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct64BitUnsignedAccelerated}. */
    public static int nintegerDotProduct64BitUnsignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT64BITUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct64BitSignedAccelerated}. */
    public static int nintegerDotProduct64BitSignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT64BITSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct64BitMixedSignednessAccelerated}. */
    public static int nintegerDotProduct64BitMixedSignednessAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT64BITMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating8BitUnsignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating8BitUnsignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating8BitSignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating8BitSignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating16BitUnsignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating16BitUnsignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating16BitSignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating16BitSignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating32BitUnsignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating32BitUnsignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating32BitSignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating32BitSignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating64BitUnsignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating64BitUnsignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating64BitSignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating64BitSignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITMIXEDSIGNEDNESSACCELERATED); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductProperties.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderIntegerDotProductProperties.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderIntegerDotProductProperties} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderIntegerDotProductProperties, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderIntegerDotProductProperties ELEMENT_FACTORY = VkPhysicalDeviceShaderIntegerDotProductProperties.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderIntegerDotProductProperties#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected VkPhysicalDeviceShaderIntegerDotProductProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductProperties#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductProperties#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderIntegerDotProductProperties.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductProperties#integerDotProduct8BitUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct8BitUnsignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct8BitUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductProperties#integerDotProduct8BitSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct8BitSignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct8BitSignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductProperties#integerDotProduct8BitMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct8BitMixedSignednessAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct8BitMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductProperties#integerDotProduct4x8BitPackedUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct4x8BitPackedUnsignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct4x8BitPackedUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductProperties#integerDotProduct4x8BitPackedSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct4x8BitPackedSignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct4x8BitPackedSignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductProperties#integerDotProduct4x8BitPackedMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct4x8BitPackedMixedSignednessAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct4x8BitPackedMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductProperties#integerDotProduct16BitUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct16BitUnsignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct16BitUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductProperties#integerDotProduct16BitSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct16BitSignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct16BitSignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductProperties#integerDotProduct16BitMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct16BitMixedSignednessAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct16BitMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductProperties#integerDotProduct32BitUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct32BitUnsignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct32BitUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductProperties#integerDotProduct32BitSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct32BitSignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct32BitSignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductProperties#integerDotProduct32BitMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct32BitMixedSignednessAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct32BitMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductProperties#integerDotProduct64BitUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct64BitUnsignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct64BitUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductProperties#integerDotProduct64BitSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct64BitSignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct64BitSignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductProperties#integerDotProduct64BitMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct64BitMixedSignednessAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct64BitMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductProperties#integerDotProductAccumulatingSaturating8BitUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating8BitUnsignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating8BitUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductProperties#integerDotProductAccumulatingSaturating8BitSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating8BitSignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating8BitSignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductProperties#integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductProperties#integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductProperties#integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductProperties#integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductProperties#integerDotProductAccumulatingSaturating16BitUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating16BitUnsignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating16BitUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductProperties#integerDotProductAccumulatingSaturating16BitSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating16BitSignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating16BitSignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductProperties#integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductProperties#integerDotProductAccumulatingSaturating32BitUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating32BitUnsignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating32BitUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductProperties#integerDotProductAccumulatingSaturating32BitSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating32BitSignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating32BitSignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductProperties#integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductProperties#integerDotProductAccumulatingSaturating64BitUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating64BitUnsignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating64BitUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductProperties#integerDotProductAccumulatingSaturating64BitSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating64BitSignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating64BitSignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductProperties#integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceShaderIntegerDotProductProperties#sType} field. */
        public VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES} value to the {@link VkPhysicalDeviceShaderIntegerDotProductProperties#sType} field. */
        public VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES); }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderIntegerDotProductProperties#pNext} field. */
        public VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderIntegerDotProductProperties.npNext(address(), value); return this; }

    }

}