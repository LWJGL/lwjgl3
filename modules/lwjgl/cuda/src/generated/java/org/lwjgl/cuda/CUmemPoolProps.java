/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Specifies the properties of allocations made from the pool.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUmemPoolProps {
 *     CUmemAllocationType {@link #allocType};
 *     CUmemAllocationHandleType {@link #handleTypes};
 *     {@link CUmemLocation CUmemLocation} {@link #location};
 *     void * {@link #win32SecurityAttributes};
 *     unsigned char {@link #reserved}[64];
 * }</code></pre>
 */
public class CUmemPoolProps extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ALLOCTYPE,
        HANDLETYPES,
        LOCATION,
        WIN32SECURITYATTRIBUTES,
        RESERVED;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(CUmemLocation.SIZEOF, CUmemLocation.ALIGNOF),
            __member(POINTER_SIZE),
            __array(1, 64)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ALLOCTYPE = layout.offsetof(0);
        HANDLETYPES = layout.offsetof(1);
        LOCATION = layout.offsetof(2);
        WIN32SECURITYATTRIBUTES = layout.offsetof(3);
        RESERVED = layout.offsetof(4);
    }

    /**
     * Creates a {@code CUmemPoolProps} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUmemPoolProps(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** allocation type. Currently must be specified as {@link CU#CU_MEM_ALLOCATION_TYPE_PINNED MEM_ALLOCATION_TYPE_PINNED}. */
    @NativeType("CUmemAllocationType")
    public int allocType() { return nallocType(address()); }
    /** handle types that will be supported by allocations from the pool */
    @NativeType("CUmemAllocationHandleType")
    public int handleTypes() { return nhandleTypes(address()); }
    /** location where allocations should reside */
    public CUmemLocation location() { return nlocation(address()); }
    /**
     * windows-specific {@code LPSECURITYATTRIBUTES} required when {@link CU#CU_MEM_HANDLE_TYPE_WIN32 MEM_HANDLE_TYPE_WIN32} is specified. This security attribute defines the scope of which
     * exported allocations may be tranferred to other processes. In all other cases, this field is required to be zero.
     */
    @NativeType("void *")
    public long win32SecurityAttributes() { return nwin32SecurityAttributes(address()); }
    /** reserved for future use, must be 0 */
    @NativeType("unsigned char[64]")
    public ByteBuffer reserved() { return nreserved(address()); }
    /** reserved for future use, must be 0 */
    @NativeType("unsigned char")
    public byte reserved(int index) { return nreserved(address(), index); }

    /** Sets the specified value to the {@link #allocType} field. */
    public CUmemPoolProps allocType(@NativeType("CUmemAllocationType") int value) { nallocType(address(), value); return this; }
    /** Sets the specified value to the {@link #handleTypes} field. */
    public CUmemPoolProps handleTypes(@NativeType("CUmemAllocationHandleType") int value) { nhandleTypes(address(), value); return this; }
    /** Copies the specified {@link CUmemLocation} to the {@link #location} field. */
    public CUmemPoolProps location(CUmemLocation value) { nlocation(address(), value); return this; }
    /** Passes the {@link #location} field to the specified {@link java.util.function.Consumer Consumer}. */
    public CUmemPoolProps location(java.util.function.Consumer<CUmemLocation> consumer) { consumer.accept(location()); return this; }
    /** Sets the specified value to the {@link #win32SecurityAttributes} field. */
    public CUmemPoolProps win32SecurityAttributes(@NativeType("void *") long value) { nwin32SecurityAttributes(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@link #reserved} field. */
    public CUmemPoolProps reserved(@NativeType("unsigned char[64]") ByteBuffer value) { nreserved(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@link #reserved} field. */
    public CUmemPoolProps reserved(int index, @NativeType("unsigned char") byte value) { nreserved(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public CUmemPoolProps set(
        int allocType,
        int handleTypes,
        CUmemLocation location,
        long win32SecurityAttributes,
        ByteBuffer reserved
    ) {
        allocType(allocType);
        handleTypes(handleTypes);
        location(location);
        win32SecurityAttributes(win32SecurityAttributes);
        reserved(reserved);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUmemPoolProps set(CUmemPoolProps src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUmemPoolProps} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUmemPoolProps malloc() {
        return wrap(CUmemPoolProps.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CUmemPoolProps} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUmemPoolProps calloc() {
        return wrap(CUmemPoolProps.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CUmemPoolProps} instance allocated with {@link BufferUtils}. */
    public static CUmemPoolProps create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CUmemPoolProps.class, memAddress(container), container);
    }

    /** Returns a new {@code CUmemPoolProps} instance for the specified memory address. */
    public static CUmemPoolProps create(long address) {
        return wrap(CUmemPoolProps.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUmemPoolProps createSafe(long address) {
        return address == NULL ? null : wrap(CUmemPoolProps.class, address);
    }

    /**
     * Returns a new {@link CUmemPoolProps.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUmemPoolProps.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUmemPoolProps.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUmemPoolProps.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUmemPoolProps.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUmemPoolProps.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CUmemPoolProps.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUmemPoolProps.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUmemPoolProps.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code CUmemPoolProps} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUmemPoolProps malloc(MemoryStack stack) {
        return wrap(CUmemPoolProps.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CUmemPoolProps} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUmemPoolProps calloc(MemoryStack stack) {
        return wrap(CUmemPoolProps.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CUmemPoolProps.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUmemPoolProps.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUmemPoolProps.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUmemPoolProps.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #allocType}. */
    public static int nallocType(long struct) { return UNSAFE.getInt(null, struct + CUmemPoolProps.ALLOCTYPE); }
    /** Unsafe version of {@link #handleTypes}. */
    public static int nhandleTypes(long struct) { return UNSAFE.getInt(null, struct + CUmemPoolProps.HANDLETYPES); }
    /** Unsafe version of {@link #location}. */
    public static CUmemLocation nlocation(long struct) { return CUmemLocation.create(struct + CUmemPoolProps.LOCATION); }
    /** Unsafe version of {@link #win32SecurityAttributes}. */
    public static long nwin32SecurityAttributes(long struct) { return memGetAddress(struct + CUmemPoolProps.WIN32SECURITYATTRIBUTES); }
    /** Unsafe version of {@link #reserved}. */
    public static ByteBuffer nreserved(long struct) { return memByteBuffer(struct + CUmemPoolProps.RESERVED, 64); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static byte nreserved(long struct, int index) {
        return UNSAFE.getByte(null, struct + CUmemPoolProps.RESERVED + check(index, 64) * 1);
    }

    /** Unsafe version of {@link #allocType(int) allocType}. */
    public static void nallocType(long struct, int value) { UNSAFE.putInt(null, struct + CUmemPoolProps.ALLOCTYPE, value); }
    /** Unsafe version of {@link #handleTypes(int) handleTypes}. */
    public static void nhandleTypes(long struct, int value) { UNSAFE.putInt(null, struct + CUmemPoolProps.HANDLETYPES, value); }
    /** Unsafe version of {@link #location(CUmemLocation) location}. */
    public static void nlocation(long struct, CUmemLocation value) { memCopy(value.address(), struct + CUmemPoolProps.LOCATION, CUmemLocation.SIZEOF); }
    /** Unsafe version of {@link #win32SecurityAttributes(long) win32SecurityAttributes}. */
    public static void nwin32SecurityAttributes(long struct, long value) { memPutAddress(struct + CUmemPoolProps.WIN32SECURITYATTRIBUTES, value); }
    /** Unsafe version of {@link #reserved(ByteBuffer) reserved}. */
    public static void nreserved(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 64); }
        memCopy(memAddress(value), struct + CUmemPoolProps.RESERVED, value.remaining() * 1);
    }
    /** Unsafe version of {@link #reserved(int, byte) reserved}. */
    public static void nreserved(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + CUmemPoolProps.RESERVED + check(index, 64) * 1, value);
    }

    // -----------------------------------

    /** An array of {@link CUmemPoolProps} structs. */
    public static class Buffer extends StructBuffer<CUmemPoolProps, Buffer> implements NativeResource {

        private static final CUmemPoolProps ELEMENT_FACTORY = CUmemPoolProps.create(-1L);

        /**
         * Creates a new {@code CUmemPoolProps.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUmemPoolProps#SIZEOF}, and its mark will be undefined.
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
        protected CUmemPoolProps getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link CUmemPoolProps#allocType} field. */
        @NativeType("CUmemAllocationType")
        public int allocType() { return CUmemPoolProps.nallocType(address()); }
        /** @return the value of the {@link CUmemPoolProps#handleTypes} field. */
        @NativeType("CUmemAllocationHandleType")
        public int handleTypes() { return CUmemPoolProps.nhandleTypes(address()); }
        /** @return a {@link CUmemLocation} view of the {@link CUmemPoolProps#location} field. */
        public CUmemLocation location() { return CUmemPoolProps.nlocation(address()); }
        /** @return the value of the {@link CUmemPoolProps#win32SecurityAttributes} field. */
        @NativeType("void *")
        public long win32SecurityAttributes() { return CUmemPoolProps.nwin32SecurityAttributes(address()); }
        /** @return a {@link ByteBuffer} view of the {@link CUmemPoolProps#reserved} field. */
        @NativeType("unsigned char[64]")
        public ByteBuffer reserved() { return CUmemPoolProps.nreserved(address()); }
        /** @return the value at the specified index of the {@link CUmemPoolProps#reserved} field. */
        @NativeType("unsigned char")
        public byte reserved(int index) { return CUmemPoolProps.nreserved(address(), index); }

        /** Sets the specified value to the {@link CUmemPoolProps#allocType} field. */
        public CUmemPoolProps.Buffer allocType(@NativeType("CUmemAllocationType") int value) { CUmemPoolProps.nallocType(address(), value); return this; }
        /** Sets the specified value to the {@link CUmemPoolProps#handleTypes} field. */
        public CUmemPoolProps.Buffer handleTypes(@NativeType("CUmemAllocationHandleType") int value) { CUmemPoolProps.nhandleTypes(address(), value); return this; }
        /** Copies the specified {@link CUmemLocation} to the {@link CUmemPoolProps#location} field. */
        public CUmemPoolProps.Buffer location(CUmemLocation value) { CUmemPoolProps.nlocation(address(), value); return this; }
        /** Passes the {@link CUmemPoolProps#location} field to the specified {@link java.util.function.Consumer Consumer}. */
        public CUmemPoolProps.Buffer location(java.util.function.Consumer<CUmemLocation> consumer) { consumer.accept(location()); return this; }
        /** Sets the specified value to the {@link CUmemPoolProps#win32SecurityAttributes} field. */
        public CUmemPoolProps.Buffer win32SecurityAttributes(@NativeType("void *") long value) { CUmemPoolProps.nwin32SecurityAttributes(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@link CUmemPoolProps#reserved} field. */
        public CUmemPoolProps.Buffer reserved(@NativeType("unsigned char[64]") ByteBuffer value) { CUmemPoolProps.nreserved(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@link CUmemPoolProps#reserved} field. */
        public CUmemPoolProps.Buffer reserved(int index, @NativeType("unsigned char") byte value) { CUmemPoolProps.nreserved(address(), index, value); return this; }

    }

}