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
 * <p>If the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
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
 * <li>{@code sType} <b>must</b> be {@link KHRShaderIntegerDotProduct#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES_KHR}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR {
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
public class VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR extends Struct implements NativeResource {

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
     * Creates a {@code VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR(ByteBuffer container) {
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
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 8-bit unsigned dot product operations using the {@code OpUDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct8BitUnsignedAccelerated() { return nintegerDotProduct8BitUnsignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 8-bit signed dot product operations using the {@code OpSDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct8BitSignedAccelerated() { return nintegerDotProduct8BitSignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 8-bit mixed signedness dot product operations using the {@code OpSUDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct8BitMixedSignednessAccelerated() { return nintegerDotProduct8BitMixedSignednessAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 8-bit unsigned dot product operations from operands packed into 32-bit integers using the {@code OpUDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct4x8BitPackedUnsignedAccelerated() { return nintegerDotProduct4x8BitPackedUnsignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 8-bit signed dot product operations from operands packed into 32-bit integers using the {@code OpSDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct4x8BitPackedSignedAccelerated() { return nintegerDotProduct4x8BitPackedSignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 8-bit mixed signedness dot product operations from operands packed into 32-bit integers using the {@code OpSUDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct4x8BitPackedMixedSignednessAccelerated() { return nintegerDotProduct4x8BitPackedMixedSignednessAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 16-bit unsigned dot product operations using the {@code OpUDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct16BitUnsignedAccelerated() { return nintegerDotProduct16BitUnsignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 16-bit signed dot product operations using the {@code OpSDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct16BitSignedAccelerated() { return nintegerDotProduct16BitSignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 16-bit mixed signedness dot product operations using the {@code OpSUDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct16BitMixedSignednessAccelerated() { return nintegerDotProduct16BitMixedSignednessAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 32-bit unsigned dot product operations using the {@code OpUDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct32BitUnsignedAccelerated() { return nintegerDotProduct32BitUnsignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 32-bit signed dot product operations using the {@code OpSDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct32BitSignedAccelerated() { return nintegerDotProduct32BitSignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 32-bit mixed signedness dot product operations using the {@code OpSUDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct32BitMixedSignednessAccelerated() { return nintegerDotProduct32BitMixedSignednessAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 64-bit unsigned dot product operations using the {@code OpUDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct64BitUnsignedAccelerated() { return nintegerDotProduct64BitUnsignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 64-bit signed dot product operations using the {@code OpSDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct64BitSignedAccelerated() { return nintegerDotProduct64BitSignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 64-bit mixed signedness dot product operations using the {@code OpSUDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct64BitMixedSignednessAccelerated() { return nintegerDotProduct64BitMixedSignednessAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 8-bit unsigned accumulating saturating dot product operations using the {@code OpUDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating8BitUnsignedAccelerated() { return nintegerDotProductAccumulatingSaturating8BitUnsignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 8-bit signed accumulating saturating dot product operations using the {@code OpSDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating8BitSignedAccelerated() { return nintegerDotProductAccumulatingSaturating8BitSignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 8-bit mixed signedness accumulating saturating dot product operations using the {@code OpSUDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated() { return nintegerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 8-bit unsigned accumulating saturating dot product operations from operands packed into 32-bit integers using the {@code OpUDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated() { return nintegerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 8-bit signed accumulating saturating dot product operations from operands packed into 32-bit integers using the {@code OpSDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated() { return nintegerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 8-bit mixed signedness accumulating saturating dot product operations from operands packed into 32-bit integers using the {@code OpSUDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated() { return nintegerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 16-bit unsigned accumulating saturating dot product operations using the {@code OpUDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating16BitUnsignedAccelerated() { return nintegerDotProductAccumulatingSaturating16BitUnsignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 16-bit signed accumulating saturating dot product operations using the {@code OpSDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating16BitSignedAccelerated() { return nintegerDotProductAccumulatingSaturating16BitSignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 16-bit mixed signedness accumulating saturating dot product operations using the {@code OpSUDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated() { return nintegerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 32-bit unsigned accumulating saturating dot product operations using the {@code OpUDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating32BitUnsignedAccelerated() { return nintegerDotProductAccumulatingSaturating32BitUnsignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 32-bit signed accumulating saturating dot product operations using the {@code OpSDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating32BitSignedAccelerated() { return nintegerDotProductAccumulatingSaturating32BitSignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 32-bit mixed signedness accumulating saturating dot product operations using the {@code OpSUDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated() { return nintegerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 64-bit unsigned accumulating saturating dot product operations using the {@code OpUDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating64BitUnsignedAccelerated() { return nintegerDotProductAccumulatingSaturating64BitUnsignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 64-bit signed accumulating saturating dot product operations using the {@code OpSDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating64BitSignedAccelerated() { return nintegerDotProductAccumulatingSaturating64BitSignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 64-bit mixed signedness accumulating saturating dot product operations using the {@code OpSUDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated() { return nintegerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRShaderIntegerDotProduct#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES_KHR} value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR sType$Default() { return sType(KHRShaderIntegerDotProduct.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #integerDotProduct8BitUnsignedAccelerated} field. */
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct8BitUnsignedAccelerated(@NativeType("VkBool32") boolean value) { nintegerDotProduct8BitUnsignedAccelerated(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #integerDotProduct8BitSignedAccelerated} field. */
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct8BitSignedAccelerated(@NativeType("VkBool32") boolean value) { nintegerDotProduct8BitSignedAccelerated(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #integerDotProduct8BitMixedSignednessAccelerated} field. */
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct8BitMixedSignednessAccelerated(@NativeType("VkBool32") boolean value) { nintegerDotProduct8BitMixedSignednessAccelerated(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #integerDotProduct4x8BitPackedUnsignedAccelerated} field. */
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct4x8BitPackedUnsignedAccelerated(@NativeType("VkBool32") boolean value) { nintegerDotProduct4x8BitPackedUnsignedAccelerated(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #integerDotProduct4x8BitPackedSignedAccelerated} field. */
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct4x8BitPackedSignedAccelerated(@NativeType("VkBool32") boolean value) { nintegerDotProduct4x8BitPackedSignedAccelerated(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #integerDotProduct4x8BitPackedMixedSignednessAccelerated} field. */
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct4x8BitPackedMixedSignednessAccelerated(@NativeType("VkBool32") boolean value) { nintegerDotProduct4x8BitPackedMixedSignednessAccelerated(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #integerDotProduct16BitUnsignedAccelerated} field. */
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct16BitUnsignedAccelerated(@NativeType("VkBool32") boolean value) { nintegerDotProduct16BitUnsignedAccelerated(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #integerDotProduct16BitSignedAccelerated} field. */
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct16BitSignedAccelerated(@NativeType("VkBool32") boolean value) { nintegerDotProduct16BitSignedAccelerated(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #integerDotProduct16BitMixedSignednessAccelerated} field. */
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct16BitMixedSignednessAccelerated(@NativeType("VkBool32") boolean value) { nintegerDotProduct16BitMixedSignednessAccelerated(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #integerDotProduct32BitUnsignedAccelerated} field. */
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct32BitUnsignedAccelerated(@NativeType("VkBool32") boolean value) { nintegerDotProduct32BitUnsignedAccelerated(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #integerDotProduct32BitSignedAccelerated} field. */
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct32BitSignedAccelerated(@NativeType("VkBool32") boolean value) { nintegerDotProduct32BitSignedAccelerated(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #integerDotProduct32BitMixedSignednessAccelerated} field. */
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct32BitMixedSignednessAccelerated(@NativeType("VkBool32") boolean value) { nintegerDotProduct32BitMixedSignednessAccelerated(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #integerDotProduct64BitUnsignedAccelerated} field. */
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct64BitUnsignedAccelerated(@NativeType("VkBool32") boolean value) { nintegerDotProduct64BitUnsignedAccelerated(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #integerDotProduct64BitSignedAccelerated} field. */
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct64BitSignedAccelerated(@NativeType("VkBool32") boolean value) { nintegerDotProduct64BitSignedAccelerated(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #integerDotProduct64BitMixedSignednessAccelerated} field. */
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct64BitMixedSignednessAccelerated(@NativeType("VkBool32") boolean value) { nintegerDotProduct64BitMixedSignednessAccelerated(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #integerDotProductAccumulatingSaturating8BitUnsignedAccelerated} field. */
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(@NativeType("VkBool32") boolean value) { nintegerDotProductAccumulatingSaturating8BitUnsignedAccelerated(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #integerDotProductAccumulatingSaturating8BitSignedAccelerated} field. */
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating8BitSignedAccelerated(@NativeType("VkBool32") boolean value) { nintegerDotProductAccumulatingSaturating8BitSignedAccelerated(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated} field. */
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(@NativeType("VkBool32") boolean value) { nintegerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated} field. */
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(@NativeType("VkBool32") boolean value) { nintegerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated} field. */
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(@NativeType("VkBool32") boolean value) { nintegerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated} field. */
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(@NativeType("VkBool32") boolean value) { nintegerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #integerDotProductAccumulatingSaturating16BitUnsignedAccelerated} field. */
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(@NativeType("VkBool32") boolean value) { nintegerDotProductAccumulatingSaturating16BitUnsignedAccelerated(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #integerDotProductAccumulatingSaturating16BitSignedAccelerated} field. */
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating16BitSignedAccelerated(@NativeType("VkBool32") boolean value) { nintegerDotProductAccumulatingSaturating16BitSignedAccelerated(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated} field. */
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(@NativeType("VkBool32") boolean value) { nintegerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #integerDotProductAccumulatingSaturating32BitUnsignedAccelerated} field. */
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(@NativeType("VkBool32") boolean value) { nintegerDotProductAccumulatingSaturating32BitUnsignedAccelerated(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #integerDotProductAccumulatingSaturating32BitSignedAccelerated} field. */
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating32BitSignedAccelerated(@NativeType("VkBool32") boolean value) { nintegerDotProductAccumulatingSaturating32BitSignedAccelerated(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated} field. */
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(@NativeType("VkBool32") boolean value) { nintegerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #integerDotProductAccumulatingSaturating64BitUnsignedAccelerated} field. */
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(@NativeType("VkBool32") boolean value) { nintegerDotProductAccumulatingSaturating64BitUnsignedAccelerated(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #integerDotProductAccumulatingSaturating64BitSignedAccelerated} field. */
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating64BitSignedAccelerated(@NativeType("VkBool32") boolean value) { nintegerDotProductAccumulatingSaturating64BitSignedAccelerated(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated} field. */
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(@NativeType("VkBool32") boolean value) { nintegerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR set(
        int sType,
        long pNext,
        boolean integerDotProduct8BitUnsignedAccelerated,
        boolean integerDotProduct8BitSignedAccelerated,
        boolean integerDotProduct8BitMixedSignednessAccelerated,
        boolean integerDotProduct4x8BitPackedUnsignedAccelerated,
        boolean integerDotProduct4x8BitPackedSignedAccelerated,
        boolean integerDotProduct4x8BitPackedMixedSignednessAccelerated,
        boolean integerDotProduct16BitUnsignedAccelerated,
        boolean integerDotProduct16BitSignedAccelerated,
        boolean integerDotProduct16BitMixedSignednessAccelerated,
        boolean integerDotProduct32BitUnsignedAccelerated,
        boolean integerDotProduct32BitSignedAccelerated,
        boolean integerDotProduct32BitMixedSignednessAccelerated,
        boolean integerDotProduct64BitUnsignedAccelerated,
        boolean integerDotProduct64BitSignedAccelerated,
        boolean integerDotProduct64BitMixedSignednessAccelerated,
        boolean integerDotProductAccumulatingSaturating8BitUnsignedAccelerated,
        boolean integerDotProductAccumulatingSaturating8BitSignedAccelerated,
        boolean integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated,
        boolean integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated,
        boolean integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated,
        boolean integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated,
        boolean integerDotProductAccumulatingSaturating16BitUnsignedAccelerated,
        boolean integerDotProductAccumulatingSaturating16BitSignedAccelerated,
        boolean integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated,
        boolean integerDotProductAccumulatingSaturating32BitUnsignedAccelerated,
        boolean integerDotProductAccumulatingSaturating32BitSignedAccelerated,
        boolean integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated,
        boolean integerDotProductAccumulatingSaturating64BitUnsignedAccelerated,
        boolean integerDotProductAccumulatingSaturating64BitSignedAccelerated,
        boolean integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated
    ) {
        sType(sType);
        pNext(pNext);
        integerDotProduct8BitUnsignedAccelerated(integerDotProduct8BitUnsignedAccelerated);
        integerDotProduct8BitSignedAccelerated(integerDotProduct8BitSignedAccelerated);
        integerDotProduct8BitMixedSignednessAccelerated(integerDotProduct8BitMixedSignednessAccelerated);
        integerDotProduct4x8BitPackedUnsignedAccelerated(integerDotProduct4x8BitPackedUnsignedAccelerated);
        integerDotProduct4x8BitPackedSignedAccelerated(integerDotProduct4x8BitPackedSignedAccelerated);
        integerDotProduct4x8BitPackedMixedSignednessAccelerated(integerDotProduct4x8BitPackedMixedSignednessAccelerated);
        integerDotProduct16BitUnsignedAccelerated(integerDotProduct16BitUnsignedAccelerated);
        integerDotProduct16BitSignedAccelerated(integerDotProduct16BitSignedAccelerated);
        integerDotProduct16BitMixedSignednessAccelerated(integerDotProduct16BitMixedSignednessAccelerated);
        integerDotProduct32BitUnsignedAccelerated(integerDotProduct32BitUnsignedAccelerated);
        integerDotProduct32BitSignedAccelerated(integerDotProduct32BitSignedAccelerated);
        integerDotProduct32BitMixedSignednessAccelerated(integerDotProduct32BitMixedSignednessAccelerated);
        integerDotProduct64BitUnsignedAccelerated(integerDotProduct64BitUnsignedAccelerated);
        integerDotProduct64BitSignedAccelerated(integerDotProduct64BitSignedAccelerated);
        integerDotProduct64BitMixedSignednessAccelerated(integerDotProduct64BitMixedSignednessAccelerated);
        integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(integerDotProductAccumulatingSaturating8BitUnsignedAccelerated);
        integerDotProductAccumulatingSaturating8BitSignedAccelerated(integerDotProductAccumulatingSaturating8BitSignedAccelerated);
        integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated);
        integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated);
        integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated);
        integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated);
        integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(integerDotProductAccumulatingSaturating16BitUnsignedAccelerated);
        integerDotProductAccumulatingSaturating16BitSignedAccelerated(integerDotProductAccumulatingSaturating16BitSignedAccelerated);
        integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated);
        integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(integerDotProductAccumulatingSaturating32BitUnsignedAccelerated);
        integerDotProductAccumulatingSaturating32BitSignedAccelerated(integerDotProductAccumulatingSaturating32BitSignedAccelerated);
        integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated);
        integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(integerDotProductAccumulatingSaturating64BitUnsignedAccelerated);
        integerDotProductAccumulatingSaturating64BitSignedAccelerated(integerDotProductAccumulatingSaturating64BitSignedAccelerated);
        integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR set(VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR malloc() {
        return wrap(VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR calloc() {
        return wrap(VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR create(long address) {
        return wrap(VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #integerDotProduct8BitUnsignedAccelerated}. */
    public static int nintegerDotProduct8BitUnsignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCT8BITUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct8BitSignedAccelerated}. */
    public static int nintegerDotProduct8BitSignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCT8BITSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct8BitMixedSignednessAccelerated}. */
    public static int nintegerDotProduct8BitMixedSignednessAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCT8BITMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct4x8BitPackedUnsignedAccelerated}. */
    public static int nintegerDotProduct4x8BitPackedUnsignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCT4X8BITPACKEDUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct4x8BitPackedSignedAccelerated}. */
    public static int nintegerDotProduct4x8BitPackedSignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCT4X8BITPACKEDSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct4x8BitPackedMixedSignednessAccelerated}. */
    public static int nintegerDotProduct4x8BitPackedMixedSignednessAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCT4X8BITPACKEDMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct16BitUnsignedAccelerated}. */
    public static int nintegerDotProduct16BitUnsignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCT16BITUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct16BitSignedAccelerated}. */
    public static int nintegerDotProduct16BitSignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCT16BITSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct16BitMixedSignednessAccelerated}. */
    public static int nintegerDotProduct16BitMixedSignednessAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCT16BITMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct32BitUnsignedAccelerated}. */
    public static int nintegerDotProduct32BitUnsignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCT32BITUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct32BitSignedAccelerated}. */
    public static int nintegerDotProduct32BitSignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCT32BITSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct32BitMixedSignednessAccelerated}. */
    public static int nintegerDotProduct32BitMixedSignednessAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCT32BITMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct64BitUnsignedAccelerated}. */
    public static int nintegerDotProduct64BitUnsignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCT64BITUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct64BitSignedAccelerated}. */
    public static int nintegerDotProduct64BitSignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCT64BITSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct64BitMixedSignednessAccelerated}. */
    public static int nintegerDotProduct64BitMixedSignednessAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCT64BITMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating8BitUnsignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating8BitUnsignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating8BitSignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating8BitSignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating16BitUnsignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating16BitUnsignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating16BitSignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating16BitSignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating32BitUnsignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating32BitUnsignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating32BitSignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating32BitSignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating64BitUnsignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating64BitUnsignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating64BitSignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating64BitSignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITMIXEDSIGNEDNESSACCELERATED); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.PNEXT, value); }
    /** Unsafe version of {@link #integerDotProduct8BitUnsignedAccelerated(boolean) integerDotProduct8BitUnsignedAccelerated}. */
    public static void nintegerDotProduct8BitUnsignedAccelerated(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCT8BITUNSIGNEDACCELERATED, value); }
    /** Unsafe version of {@link #integerDotProduct8BitSignedAccelerated(boolean) integerDotProduct8BitSignedAccelerated}. */
    public static void nintegerDotProduct8BitSignedAccelerated(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCT8BITSIGNEDACCELERATED, value); }
    /** Unsafe version of {@link #integerDotProduct8BitMixedSignednessAccelerated(boolean) integerDotProduct8BitMixedSignednessAccelerated}. */
    public static void nintegerDotProduct8BitMixedSignednessAccelerated(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCT8BITMIXEDSIGNEDNESSACCELERATED, value); }
    /** Unsafe version of {@link #integerDotProduct4x8BitPackedUnsignedAccelerated(boolean) integerDotProduct4x8BitPackedUnsignedAccelerated}. */
    public static void nintegerDotProduct4x8BitPackedUnsignedAccelerated(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCT4X8BITPACKEDUNSIGNEDACCELERATED, value); }
    /** Unsafe version of {@link #integerDotProduct4x8BitPackedSignedAccelerated(boolean) integerDotProduct4x8BitPackedSignedAccelerated}. */
    public static void nintegerDotProduct4x8BitPackedSignedAccelerated(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCT4X8BITPACKEDSIGNEDACCELERATED, value); }
    /** Unsafe version of {@link #integerDotProduct4x8BitPackedMixedSignednessAccelerated(boolean) integerDotProduct4x8BitPackedMixedSignednessAccelerated}. */
    public static void nintegerDotProduct4x8BitPackedMixedSignednessAccelerated(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCT4X8BITPACKEDMIXEDSIGNEDNESSACCELERATED, value); }
    /** Unsafe version of {@link #integerDotProduct16BitUnsignedAccelerated(boolean) integerDotProduct16BitUnsignedAccelerated}. */
    public static void nintegerDotProduct16BitUnsignedAccelerated(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCT16BITUNSIGNEDACCELERATED, value); }
    /** Unsafe version of {@link #integerDotProduct16BitSignedAccelerated(boolean) integerDotProduct16BitSignedAccelerated}. */
    public static void nintegerDotProduct16BitSignedAccelerated(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCT16BITSIGNEDACCELERATED, value); }
    /** Unsafe version of {@link #integerDotProduct16BitMixedSignednessAccelerated(boolean) integerDotProduct16BitMixedSignednessAccelerated}. */
    public static void nintegerDotProduct16BitMixedSignednessAccelerated(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCT16BITMIXEDSIGNEDNESSACCELERATED, value); }
    /** Unsafe version of {@link #integerDotProduct32BitUnsignedAccelerated(boolean) integerDotProduct32BitUnsignedAccelerated}. */
    public static void nintegerDotProduct32BitUnsignedAccelerated(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCT32BITUNSIGNEDACCELERATED, value); }
    /** Unsafe version of {@link #integerDotProduct32BitSignedAccelerated(boolean) integerDotProduct32BitSignedAccelerated}. */
    public static void nintegerDotProduct32BitSignedAccelerated(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCT32BITSIGNEDACCELERATED, value); }
    /** Unsafe version of {@link #integerDotProduct32BitMixedSignednessAccelerated(boolean) integerDotProduct32BitMixedSignednessAccelerated}. */
    public static void nintegerDotProduct32BitMixedSignednessAccelerated(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCT32BITMIXEDSIGNEDNESSACCELERATED, value); }
    /** Unsafe version of {@link #integerDotProduct64BitUnsignedAccelerated(boolean) integerDotProduct64BitUnsignedAccelerated}. */
    public static void nintegerDotProduct64BitUnsignedAccelerated(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCT64BITUNSIGNEDACCELERATED, value); }
    /** Unsafe version of {@link #integerDotProduct64BitSignedAccelerated(boolean) integerDotProduct64BitSignedAccelerated}. */
    public static void nintegerDotProduct64BitSignedAccelerated(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCT64BITSIGNEDACCELERATED, value); }
    /** Unsafe version of {@link #integerDotProduct64BitMixedSignednessAccelerated(boolean) integerDotProduct64BitMixedSignednessAccelerated}. */
    public static void nintegerDotProduct64BitMixedSignednessAccelerated(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCT64BITMIXEDSIGNEDNESSACCELERATED, value); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(boolean) integerDotProductAccumulatingSaturating8BitUnsignedAccelerated}. */
    public static void nintegerDotProductAccumulatingSaturating8BitUnsignedAccelerated(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITUNSIGNEDACCELERATED, value); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating8BitSignedAccelerated(boolean) integerDotProductAccumulatingSaturating8BitSignedAccelerated}. */
    public static void nintegerDotProductAccumulatingSaturating8BitSignedAccelerated(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITSIGNEDACCELERATED, value); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(boolean) integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated}. */
    public static void nintegerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITMIXEDSIGNEDNESSACCELERATED, value); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(boolean) integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated}. */
    public static void nintegerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDUNSIGNEDACCELERATED, value); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(boolean) integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated}. */
    public static void nintegerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDSIGNEDACCELERATED, value); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(boolean) integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated}. */
    public static void nintegerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDMIXEDSIGNEDNESSACCELERATED, value); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(boolean) integerDotProductAccumulatingSaturating16BitUnsignedAccelerated}. */
    public static void nintegerDotProductAccumulatingSaturating16BitUnsignedAccelerated(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITUNSIGNEDACCELERATED, value); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating16BitSignedAccelerated(boolean) integerDotProductAccumulatingSaturating16BitSignedAccelerated}. */
    public static void nintegerDotProductAccumulatingSaturating16BitSignedAccelerated(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITSIGNEDACCELERATED, value); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(boolean) integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated}. */
    public static void nintegerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITMIXEDSIGNEDNESSACCELERATED, value); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(boolean) integerDotProductAccumulatingSaturating32BitUnsignedAccelerated}. */
    public static void nintegerDotProductAccumulatingSaturating32BitUnsignedAccelerated(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITUNSIGNEDACCELERATED, value); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating32BitSignedAccelerated(boolean) integerDotProductAccumulatingSaturating32BitSignedAccelerated}. */
    public static void nintegerDotProductAccumulatingSaturating32BitSignedAccelerated(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITSIGNEDACCELERATED, value); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(boolean) integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated}. */
    public static void nintegerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITMIXEDSIGNEDNESSACCELERATED, value); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(boolean) integerDotProductAccumulatingSaturating64BitUnsignedAccelerated}. */
    public static void nintegerDotProductAccumulatingSaturating64BitUnsignedAccelerated(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITUNSIGNEDACCELERATED, value); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating64BitSignedAccelerated(boolean) integerDotProductAccumulatingSaturating64BitSignedAccelerated}. */
    public static void nintegerDotProductAccumulatingSaturating64BitSignedAccelerated(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITSIGNEDACCELERATED, value); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(boolean) integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated}. */
    public static void nintegerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITMIXEDSIGNEDNESSACCELERATED, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR ELEMENT_FACTORY = VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProduct8BitUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct8BitUnsignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProduct8BitUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProduct8BitSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct8BitSignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProduct8BitSignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProduct8BitMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct8BitMixedSignednessAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProduct8BitMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProduct4x8BitPackedUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct4x8BitPackedUnsignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProduct4x8BitPackedUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProduct4x8BitPackedSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct4x8BitPackedSignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProduct4x8BitPackedSignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProduct4x8BitPackedMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct4x8BitPackedMixedSignednessAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProduct4x8BitPackedMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProduct16BitUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct16BitUnsignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProduct16BitUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProduct16BitSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct16BitSignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProduct16BitSignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProduct16BitMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct16BitMixedSignednessAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProduct16BitMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProduct32BitUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct32BitUnsignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProduct32BitUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProduct32BitSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct32BitSignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProduct32BitSignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProduct32BitMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct32BitMixedSignednessAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProduct32BitMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProduct64BitUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct64BitUnsignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProduct64BitUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProduct64BitSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct64BitSignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProduct64BitSignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProduct64BitMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct64BitMixedSignednessAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProduct64BitMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProductAccumulatingSaturating8BitUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating8BitUnsignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProductAccumulatingSaturating8BitUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProductAccumulatingSaturating8BitSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating8BitSignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProductAccumulatingSaturating8BitSignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProductAccumulatingSaturating16BitUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating16BitUnsignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProductAccumulatingSaturating16BitUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProductAccumulatingSaturating16BitSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating16BitSignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProductAccumulatingSaturating16BitSignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProductAccumulatingSaturating32BitUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating32BitUnsignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProductAccumulatingSaturating32BitUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProductAccumulatingSaturating32BitSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating32BitSignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProductAccumulatingSaturating32BitSignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProductAccumulatingSaturating64BitUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating64BitUnsignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProductAccumulatingSaturating64BitUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProductAccumulatingSaturating64BitSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating64BitSignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProductAccumulatingSaturating64BitSignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#sType} field. */
        public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRShaderIntegerDotProduct#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES_KHR} value to the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#sType} field. */
        public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer sType$Default() { return sType(KHRShaderIntegerDotProduct.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES_KHR); }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#pNext} field. */
        public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProduct8BitUnsignedAccelerated} field. */
        public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer integerDotProduct8BitUnsignedAccelerated(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProduct8BitUnsignedAccelerated(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProduct8BitSignedAccelerated} field. */
        public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer integerDotProduct8BitSignedAccelerated(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProduct8BitSignedAccelerated(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProduct8BitMixedSignednessAccelerated} field. */
        public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer integerDotProduct8BitMixedSignednessAccelerated(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProduct8BitMixedSignednessAccelerated(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProduct4x8BitPackedUnsignedAccelerated} field. */
        public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer integerDotProduct4x8BitPackedUnsignedAccelerated(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProduct4x8BitPackedUnsignedAccelerated(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProduct4x8BitPackedSignedAccelerated} field. */
        public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer integerDotProduct4x8BitPackedSignedAccelerated(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProduct4x8BitPackedSignedAccelerated(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProduct4x8BitPackedMixedSignednessAccelerated} field. */
        public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer integerDotProduct4x8BitPackedMixedSignednessAccelerated(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProduct4x8BitPackedMixedSignednessAccelerated(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProduct16BitUnsignedAccelerated} field. */
        public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer integerDotProduct16BitUnsignedAccelerated(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProduct16BitUnsignedAccelerated(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProduct16BitSignedAccelerated} field. */
        public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer integerDotProduct16BitSignedAccelerated(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProduct16BitSignedAccelerated(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProduct16BitMixedSignednessAccelerated} field. */
        public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer integerDotProduct16BitMixedSignednessAccelerated(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProduct16BitMixedSignednessAccelerated(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProduct32BitUnsignedAccelerated} field. */
        public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer integerDotProduct32BitUnsignedAccelerated(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProduct32BitUnsignedAccelerated(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProduct32BitSignedAccelerated} field. */
        public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer integerDotProduct32BitSignedAccelerated(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProduct32BitSignedAccelerated(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProduct32BitMixedSignednessAccelerated} field. */
        public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer integerDotProduct32BitMixedSignednessAccelerated(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProduct32BitMixedSignednessAccelerated(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProduct64BitUnsignedAccelerated} field. */
        public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer integerDotProduct64BitUnsignedAccelerated(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProduct64BitUnsignedAccelerated(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProduct64BitSignedAccelerated} field. */
        public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer integerDotProduct64BitSignedAccelerated(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProduct64BitSignedAccelerated(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProduct64BitMixedSignednessAccelerated} field. */
        public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer integerDotProduct64BitMixedSignednessAccelerated(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProduct64BitMixedSignednessAccelerated(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProductAccumulatingSaturating8BitUnsignedAccelerated} field. */
        public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProductAccumulatingSaturating8BitUnsignedAccelerated(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProductAccumulatingSaturating8BitSignedAccelerated} field. */
        public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer integerDotProductAccumulatingSaturating8BitSignedAccelerated(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProductAccumulatingSaturating8BitSignedAccelerated(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated} field. */
        public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated} field. */
        public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated} field. */
        public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated} field. */
        public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProductAccumulatingSaturating16BitUnsignedAccelerated} field. */
        public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProductAccumulatingSaturating16BitUnsignedAccelerated(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProductAccumulatingSaturating16BitSignedAccelerated} field. */
        public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer integerDotProductAccumulatingSaturating16BitSignedAccelerated(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProductAccumulatingSaturating16BitSignedAccelerated(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated} field. */
        public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProductAccumulatingSaturating32BitUnsignedAccelerated} field. */
        public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProductAccumulatingSaturating32BitUnsignedAccelerated(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProductAccumulatingSaturating32BitSignedAccelerated} field. */
        public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer integerDotProductAccumulatingSaturating32BitSignedAccelerated(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProductAccumulatingSaturating32BitSignedAccelerated(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated} field. */
        public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProductAccumulatingSaturating64BitUnsignedAccelerated} field. */
        public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProductAccumulatingSaturating64BitUnsignedAccelerated(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProductAccumulatingSaturating64BitSignedAccelerated} field. */
        public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer integerDotProductAccumulatingSaturating64BitSignedAccelerated(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProductAccumulatingSaturating64BitSignedAccelerated(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated} field. */
        public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nintegerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(address(), value ? 1 : 0); return this; }

    }

}