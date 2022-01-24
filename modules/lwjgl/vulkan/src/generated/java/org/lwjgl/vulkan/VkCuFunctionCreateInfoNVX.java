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
 * Stub description of VkCuFunctionCreateInfoNVX.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVXBinaryImport#VK_STRUCTURE_TYPE_CU_FUNCTION_CREATE_INFO_NVX STRUCTURE_TYPE_CU_FUNCTION_CREATE_INFO_NVX}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code module} <b>must</b> be a valid {@code VkCuModuleNVX} handle</li>
 * <li>{@code pName} <b>must</b> be a null-terminated UTF-8 string</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link NVXBinaryImport#vkCreateCuFunctionNVX CreateCuFunctionNVX}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCuFunctionCreateInfoNVX {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkCuModuleNVX module;
 *     char const * pName;
 * }</code></pre>
 */
public class VkCuFunctionCreateInfoNVX extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MODULE,
        PNAME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MODULE = layout.offsetof(2);
        PNAME = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkCuFunctionCreateInfoNVX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCuFunctionCreateInfoNVX(ByteBuffer container) {
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
    /** @return the value of the {@code module} field. */
    @NativeType("VkCuModuleNVX")
    public long module() { return nmodule(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pName} field. */
    @NativeType("char const *")
    public ByteBuffer pName() { return npName(address()); }
    /** @return the null-terminated string pointed to by the {@code pName} field. */
    @NativeType("char const *")
    public String pNameString() { return npNameString(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkCuFunctionCreateInfoNVX sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVXBinaryImport#VK_STRUCTURE_TYPE_CU_FUNCTION_CREATE_INFO_NVX STRUCTURE_TYPE_CU_FUNCTION_CREATE_INFO_NVX} value to the {@code sType} field. */
    public VkCuFunctionCreateInfoNVX sType$Default() { return sType(NVXBinaryImport.VK_STRUCTURE_TYPE_CU_FUNCTION_CREATE_INFO_NVX); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkCuFunctionCreateInfoNVX pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code module} field. */
    public VkCuFunctionCreateInfoNVX module(@NativeType("VkCuModuleNVX") long value) { nmodule(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code pName} field. */
    public VkCuFunctionCreateInfoNVX pName(@NativeType("char const *") ByteBuffer value) { npName(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCuFunctionCreateInfoNVX set(
        int sType,
        long pNext,
        long module,
        ByteBuffer pName
    ) {
        sType(sType);
        pNext(pNext);
        module(module);
        pName(pName);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCuFunctionCreateInfoNVX set(VkCuFunctionCreateInfoNVX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCuFunctionCreateInfoNVX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCuFunctionCreateInfoNVX malloc() {
        return wrap(VkCuFunctionCreateInfoNVX.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkCuFunctionCreateInfoNVX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCuFunctionCreateInfoNVX calloc() {
        return wrap(VkCuFunctionCreateInfoNVX.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkCuFunctionCreateInfoNVX} instance allocated with {@link BufferUtils}. */
    public static VkCuFunctionCreateInfoNVX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkCuFunctionCreateInfoNVX.class, memAddress(container), container);
    }

    /** Returns a new {@code VkCuFunctionCreateInfoNVX} instance for the specified memory address. */
    public static VkCuFunctionCreateInfoNVX create(long address) {
        return wrap(VkCuFunctionCreateInfoNVX.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCuFunctionCreateInfoNVX createSafe(long address) {
        return address == NULL ? null : wrap(VkCuFunctionCreateInfoNVX.class, address);
    }

    /**
     * Returns a new {@link VkCuFunctionCreateInfoNVX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCuFunctionCreateInfoNVX.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCuFunctionCreateInfoNVX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCuFunctionCreateInfoNVX.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCuFunctionCreateInfoNVX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCuFunctionCreateInfoNVX.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkCuFunctionCreateInfoNVX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCuFunctionCreateInfoNVX.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCuFunctionCreateInfoNVX.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkCuFunctionCreateInfoNVX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCuFunctionCreateInfoNVX malloc(MemoryStack stack) {
        return wrap(VkCuFunctionCreateInfoNVX.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkCuFunctionCreateInfoNVX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCuFunctionCreateInfoNVX calloc(MemoryStack stack) {
        return wrap(VkCuFunctionCreateInfoNVX.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkCuFunctionCreateInfoNVX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCuFunctionCreateInfoNVX.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCuFunctionCreateInfoNVX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCuFunctionCreateInfoNVX.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkCuFunctionCreateInfoNVX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCuFunctionCreateInfoNVX.PNEXT); }
    /** Unsafe version of {@link #module}. */
    public static long nmodule(long struct) { return UNSAFE.getLong(null, struct + VkCuFunctionCreateInfoNVX.MODULE); }
    /** Unsafe version of {@link #pName}. */
    public static ByteBuffer npName(long struct) { return memByteBufferNT1(memGetAddress(struct + VkCuFunctionCreateInfoNVX.PNAME)); }
    /** Unsafe version of {@link #pNameString}. */
    public static String npNameString(long struct) { return memUTF8(memGetAddress(struct + VkCuFunctionCreateInfoNVX.PNAME)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkCuFunctionCreateInfoNVX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCuFunctionCreateInfoNVX.PNEXT, value); }
    /** Unsafe version of {@link #module(long) module}. */
    public static void nmodule(long struct, long value) { UNSAFE.putLong(null, struct + VkCuFunctionCreateInfoNVX.MODULE, value); }
    /** Unsafe version of {@link #pName(ByteBuffer) pName}. */
    public static void npName(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + VkCuFunctionCreateInfoNVX.PNAME, memAddress(value));
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkCuFunctionCreateInfoNVX.PNAME));
    }

    // -----------------------------------

    /** An array of {@link VkCuFunctionCreateInfoNVX} structs. */
    public static class Buffer extends StructBuffer<VkCuFunctionCreateInfoNVX, Buffer> implements NativeResource {

        private static final VkCuFunctionCreateInfoNVX ELEMENT_FACTORY = VkCuFunctionCreateInfoNVX.create(-1L);

        /**
         * Creates a new {@code VkCuFunctionCreateInfoNVX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCuFunctionCreateInfoNVX#SIZEOF}, and its mark will be undefined.
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
        protected VkCuFunctionCreateInfoNVX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCuFunctionCreateInfoNVX.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCuFunctionCreateInfoNVX.npNext(address()); }
        /** @return the value of the {@code module} field. */
        @NativeType("VkCuModuleNVX")
        public long module() { return VkCuFunctionCreateInfoNVX.nmodule(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pName} field. */
        @NativeType("char const *")
        public ByteBuffer pName() { return VkCuFunctionCreateInfoNVX.npName(address()); }
        /** @return the null-terminated string pointed to by the {@code pName} field. */
        @NativeType("char const *")
        public String pNameString() { return VkCuFunctionCreateInfoNVX.npNameString(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkCuFunctionCreateInfoNVX.Buffer sType(@NativeType("VkStructureType") int value) { VkCuFunctionCreateInfoNVX.nsType(address(), value); return this; }
        /** Sets the {@link NVXBinaryImport#VK_STRUCTURE_TYPE_CU_FUNCTION_CREATE_INFO_NVX STRUCTURE_TYPE_CU_FUNCTION_CREATE_INFO_NVX} value to the {@code sType} field. */
        public VkCuFunctionCreateInfoNVX.Buffer sType$Default() { return sType(NVXBinaryImport.VK_STRUCTURE_TYPE_CU_FUNCTION_CREATE_INFO_NVX); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkCuFunctionCreateInfoNVX.Buffer pNext(@NativeType("void const *") long value) { VkCuFunctionCreateInfoNVX.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code module} field. */
        public VkCuFunctionCreateInfoNVX.Buffer module(@NativeType("VkCuModuleNVX") long value) { VkCuFunctionCreateInfoNVX.nmodule(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code pName} field. */
        public VkCuFunctionCreateInfoNVX.Buffer pName(@NativeType("char const *") ByteBuffer value) { VkCuFunctionCreateInfoNVX.npName(address(), value); return this; }

    }

}