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
 * Structure specifying a buffer copy operation.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The {@code size} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK13#VK_STRUCTURE_TYPE_BUFFER_COPY_2 STRUCTURE_TYPE_BUFFER_COPY_2}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkCopyBufferInfo2}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkBufferCopy2 {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkDeviceSize {@link #srcOffset};
 *     VkDeviceSize {@link #dstOffset};
 *     VkDeviceSize {@link #size};
 * }</code></pre>
 */
public class VkBufferCopy2 extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SRCOFFSET,
        DSTOFFSET,
        SIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCOFFSET = layout.offsetof(2);
        DSTOFFSET = layout.offsetof(3);
        SIZE = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkBufferCopy2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBufferCopy2(ByteBuffer container) {
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
    /** the starting offset in bytes from the start of {@code srcBuffer}. */
    @NativeType("VkDeviceSize")
    public long srcOffset() { return nsrcOffset(address()); }
    /** the starting offset in bytes from the start of {@code dstBuffer}. */
    @NativeType("VkDeviceSize")
    public long dstOffset() { return ndstOffset(address()); }
    /** the number of bytes to copy. */
    @NativeType("VkDeviceSize")
    public long size() { return nsize(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkBufferCopy2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_BUFFER_COPY_2 STRUCTURE_TYPE_BUFFER_COPY_2} value to the {@link #sType} field. */
    public VkBufferCopy2 sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_BUFFER_COPY_2); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkBufferCopy2 pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #srcOffset} field. */
    public VkBufferCopy2 srcOffset(@NativeType("VkDeviceSize") long value) { nsrcOffset(address(), value); return this; }
    /** Sets the specified value to the {@link #dstOffset} field. */
    public VkBufferCopy2 dstOffset(@NativeType("VkDeviceSize") long value) { ndstOffset(address(), value); return this; }
    /** Sets the specified value to the {@link #size} field. */
    public VkBufferCopy2 size(@NativeType("VkDeviceSize") long value) { nsize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBufferCopy2 set(
        int sType,
        long pNext,
        long srcOffset,
        long dstOffset,
        long size
    ) {
        sType(sType);
        pNext(pNext);
        srcOffset(srcOffset);
        dstOffset(dstOffset);
        size(size);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBufferCopy2 set(VkBufferCopy2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBufferCopy2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBufferCopy2 malloc() {
        return wrap(VkBufferCopy2.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkBufferCopy2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBufferCopy2 calloc() {
        return wrap(VkBufferCopy2.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkBufferCopy2} instance allocated with {@link BufferUtils}. */
    public static VkBufferCopy2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkBufferCopy2.class, memAddress(container), container);
    }

    /** Returns a new {@code VkBufferCopy2} instance for the specified memory address. */
    public static VkBufferCopy2 create(long address) {
        return wrap(VkBufferCopy2.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBufferCopy2 createSafe(long address) {
        return address == NULL ? null : wrap(VkBufferCopy2.class, address);
    }

    /**
     * Returns a new {@link VkBufferCopy2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferCopy2.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBufferCopy2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferCopy2.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferCopy2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferCopy2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkBufferCopy2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBufferCopy2.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBufferCopy2.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkBufferCopy2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferCopy2 malloc(MemoryStack stack) {
        return wrap(VkBufferCopy2.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkBufferCopy2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferCopy2 calloc(MemoryStack stack) {
        return wrap(VkBufferCopy2.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkBufferCopy2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferCopy2.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferCopy2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferCopy2.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkBufferCopy2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBufferCopy2.PNEXT); }
    /** Unsafe version of {@link #srcOffset}. */
    public static long nsrcOffset(long struct) { return UNSAFE.getLong(null, struct + VkBufferCopy2.SRCOFFSET); }
    /** Unsafe version of {@link #dstOffset}. */
    public static long ndstOffset(long struct) { return UNSAFE.getLong(null, struct + VkBufferCopy2.DSTOFFSET); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return UNSAFE.getLong(null, struct + VkBufferCopy2.SIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkBufferCopy2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBufferCopy2.PNEXT, value); }
    /** Unsafe version of {@link #srcOffset(long) srcOffset}. */
    public static void nsrcOffset(long struct, long value) { UNSAFE.putLong(null, struct + VkBufferCopy2.SRCOFFSET, value); }
    /** Unsafe version of {@link #dstOffset(long) dstOffset}. */
    public static void ndstOffset(long struct, long value) { UNSAFE.putLong(null, struct + VkBufferCopy2.DSTOFFSET, value); }
    /** Unsafe version of {@link #size(long) size}. */
    public static void nsize(long struct, long value) { UNSAFE.putLong(null, struct + VkBufferCopy2.SIZE, value); }

    // -----------------------------------

    /** An array of {@link VkBufferCopy2} structs. */
    public static class Buffer extends StructBuffer<VkBufferCopy2, Buffer> implements NativeResource {

        private static final VkBufferCopy2 ELEMENT_FACTORY = VkBufferCopy2.create(-1L);

        /**
         * Creates a new {@code VkBufferCopy2.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBufferCopy2#SIZEOF}, and its mark will be undefined.
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
        protected VkBufferCopy2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkBufferCopy2#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBufferCopy2.nsType(address()); }
        /** @return the value of the {@link VkBufferCopy2#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkBufferCopy2.npNext(address()); }
        /** @return the value of the {@link VkBufferCopy2#srcOffset} field. */
        @NativeType("VkDeviceSize")
        public long srcOffset() { return VkBufferCopy2.nsrcOffset(address()); }
        /** @return the value of the {@link VkBufferCopy2#dstOffset} field. */
        @NativeType("VkDeviceSize")
        public long dstOffset() { return VkBufferCopy2.ndstOffset(address()); }
        /** @return the value of the {@link VkBufferCopy2#size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VkBufferCopy2.nsize(address()); }

        /** Sets the specified value to the {@link VkBufferCopy2#sType} field. */
        public VkBufferCopy2.Buffer sType(@NativeType("VkStructureType") int value) { VkBufferCopy2.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_BUFFER_COPY_2 STRUCTURE_TYPE_BUFFER_COPY_2} value to the {@link VkBufferCopy2#sType} field. */
        public VkBufferCopy2.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_BUFFER_COPY_2); }
        /** Sets the specified value to the {@link VkBufferCopy2#pNext} field. */
        public VkBufferCopy2.Buffer pNext(@NativeType("void const *") long value) { VkBufferCopy2.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkBufferCopy2#srcOffset} field. */
        public VkBufferCopy2.Buffer srcOffset(@NativeType("VkDeviceSize") long value) { VkBufferCopy2.nsrcOffset(address(), value); return this; }
        /** Sets the specified value to the {@link VkBufferCopy2#dstOffset} field. */
        public VkBufferCopy2.Buffer dstOffset(@NativeType("VkDeviceSize") long value) { VkBufferCopy2.ndstOffset(address(), value); return this; }
        /** Sets the specified value to the {@link VkBufferCopy2#size} field. */
        public VkBufferCopy2.Buffer size(@NativeType("VkDeviceSize") long value) { VkBufferCopy2.nsize(address(), value); return this; }

    }

}