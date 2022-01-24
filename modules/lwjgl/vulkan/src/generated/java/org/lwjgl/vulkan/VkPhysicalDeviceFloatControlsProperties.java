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
 * Structure describing properties supported by VK_KHR_shader_float_controls.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceFloatControlsProperties} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FLOAT_CONTROLS_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_FLOAT_CONTROLS_PROPERTIES}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceFloatControlsProperties {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkShaderFloatControlsIndependence {@link #denormBehaviorIndependence};
 *     VkShaderFloatControlsIndependence {@link #roundingModeIndependence};
 *     VkBool32 {@link #shaderSignedZeroInfNanPreserveFloat16};
 *     VkBool32 {@link #shaderSignedZeroInfNanPreserveFloat32};
 *     VkBool32 {@link #shaderSignedZeroInfNanPreserveFloat64};
 *     VkBool32 {@link #shaderDenormPreserveFloat16};
 *     VkBool32 {@link #shaderDenormPreserveFloat32};
 *     VkBool32 {@link #shaderDenormPreserveFloat64};
 *     VkBool32 {@link #shaderDenormFlushToZeroFloat16};
 *     VkBool32 {@link #shaderDenormFlushToZeroFloat32};
 *     VkBool32 {@link #shaderDenormFlushToZeroFloat64};
 *     VkBool32 {@link #shaderRoundingModeRTEFloat16};
 *     VkBool32 {@link #shaderRoundingModeRTEFloat32};
 *     VkBool32 {@link #shaderRoundingModeRTEFloat64};
 *     VkBool32 {@link #shaderRoundingModeRTZFloat16};
 *     VkBool32 {@link #shaderRoundingModeRTZFloat32};
 *     VkBool32 {@link #shaderRoundingModeRTZFloat64};
 * }</code></pre>
 */
public class VkPhysicalDeviceFloatControlsProperties extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DENORMBEHAVIORINDEPENDENCE,
        ROUNDINGMODEINDEPENDENCE,
        SHADERSIGNEDZEROINFNANPRESERVEFLOAT16,
        SHADERSIGNEDZEROINFNANPRESERVEFLOAT32,
        SHADERSIGNEDZEROINFNANPRESERVEFLOAT64,
        SHADERDENORMPRESERVEFLOAT16,
        SHADERDENORMPRESERVEFLOAT32,
        SHADERDENORMPRESERVEFLOAT64,
        SHADERDENORMFLUSHTOZEROFLOAT16,
        SHADERDENORMFLUSHTOZEROFLOAT32,
        SHADERDENORMFLUSHTOZEROFLOAT64,
        SHADERROUNDINGMODERTEFLOAT16,
        SHADERROUNDINGMODERTEFLOAT32,
        SHADERROUNDINGMODERTEFLOAT64,
        SHADERROUNDINGMODERTZFLOAT16,
        SHADERROUNDINGMODERTZFLOAT32,
        SHADERROUNDINGMODERTZFLOAT64;

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
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DENORMBEHAVIORINDEPENDENCE = layout.offsetof(2);
        ROUNDINGMODEINDEPENDENCE = layout.offsetof(3);
        SHADERSIGNEDZEROINFNANPRESERVEFLOAT16 = layout.offsetof(4);
        SHADERSIGNEDZEROINFNANPRESERVEFLOAT32 = layout.offsetof(5);
        SHADERSIGNEDZEROINFNANPRESERVEFLOAT64 = layout.offsetof(6);
        SHADERDENORMPRESERVEFLOAT16 = layout.offsetof(7);
        SHADERDENORMPRESERVEFLOAT32 = layout.offsetof(8);
        SHADERDENORMPRESERVEFLOAT64 = layout.offsetof(9);
        SHADERDENORMFLUSHTOZEROFLOAT16 = layout.offsetof(10);
        SHADERDENORMFLUSHTOZEROFLOAT32 = layout.offsetof(11);
        SHADERDENORMFLUSHTOZEROFLOAT64 = layout.offsetof(12);
        SHADERROUNDINGMODERTEFLOAT16 = layout.offsetof(13);
        SHADERROUNDINGMODERTEFLOAT32 = layout.offsetof(14);
        SHADERROUNDINGMODERTEFLOAT64 = layout.offsetof(15);
        SHADERROUNDINGMODERTZFLOAT16 = layout.offsetof(16);
        SHADERROUNDINGMODERTZFLOAT32 = layout.offsetof(17);
        SHADERROUNDINGMODERTZFLOAT64 = layout.offsetof(18);
    }

    /**
     * Creates a {@code VkPhysicalDeviceFloatControlsProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceFloatControlsProperties(ByteBuffer container) {
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
    /** a {@code VkShaderFloatControlsIndependence} value indicating whether, and how, denorm behavior can be set independently for different bit widths. */
    @NativeType("VkShaderFloatControlsIndependence")
    public int denormBehaviorIndependence() { return ndenormBehaviorIndependence(address()); }
    /** a {@code VkShaderFloatControlsIndependence} value indicating whether, and how, rounding modes can be set independently for different bit widths. */
    @NativeType("VkShaderFloatControlsIndependence")
    public int roundingModeIndependence() { return nroundingModeIndependence(address()); }
    /** a boolean value indicating whether sign of a zero, <code>Nan</code>s and &plusmn;&infin; <b>can</b> be preserved in 16-bit floating-point computations. It also indicates whether the {@code SignedZeroInfNanPreserve} execution mode <b>can</b> be used for 16-bit floating-point types. */
    @NativeType("VkBool32")
    public boolean shaderSignedZeroInfNanPreserveFloat16() { return nshaderSignedZeroInfNanPreserveFloat16(address()) != 0; }
    /** a boolean value indicating whether sign of a zero, <code>Nan</code>s and &plusmn;&infin; <b>can</b> be preserved in 32-bit floating-point computations. It also indicates whether the {@code SignedZeroInfNanPreserve} execution mode <b>can</b> be used for 32-bit floating-point types. */
    @NativeType("VkBool32")
    public boolean shaderSignedZeroInfNanPreserveFloat32() { return nshaderSignedZeroInfNanPreserveFloat32(address()) != 0; }
    /** a boolean value indicating whether sign of a zero, <code>Nan</code>s and &plusmn;&infin; <b>can</b> be preserved in 64-bit floating-point computations. It also indicates whether the {@code SignedZeroInfNanPreserve} execution mode <b>can</b> be used for 64-bit floating-point types. */
    @NativeType("VkBool32")
    public boolean shaderSignedZeroInfNanPreserveFloat64() { return nshaderSignedZeroInfNanPreserveFloat64(address()) != 0; }
    /** a boolean value indicating whether denormals <b>can</b> be preserved in 16-bit floating-point computations. It also indicates whether the {@code DenormPreserve} execution mode <b>can</b> be used for 16-bit floating-point types. */
    @NativeType("VkBool32")
    public boolean shaderDenormPreserveFloat16() { return nshaderDenormPreserveFloat16(address()) != 0; }
    /** a boolean value indicating whether denormals <b>can</b> be preserved in 32-bit floating-point computations. It also indicates whether the {@code DenormPreserve} execution mode <b>can</b> be used for 32-bit floating-point types. */
    @NativeType("VkBool32")
    public boolean shaderDenormPreserveFloat32() { return nshaderDenormPreserveFloat32(address()) != 0; }
    /** a boolean value indicating whether denormals <b>can</b> be preserved in 64-bit floating-point computations. It also indicates whether the {@code DenormPreserve} execution mode <b>can</b> be used for 64-bit floating-point types. */
    @NativeType("VkBool32")
    public boolean shaderDenormPreserveFloat64() { return nshaderDenormPreserveFloat64(address()) != 0; }
    /** a boolean value indicating whether denormals <b>can</b> be flushed to zero in 16-bit floating-point computations. It also indicates whether the {@code DenormFlushToZero} execution mode <b>can</b> be used for 16-bit floating-point types. */
    @NativeType("VkBool32")
    public boolean shaderDenormFlushToZeroFloat16() { return nshaderDenormFlushToZeroFloat16(address()) != 0; }
    /** a boolean value indicating whether denormals <b>can</b> be flushed to zero in 32-bit floating-point computations. It also indicates whether the {@code DenormFlushToZero} execution mode <b>can</b> be used for 32-bit floating-point types. */
    @NativeType("VkBool32")
    public boolean shaderDenormFlushToZeroFloat32() { return nshaderDenormFlushToZeroFloat32(address()) != 0; }
    /** a boolean value indicating whether denormals <b>can</b> be flushed to zero in 64-bit floating-point computations. It also indicates whether the {@code DenormFlushToZero} execution mode <b>can</b> be used for 64-bit floating-point types. */
    @NativeType("VkBool32")
    public boolean shaderDenormFlushToZeroFloat64() { return nshaderDenormFlushToZeroFloat64(address()) != 0; }
    /** a boolean value indicating whether an implementation supports the round-to-nearest-even rounding mode for 16-bit floating-point arithmetic and conversion instructions. It also indicates whether the {@code RoundingModeRTE} execution mode <b>can</b> be used for 16-bit floating-point types. */
    @NativeType("VkBool32")
    public boolean shaderRoundingModeRTEFloat16() { return nshaderRoundingModeRTEFloat16(address()) != 0; }
    /** a boolean value indicating whether an implementation supports the round-to-nearest-even rounding mode for 32-bit floating-point arithmetic and conversion instructions. It also indicates whether the {@code RoundingModeRTE} execution mode <b>can</b> be used for 32-bit floating-point types. */
    @NativeType("VkBool32")
    public boolean shaderRoundingModeRTEFloat32() { return nshaderRoundingModeRTEFloat32(address()) != 0; }
    /** a boolean value indicating whether an implementation supports the round-to-nearest-even rounding mode for 64-bit floating-point arithmetic and conversion instructions. It also indicates whether the {@code RoundingModeRTE} execution mode <b>can</b> be used for 64-bit floating-point types. */
    @NativeType("VkBool32")
    public boolean shaderRoundingModeRTEFloat64() { return nshaderRoundingModeRTEFloat64(address()) != 0; }
    /** a boolean value indicating whether an implementation supports the round-towards-zero rounding mode for 16-bit floating-point arithmetic and conversion instructions. It also indicates whether the {@code RoundingModeRTZ} execution mode <b>can</b> be used for 16-bit floating-point types. */
    @NativeType("VkBool32")
    public boolean shaderRoundingModeRTZFloat16() { return nshaderRoundingModeRTZFloat16(address()) != 0; }
    /** a boolean value indicating whether an implementation supports the round-towards-zero rounding mode for 32-bit floating-point arithmetic and conversion instructions. It also indicates whether the {@code RoundingModeRTZ} execution mode <b>can</b> be used for 32-bit floating-point types. */
    @NativeType("VkBool32")
    public boolean shaderRoundingModeRTZFloat32() { return nshaderRoundingModeRTZFloat32(address()) != 0; }
    /** a boolean value indicating whether an implementation supports the round-towards-zero rounding mode for 64-bit floating-point arithmetic and conversion instructions. It also indicates whether the {@code RoundingModeRTZ} execution mode <b>can</b> be used for 64-bit floating-point types. */
    @NativeType("VkBool32")
    public boolean shaderRoundingModeRTZFloat64() { return nshaderRoundingModeRTZFloat64(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceFloatControlsProperties sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FLOAT_CONTROLS_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_FLOAT_CONTROLS_PROPERTIES} value to the {@link #sType} field. */
    public VkPhysicalDeviceFloatControlsProperties sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FLOAT_CONTROLS_PROPERTIES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceFloatControlsProperties pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceFloatControlsProperties set(
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
    public VkPhysicalDeviceFloatControlsProperties set(VkPhysicalDeviceFloatControlsProperties src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceFloatControlsProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFloatControlsProperties malloc() {
        return wrap(VkPhysicalDeviceFloatControlsProperties.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceFloatControlsProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFloatControlsProperties calloc() {
        return wrap(VkPhysicalDeviceFloatControlsProperties.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceFloatControlsProperties} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceFloatControlsProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceFloatControlsProperties.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceFloatControlsProperties} instance for the specified memory address. */
    public static VkPhysicalDeviceFloatControlsProperties create(long address) {
        return wrap(VkPhysicalDeviceFloatControlsProperties.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFloatControlsProperties createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceFloatControlsProperties.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFloatControlsProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFloatControlsProperties.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFloatControlsProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFloatControlsProperties.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFloatControlsProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFloatControlsProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceFloatControlsProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFloatControlsProperties.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFloatControlsProperties.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFloatControlsProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFloatControlsProperties malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceFloatControlsProperties.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFloatControlsProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFloatControlsProperties calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceFloatControlsProperties.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFloatControlsProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFloatControlsProperties.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFloatControlsProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFloatControlsProperties.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFloatControlsProperties.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceFloatControlsProperties.PNEXT); }
    /** Unsafe version of {@link #denormBehaviorIndependence}. */
    public static int ndenormBehaviorIndependence(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFloatControlsProperties.DENORMBEHAVIORINDEPENDENCE); }
    /** Unsafe version of {@link #roundingModeIndependence}. */
    public static int nroundingModeIndependence(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFloatControlsProperties.ROUNDINGMODEINDEPENDENCE); }
    /** Unsafe version of {@link #shaderSignedZeroInfNanPreserveFloat16}. */
    public static int nshaderSignedZeroInfNanPreserveFloat16(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFloatControlsProperties.SHADERSIGNEDZEROINFNANPRESERVEFLOAT16); }
    /** Unsafe version of {@link #shaderSignedZeroInfNanPreserveFloat32}. */
    public static int nshaderSignedZeroInfNanPreserveFloat32(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFloatControlsProperties.SHADERSIGNEDZEROINFNANPRESERVEFLOAT32); }
    /** Unsafe version of {@link #shaderSignedZeroInfNanPreserveFloat64}. */
    public static int nshaderSignedZeroInfNanPreserveFloat64(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFloatControlsProperties.SHADERSIGNEDZEROINFNANPRESERVEFLOAT64); }
    /** Unsafe version of {@link #shaderDenormPreserveFloat16}. */
    public static int nshaderDenormPreserveFloat16(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFloatControlsProperties.SHADERDENORMPRESERVEFLOAT16); }
    /** Unsafe version of {@link #shaderDenormPreserveFloat32}. */
    public static int nshaderDenormPreserveFloat32(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFloatControlsProperties.SHADERDENORMPRESERVEFLOAT32); }
    /** Unsafe version of {@link #shaderDenormPreserveFloat64}. */
    public static int nshaderDenormPreserveFloat64(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFloatControlsProperties.SHADERDENORMPRESERVEFLOAT64); }
    /** Unsafe version of {@link #shaderDenormFlushToZeroFloat16}. */
    public static int nshaderDenormFlushToZeroFloat16(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFloatControlsProperties.SHADERDENORMFLUSHTOZEROFLOAT16); }
    /** Unsafe version of {@link #shaderDenormFlushToZeroFloat32}. */
    public static int nshaderDenormFlushToZeroFloat32(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFloatControlsProperties.SHADERDENORMFLUSHTOZEROFLOAT32); }
    /** Unsafe version of {@link #shaderDenormFlushToZeroFloat64}. */
    public static int nshaderDenormFlushToZeroFloat64(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFloatControlsProperties.SHADERDENORMFLUSHTOZEROFLOAT64); }
    /** Unsafe version of {@link #shaderRoundingModeRTEFloat16}. */
    public static int nshaderRoundingModeRTEFloat16(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFloatControlsProperties.SHADERROUNDINGMODERTEFLOAT16); }
    /** Unsafe version of {@link #shaderRoundingModeRTEFloat32}. */
    public static int nshaderRoundingModeRTEFloat32(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFloatControlsProperties.SHADERROUNDINGMODERTEFLOAT32); }
    /** Unsafe version of {@link #shaderRoundingModeRTEFloat64}. */
    public static int nshaderRoundingModeRTEFloat64(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFloatControlsProperties.SHADERROUNDINGMODERTEFLOAT64); }
    /** Unsafe version of {@link #shaderRoundingModeRTZFloat16}. */
    public static int nshaderRoundingModeRTZFloat16(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFloatControlsProperties.SHADERROUNDINGMODERTZFLOAT16); }
    /** Unsafe version of {@link #shaderRoundingModeRTZFloat32}. */
    public static int nshaderRoundingModeRTZFloat32(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFloatControlsProperties.SHADERROUNDINGMODERTZFLOAT32); }
    /** Unsafe version of {@link #shaderRoundingModeRTZFloat64}. */
    public static int nshaderRoundingModeRTZFloat64(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFloatControlsProperties.SHADERROUNDINGMODERTZFLOAT64); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFloatControlsProperties.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceFloatControlsProperties.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceFloatControlsProperties} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFloatControlsProperties, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceFloatControlsProperties ELEMENT_FACTORY = VkPhysicalDeviceFloatControlsProperties.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceFloatControlsProperties.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceFloatControlsProperties#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceFloatControlsProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceFloatControlsProperties#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceFloatControlsProperties.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceFloatControlsProperties#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceFloatControlsProperties.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceFloatControlsProperties#denormBehaviorIndependence} field. */
        @NativeType("VkShaderFloatControlsIndependence")
        public int denormBehaviorIndependence() { return VkPhysicalDeviceFloatControlsProperties.ndenormBehaviorIndependence(address()); }
        /** @return the value of the {@link VkPhysicalDeviceFloatControlsProperties#roundingModeIndependence} field. */
        @NativeType("VkShaderFloatControlsIndependence")
        public int roundingModeIndependence() { return VkPhysicalDeviceFloatControlsProperties.nroundingModeIndependence(address()); }
        /** @return the value of the {@link VkPhysicalDeviceFloatControlsProperties#shaderSignedZeroInfNanPreserveFloat16} field. */
        @NativeType("VkBool32")
        public boolean shaderSignedZeroInfNanPreserveFloat16() { return VkPhysicalDeviceFloatControlsProperties.nshaderSignedZeroInfNanPreserveFloat16(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFloatControlsProperties#shaderSignedZeroInfNanPreserveFloat32} field. */
        @NativeType("VkBool32")
        public boolean shaderSignedZeroInfNanPreserveFloat32() { return VkPhysicalDeviceFloatControlsProperties.nshaderSignedZeroInfNanPreserveFloat32(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFloatControlsProperties#shaderSignedZeroInfNanPreserveFloat64} field. */
        @NativeType("VkBool32")
        public boolean shaderSignedZeroInfNanPreserveFloat64() { return VkPhysicalDeviceFloatControlsProperties.nshaderSignedZeroInfNanPreserveFloat64(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFloatControlsProperties#shaderDenormPreserveFloat16} field. */
        @NativeType("VkBool32")
        public boolean shaderDenormPreserveFloat16() { return VkPhysicalDeviceFloatControlsProperties.nshaderDenormPreserveFloat16(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFloatControlsProperties#shaderDenormPreserveFloat32} field. */
        @NativeType("VkBool32")
        public boolean shaderDenormPreserveFloat32() { return VkPhysicalDeviceFloatControlsProperties.nshaderDenormPreserveFloat32(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFloatControlsProperties#shaderDenormPreserveFloat64} field. */
        @NativeType("VkBool32")
        public boolean shaderDenormPreserveFloat64() { return VkPhysicalDeviceFloatControlsProperties.nshaderDenormPreserveFloat64(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFloatControlsProperties#shaderDenormFlushToZeroFloat16} field. */
        @NativeType("VkBool32")
        public boolean shaderDenormFlushToZeroFloat16() { return VkPhysicalDeviceFloatControlsProperties.nshaderDenormFlushToZeroFloat16(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFloatControlsProperties#shaderDenormFlushToZeroFloat32} field. */
        @NativeType("VkBool32")
        public boolean shaderDenormFlushToZeroFloat32() { return VkPhysicalDeviceFloatControlsProperties.nshaderDenormFlushToZeroFloat32(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFloatControlsProperties#shaderDenormFlushToZeroFloat64} field. */
        @NativeType("VkBool32")
        public boolean shaderDenormFlushToZeroFloat64() { return VkPhysicalDeviceFloatControlsProperties.nshaderDenormFlushToZeroFloat64(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFloatControlsProperties#shaderRoundingModeRTEFloat16} field. */
        @NativeType("VkBool32")
        public boolean shaderRoundingModeRTEFloat16() { return VkPhysicalDeviceFloatControlsProperties.nshaderRoundingModeRTEFloat16(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFloatControlsProperties#shaderRoundingModeRTEFloat32} field. */
        @NativeType("VkBool32")
        public boolean shaderRoundingModeRTEFloat32() { return VkPhysicalDeviceFloatControlsProperties.nshaderRoundingModeRTEFloat32(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFloatControlsProperties#shaderRoundingModeRTEFloat64} field. */
        @NativeType("VkBool32")
        public boolean shaderRoundingModeRTEFloat64() { return VkPhysicalDeviceFloatControlsProperties.nshaderRoundingModeRTEFloat64(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFloatControlsProperties#shaderRoundingModeRTZFloat16} field. */
        @NativeType("VkBool32")
        public boolean shaderRoundingModeRTZFloat16() { return VkPhysicalDeviceFloatControlsProperties.nshaderRoundingModeRTZFloat16(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFloatControlsProperties#shaderRoundingModeRTZFloat32} field. */
        @NativeType("VkBool32")
        public boolean shaderRoundingModeRTZFloat32() { return VkPhysicalDeviceFloatControlsProperties.nshaderRoundingModeRTZFloat32(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFloatControlsProperties#shaderRoundingModeRTZFloat64} field. */
        @NativeType("VkBool32")
        public boolean shaderRoundingModeRTZFloat64() { return VkPhysicalDeviceFloatControlsProperties.nshaderRoundingModeRTZFloat64(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceFloatControlsProperties#sType} field. */
        public VkPhysicalDeviceFloatControlsProperties.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceFloatControlsProperties.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FLOAT_CONTROLS_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_FLOAT_CONTROLS_PROPERTIES} value to the {@link VkPhysicalDeviceFloatControlsProperties#sType} field. */
        public VkPhysicalDeviceFloatControlsProperties.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FLOAT_CONTROLS_PROPERTIES); }
        /** Sets the specified value to the {@link VkPhysicalDeviceFloatControlsProperties#pNext} field. */
        public VkPhysicalDeviceFloatControlsProperties.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceFloatControlsProperties.npNext(address(), value); return this; }

    }

}