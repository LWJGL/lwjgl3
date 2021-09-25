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
 * Structure specifying conservative raster state.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code extraPrimitiveOverestimationSize} <b>must</b> be in the range of {@code 0.0} to {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT}{@code ::maxExtraPrimitiveOverestimationSize} inclusive</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTConservativeRasterization#VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_CONSERVATIVE_STATE_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_RASTERIZATION_CONSERVATIVE_STATE_CREATE_INFO_EXT}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code conservativeRasterizationMode} <b>must</b> be a valid {@code VkConservativeRasterizationModeEXT} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineRasterizationConservativeStateCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkPipelineRasterizationConservativeStateCreateFlagsEXT {@link #flags};
 *     VkConservativeRasterizationModeEXT {@link #conservativeRasterizationMode};
 *     float {@link #extraPrimitiveOverestimationSize};
 * }</code></pre>
 */
public class VkPipelineRasterizationConservativeStateCreateInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        CONSERVATIVERASTERIZATIONMODE,
        EXTRAPRIMITIVEOVERESTIMATIONSIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        CONSERVATIVERASTERIZATIONMODE = layout.offsetof(3);
        EXTRAPRIMITIVEOVERESTIMATIONSIZE = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkPipelineRasterizationConservativeStateCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineRasterizationConservativeStateCreateInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** reserved for future use. */
    @NativeType("VkPipelineRasterizationConservativeStateCreateFlagsEXT")
    public int flags() { return nflags(address()); }
    /** the conservative rasterization mode to use. */
    @NativeType("VkConservativeRasterizationModeEXT")
    public int conservativeRasterizationMode() { return nconservativeRasterizationMode(address()); }
    /** the extra size in pixels to increase the generating primitive during conservative rasterization at each of its edges in {@code X} and {@code Y} equally in screen space beyond the base overestimation specified in {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT}{@code ::primitiveOverestimationSize}. */
    public float extraPrimitiveOverestimationSize() { return nextraPrimitiveOverestimationSize(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPipelineRasterizationConservativeStateCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTConservativeRasterization#VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_CONSERVATIVE_STATE_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_RASTERIZATION_CONSERVATIVE_STATE_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkPipelineRasterizationConservativeStateCreateInfoEXT sType$Default() { return sType(EXTConservativeRasterization.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_CONSERVATIVE_STATE_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPipelineRasterizationConservativeStateCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkPipelineRasterizationConservativeStateCreateInfoEXT flags(@NativeType("VkPipelineRasterizationConservativeStateCreateFlagsEXT") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #conservativeRasterizationMode} field. */
    public VkPipelineRasterizationConservativeStateCreateInfoEXT conservativeRasterizationMode(@NativeType("VkConservativeRasterizationModeEXT") int value) { nconservativeRasterizationMode(address(), value); return this; }
    /** Sets the specified value to the {@link #extraPrimitiveOverestimationSize} field. */
    public VkPipelineRasterizationConservativeStateCreateInfoEXT extraPrimitiveOverestimationSize(float value) { nextraPrimitiveOverestimationSize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineRasterizationConservativeStateCreateInfoEXT set(
        int sType,
        long pNext,
        int flags,
        int conservativeRasterizationMode,
        float extraPrimitiveOverestimationSize
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        conservativeRasterizationMode(conservativeRasterizationMode);
        extraPrimitiveOverestimationSize(extraPrimitiveOverestimationSize);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineRasterizationConservativeStateCreateInfoEXT set(VkPipelineRasterizationConservativeStateCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineRasterizationConservativeStateCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineRasterizationConservativeStateCreateInfoEXT malloc() {
        return wrap(VkPipelineRasterizationConservativeStateCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPipelineRasterizationConservativeStateCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineRasterizationConservativeStateCreateInfoEXT calloc() {
        return wrap(VkPipelineRasterizationConservativeStateCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPipelineRasterizationConservativeStateCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkPipelineRasterizationConservativeStateCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPipelineRasterizationConservativeStateCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineRasterizationConservativeStateCreateInfoEXT} instance for the specified memory address. */
    public static VkPipelineRasterizationConservativeStateCreateInfoEXT create(long address) {
        return wrap(VkPipelineRasterizationConservativeStateCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineRasterizationConservativeStateCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPipelineRasterizationConservativeStateCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationConservativeStateCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationConservativeStateCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationConservativeStateCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationConservativeStateCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationConservativeStateCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationConservativeStateCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPipelineRasterizationConservativeStateCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationConservativeStateCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineRasterizationConservativeStateCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationConservativeStateCreateInfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationConservativeStateCreateInfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationConservativeStateCreateInfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationConservativeStateCreateInfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationConservativeStateCreateInfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationConservativeStateCreateInfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationConservativeStateCreateInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationConservativeStateCreateInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPipelineRasterizationConservativeStateCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineRasterizationConservativeStateCreateInfoEXT malloc(MemoryStack stack) {
        return wrap(VkPipelineRasterizationConservativeStateCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPipelineRasterizationConservativeStateCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineRasterizationConservativeStateCreateInfoEXT calloc(MemoryStack stack) {
        return wrap(VkPipelineRasterizationConservativeStateCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineRasterizationConservativeStateCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationConservativeStateCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationConservativeStateCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationConservativeStateCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineRasterizationConservativeStateCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineRasterizationConservativeStateCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkPipelineRasterizationConservativeStateCreateInfoEXT.FLAGS); }
    /** Unsafe version of {@link #conservativeRasterizationMode}. */
    public static int nconservativeRasterizationMode(long struct) { return UNSAFE.getInt(null, struct + VkPipelineRasterizationConservativeStateCreateInfoEXT.CONSERVATIVERASTERIZATIONMODE); }
    /** Unsafe version of {@link #extraPrimitiveOverestimationSize}. */
    public static float nextraPrimitiveOverestimationSize(long struct) { return UNSAFE.getFloat(null, struct + VkPipelineRasterizationConservativeStateCreateInfoEXT.EXTRAPRIMITIVEOVERESTIMATIONSIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineRasterizationConservativeStateCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineRasterizationConservativeStateCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineRasterizationConservativeStateCreateInfoEXT.FLAGS, value); }
    /** Unsafe version of {@link #conservativeRasterizationMode(int) conservativeRasterizationMode}. */
    public static void nconservativeRasterizationMode(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineRasterizationConservativeStateCreateInfoEXT.CONSERVATIVERASTERIZATIONMODE, value); }
    /** Unsafe version of {@link #extraPrimitiveOverestimationSize(float) extraPrimitiveOverestimationSize}. */
    public static void nextraPrimitiveOverestimationSize(long struct, float value) { UNSAFE.putFloat(null, struct + VkPipelineRasterizationConservativeStateCreateInfoEXT.EXTRAPRIMITIVEOVERESTIMATIONSIZE, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineRasterizationConservativeStateCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkPipelineRasterizationConservativeStateCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkPipelineRasterizationConservativeStateCreateInfoEXT ELEMENT_FACTORY = VkPipelineRasterizationConservativeStateCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkPipelineRasterizationConservativeStateCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineRasterizationConservativeStateCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineRasterizationConservativeStateCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPipelineRasterizationConservativeStateCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineRasterizationConservativeStateCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkPipelineRasterizationConservativeStateCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineRasterizationConservativeStateCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkPipelineRasterizationConservativeStateCreateInfoEXT#flags} field. */
        @NativeType("VkPipelineRasterizationConservativeStateCreateFlagsEXT")
        public int flags() { return VkPipelineRasterizationConservativeStateCreateInfoEXT.nflags(address()); }
        /** @return the value of the {@link VkPipelineRasterizationConservativeStateCreateInfoEXT#conservativeRasterizationMode} field. */
        @NativeType("VkConservativeRasterizationModeEXT")
        public int conservativeRasterizationMode() { return VkPipelineRasterizationConservativeStateCreateInfoEXT.nconservativeRasterizationMode(address()); }
        /** @return the value of the {@link VkPipelineRasterizationConservativeStateCreateInfoEXT#extraPrimitiveOverestimationSize} field. */
        public float extraPrimitiveOverestimationSize() { return VkPipelineRasterizationConservativeStateCreateInfoEXT.nextraPrimitiveOverestimationSize(address()); }

        /** Sets the specified value to the {@link VkPipelineRasterizationConservativeStateCreateInfoEXT#sType} field. */
        public VkPipelineRasterizationConservativeStateCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineRasterizationConservativeStateCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTConservativeRasterization#VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_CONSERVATIVE_STATE_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_RASTERIZATION_CONSERVATIVE_STATE_CREATE_INFO_EXT} value to the {@link VkPipelineRasterizationConservativeStateCreateInfoEXT#sType} field. */
        public VkPipelineRasterizationConservativeStateCreateInfoEXT.Buffer sType$Default() { return sType(EXTConservativeRasterization.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_CONSERVATIVE_STATE_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkPipelineRasterizationConservativeStateCreateInfoEXT#pNext} field. */
        public VkPipelineRasterizationConservativeStateCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkPipelineRasterizationConservativeStateCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineRasterizationConservativeStateCreateInfoEXT#flags} field. */
        public VkPipelineRasterizationConservativeStateCreateInfoEXT.Buffer flags(@NativeType("VkPipelineRasterizationConservativeStateCreateFlagsEXT") int value) { VkPipelineRasterizationConservativeStateCreateInfoEXT.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineRasterizationConservativeStateCreateInfoEXT#conservativeRasterizationMode} field. */
        public VkPipelineRasterizationConservativeStateCreateInfoEXT.Buffer conservativeRasterizationMode(@NativeType("VkConservativeRasterizationModeEXT") int value) { VkPipelineRasterizationConservativeStateCreateInfoEXT.nconservativeRasterizationMode(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineRasterizationConservativeStateCreateInfoEXT#extraPrimitiveOverestimationSize} field. */
        public VkPipelineRasterizationConservativeStateCreateInfoEXT.Buffer extraPrimitiveOverestimationSize(float value) { VkPipelineRasterizationConservativeStateCreateInfoEXT.nextraPrimitiveOverestimationSize(address(), value); return this; }

    }

}