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
 * <li>{@code sType} <b>must</b> be {@link KHRCopyCommands2#VK_STRUCTURE_TYPE_BUFFER_COPY_2_KHR STRUCTURE_TYPE_BUFFER_COPY_2_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkCopyBufferInfo2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkBufferCopy2KHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkDeviceSize {@link #srcOffset};
 *     VkDeviceSize {@link #dstOffset};
 *     VkDeviceSize {@link #size};
 * }</code></pre>
 */
public class VkBufferCopy2KHR extends Struct implements NativeResource {

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
     * Creates a {@code VkBufferCopy2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBufferCopy2KHR(ByteBuffer container) {
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
    public VkBufferCopy2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkBufferCopy2KHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #srcOffset} field. */
    public VkBufferCopy2KHR srcOffset(@NativeType("VkDeviceSize") long value) { nsrcOffset(address(), value); return this; }
    /** Sets the specified value to the {@link #dstOffset} field. */
    public VkBufferCopy2KHR dstOffset(@NativeType("VkDeviceSize") long value) { ndstOffset(address(), value); return this; }
    /** Sets the specified value to the {@link #size} field. */
    public VkBufferCopy2KHR size(@NativeType("VkDeviceSize") long value) { nsize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBufferCopy2KHR set(
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
    public VkBufferCopy2KHR set(VkBufferCopy2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBufferCopy2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBufferCopy2KHR malloc() {
        return wrap(VkBufferCopy2KHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkBufferCopy2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBufferCopy2KHR calloc() {
        return wrap(VkBufferCopy2KHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkBufferCopy2KHR} instance allocated with {@link BufferUtils}. */
    public static VkBufferCopy2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkBufferCopy2KHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkBufferCopy2KHR} instance for the specified memory address. */
    public static VkBufferCopy2KHR create(long address) {
        return wrap(VkBufferCopy2KHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBufferCopy2KHR createSafe(long address) {
        return address == NULL ? null : wrap(VkBufferCopy2KHR.class, address);
    }

    /**
     * Returns a new {@link VkBufferCopy2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferCopy2KHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBufferCopy2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferCopy2KHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferCopy2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferCopy2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkBufferCopy2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBufferCopy2KHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBufferCopy2KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkBufferCopy2KHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkBufferCopy2KHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkBufferCopy2KHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkBufferCopy2KHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkBufferCopy2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferCopy2KHR mallocStack(MemoryStack stack) {
        return wrap(VkBufferCopy2KHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkBufferCopy2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferCopy2KHR callocStack(MemoryStack stack) {
        return wrap(VkBufferCopy2KHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkBufferCopy2KHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferCopy2KHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkBufferCopy2KHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferCopy2KHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkBufferCopy2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferCopy2KHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferCopy2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferCopy2KHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkBufferCopy2KHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBufferCopy2KHR.PNEXT); }
    /** Unsafe version of {@link #srcOffset}. */
    public static long nsrcOffset(long struct) { return UNSAFE.getLong(null, struct + VkBufferCopy2KHR.SRCOFFSET); }
    /** Unsafe version of {@link #dstOffset}. */
    public static long ndstOffset(long struct) { return UNSAFE.getLong(null, struct + VkBufferCopy2KHR.DSTOFFSET); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return UNSAFE.getLong(null, struct + VkBufferCopy2KHR.SIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkBufferCopy2KHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBufferCopy2KHR.PNEXT, value); }
    /** Unsafe version of {@link #srcOffset(long) srcOffset}. */
    public static void nsrcOffset(long struct, long value) { UNSAFE.putLong(null, struct + VkBufferCopy2KHR.SRCOFFSET, value); }
    /** Unsafe version of {@link #dstOffset(long) dstOffset}. */
    public static void ndstOffset(long struct, long value) { UNSAFE.putLong(null, struct + VkBufferCopy2KHR.DSTOFFSET, value); }
    /** Unsafe version of {@link #size(long) size}. */
    public static void nsize(long struct, long value) { UNSAFE.putLong(null, struct + VkBufferCopy2KHR.SIZE, value); }

    // -----------------------------------

    /** An array of {@link VkBufferCopy2KHR} structs. */
    public static class Buffer extends StructBuffer<VkBufferCopy2KHR, Buffer> implements NativeResource {

        private static final VkBufferCopy2KHR ELEMENT_FACTORY = VkBufferCopy2KHR.create(-1L);

        /**
         * Creates a new {@code VkBufferCopy2KHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBufferCopy2KHR#SIZEOF}, and its mark will be undefined.
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
        protected VkBufferCopy2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkBufferCopy2KHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBufferCopy2KHR.nsType(address()); }
        /** @return the value of the {@link VkBufferCopy2KHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkBufferCopy2KHR.npNext(address()); }
        /** @return the value of the {@link VkBufferCopy2KHR#srcOffset} field. */
        @NativeType("VkDeviceSize")
        public long srcOffset() { return VkBufferCopy2KHR.nsrcOffset(address()); }
        /** @return the value of the {@link VkBufferCopy2KHR#dstOffset} field. */
        @NativeType("VkDeviceSize")
        public long dstOffset() { return VkBufferCopy2KHR.ndstOffset(address()); }
        /** @return the value of the {@link VkBufferCopy2KHR#size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VkBufferCopy2KHR.nsize(address()); }

        /** Sets the specified value to the {@link VkBufferCopy2KHR#sType} field. */
        public VkBufferCopy2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkBufferCopy2KHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@link VkBufferCopy2KHR#pNext} field. */
        public VkBufferCopy2KHR.Buffer pNext(@NativeType("void const *") long value) { VkBufferCopy2KHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkBufferCopy2KHR#srcOffset} field. */
        public VkBufferCopy2KHR.Buffer srcOffset(@NativeType("VkDeviceSize") long value) { VkBufferCopy2KHR.nsrcOffset(address(), value); return this; }
        /** Sets the specified value to the {@link VkBufferCopy2KHR#dstOffset} field. */
        public VkBufferCopy2KHR.Buffer dstOffset(@NativeType("VkDeviceSize") long value) { VkBufferCopy2KHR.ndstOffset(address(), value); return this; }
        /** Sets the specified value to the {@link VkBufferCopy2KHR#size} field. */
        public VkBufferCopy2KHR.Buffer size(@NativeType("VkDeviceSize") long value) { VkBufferCopy2KHR.nsize(address(), value); return this; }

    }

}