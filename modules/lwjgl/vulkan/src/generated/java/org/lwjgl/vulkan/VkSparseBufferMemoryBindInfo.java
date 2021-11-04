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
 * Structure specifying a sparse buffer memory bind operation.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
 * <li>{@code pBinds} <b>must</b> be a valid pointer to an array of {@code bindCount} valid {@link VkSparseMemoryBind} structures</li>
 * <li>{@code bindCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkBindSparseInfo}, {@link VkSparseMemoryBind}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSparseBufferMemoryBindInfo {
 *     VkBuffer {@link #buffer};
 *     uint32_t {@link #bindCount};
 *     {@link VkSparseMemoryBind VkSparseMemoryBind} const * {@link #pBinds};
 * }</code></pre>
 */
public class VkSparseBufferMemoryBindInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BUFFER,
        BINDCOUNT,
        PBINDS;

    static {
        Layout layout = __struct(
            __member(8),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BUFFER = layout.offsetof(0);
        BINDCOUNT = layout.offsetof(1);
        PBINDS = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkSparseBufferMemoryBindInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSparseBufferMemoryBindInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code VkBuffer} object to be bound. */
    @NativeType("VkBuffer")
    public long buffer() { return nbuffer(address()); }
    /** the number of {@link VkSparseMemoryBind} structures in the {@code pBinds} array. */
    @NativeType("uint32_t")
    public int bindCount() { return nbindCount(address()); }
    /** a pointer to an array of {@link VkSparseMemoryBind} structures. */
    @NativeType("VkSparseMemoryBind const *")
    public VkSparseMemoryBind.Buffer pBinds() { return npBinds(address()); }

    /** Sets the specified value to the {@link #buffer} field. */
    public VkSparseBufferMemoryBindInfo buffer(@NativeType("VkBuffer") long value) { nbuffer(address(), value); return this; }
    /** Sets the address of the specified {@link VkSparseMemoryBind.Buffer} to the {@link #pBinds} field. */
    public VkSparseBufferMemoryBindInfo pBinds(@NativeType("VkSparseMemoryBind const *") VkSparseMemoryBind.Buffer value) { npBinds(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSparseBufferMemoryBindInfo set(
        long buffer,
        VkSparseMemoryBind.Buffer pBinds
    ) {
        buffer(buffer);
        pBinds(pBinds);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSparseBufferMemoryBindInfo set(VkSparseBufferMemoryBindInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSparseBufferMemoryBindInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSparseBufferMemoryBindInfo malloc() {
        return wrap(VkSparseBufferMemoryBindInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSparseBufferMemoryBindInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSparseBufferMemoryBindInfo calloc() {
        return wrap(VkSparseBufferMemoryBindInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSparseBufferMemoryBindInfo} instance allocated with {@link BufferUtils}. */
    public static VkSparseBufferMemoryBindInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSparseBufferMemoryBindInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSparseBufferMemoryBindInfo} instance for the specified memory address. */
    public static VkSparseBufferMemoryBindInfo create(long address) {
        return wrap(VkSparseBufferMemoryBindInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSparseBufferMemoryBindInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkSparseBufferMemoryBindInfo.class, address);
    }

    /**
     * Returns a new {@link VkSparseBufferMemoryBindInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSparseBufferMemoryBindInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSparseBufferMemoryBindInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSparseBufferMemoryBindInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSparseBufferMemoryBindInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSparseBufferMemoryBindInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSparseBufferMemoryBindInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSparseBufferMemoryBindInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSparseBufferMemoryBindInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSparseBufferMemoryBindInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSparseBufferMemoryBindInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSparseBufferMemoryBindInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSparseBufferMemoryBindInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSparseBufferMemoryBindInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSparseBufferMemoryBindInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSparseBufferMemoryBindInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSparseBufferMemoryBindInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkSparseBufferMemoryBindInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSparseBufferMemoryBindInfo malloc(MemoryStack stack) {
        return wrap(VkSparseBufferMemoryBindInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSparseBufferMemoryBindInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSparseBufferMemoryBindInfo calloc(MemoryStack stack) {
        return wrap(VkSparseBufferMemoryBindInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSparseBufferMemoryBindInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSparseBufferMemoryBindInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSparseBufferMemoryBindInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSparseBufferMemoryBindInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #buffer}. */
    public static long nbuffer(long struct) { return UNSAFE.getLong(null, struct + VkSparseBufferMemoryBindInfo.BUFFER); }
    /** Unsafe version of {@link #bindCount}. */
    public static int nbindCount(long struct) { return UNSAFE.getInt(null, struct + VkSparseBufferMemoryBindInfo.BINDCOUNT); }
    /** Unsafe version of {@link #pBinds}. */
    public static VkSparseMemoryBind.Buffer npBinds(long struct) { return VkSparseMemoryBind.create(memGetAddress(struct + VkSparseBufferMemoryBindInfo.PBINDS), nbindCount(struct)); }

    /** Unsafe version of {@link #buffer(long) buffer}. */
    public static void nbuffer(long struct, long value) { UNSAFE.putLong(null, struct + VkSparseBufferMemoryBindInfo.BUFFER, value); }
    /** Sets the specified value to the {@code bindCount} field of the specified {@code struct}. */
    public static void nbindCount(long struct, int value) { UNSAFE.putInt(null, struct + VkSparseBufferMemoryBindInfo.BINDCOUNT, value); }
    /** Unsafe version of {@link #pBinds(VkSparseMemoryBind.Buffer) pBinds}. */
    public static void npBinds(long struct, VkSparseMemoryBind.Buffer value) { memPutAddress(struct + VkSparseBufferMemoryBindInfo.PBINDS, value.address()); nbindCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkSparseBufferMemoryBindInfo.PBINDS));
    }

    // -----------------------------------

    /** An array of {@link VkSparseBufferMemoryBindInfo} structs. */
    public static class Buffer extends StructBuffer<VkSparseBufferMemoryBindInfo, Buffer> implements NativeResource {

        private static final VkSparseBufferMemoryBindInfo ELEMENT_FACTORY = VkSparseBufferMemoryBindInfo.create(-1L);

        /**
         * Creates a new {@code VkSparseBufferMemoryBindInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSparseBufferMemoryBindInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkSparseBufferMemoryBindInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSparseBufferMemoryBindInfo#buffer} field. */
        @NativeType("VkBuffer")
        public long buffer() { return VkSparseBufferMemoryBindInfo.nbuffer(address()); }
        /** @return the value of the {@link VkSparseBufferMemoryBindInfo#bindCount} field. */
        @NativeType("uint32_t")
        public int bindCount() { return VkSparseBufferMemoryBindInfo.nbindCount(address()); }
        /** @return a {@link VkSparseMemoryBind.Buffer} view of the struct array pointed to by the {@link VkSparseBufferMemoryBindInfo#pBinds} field. */
        @NativeType("VkSparseMemoryBind const *")
        public VkSparseMemoryBind.Buffer pBinds() { return VkSparseBufferMemoryBindInfo.npBinds(address()); }

        /** Sets the specified value to the {@link VkSparseBufferMemoryBindInfo#buffer} field. */
        public VkSparseBufferMemoryBindInfo.Buffer buffer(@NativeType("VkBuffer") long value) { VkSparseBufferMemoryBindInfo.nbuffer(address(), value); return this; }
        /** Sets the address of the specified {@link VkSparseMemoryBind.Buffer} to the {@link VkSparseBufferMemoryBindInfo#pBinds} field. */
        public VkSparseBufferMemoryBindInfo.Buffer pBinds(@NativeType("VkSparseMemoryBind const *") VkSparseMemoryBind.Buffer value) { VkSparseBufferMemoryBindInfo.npBinds(address(), value); return this; }

    }

}