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
 * Structure specifying the color blend factors and operations for an attachment.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-dualSrcBlend">{@code dualSrcBlend}</a> feature is not enabled, {@code srcColorBlendFactor} <b>must</b> not be {@link VK10#VK_BLEND_FACTOR_SRC1_COLOR BLEND_FACTOR_SRC1_COLOR}, {@link VK10#VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR BLEND_FACTOR_ONE_MINUS_SRC1_COLOR}, {@link VK10#VK_BLEND_FACTOR_SRC1_ALPHA BLEND_FACTOR_SRC1_ALPHA}, or {@link VK10#VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-dualSrcBlend">{@code dualSrcBlend}</a> feature is not enabled, {@code dstColorBlendFactor} <b>must</b> not be {@link VK10#VK_BLEND_FACTOR_SRC1_COLOR BLEND_FACTOR_SRC1_COLOR}, {@link VK10#VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR BLEND_FACTOR_ONE_MINUS_SRC1_COLOR}, {@link VK10#VK_BLEND_FACTOR_SRC1_ALPHA BLEND_FACTOR_SRC1_ALPHA}, or {@link VK10#VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-dualSrcBlend">{@code dualSrcBlend}</a> feature is not enabled, {@code srcAlphaBlendFactor} <b>must</b> not be {@link VK10#VK_BLEND_FACTOR_SRC1_COLOR BLEND_FACTOR_SRC1_COLOR}, {@link VK10#VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR BLEND_FACTOR_ONE_MINUS_SRC1_COLOR}, {@link VK10#VK_BLEND_FACTOR_SRC1_ALPHA BLEND_FACTOR_SRC1_ALPHA}, or {@link VK10#VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-dualSrcBlend">{@code dualSrcBlend}</a> feature is not enabled, {@code dstAlphaBlendFactor} <b>must</b> not be {@link VK10#VK_BLEND_FACTOR_SRC1_COLOR BLEND_FACTOR_SRC1_COLOR}, {@link VK10#VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR BLEND_FACTOR_ONE_MINUS_SRC1_COLOR}, {@link VK10#VK_BLEND_FACTOR_SRC1_ALPHA BLEND_FACTOR_SRC1_ALPHA}, or {@link VK10#VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA}</li>
 * <li>{@code colorBlendOp} and {@code alphaBlendOp} <b>must</b> not be {@link EXTBlendOperationAdvanced#VK_BLEND_OP_ZERO_EXT BLEND_OP_ZERO_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_SRC_EXT BLEND_OP_SRC_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_DST_EXT BLEND_OP_DST_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_SRC_OVER_EXT BLEND_OP_SRC_OVER_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_DST_OVER_EXT BLEND_OP_DST_OVER_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_SRC_IN_EXT BLEND_OP_SRC_IN_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_DST_IN_EXT BLEND_OP_DST_IN_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_SRC_OUT_EXT BLEND_OP_SRC_OUT_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_DST_OUT_EXT BLEND_OP_DST_OUT_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_SRC_ATOP_EXT BLEND_OP_SRC_ATOP_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_DST_ATOP_EXT BLEND_OP_DST_ATOP_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_XOR_EXT BLEND_OP_XOR_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_MULTIPLY_EXT BLEND_OP_MULTIPLY_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_SCREEN_EXT BLEND_OP_SCREEN_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_OVERLAY_EXT BLEND_OP_OVERLAY_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_DARKEN_EXT BLEND_OP_DARKEN_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_LIGHTEN_EXT BLEND_OP_LIGHTEN_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_COLORDODGE_EXT BLEND_OP_COLORDODGE_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_COLORBURN_EXT BLEND_OP_COLORBURN_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_HARDLIGHT_EXT BLEND_OP_HARDLIGHT_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_SOFTLIGHT_EXT BLEND_OP_SOFTLIGHT_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_DIFFERENCE_EXT BLEND_OP_DIFFERENCE_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_EXCLUSION_EXT BLEND_OP_EXCLUSION_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_INVERT_EXT BLEND_OP_INVERT_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_INVERT_RGB_EXT BLEND_OP_INVERT_RGB_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_LINEARDODGE_EXT BLEND_OP_LINEARDODGE_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_LINEARBURN_EXT BLEND_OP_LINEARBURN_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_VIVIDLIGHT_EXT BLEND_OP_VIVIDLIGHT_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_LINEARLIGHT_EXT BLEND_OP_LINEARLIGHT_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_PINLIGHT_EXT BLEND_OP_PINLIGHT_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_HARDMIX_EXT BLEND_OP_HARDMIX_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_HSL_HUE_EXT BLEND_OP_HSL_HUE_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_HSL_SATURATION_EXT BLEND_OP_HSL_SATURATION_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_HSL_COLOR_EXT BLEND_OP_HSL_COLOR_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_HSL_LUMINOSITY_EXT BLEND_OP_HSL_LUMINOSITY_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_PLUS_EXT BLEND_OP_PLUS_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_PLUS_CLAMPED_EXT BLEND_OP_PLUS_CLAMPED_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_PLUS_CLAMPED_ALPHA_EXT BLEND_OP_PLUS_CLAMPED_ALPHA_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_PLUS_DARKER_EXT BLEND_OP_PLUS_DARKER_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_MINUS_EXT BLEND_OP_MINUS_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_MINUS_CLAMPED_EXT BLEND_OP_MINUS_CLAMPED_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_CONTRAST_EXT BLEND_OP_CONTRAST_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_INVERT_OVG_EXT BLEND_OP_INVERT_OVG_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_RED_EXT BLEND_OP_RED_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_GREEN_EXT BLEND_OP_GREEN_EXT}, or {@link EXTBlendOperationAdvanced#VK_BLEND_OP_BLUE_EXT BLEND_OP_BLUE_EXT}</li>
 * <li>If the {@link KHRPortabilitySubset VK_KHR_portability_subset} extension is enabled, and {@link VkPhysicalDevicePortabilitySubsetFeaturesKHR}{@code ::constantAlphaColorBlendFactors} is {@link VK10#VK_FALSE FALSE}, {@code srcColorBlendFactor} <b>must</b> not be {@link VK10#VK_BLEND_FACTOR_CONSTANT_ALPHA BLEND_FACTOR_CONSTANT_ALPHA} or {@link VK10#VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA}</li>
 * <li>If the {@link KHRPortabilitySubset VK_KHR_portability_subset} extension is enabled, and {@link VkPhysicalDevicePortabilitySubsetFeaturesKHR}{@code ::constantAlphaColorBlendFactors} is {@link VK10#VK_FALSE FALSE}, {@code dstColorBlendFactor} <b>must</b> not be {@link VK10#VK_BLEND_FACTOR_CONSTANT_ALPHA BLEND_FACTOR_CONSTANT_ALPHA} or {@link VK10#VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code srcColorBlendFactor} <b>must</b> be a valid {@code VkBlendFactor} value</li>
 * <li>{@code dstColorBlendFactor} <b>must</b> be a valid {@code VkBlendFactor} value</li>
 * <li>{@code colorBlendOp} <b>must</b> be a valid {@code VkBlendOp} value</li>
 * <li>{@code srcAlphaBlendFactor} <b>must</b> be a valid {@code VkBlendFactor} value</li>
 * <li>{@code dstAlphaBlendFactor} <b>must</b> be a valid {@code VkBlendFactor} value</li>
 * <li>{@code alphaBlendOp} <b>must</b> be a valid {@code VkBlendOp} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTShaderObject#vkCmdSetColorBlendEquationEXT CmdSetColorBlendEquationEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkColorBlendEquationEXT {
 *     VkBlendFactor {@link #srcColorBlendFactor};
 *     VkBlendFactor {@link #dstColorBlendFactor};
 *     VkBlendOp {@link #colorBlendOp};
 *     VkBlendFactor {@link #srcAlphaBlendFactor};
 *     VkBlendFactor {@link #dstAlphaBlendFactor};
 *     VkBlendOp {@link #alphaBlendOp};
 * }</code></pre>
 */
public class VkColorBlendEquationEXT extends Struct<VkColorBlendEquationEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SRCCOLORBLENDFACTOR,
        DSTCOLORBLENDFACTOR,
        COLORBLENDOP,
        SRCALPHABLENDFACTOR,
        DSTALPHABLENDFACTOR,
        ALPHABLENDOP;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SRCCOLORBLENDFACTOR = layout.offsetof(0);
        DSTCOLORBLENDFACTOR = layout.offsetof(1);
        COLORBLENDOP = layout.offsetof(2);
        SRCALPHABLENDFACTOR = layout.offsetof(3);
        DSTALPHABLENDFACTOR = layout.offsetof(4);
        ALPHABLENDOP = layout.offsetof(5);
    }

    protected VkColorBlendEquationEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkColorBlendEquationEXT create(long address, @Nullable ByteBuffer container) {
        return new VkColorBlendEquationEXT(address, container);
    }

    /**
     * Creates a {@code VkColorBlendEquationEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkColorBlendEquationEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** selects which blend factor is used to determine the source factors <code>(S<sub>r</sub>,S<sub>g</sub>,S<sub>b</sub>)</code>. */
    @NativeType("VkBlendFactor")
    public int srcColorBlendFactor() { return nsrcColorBlendFactor(address()); }
    /** selects which blend factor is used to determine the destination factors <code>(D<sub>r</sub>,D<sub>g</sub>,D<sub>b</sub>)</code>. */
    @NativeType("VkBlendFactor")
    public int dstColorBlendFactor() { return ndstColorBlendFactor(address()); }
    /** selects which blend operation is used to calculate the RGB values to write to the color attachment. */
    @NativeType("VkBlendOp")
    public int colorBlendOp() { return ncolorBlendOp(address()); }
    /** selects which blend factor is used to determine the source factor <code>S<sub>a</sub></code>. */
    @NativeType("VkBlendFactor")
    public int srcAlphaBlendFactor() { return nsrcAlphaBlendFactor(address()); }
    /** selects which blend factor is used to determine the destination factor <code>D<sub>a</sub></code>. */
    @NativeType("VkBlendFactor")
    public int dstAlphaBlendFactor() { return ndstAlphaBlendFactor(address()); }
    /** selects which blend operation is use to calculate the alpha values to write to the color attachment. */
    @NativeType("VkBlendOp")
    public int alphaBlendOp() { return nalphaBlendOp(address()); }

    /** Sets the specified value to the {@link #srcColorBlendFactor} field. */
    public VkColorBlendEquationEXT srcColorBlendFactor(@NativeType("VkBlendFactor") int value) { nsrcColorBlendFactor(address(), value); return this; }
    /** Sets the specified value to the {@link #dstColorBlendFactor} field. */
    public VkColorBlendEquationEXT dstColorBlendFactor(@NativeType("VkBlendFactor") int value) { ndstColorBlendFactor(address(), value); return this; }
    /** Sets the specified value to the {@link #colorBlendOp} field. */
    public VkColorBlendEquationEXT colorBlendOp(@NativeType("VkBlendOp") int value) { ncolorBlendOp(address(), value); return this; }
    /** Sets the specified value to the {@link #srcAlphaBlendFactor} field. */
    public VkColorBlendEquationEXT srcAlphaBlendFactor(@NativeType("VkBlendFactor") int value) { nsrcAlphaBlendFactor(address(), value); return this; }
    /** Sets the specified value to the {@link #dstAlphaBlendFactor} field. */
    public VkColorBlendEquationEXT dstAlphaBlendFactor(@NativeType("VkBlendFactor") int value) { ndstAlphaBlendFactor(address(), value); return this; }
    /** Sets the specified value to the {@link #alphaBlendOp} field. */
    public VkColorBlendEquationEXT alphaBlendOp(@NativeType("VkBlendOp") int value) { nalphaBlendOp(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkColorBlendEquationEXT set(
        int srcColorBlendFactor,
        int dstColorBlendFactor,
        int colorBlendOp,
        int srcAlphaBlendFactor,
        int dstAlphaBlendFactor,
        int alphaBlendOp
    ) {
        srcColorBlendFactor(srcColorBlendFactor);
        dstColorBlendFactor(dstColorBlendFactor);
        colorBlendOp(colorBlendOp);
        srcAlphaBlendFactor(srcAlphaBlendFactor);
        dstAlphaBlendFactor(dstAlphaBlendFactor);
        alphaBlendOp(alphaBlendOp);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkColorBlendEquationEXT set(VkColorBlendEquationEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkColorBlendEquationEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkColorBlendEquationEXT malloc() {
        return new VkColorBlendEquationEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkColorBlendEquationEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkColorBlendEquationEXT calloc() {
        return new VkColorBlendEquationEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkColorBlendEquationEXT} instance allocated with {@link BufferUtils}. */
    public static VkColorBlendEquationEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkColorBlendEquationEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkColorBlendEquationEXT} instance for the specified memory address. */
    public static VkColorBlendEquationEXT create(long address) {
        return new VkColorBlendEquationEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkColorBlendEquationEXT createSafe(long address) {
        return address == NULL ? null : new VkColorBlendEquationEXT(address, null);
    }

    /**
     * Returns a new {@link VkColorBlendEquationEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkColorBlendEquationEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkColorBlendEquationEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkColorBlendEquationEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkColorBlendEquationEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkColorBlendEquationEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkColorBlendEquationEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkColorBlendEquationEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkColorBlendEquationEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkColorBlendEquationEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkColorBlendEquationEXT malloc(MemoryStack stack) {
        return new VkColorBlendEquationEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkColorBlendEquationEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkColorBlendEquationEXT calloc(MemoryStack stack) {
        return new VkColorBlendEquationEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkColorBlendEquationEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkColorBlendEquationEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkColorBlendEquationEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkColorBlendEquationEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #srcColorBlendFactor}. */
    public static int nsrcColorBlendFactor(long struct) { return UNSAFE.getInt(null, struct + VkColorBlendEquationEXT.SRCCOLORBLENDFACTOR); }
    /** Unsafe version of {@link #dstColorBlendFactor}. */
    public static int ndstColorBlendFactor(long struct) { return UNSAFE.getInt(null, struct + VkColorBlendEquationEXT.DSTCOLORBLENDFACTOR); }
    /** Unsafe version of {@link #colorBlendOp}. */
    public static int ncolorBlendOp(long struct) { return UNSAFE.getInt(null, struct + VkColorBlendEquationEXT.COLORBLENDOP); }
    /** Unsafe version of {@link #srcAlphaBlendFactor}. */
    public static int nsrcAlphaBlendFactor(long struct) { return UNSAFE.getInt(null, struct + VkColorBlendEquationEXT.SRCALPHABLENDFACTOR); }
    /** Unsafe version of {@link #dstAlphaBlendFactor}. */
    public static int ndstAlphaBlendFactor(long struct) { return UNSAFE.getInt(null, struct + VkColorBlendEquationEXT.DSTALPHABLENDFACTOR); }
    /** Unsafe version of {@link #alphaBlendOp}. */
    public static int nalphaBlendOp(long struct) { return UNSAFE.getInt(null, struct + VkColorBlendEquationEXT.ALPHABLENDOP); }

    /** Unsafe version of {@link #srcColorBlendFactor(int) srcColorBlendFactor}. */
    public static void nsrcColorBlendFactor(long struct, int value) { UNSAFE.putInt(null, struct + VkColorBlendEquationEXT.SRCCOLORBLENDFACTOR, value); }
    /** Unsafe version of {@link #dstColorBlendFactor(int) dstColorBlendFactor}. */
    public static void ndstColorBlendFactor(long struct, int value) { UNSAFE.putInt(null, struct + VkColorBlendEquationEXT.DSTCOLORBLENDFACTOR, value); }
    /** Unsafe version of {@link #colorBlendOp(int) colorBlendOp}. */
    public static void ncolorBlendOp(long struct, int value) { UNSAFE.putInt(null, struct + VkColorBlendEquationEXT.COLORBLENDOP, value); }
    /** Unsafe version of {@link #srcAlphaBlendFactor(int) srcAlphaBlendFactor}. */
    public static void nsrcAlphaBlendFactor(long struct, int value) { UNSAFE.putInt(null, struct + VkColorBlendEquationEXT.SRCALPHABLENDFACTOR, value); }
    /** Unsafe version of {@link #dstAlphaBlendFactor(int) dstAlphaBlendFactor}. */
    public static void ndstAlphaBlendFactor(long struct, int value) { UNSAFE.putInt(null, struct + VkColorBlendEquationEXT.DSTALPHABLENDFACTOR, value); }
    /** Unsafe version of {@link #alphaBlendOp(int) alphaBlendOp}. */
    public static void nalphaBlendOp(long struct, int value) { UNSAFE.putInt(null, struct + VkColorBlendEquationEXT.ALPHABLENDOP, value); }

    // -----------------------------------

    /** An array of {@link VkColorBlendEquationEXT} structs. */
    public static class Buffer extends StructBuffer<VkColorBlendEquationEXT, Buffer> implements NativeResource {

        private static final VkColorBlendEquationEXT ELEMENT_FACTORY = VkColorBlendEquationEXT.create(-1L);

        /**
         * Creates a new {@code VkColorBlendEquationEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkColorBlendEquationEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkColorBlendEquationEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkColorBlendEquationEXT#srcColorBlendFactor} field. */
        @NativeType("VkBlendFactor")
        public int srcColorBlendFactor() { return VkColorBlendEquationEXT.nsrcColorBlendFactor(address()); }
        /** @return the value of the {@link VkColorBlendEquationEXT#dstColorBlendFactor} field. */
        @NativeType("VkBlendFactor")
        public int dstColorBlendFactor() { return VkColorBlendEquationEXT.ndstColorBlendFactor(address()); }
        /** @return the value of the {@link VkColorBlendEquationEXT#colorBlendOp} field. */
        @NativeType("VkBlendOp")
        public int colorBlendOp() { return VkColorBlendEquationEXT.ncolorBlendOp(address()); }
        /** @return the value of the {@link VkColorBlendEquationEXT#srcAlphaBlendFactor} field. */
        @NativeType("VkBlendFactor")
        public int srcAlphaBlendFactor() { return VkColorBlendEquationEXT.nsrcAlphaBlendFactor(address()); }
        /** @return the value of the {@link VkColorBlendEquationEXT#dstAlphaBlendFactor} field. */
        @NativeType("VkBlendFactor")
        public int dstAlphaBlendFactor() { return VkColorBlendEquationEXT.ndstAlphaBlendFactor(address()); }
        /** @return the value of the {@link VkColorBlendEquationEXT#alphaBlendOp} field. */
        @NativeType("VkBlendOp")
        public int alphaBlendOp() { return VkColorBlendEquationEXT.nalphaBlendOp(address()); }

        /** Sets the specified value to the {@link VkColorBlendEquationEXT#srcColorBlendFactor} field. */
        public VkColorBlendEquationEXT.Buffer srcColorBlendFactor(@NativeType("VkBlendFactor") int value) { VkColorBlendEquationEXT.nsrcColorBlendFactor(address(), value); return this; }
        /** Sets the specified value to the {@link VkColorBlendEquationEXT#dstColorBlendFactor} field. */
        public VkColorBlendEquationEXT.Buffer dstColorBlendFactor(@NativeType("VkBlendFactor") int value) { VkColorBlendEquationEXT.ndstColorBlendFactor(address(), value); return this; }
        /** Sets the specified value to the {@link VkColorBlendEquationEXT#colorBlendOp} field. */
        public VkColorBlendEquationEXT.Buffer colorBlendOp(@NativeType("VkBlendOp") int value) { VkColorBlendEquationEXT.ncolorBlendOp(address(), value); return this; }
        /** Sets the specified value to the {@link VkColorBlendEquationEXT#srcAlphaBlendFactor} field. */
        public VkColorBlendEquationEXT.Buffer srcAlphaBlendFactor(@NativeType("VkBlendFactor") int value) { VkColorBlendEquationEXT.nsrcAlphaBlendFactor(address(), value); return this; }
        /** Sets the specified value to the {@link VkColorBlendEquationEXT#dstAlphaBlendFactor} field. */
        public VkColorBlendEquationEXT.Buffer dstAlphaBlendFactor(@NativeType("VkBlendFactor") int value) { VkColorBlendEquationEXT.ndstAlphaBlendFactor(address(), value); return this; }
        /** Sets the specified value to the {@link VkColorBlendEquationEXT#alphaBlendOp} field. */
        public VkColorBlendEquationEXT.Buffer alphaBlendOp(@NativeType("VkBlendOp") int value) { VkColorBlendEquationEXT.nalphaBlendOp(address(), value); return this; }

    }

}