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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying where to return memory binding status.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@code pNext} chain of {@link VkBindBufferMemoryInfo} or {@link VkBindImageMemoryInfo} includes a {@link VkBindMemoryStatusKHR} structure, then the {@link VkBindMemoryStatusKHR}{@code ::pResult} will be populated with a value describing the result of the corresponding memory binding operation.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRMaintenance6#VK_STRUCTURE_TYPE_BIND_MEMORY_STATUS_KHR STRUCTURE_TYPE_BIND_MEMORY_STATUS_KHR}</li>
 * <li>{@code pResult} <b>must</b> be a valid pointer to a {@code VkResult} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkBindMemoryStatusKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkResult * {@link #pResult};
 * }</code></pre>
 */
public class VkBindMemoryStatusKHR extends Struct<VkBindMemoryStatusKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PRESULT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRESULT = layout.offsetof(2);
    }

    protected VkBindMemoryStatusKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkBindMemoryStatusKHR create(long address, @Nullable ByteBuffer container) {
        return new VkBindMemoryStatusKHR(address, container);
    }

    /**
     * Creates a {@code VkBindMemoryStatusKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBindMemoryStatusKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /**
     * @param capacity the number of elements in the returned buffer
     *
     * @return a pointer to a {@code VkResult} value.
     */
    @NativeType("VkResult *")
    public IntBuffer pResult(int capacity) { return npResult(address(), capacity); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkBindMemoryStatusKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRMaintenance6#VK_STRUCTURE_TYPE_BIND_MEMORY_STATUS_KHR STRUCTURE_TYPE_BIND_MEMORY_STATUS_KHR} value to the {@link #sType} field. */
    public VkBindMemoryStatusKHR sType$Default() { return sType(KHRMaintenance6.VK_STRUCTURE_TYPE_BIND_MEMORY_STATUS_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkBindMemoryStatusKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pResult} field. */
    public VkBindMemoryStatusKHR pResult(@NativeType("VkResult *") IntBuffer value) { npResult(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBindMemoryStatusKHR set(
        int sType,
        long pNext,
        IntBuffer pResult
    ) {
        sType(sType);
        pNext(pNext);
        pResult(pResult);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBindMemoryStatusKHR set(VkBindMemoryStatusKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBindMemoryStatusKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBindMemoryStatusKHR malloc() {
        return new VkBindMemoryStatusKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkBindMemoryStatusKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBindMemoryStatusKHR calloc() {
        return new VkBindMemoryStatusKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkBindMemoryStatusKHR} instance allocated with {@link BufferUtils}. */
    public static VkBindMemoryStatusKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindMemoryStatusKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkBindMemoryStatusKHR} instance for the specified memory address. */
    public static VkBindMemoryStatusKHR create(long address) {
        return new VkBindMemoryStatusKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindMemoryStatusKHR createSafe(long address) {
        return address == NULL ? null : new VkBindMemoryStatusKHR(address, null);
    }

    /**
     * Returns a new {@link VkBindMemoryStatusKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindMemoryStatusKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBindMemoryStatusKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindMemoryStatusKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindMemoryStatusKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindMemoryStatusKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkBindMemoryStatusKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBindMemoryStatusKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindMemoryStatusKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkBindMemoryStatusKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindMemoryStatusKHR malloc(MemoryStack stack) {
        return new VkBindMemoryStatusKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkBindMemoryStatusKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindMemoryStatusKHR calloc(MemoryStack stack) {
        return new VkBindMemoryStatusKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkBindMemoryStatusKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindMemoryStatusKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindMemoryStatusKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindMemoryStatusKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkBindMemoryStatusKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBindMemoryStatusKHR.PNEXT); }
    /** Unsafe version of {@link #pResult(int) pResult}. */
    public static IntBuffer npResult(long struct, int capacity) { return memIntBuffer(memGetAddress(struct + VkBindMemoryStatusKHR.PRESULT), capacity); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkBindMemoryStatusKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBindMemoryStatusKHR.PNEXT, value); }
    /** Unsafe version of {@link #pResult(IntBuffer) pResult}. */
    public static void npResult(long struct, IntBuffer value) { memPutAddress(struct + VkBindMemoryStatusKHR.PRESULT, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkBindMemoryStatusKHR.PRESULT));
    }

    // -----------------------------------

    /** An array of {@link VkBindMemoryStatusKHR} structs. */
    public static class Buffer extends StructBuffer<VkBindMemoryStatusKHR, Buffer> implements NativeResource {

        private static final VkBindMemoryStatusKHR ELEMENT_FACTORY = VkBindMemoryStatusKHR.create(-1L);

        /**
         * Creates a new {@code VkBindMemoryStatusKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBindMemoryStatusKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkBindMemoryStatusKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkBindMemoryStatusKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBindMemoryStatusKHR.nsType(address()); }
        /** @return the value of the {@link VkBindMemoryStatusKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkBindMemoryStatusKHR.npNext(address()); }
        /**
         * @return a {@link IntBuffer} view of the data pointed to by the {@link VkBindMemoryStatusKHR#pResult} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("VkResult *")
        public IntBuffer pResult(int capacity) { return VkBindMemoryStatusKHR.npResult(address(), capacity); }

        /** Sets the specified value to the {@link VkBindMemoryStatusKHR#sType} field. */
        public VkBindMemoryStatusKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkBindMemoryStatusKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRMaintenance6#VK_STRUCTURE_TYPE_BIND_MEMORY_STATUS_KHR STRUCTURE_TYPE_BIND_MEMORY_STATUS_KHR} value to the {@link VkBindMemoryStatusKHR#sType} field. */
        public VkBindMemoryStatusKHR.Buffer sType$Default() { return sType(KHRMaintenance6.VK_STRUCTURE_TYPE_BIND_MEMORY_STATUS_KHR); }
        /** Sets the specified value to the {@link VkBindMemoryStatusKHR#pNext} field. */
        public VkBindMemoryStatusKHR.Buffer pNext(@NativeType("void const *") long value) { VkBindMemoryStatusKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VkBindMemoryStatusKHR#pResult} field. */
        public VkBindMemoryStatusKHR.Buffer pResult(@NativeType("VkResult *") IntBuffer value) { VkBindMemoryStatusKHR.npResult(address(), value); return this; }

    }

}