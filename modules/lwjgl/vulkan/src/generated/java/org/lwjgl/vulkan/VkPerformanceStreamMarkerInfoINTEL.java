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
 * Structure specifying stream performance markers.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The value written by the application into {@code marker} <b>must</b> only used the valid bits as reported by {@link INTELPerformanceQuery#vkGetPerformanceParameterINTEL GetPerformanceParameterINTEL} with the {@link INTELPerformanceQuery#VK_PERFORMANCE_PARAMETER_TYPE_STREAM_MARKER_VALID_BITS_INTEL PERFORMANCE_PARAMETER_TYPE_STREAM_MARKER_VALID_BITS_INTEL}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link INTELPerformanceQuery#VK_STRUCTURE_TYPE_PERFORMANCE_STREAM_MARKER_INFO_INTEL STRUCTURE_TYPE_PERFORMANCE_STREAM_MARKER_INFO_INTEL}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link INTELPerformanceQuery#vkCmdSetPerformanceStreamMarkerINTEL CmdSetPerformanceStreamMarkerINTEL}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPerformanceStreamMarkerInfoINTEL {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #marker};
 * }</code></pre>
 */
public class VkPerformanceStreamMarkerInfoINTEL extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MARKER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MARKER = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPerformanceStreamMarkerInfoINTEL} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPerformanceStreamMarkerInfoINTEL(ByteBuffer container) {
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
    /** the marker value that will be recorded into the reports consumed by an external application. */
    @NativeType("uint32_t")
    public int marker() { return nmarker(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPerformanceStreamMarkerInfoINTEL sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link INTELPerformanceQuery#VK_STRUCTURE_TYPE_PERFORMANCE_STREAM_MARKER_INFO_INTEL STRUCTURE_TYPE_PERFORMANCE_STREAM_MARKER_INFO_INTEL} value to the {@link #sType} field. */
    public VkPerformanceStreamMarkerInfoINTEL sType$Default() { return sType(INTELPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_STREAM_MARKER_INFO_INTEL); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPerformanceStreamMarkerInfoINTEL pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #marker} field. */
    public VkPerformanceStreamMarkerInfoINTEL marker(@NativeType("uint32_t") int value) { nmarker(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPerformanceStreamMarkerInfoINTEL set(
        int sType,
        long pNext,
        int marker
    ) {
        sType(sType);
        pNext(pNext);
        marker(marker);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPerformanceStreamMarkerInfoINTEL set(VkPerformanceStreamMarkerInfoINTEL src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPerformanceStreamMarkerInfoINTEL} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPerformanceStreamMarkerInfoINTEL malloc() {
        return wrap(VkPerformanceStreamMarkerInfoINTEL.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPerformanceStreamMarkerInfoINTEL} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPerformanceStreamMarkerInfoINTEL calloc() {
        return wrap(VkPerformanceStreamMarkerInfoINTEL.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPerformanceStreamMarkerInfoINTEL} instance allocated with {@link BufferUtils}. */
    public static VkPerformanceStreamMarkerInfoINTEL create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPerformanceStreamMarkerInfoINTEL.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPerformanceStreamMarkerInfoINTEL} instance for the specified memory address. */
    public static VkPerformanceStreamMarkerInfoINTEL create(long address) {
        return wrap(VkPerformanceStreamMarkerInfoINTEL.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPerformanceStreamMarkerInfoINTEL createSafe(long address) {
        return address == NULL ? null : wrap(VkPerformanceStreamMarkerInfoINTEL.class, address);
    }

    /**
     * Returns a new {@link VkPerformanceStreamMarkerInfoINTEL.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerformanceStreamMarkerInfoINTEL.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPerformanceStreamMarkerInfoINTEL.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerformanceStreamMarkerInfoINTEL.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPerformanceStreamMarkerInfoINTEL.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerformanceStreamMarkerInfoINTEL.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPerformanceStreamMarkerInfoINTEL.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPerformanceStreamMarkerInfoINTEL.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPerformanceStreamMarkerInfoINTEL.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPerformanceStreamMarkerInfoINTEL mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPerformanceStreamMarkerInfoINTEL callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPerformanceStreamMarkerInfoINTEL mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPerformanceStreamMarkerInfoINTEL callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPerformanceStreamMarkerInfoINTEL.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPerformanceStreamMarkerInfoINTEL.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPerformanceStreamMarkerInfoINTEL.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPerformanceStreamMarkerInfoINTEL.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPerformanceStreamMarkerInfoINTEL} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPerformanceStreamMarkerInfoINTEL malloc(MemoryStack stack) {
        return wrap(VkPerformanceStreamMarkerInfoINTEL.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPerformanceStreamMarkerInfoINTEL} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPerformanceStreamMarkerInfoINTEL calloc(MemoryStack stack) {
        return wrap(VkPerformanceStreamMarkerInfoINTEL.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPerformanceStreamMarkerInfoINTEL.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPerformanceStreamMarkerInfoINTEL.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPerformanceStreamMarkerInfoINTEL.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPerformanceStreamMarkerInfoINTEL.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPerformanceStreamMarkerInfoINTEL.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPerformanceStreamMarkerInfoINTEL.PNEXT); }
    /** Unsafe version of {@link #marker}. */
    public static int nmarker(long struct) { return UNSAFE.getInt(null, struct + VkPerformanceStreamMarkerInfoINTEL.MARKER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPerformanceStreamMarkerInfoINTEL.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPerformanceStreamMarkerInfoINTEL.PNEXT, value); }
    /** Unsafe version of {@link #marker(int) marker}. */
    public static void nmarker(long struct, int value) { UNSAFE.putInt(null, struct + VkPerformanceStreamMarkerInfoINTEL.MARKER, value); }

    // -----------------------------------

    /** An array of {@link VkPerformanceStreamMarkerInfoINTEL} structs. */
    public static class Buffer extends StructBuffer<VkPerformanceStreamMarkerInfoINTEL, Buffer> implements NativeResource {

        private static final VkPerformanceStreamMarkerInfoINTEL ELEMENT_FACTORY = VkPerformanceStreamMarkerInfoINTEL.create(-1L);

        /**
         * Creates a new {@code VkPerformanceStreamMarkerInfoINTEL.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPerformanceStreamMarkerInfoINTEL#SIZEOF}, and its mark will be undefined.
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
        protected VkPerformanceStreamMarkerInfoINTEL getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPerformanceStreamMarkerInfoINTEL#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPerformanceStreamMarkerInfoINTEL.nsType(address()); }
        /** @return the value of the {@link VkPerformanceStreamMarkerInfoINTEL#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPerformanceStreamMarkerInfoINTEL.npNext(address()); }
        /** @return the value of the {@link VkPerformanceStreamMarkerInfoINTEL#marker} field. */
        @NativeType("uint32_t")
        public int marker() { return VkPerformanceStreamMarkerInfoINTEL.nmarker(address()); }

        /** Sets the specified value to the {@link VkPerformanceStreamMarkerInfoINTEL#sType} field. */
        public VkPerformanceStreamMarkerInfoINTEL.Buffer sType(@NativeType("VkStructureType") int value) { VkPerformanceStreamMarkerInfoINTEL.nsType(address(), value); return this; }
        /** Sets the {@link INTELPerformanceQuery#VK_STRUCTURE_TYPE_PERFORMANCE_STREAM_MARKER_INFO_INTEL STRUCTURE_TYPE_PERFORMANCE_STREAM_MARKER_INFO_INTEL} value to the {@link VkPerformanceStreamMarkerInfoINTEL#sType} field. */
        public VkPerformanceStreamMarkerInfoINTEL.Buffer sType$Default() { return sType(INTELPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_STREAM_MARKER_INFO_INTEL); }
        /** Sets the specified value to the {@link VkPerformanceStreamMarkerInfoINTEL#pNext} field. */
        public VkPerformanceStreamMarkerInfoINTEL.Buffer pNext(@NativeType("void const *") long value) { VkPerformanceStreamMarkerInfoINTEL.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPerformanceStreamMarkerInfoINTEL#marker} field. */
        public VkPerformanceStreamMarkerInfoINTEL.Buffer marker(@NativeType("uint32_t") int value) { VkPerformanceStreamMarkerInfoINTEL.nmarker(address(), value); return this; }

    }

}