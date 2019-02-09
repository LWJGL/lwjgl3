/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Contains the security descriptor for an object and specifies whether the handle retrieved by specifying this structure is inheritable. This structure
 * provides security settings for objects created by various functions, such as {@code CreateFile}, {@code CreatePipe}, {@code CreateProcess},
 * {@code RegCreateKeyEx}, or {@code RegSaveKeyEx}.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code nLength} &ndash; the size, in bytes, of this structure. Set this value to {@link #SIZEOF}.</li>
 * <li>{@code lpSecurityDescriptor} &ndash; 
 * a pointer to a {@code SECURITY_DESCRIPTOR} structure that controls access to the object. If the value of this member is {@code NULL}, the object is assigned
 * the default security descriptor associated with the access token of the calling process. This is not the same as granting access to everyone by
 * assigning a {@code NULL} discretionary access control list (DACL). By default, the default DACL in the access token of a process allows access only to the
 * user represented by the access token.</li>
 * <li>{@code bInheritHandle} &ndash; specifies whether the returned handle is inherited when a new process is created. If this member is {@code TRUE}, the new process inherits the handle.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct SECURITY_ATTRIBUTES {
 *     DWORD nLength;
 *     LPVOID lpSecurityDescriptor;
 *     BOOL bInheritHandle;
 * }</code></pre>
 */
public class SECURITY_ATTRIBUTES extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NLENGTH,
        LPSECURITYDESCRIPTOR,
        BINHERITHANDLE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NLENGTH = layout.offsetof(0);
        LPSECURITYDESCRIPTOR = layout.offsetof(1);
        BINHERITHANDLE = layout.offsetof(2);
    }

    /**
     * Creates a {@code SECURITY_ATTRIBUTES} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SECURITY_ATTRIBUTES(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code nLength} field. */
    @NativeType("DWORD")
    public int nLength() { return nnLength(address()); }
    /** Returns the value of the {@code lpSecurityDescriptor} field. */
    @NativeType("LPVOID")
    public long lpSecurityDescriptor() { return nlpSecurityDescriptor(address()); }
    /** Returns the value of the {@code bInheritHandle} field. */
    @NativeType("BOOL")
    public boolean bInheritHandle() { return nbInheritHandle(address()) != 0; }

    /** Sets the specified value to the {@code nLength} field. */
    public SECURITY_ATTRIBUTES nLength(@NativeType("DWORD") int value) { nnLength(address(), value); return this; }
    /** Sets the specified value to the {@code lpSecurityDescriptor} field. */
    public SECURITY_ATTRIBUTES lpSecurityDescriptor(@NativeType("LPVOID") long value) { nlpSecurityDescriptor(address(), value); return this; }
    /** Sets the specified value to the {@code bInheritHandle} field. */
    public SECURITY_ATTRIBUTES bInheritHandle(@NativeType("BOOL") boolean value) { nbInheritHandle(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public SECURITY_ATTRIBUTES set(
        int nLength,
        long lpSecurityDescriptor,
        boolean bInheritHandle
    ) {
        nLength(nLength);
        lpSecurityDescriptor(lpSecurityDescriptor);
        bInheritHandle(bInheritHandle);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SECURITY_ATTRIBUTES set(SECURITY_ATTRIBUTES src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SECURITY_ATTRIBUTES} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SECURITY_ATTRIBUTES malloc() {
        return wrap(SECURITY_ATTRIBUTES.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code SECURITY_ATTRIBUTES} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SECURITY_ATTRIBUTES calloc() {
        return wrap(SECURITY_ATTRIBUTES.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code SECURITY_ATTRIBUTES} instance allocated with {@link BufferUtils}. */
    public static SECURITY_ATTRIBUTES create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(SECURITY_ATTRIBUTES.class, memAddress(container), container);
    }

    /** Returns a new {@code SECURITY_ATTRIBUTES} instance for the specified memory address. */
    public static SECURITY_ATTRIBUTES create(long address) {
        return wrap(SECURITY_ATTRIBUTES.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SECURITY_ATTRIBUTES createSafe(long address) {
        return address == NULL ? null : wrap(SECURITY_ATTRIBUTES.class, address);
    }

    /**
     * Returns a new {@link SECURITY_ATTRIBUTES.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SECURITY_ATTRIBUTES.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SECURITY_ATTRIBUTES.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SECURITY_ATTRIBUTES.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SECURITY_ATTRIBUTES.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SECURITY_ATTRIBUTES.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link SECURITY_ATTRIBUTES.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SECURITY_ATTRIBUTES.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SECURITY_ATTRIBUTES.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code SECURITY_ATTRIBUTES} instance allocated on the thread-local {@link MemoryStack}. */
    public static SECURITY_ATTRIBUTES mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code SECURITY_ATTRIBUTES} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static SECURITY_ATTRIBUTES callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code SECURITY_ATTRIBUTES} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SECURITY_ATTRIBUTES mallocStack(MemoryStack stack) {
        return wrap(SECURITY_ATTRIBUTES.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code SECURITY_ATTRIBUTES} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SECURITY_ATTRIBUTES callocStack(MemoryStack stack) {
        return wrap(SECURITY_ATTRIBUTES.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link SECURITY_ATTRIBUTES.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static SECURITY_ATTRIBUTES.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link SECURITY_ATTRIBUTES.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static SECURITY_ATTRIBUTES.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link SECURITY_ATTRIBUTES.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SECURITY_ATTRIBUTES.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SECURITY_ATTRIBUTES.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SECURITY_ATTRIBUTES.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #nLength}. */
    public static int nnLength(long struct) { return UNSAFE.getInt(null, struct + SECURITY_ATTRIBUTES.NLENGTH); }
    /** Unsafe version of {@link #lpSecurityDescriptor}. */
    public static long nlpSecurityDescriptor(long struct) { return memGetAddress(struct + SECURITY_ATTRIBUTES.LPSECURITYDESCRIPTOR); }
    /** Unsafe version of {@link #bInheritHandle}. */
    public static int nbInheritHandle(long struct) { return UNSAFE.getInt(null, struct + SECURITY_ATTRIBUTES.BINHERITHANDLE); }

    /** Unsafe version of {@link #nLength(int) nLength}. */
    public static void nnLength(long struct, int value) { UNSAFE.putInt(null, struct + SECURITY_ATTRIBUTES.NLENGTH, value); }
    /** Unsafe version of {@link #lpSecurityDescriptor(long) lpSecurityDescriptor}. */
    public static void nlpSecurityDescriptor(long struct, long value) { memPutAddress(struct + SECURITY_ATTRIBUTES.LPSECURITYDESCRIPTOR, check(value)); }
    /** Unsafe version of {@link #bInheritHandle(boolean) bInheritHandle}. */
    public static void nbInheritHandle(long struct, int value) { UNSAFE.putInt(null, struct + SECURITY_ATTRIBUTES.BINHERITHANDLE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + SECURITY_ATTRIBUTES.LPSECURITYDESCRIPTOR));
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

    /** An array of {@link SECURITY_ATTRIBUTES} structs. */
    public static class Buffer extends StructBuffer<SECURITY_ATTRIBUTES, Buffer> implements NativeResource {

        private static final SECURITY_ATTRIBUTES ELEMENT_FACTORY = SECURITY_ATTRIBUTES.create(-1L);

        /**
         * Creates a new {@code SECURITY_ATTRIBUTES.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SECURITY_ATTRIBUTES#SIZEOF}, and its mark will be undefined.
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
        protected SECURITY_ATTRIBUTES getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code nLength} field. */
        @NativeType("DWORD")
        public int nLength() { return SECURITY_ATTRIBUTES.nnLength(address()); }
        /** Returns the value of the {@code lpSecurityDescriptor} field. */
        @NativeType("LPVOID")
        public long lpSecurityDescriptor() { return SECURITY_ATTRIBUTES.nlpSecurityDescriptor(address()); }
        /** Returns the value of the {@code bInheritHandle} field. */
        @NativeType("BOOL")
        public boolean bInheritHandle() { return SECURITY_ATTRIBUTES.nbInheritHandle(address()) != 0; }

        /** Sets the specified value to the {@code nLength} field. */
        public SECURITY_ATTRIBUTES.Buffer nLength(@NativeType("DWORD") int value) { SECURITY_ATTRIBUTES.nnLength(address(), value); return this; }
        /** Sets the specified value to the {@code lpSecurityDescriptor} field. */
        public SECURITY_ATTRIBUTES.Buffer lpSecurityDescriptor(@NativeType("LPVOID") long value) { SECURITY_ATTRIBUTES.nlpSecurityDescriptor(address(), value); return this; }
        /** Sets the specified value to the {@code bInheritHandle} field. */
        public SECURITY_ATTRIBUTES.Buffer bInheritHandle(@NativeType("BOOL") boolean value) { SECURITY_ATTRIBUTES.nbInheritHandle(address(), value ? 1 : 0); return this; }

    }

}