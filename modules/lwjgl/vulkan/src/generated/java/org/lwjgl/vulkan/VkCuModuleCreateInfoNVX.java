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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCuModuleCreateInfoNVX {
 *     VkStructureType sType;
 *     void const * pNext;
 *     size_t dataSize;
 *     void const * pData;
 * }</code></pre>
 */
public class VkCuModuleCreateInfoNVX extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DATASIZE,
        PDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DATASIZE = layout.offsetof(2);
        PDATA = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkCuModuleCreateInfoNVX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCuModuleCreateInfoNVX(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code dataSize} field. */
    @NativeType("size_t")
    public long dataSize() { return ndataSize(address()); }
    /** @return the value of the {@code pData} field. */
    @NativeType("void const *")
    public long pData() { return npData(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkCuModuleCreateInfoNVX sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkCuModuleCreateInfoNVX pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code dataSize} field. */
    public VkCuModuleCreateInfoNVX dataSize(@NativeType("size_t") long value) { ndataSize(address(), value); return this; }
    /** Sets the specified value to the {@code pData} field. */
    public VkCuModuleCreateInfoNVX pData(@NativeType("void const *") long value) { npData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCuModuleCreateInfoNVX set(
        int sType,
        long pNext,
        long dataSize,
        long pData
    ) {
        sType(sType);
        pNext(pNext);
        dataSize(dataSize);
        pData(pData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCuModuleCreateInfoNVX set(VkCuModuleCreateInfoNVX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCuModuleCreateInfoNVX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCuModuleCreateInfoNVX malloc() {
        return wrap(VkCuModuleCreateInfoNVX.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkCuModuleCreateInfoNVX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCuModuleCreateInfoNVX calloc() {
        return wrap(VkCuModuleCreateInfoNVX.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkCuModuleCreateInfoNVX} instance allocated with {@link BufferUtils}. */
    public static VkCuModuleCreateInfoNVX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkCuModuleCreateInfoNVX.class, memAddress(container), container);
    }

    /** Returns a new {@code VkCuModuleCreateInfoNVX} instance for the specified memory address. */
    public static VkCuModuleCreateInfoNVX create(long address) {
        return wrap(VkCuModuleCreateInfoNVX.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCuModuleCreateInfoNVX createSafe(long address) {
        return address == NULL ? null : wrap(VkCuModuleCreateInfoNVX.class, address);
    }

    /**
     * Returns a new {@link VkCuModuleCreateInfoNVX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCuModuleCreateInfoNVX.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCuModuleCreateInfoNVX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCuModuleCreateInfoNVX.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCuModuleCreateInfoNVX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCuModuleCreateInfoNVX.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkCuModuleCreateInfoNVX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCuModuleCreateInfoNVX.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCuModuleCreateInfoNVX.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkCuModuleCreateInfoNVX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkCuModuleCreateInfoNVX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkCuModuleCreateInfoNVX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkCuModuleCreateInfoNVX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkCuModuleCreateInfoNVX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCuModuleCreateInfoNVX mallocStack(MemoryStack stack) {
        return wrap(VkCuModuleCreateInfoNVX.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkCuModuleCreateInfoNVX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCuModuleCreateInfoNVX callocStack(MemoryStack stack) {
        return wrap(VkCuModuleCreateInfoNVX.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkCuModuleCreateInfoNVX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCuModuleCreateInfoNVX.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkCuModuleCreateInfoNVX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkCuModuleCreateInfoNVX.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkCuModuleCreateInfoNVX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCuModuleCreateInfoNVX.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCuModuleCreateInfoNVX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCuModuleCreateInfoNVX.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkCuModuleCreateInfoNVX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCuModuleCreateInfoNVX.PNEXT); }
    /** Unsafe version of {@link #dataSize}. */
    public static long ndataSize(long struct) { return memGetAddress(struct + VkCuModuleCreateInfoNVX.DATASIZE); }
    /** Unsafe version of {@link #pData}. */
    public static long npData(long struct) { return memGetAddress(struct + VkCuModuleCreateInfoNVX.PDATA); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkCuModuleCreateInfoNVX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCuModuleCreateInfoNVX.PNEXT, value); }
    /** Unsafe version of {@link #dataSize(long) dataSize}. */
    public static void ndataSize(long struct, long value) { memPutAddress(struct + VkCuModuleCreateInfoNVX.DATASIZE, value); }
    /** Unsafe version of {@link #pData(long) pData}. */
    public static void npData(long struct, long value) { memPutAddress(struct + VkCuModuleCreateInfoNVX.PDATA, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkCuModuleCreateInfoNVX.PDATA));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkCuModuleCreateInfoNVX} structs. */
    public static class Buffer extends StructBuffer<VkCuModuleCreateInfoNVX, Buffer> implements NativeResource {

        private static final VkCuModuleCreateInfoNVX ELEMENT_FACTORY = VkCuModuleCreateInfoNVX.create(-1L);

        /**
         * Creates a new {@code VkCuModuleCreateInfoNVX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCuModuleCreateInfoNVX#SIZEOF}, and its mark will be undefined.
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
        protected VkCuModuleCreateInfoNVX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCuModuleCreateInfoNVX.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCuModuleCreateInfoNVX.npNext(address()); }
        /** @return the value of the {@code dataSize} field. */
        @NativeType("size_t")
        public long dataSize() { return VkCuModuleCreateInfoNVX.ndataSize(address()); }
        /** @return the value of the {@code pData} field. */
        @NativeType("void const *")
        public long pData() { return VkCuModuleCreateInfoNVX.npData(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkCuModuleCreateInfoNVX.Buffer sType(@NativeType("VkStructureType") int value) { VkCuModuleCreateInfoNVX.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkCuModuleCreateInfoNVX.Buffer pNext(@NativeType("void const *") long value) { VkCuModuleCreateInfoNVX.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code dataSize} field. */
        public VkCuModuleCreateInfoNVX.Buffer dataSize(@NativeType("size_t") long value) { VkCuModuleCreateInfoNVX.ndataSize(address(), value); return this; }
        /** Sets the specified value to the {@code pData} field. */
        public VkCuModuleCreateInfoNVX.Buffer pData(@NativeType("void const *") long value) { VkCuModuleCreateInfoNVX.npData(address(), value); return this; }

    }

}