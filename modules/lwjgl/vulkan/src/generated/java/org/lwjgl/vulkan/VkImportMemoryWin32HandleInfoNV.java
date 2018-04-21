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

import org.lwjgl.system.windows.*;

/**
 * import Win32 memory created on the same physical device.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code handleType} is 0, this structure is ignored by consumers of the {@link VkMemoryAllocateInfo} structure it is chained from.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code handleType} <b>must</b> not have more than one bit set.</li>
 * <li>{@code handle} <b>must</b> be a valid handle to memory, obtained as specified by {@code handleType}.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVExternalMemoryWin32#VK_STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_NV STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_NV}</li>
 * <li>{@code handleType} <b>must</b> be a valid combination of {@code VkExternalMemoryHandleTypeFlagBitsNV} values</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code handleType} &ndash; 0 or a {@code VkExternalMemoryHandleTypeFlagBitsNV} value specifying the type of memory handle in {@code handle}.</li>
 * <li>{@code handle} &ndash; a Windows {@code HANDLE} referring to the memory.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkImportMemoryWin32HandleInfoNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkExternalMemoryHandleTypeFlagsNV handleType;
 *     HANDLE handle;
 * }</pre></code>
 */
public class VkImportMemoryWin32HandleInfoNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        HANDLETYPE,
        HANDLE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        HANDLETYPE = layout.offsetof(2);
        HANDLE = layout.offsetof(3);
    }

    VkImportMemoryWin32HandleInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkImportMemoryWin32HandleInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImportMemoryWin32HandleInfoNV(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code handleType} field. */
    @NativeType("VkExternalMemoryHandleTypeFlagsNV")
    public int handleType() { return nhandleType(address()); }
    /** Returns the value of the {@code handle} field. */
    @NativeType("HANDLE")
    public long handle() { return nhandle(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkImportMemoryWin32HandleInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkImportMemoryWin32HandleInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code handleType} field. */
    public VkImportMemoryWin32HandleInfoNV handleType(@NativeType("VkExternalMemoryHandleTypeFlagsNV") int value) { nhandleType(address(), value); return this; }
    /** Sets the specified value to the {@code handle} field. */
    public VkImportMemoryWin32HandleInfoNV handle(@NativeType("HANDLE") long value) { nhandle(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImportMemoryWin32HandleInfoNV set(
        int sType,
        long pNext,
        int handleType,
        long handle
    ) {
        sType(sType);
        pNext(pNext);
        handleType(handleType);
        handle(handle);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImportMemoryWin32HandleInfoNV set(VkImportMemoryWin32HandleInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkImportMemoryWin32HandleInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImportMemoryWin32HandleInfoNV malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkImportMemoryWin32HandleInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImportMemoryWin32HandleInfoNV calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkImportMemoryWin32HandleInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkImportMemoryWin32HandleInfoNV create() {
        return new VkImportMemoryWin32HandleInfoNV(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkImportMemoryWin32HandleInfoNV} instance for the specified memory address. */
    public static VkImportMemoryWin32HandleInfoNV create(long address) {
        return new VkImportMemoryWin32HandleInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImportMemoryWin32HandleInfoNV createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkImportMemoryWin32HandleInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryWin32HandleInfoNV.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportMemoryWin32HandleInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryWin32HandleInfoNV.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportMemoryWin32HandleInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryWin32HandleInfoNV.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkImportMemoryWin32HandleInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryWin32HandleInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImportMemoryWin32HandleInfoNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkImportMemoryWin32HandleInfoNV} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkImportMemoryWin32HandleInfoNV mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkImportMemoryWin32HandleInfoNV} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkImportMemoryWin32HandleInfoNV callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkImportMemoryWin32HandleInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImportMemoryWin32HandleInfoNV mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkImportMemoryWin32HandleInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImportMemoryWin32HandleInfoNV callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImportMemoryWin32HandleInfoNV.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryWin32HandleInfoNV.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImportMemoryWin32HandleInfoNV.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryWin32HandleInfoNV.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImportMemoryWin32HandleInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryWin32HandleInfoNV.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportMemoryWin32HandleInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryWin32HandleInfoNV.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkImportMemoryWin32HandleInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImportMemoryWin32HandleInfoNV.PNEXT); }
    /** Unsafe version of {@link #handleType}. */
    public static int nhandleType(long struct) { return memGetInt(struct + VkImportMemoryWin32HandleInfoNV.HANDLETYPE); }
    /** Unsafe version of {@link #handle}. */
    public static long nhandle(long struct) { return memGetAddress(struct + VkImportMemoryWin32HandleInfoNV.HANDLE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkImportMemoryWin32HandleInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImportMemoryWin32HandleInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #handleType(int) handleType}. */
    public static void nhandleType(long struct, int value) { memPutInt(struct + VkImportMemoryWin32HandleInfoNV.HANDLETYPE, value); }
    /** Unsafe version of {@link #handle(long) handle}. */
    public static void nhandle(long struct, long value) { memPutAddress(struct + VkImportMemoryWin32HandleInfoNV.HANDLE, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkImportMemoryWin32HandleInfoNV.HANDLE));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + i * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkImportMemoryWin32HandleInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkImportMemoryWin32HandleInfoNV, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkImportMemoryWin32HandleInfoNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImportMemoryWin32HandleInfoNV#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VkImportMemoryWin32HandleInfoNV newInstance(long address) {
            return new VkImportMemoryWin32HandleInfoNV(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImportMemoryWin32HandleInfoNV.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImportMemoryWin32HandleInfoNV.npNext(address()); }
        /** Returns the value of the {@code handleType} field. */
        @NativeType("VkExternalMemoryHandleTypeFlagsNV")
        public int handleType() { return VkImportMemoryWin32HandleInfoNV.nhandleType(address()); }
        /** Returns the value of the {@code handle} field. */
        @NativeType("HANDLE")
        public long handle() { return VkImportMemoryWin32HandleInfoNV.nhandle(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkImportMemoryWin32HandleInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkImportMemoryWin32HandleInfoNV.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkImportMemoryWin32HandleInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkImportMemoryWin32HandleInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code handleType} field. */
        public VkImportMemoryWin32HandleInfoNV.Buffer handleType(@NativeType("VkExternalMemoryHandleTypeFlagsNV") int value) { VkImportMemoryWin32HandleInfoNV.nhandleType(address(), value); return this; }
        /** Sets the specified value to the {@code handle} field. */
        public VkImportMemoryWin32HandleInfoNV.Buffer handle(@NativeType("HANDLE") long value) { VkImportMemoryWin32HandleInfoNV.nhandle(address(), value); return this; }

    }

}