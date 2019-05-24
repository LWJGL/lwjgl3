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
 * Structure specifying performance markers.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link INTELPerformanceQuery#VK_STRUCTURE_TYPE_PERFORMANCE_MARKER_INFO_INTEL STRUCTURE_TYPE_PERFORMANCE_MARKER_INFO_INTEL}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link INTELPerformanceQuery#vkCmdSetPerformanceMarkerINTEL CmdSetPerformanceMarkerINTEL}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code marker} &ndash; the marker value that will be recorded into the opaque query results.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPerformanceMarkerInfoINTEL {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint64_t marker;
 * }</code></pre>
 */
public class VkPerformanceMarkerInfoINTEL extends Struct implements NativeResource {

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
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MARKER = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPerformanceMarkerInfoINTEL} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPerformanceMarkerInfoINTEL(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code marker} field. */
    @NativeType("uint64_t")
    public long marker() { return nmarker(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPerformanceMarkerInfoINTEL sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPerformanceMarkerInfoINTEL pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code marker} field. */
    public VkPerformanceMarkerInfoINTEL marker(@NativeType("uint64_t") long value) { nmarker(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPerformanceMarkerInfoINTEL set(
        int sType,
        long pNext,
        long marker
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
    public VkPerformanceMarkerInfoINTEL set(VkPerformanceMarkerInfoINTEL src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPerformanceMarkerInfoINTEL} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPerformanceMarkerInfoINTEL malloc() {
        return wrap(VkPerformanceMarkerInfoINTEL.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPerformanceMarkerInfoINTEL} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPerformanceMarkerInfoINTEL calloc() {
        return wrap(VkPerformanceMarkerInfoINTEL.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPerformanceMarkerInfoINTEL} instance allocated with {@link BufferUtils}. */
    public static VkPerformanceMarkerInfoINTEL create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPerformanceMarkerInfoINTEL.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPerformanceMarkerInfoINTEL} instance for the specified memory address. */
    public static VkPerformanceMarkerInfoINTEL create(long address) {
        return wrap(VkPerformanceMarkerInfoINTEL.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPerformanceMarkerInfoINTEL createSafe(long address) {
        return address == NULL ? null : wrap(VkPerformanceMarkerInfoINTEL.class, address);
    }

    /**
     * Returns a new {@link VkPerformanceMarkerInfoINTEL.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerformanceMarkerInfoINTEL.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPerformanceMarkerInfoINTEL.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerformanceMarkerInfoINTEL.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPerformanceMarkerInfoINTEL.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerformanceMarkerInfoINTEL.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPerformanceMarkerInfoINTEL.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPerformanceMarkerInfoINTEL.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPerformanceMarkerInfoINTEL.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPerformanceMarkerInfoINTEL} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPerformanceMarkerInfoINTEL mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPerformanceMarkerInfoINTEL} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPerformanceMarkerInfoINTEL callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPerformanceMarkerInfoINTEL} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPerformanceMarkerInfoINTEL mallocStack(MemoryStack stack) {
        return wrap(VkPerformanceMarkerInfoINTEL.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPerformanceMarkerInfoINTEL} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPerformanceMarkerInfoINTEL callocStack(MemoryStack stack) {
        return wrap(VkPerformanceMarkerInfoINTEL.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPerformanceMarkerInfoINTEL.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerformanceMarkerInfoINTEL.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPerformanceMarkerInfoINTEL.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerformanceMarkerInfoINTEL.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPerformanceMarkerInfoINTEL.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPerformanceMarkerInfoINTEL.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPerformanceMarkerInfoINTEL.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPerformanceMarkerInfoINTEL.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPerformanceMarkerInfoINTEL.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPerformanceMarkerInfoINTEL.PNEXT); }
    /** Unsafe version of {@link #marker}. */
    public static long nmarker(long struct) { return UNSAFE.getLong(null, struct + VkPerformanceMarkerInfoINTEL.MARKER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPerformanceMarkerInfoINTEL.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPerformanceMarkerInfoINTEL.PNEXT, value); }
    /** Unsafe version of {@link #marker(long) marker}. */
    public static void nmarker(long struct, long value) { UNSAFE.putLong(null, struct + VkPerformanceMarkerInfoINTEL.MARKER, value); }

    // -----------------------------------

    /** An array of {@link VkPerformanceMarkerInfoINTEL} structs. */
    public static class Buffer extends StructBuffer<VkPerformanceMarkerInfoINTEL, Buffer> implements NativeResource {

        private static final VkPerformanceMarkerInfoINTEL ELEMENT_FACTORY = VkPerformanceMarkerInfoINTEL.create(-1L);

        /**
         * Creates a new {@code VkPerformanceMarkerInfoINTEL.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPerformanceMarkerInfoINTEL#SIZEOF}, and its mark will be undefined.
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
        protected VkPerformanceMarkerInfoINTEL getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPerformanceMarkerInfoINTEL.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPerformanceMarkerInfoINTEL.npNext(address()); }
        /** Returns the value of the {@code marker} field. */
        @NativeType("uint64_t")
        public long marker() { return VkPerformanceMarkerInfoINTEL.nmarker(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPerformanceMarkerInfoINTEL.Buffer sType(@NativeType("VkStructureType") int value) { VkPerformanceMarkerInfoINTEL.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPerformanceMarkerInfoINTEL.Buffer pNext(@NativeType("void const *") long value) { VkPerformanceMarkerInfoINTEL.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code marker} field. */
        public VkPerformanceMarkerInfoINTEL.Buffer marker(@NativeType("uint64_t") long value) { VkPerformanceMarkerInfoINTEL.nmarker(address(), value); return this; }

    }

}